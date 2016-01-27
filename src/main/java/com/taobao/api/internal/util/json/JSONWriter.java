package com.taobao.api.internal.util.json;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.CharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.TimeZone;

import com.taobao.api.Constants;
import com.taobao.api.internal.util.StringUtils;

public class JSONWriter {

    static char[] hex = "0123456789ABCDEF".toCharArray();

    private StringBuffer buf = new StringBuffer();

    private Stack<Object> calls = new Stack<Object>();

    private boolean emitClassName = true;

    private DateFormat format;

    private boolean useApiStyle = false;

    public JSONWriter() {
        this(false);
    }

    public JSONWriter(boolean emitClassName) {
        this.emitClassName = emitClassName;
    }

    public JSONWriter(boolean emitClassName, boolean useApiStyle) {
        this(emitClassName);
        this.useApiStyle = useApiStyle;
    }

    public JSONWriter(DateFormat format) {
        this(false);
        this.format = format;
    }

    private void add(char c) {
        buf.append(c);
    }

    private void add(Object obj) {
        buf.append(obj);
    }

    private void add(String name, Object value) {
        add('"');
        add(name);
        add("\":");
        value(value);
    }

    private void array(Iterator<?> it) {
        add("[");
        while (it.hasNext()) {
            value(it.next());
            if (it.hasNext()) {
                add(",");
            }
        }
        add("]");
    }

    private void array(Object object) {
        add("[");
        int length = Array.getLength(object);
        for (int i = 0; i < length; ++i) {
            value(Array.get(object, i));
            if (i < (length - 1)) {
                add(',');
            }
        }
        add("]");
    }

    private void bean(Object object) {
        add("{");
        BeanInfo info;
        boolean addedSomething = false;
        try {
            info = Introspector.getBeanInfo(object.getClass());
            PropertyDescriptor[] props = info.getPropertyDescriptors();
            for (PropertyDescriptor prop : props) {
                String name = prop.getName();
                Method accessor = prop.getReadMethod();
                if ((emitClassName || !"class".equals(name)) && (accessor != null)) {
                    if (!accessor.isAccessible()) {
                        accessor.setAccessible(true);
                    }
                    Object value = accessor.invoke(object, (Object[]) null);
                    if (value == null) {
                        continue;
                    }
                    if (addedSomething) {
                        add(',');
                    }

                    if (useApiStyle) {
                        name = StringUtils.toUnderlineStyle(name);
                    }

                    add(name, value);
                    addedSomething = true;
                }
            }
            Field[] ff = object.getClass().getFields();
            for (Field field : ff) {
                Object value = field.get(object);
                if (value == null) {
                    continue;
                }
                if (addedSomething) {
                    add(',');
                }
                add(field.getName(), value);
                addedSomething = true;
            }
        } catch (IllegalAccessException iae) {
            iae.printStackTrace();
        } catch (InvocationTargetException ite) {
            ite.getCause().printStackTrace();
            ite.printStackTrace();
        } catch (IntrospectionException ie) {
            ie.printStackTrace();
        }
        add("}");
    }

    private void bool(boolean b) {
        add(b ? "true" : "false");
    }

    private boolean cyclic(Object object) {
        Iterator<Object> it = calls.iterator();
        while (it.hasNext()) {
            Object called = it.next();
            if (object == called) {
                return true;
            }
        }
        return false;
    }

    private void date(Date date) {
        if (this.format == null) {
            this.format = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
            this.format.setTimeZone(TimeZone.getTimeZone(Constants.DATE_TIMEZONE));
        }
        add("\"");
        add(format.format(date));
        add("\"");
    }

    private void map(Map<?, ?> map) {
        add("{");
        Iterator<?> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, ?> e = (Map.Entry<?, ?>) it.next();
            value(e.getKey());
            add(":");
            value(e.getValue());
            if (it.hasNext()) {
                add(',');
            }
        }
        add("}");
    }

    private void string(Object obj) {
        add('"');
        CharacterIterator it = new StringCharacterIterator(obj.toString());
        for (char c = it.first(); c != CharacterIterator.DONE; c = it.next()) {
            if (c == '"') {
                add("\\\"");
            } else if (c == '\\') {
                add("\\\\");
            } else if (c == '/') {
                add("\\/");
            } else if (c == '\b') {
                add("\\b");
            } else if (c == '\f') {
                add("\\f");
            } else if (c == '\n') {
                add("\\n");
            } else if (c == '\r') {
                add("\\r");
            } else if (c == '\t') {
                add("\\t");
            } else if (Character.isISOControl(c)) {
                unicode(c);
            } else {
                add(c);
            }
        }
        add('"');
    }

    private void unicode(char c) {
        add("\\u");
        int n = c;
        for (int i = 0; i < 4; ++i) {
            int digit = (n & 0xf000) >> 12;
            add(hex[digit]);
            n <<= 4;
        }
    }

    private void value(Object object) {
        if ((object == null) || cyclic(object)) {
            add(null);
        } else {
            calls.push(object);
            if (object instanceof Class<?>) {
                string(object);
            } else if (object instanceof Boolean) {
                bool(((Boolean) object).booleanValue());
            } else if (object instanceof Number) {
                add(object);
            } else if (object instanceof String) {
                string(object);
            } else if (object instanceof Character) {
                string(object);
            } else if (object instanceof Map<?, ?>) {
                map((Map<?, ?>) object);
            } else if (object.getClass().isArray()) {
                array(object);
            } else if (object instanceof Iterator<?>) {
                array((Iterator<?>) object);
            } else if (object instanceof Collection<?>) {
                array(((Collection<?>) object).iterator());
            } else if (object instanceof Date) {
                date((Date) object);
            } else {
                bean(object);
            }
            calls.pop();
        }
    }

    public String write(boolean b) {
        return String.valueOf(b);
    }

    public String write(char c) {
        return "\"" + c + "\"";
    }

    public String write(double d) {
        return String.valueOf(d);
    }

    public String write(long n) {
        return String.valueOf(n);
    }

    public String write(Object object) {
        buf.setLength(0);
        value(object);
        return buf.toString();
    }
}
