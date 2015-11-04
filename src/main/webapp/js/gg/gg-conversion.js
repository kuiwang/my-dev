(function() {
    var f = this,
    k = function(a) {
        var c = typeof a;
        if ("object" == c) if (a) {
            if (a instanceof Array) return "array";
            if (a instanceof Object) return c;
            var d = Object.prototype.toString.call(a);
            if ("[object Window]" == d) return "object";
            if ("[object Array]" == d || "number" == typeof a.length && "undefined" != typeof a.splice && "undefined" != typeof a.propertyIsEnumerable && !a.propertyIsEnumerable("splice")) return "array";
            if ("[object Function]" == d || "undefined" != typeof a.call && "undefined" != typeof a.propertyIsEnumerable && !a.propertyIsEnumerable("call")) return "function"
        } else {
            return "null";
        }

        else if ("function" == c && "undefined" == typeof a.call) {
            return "object";
        }
        return c
    };
    var l = function(a) {
        l[" "](a);
        return a
    };
    l[" "] = function() {};
    var m = window;
    var n = function(a, c) {
        for (var d in a) Object.prototype.hasOwnProperty.call(a, d) && c.call(null, a[d], d, a)
    };
    var p = function(a) {
        a = parseFloat(a);
        return isNaN(a) || 1 < a || 0 > a ? 0 : a
    };
    var q = p("0.06"),
    r = p("0.01");
    var s;
    r: {
        var t = f.navigator;
        if (t) {
            var u = t.userAgent;
            if (u) {
                s = u;
                break r
            }
        }
        s = ""
    };
    var v = -1 != s.indexOf("Opera") || -1 != s.indexOf("OPR"),
    w = -1 != s.indexOf("Trident") || -1 != s.indexOf("MSIE"),
    x = -1 != s.indexOf("Gecko") && -1 == s.toLowerCase().indexOf("webkit") && !( - 1 != s.indexOf("Trident") || -1 != s.indexOf("MSIE")),
    y = -1 != s.toLowerCase().indexOf("webkit"); (function() {
        var a = "",
        c;
        if (v && f.opera) return a = f.opera.version,
        "function" == k(a) ? a() : a;
        x ? c = /rv\:([^\);]+)(\)|;)/: w ? c = /\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/: y && (c = /WebKit\/(\S+)/);
        c && (a = (a = c.exec(s)) ? a[1] : "");
        return w && (c = (c = f.document) ? c.documentMode: void 0, c > parseFloat(a)) ? String(c) : a
    })();
    var z = function(a) {
        this.b = [];
        this.a = {};
        for (var c = 0,
        d = arguments.length; c < d; ++c) this.a[arguments[c]] = ""
    },
    B = function(a, c, d) {
        var b = A;
        if (d ? b.a.hasOwnProperty(d) && "" == b.a[d] : 1) {
            r: {
                if (! (1E-4 > Math.random())) {
                    var e = Math.random();
                    if (e < c) {
                        try {
                            var h = new Uint16Array(1);
                            window.crypto.getRandomValues(h);
                            e = h[0] / 65536
                        } catch(g) {
                            e = Math.random()
                        }
                        a = a[Math.floor(e * a.length)];
                        break r
                    }
                }
                a = null
            }
            a && "" != a && (d ? b.a.hasOwnProperty(d) && (b.a[d] = a) : b.b.push(a))
        }
    };
    z.prototype.c = function(a) {
        return this.a.hasOwnProperty(a) ? this.a[a] : ""
    };
    z.prototype.geil = z.prototype.c;
    var C = function() {
        var a = A,
        c = [];
        n(a.a,
        function(a) {
            "" != a && c.push(a)
        });
        return 0 < a.b.length && 0 < c.length ? a.b.join(",") + "," + c.join(",") : a.b.join(",") + c.join(",")
    };
    var A, D = "google_conversion_id google_conversion_format google_conversion_type google_conversion_order_id google_conversion_language google_conversion_value google_conversion_currency google_conversion_domain google_conversion_label google_conversion_color google_disable_viewthrough google_remarketing_only google_remarketing_for_search google_conversion_items google_custom_params google_conversion_date google_conversion_time google_conversion_js_version onload_callback opt_image_generator google_is_call google_conversion_page_url".split(" ");
    function E(a) {
        return null != a ? escape(a.toString()) : ""
    }
    function F(a) {
        return null != a ? a.toString().substring(0, 512) : ""
    }
    function G(a, c) {
        var d = E(c);
        if ("" != d) {
            var b = E(a);
            if ("" != b) return "&".concat(b, "=", d)
        }
        return ""
    }
    function H(a) {
        var c = typeof a;
        return null == a || "object" == c || "function" == c ? null: String(a).replace(/,/g, "\\,").replace(/;/g, "\\;").replace(/=/g, "\\=")
    }
    function I(a) {
        var c;
        if ((a = a.google_custom_params) && "object" == typeof a && "function" != typeof a.join) {
            var d = [];
            for (c in a) if (Object.prototype.hasOwnProperty.call(a, c)) {
                var b = a[c];
                if (b && "function" == typeof b.join) {
                    for (var e = [], h = 0; h < b.length; ++h) {
                        var g = H(b[h]);
                        null != g && e.push(g)
                    }
                    b = 0 == e.length ? null: e.join(",")
                } else b = H(b); (e = H(c)) && null != b && d.push(e + "=" + b)
            }
            c = d.join(";")
        } else c = "";
        return "" == c ? "": "&".concat("data=", encodeURIComponent(c))
    }
    function J(a) {
        return "number" != typeof a && "string" != typeof a ? "": E(a.toString())
    }
    function K(a) {
        if (!a) return "";
        a = a.google_conversion_items;
        if (!a) return "";
        for (var c = [], d = 0, b = a.length; d < b; d++) {
            var e = a[d],
            h = [];
            e && (h.push(J(e.value)), h.push(J(e.quantity)), h.push(J(e.item_id)), h.push(J(e.adwords_grouping)), h.push(J(e.sku)), c.push("(" + h.join("*") + ")"))
        }
        return 0 < c.length ? "&item=" + c.join("") : ""
    }
    function L(a, c, d) {
        var b = [];
        if (a) {
            var e = a.screen;
            e && (b.push(G("u_h", e.height)), b.push(G("u_w", e.width)), b.push(G("u_ah", e.availHeight)), b.push(G("u_aw", e.availWidth)), b.push(G("u_cd", e.colorDepth)));
            a.history && b.push(G("u_his", a.history.length))
        }
        d && "function" == typeof d.getTimezoneOffset && b.push(G("u_tz", -d.getTimezoneOffset()));
        c && ("function" == typeof c.javaEnabled && b.push(G("u_java", c.javaEnabled())), c.plugins && b.push(G("u_nplug", c.plugins.length)), c.mimeTypes && b.push(G("u_nmime", c.mimeTypes.length)));
        return b.join("")
    }
    function M(a, c, d) {
        var b = "";
        if (c) {
            var e;
            if (a.top == a) e = 0;
            else {
                var h = a.location.ancestorOrigins;
                if (h) e = h[h.length - 1] == a.location.origin ? 1 : 2;
                else {
                    h = a.top;
                    try {
                        var g;
                        if (g = !!h && null != h.location.href) n: {
                            try {
                                l(h.foo);
                                g = !0;
                                break n
                            } catch(ia) {}
                            g = !1
                        }
                        e = g
                    } catch(ja) {
                        e = !1
                    }
                    e = e ? 1 : 2
                }
            }
            g = "";
            g = d ? d: 1 == e ? a.top.location.href: a.location.href;
            b += G("frm", e);
            b += G("url", F(g));
            b += G("ref", F(c.referrer))
        }
        return b
    }
    function N(a) {
        return "42631044" == (A ? A.c(2) : "") || a && a.location && a.location.protocol && "https:" == a.location.protocol.toString().toLowerCase() ? "https:": "http:"
    }
    function O(a) {
        return a.google_remarketing_only ? "googleads.g.doubleclick.net": a.google_conversion_domain || "www.googleadservices.com"
    }
    function P(a, c, d, b) {
        var e = "/?";
        "landing" == b.google_conversion_type && (e = "/extclk?");
        var e = N(a) + "//" + O(b) + "/pagead/" + [b.google_remarketing_only ? "viewthroughconversion/": "conversion/", E(b.google_conversion_id), e, "random=", E(b.google_conversion_time)].join(""),
        h = d ? {
            visible: 1,
            hidden: 2,
            prerender: 3,
            preview: 4
        } [d.webkitVisibilityState || d.mozVisibilityState || d.visibilityState || ""] || 0 : "0",
        g;
        r: {
            g = b.google_conversion_language;
            if (null != g) {
                g = g.toString();
                if (2 == g.length) {
                    g = G("hl", g);
                    break r
                }
                if (5 == g.length) {
                    g = G("hl", g.substring(0, 2)) + G("gl", g.substring(3, 5));
                    break r
                }
            }
            g = ""
        }
        a = [G("cv", b.google_conversion_js_version), G("fst", b.google_conversion_first_time), G("num", b.google_conversion_snippets), G("fmt", b.google_conversion_format), G("value", b.google_conversion_value), G("currency_code", b.google_conversion_currency), G("label", b.google_conversion_label), G("oid", b.google_conversion_order_id), G("bg", b.google_conversion_color), g, G("guid", "ON"), G("disvt", b.google_disable_viewthrough), G("is_call", b.google_is_call), G("eid", C()), K(b), L(a, c, b.google_conversion_date), I(b), M(a, d, b.google_conversion_page_url), b.google_remarketing_for_search && !b.google_conversion_domain ? "&srr=n": "", G("vis", h)].join("");
        return e + a
    }
    function aa(a) {
        return {
            ar: 1,
            bg: 1,
            cs: 1,
            da: 1,
            de: 1,
            el: 1,
            en_AU: 1,
            en_US: 1,
            en_GB: 1,
            es: 1,
            et: 1,
            fi: 1,
            fr: 1,
            hi: 1,
            hr: 1,
            hu: 1,
            id: 1,
            is: 1,
            it: 1,
            iw: 1,
            ja: 1,
            ko: 1,
            lt: 1,
            nl: 1,
            no: 1,
            pl: 1,
            pt_BR: 1,
            pt_PT: 1,
            ro: 1,
            ru: 1,
            sk: 1,
            sl: 1,
            sr: 1,
            sv: 1,
            th: 1,
            tl: 1,
            tr: 1,
            vi: 1,
            zh_CN: 1,
            zh_TW: 1
        } [a] ? a + ".html": "en_US.html"
    }
    var ba = /Android ([01]\.|2\.[01])/i;
    function ca() {
        var a = Q,
        c = navigator,
        d = document,
        b = Q;
        3 != b.google_conversion_format || b.google_remarketing_only || b.google_conversion_domain || A && B("317150500 317150501 317150502 317150503 317150504 317150505".split(" "), q, 1);
        var e = A ? A.c(1) : "",
        c = P(a, c, d, b),
        d = function(a, b, c) {
            return '<img height="' + c + '" width="' + b + '" border="0" alt="" src="' + a + '" />'
        };
        return 0 == b.google_conversion_format && null == b.google_conversion_domain ? '<a href="' + (N(a) + "//services.google.com/sitestats/" + aa(b.google_conversion_language) + "?cid=" + E(b.google_conversion_id)) + '" target="_blank">' + d(c, 135, 27) + "</a>": 1 < b.google_conversion_snippets || 3 == b.google_conversion_format ? "317150501" == e || "317150502" == e || "317150503" == e || "317150504" == e || "317150505" == e ? d(c, 1, 1) + ('<script src="' + c.replace(/(&|\?)fmt=3(&|$)/, "$1fmt=4&adtest=on$2") + '">\x3c/script>') : d(c, 1, 1) : '<iframe name="google_conversion_frame" title="Google conversion frame" width="' + (2 == b.google_conversion_format ? 200 : 300) + '" height="' + (2 == b.google_conversion_format ? 26 : 13) + '" src="' + c + '" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no">' + d(c.replace(/\?random=/, "?frame=0&random="), 1, 1) + "</iframe>"
    }
    function da() {
        return new Image
    }
    function ea() {
        var a = R,
        c = S,
        d = da;
        "function" === typeof a.opt_image_generator && (d = a.opt_image_generator);
        a = d();
        c += G("async", "1");
        a.src = c;
        a.onload = function() {}
    };
    var Q = window;
    if (Q) if (null != /[\?&;]google_debug/.exec(document.URL)) {
        var fa = Q,
        T = document.getElementsByTagName("head")[0];
        T || (T = document.createElement("head"), document.getElementsByTagName("html")[0].insertBefore(T, document.getElementsByTagName("body")[0]));
        var U = document.createElement("script");
        U.src = N(window) + "//" + O(fa) + "/pagead/conversion_debug_overlay.js";
        T.appendChild(U)
    } else {
        try {
            var V;
            var W = Q;
            "landing" == W.google_conversion_type || !W.google_conversion_id || W.google_remarketing_only && W.google_disable_viewthrough ? V = !1 : (W.google_conversion_date = new Date, W.google_conversion_time = W.google_conversion_date.getTime(), W.google_conversion_snippets = "number" == typeof W.google_conversion_snippets && 0 < W.google_conversion_snippets ? W.google_conversion_snippets + 1 : 1, "number" != typeof W.google_conversion_first_time && (W.google_conversion_first_time = W.google_conversion_time), W.google_conversion_js_version = "7", 0 != W.google_conversion_format && 1 != W.google_conversion_format && 2 != W.google_conversion_format && 3 != W.google_conversion_format && (W.google_conversion_format = 1), A = new z(1, 2), "https:" == N(m) || ba.test(navigator.userAgent) || A && B(["42631043", "42631044"], r, 2), V = !0);
            if (V && (document.write(ca()), Q.google_remarketing_for_search && !Q.google_conversion_domain)) {
                var X = Q,
                R = Q,
                S, ga = S = N(X) + "//www.google.com/ads/user-lists/" + [E(R.google_conversion_id), "/?random=", Math.floor(1E9 * Math.random())].join(""),
                Y,
                Z = R;
                Y = [G("label", Z.google_conversion_label), G("fmt", "3"), M(X, document, Z.google_conversion_page_url)].join("");
                S = ga + Y;
                ea()
            }
        } catch(ha) {}
        for (var ka = Q,
        $ = 0; $ < D.length; $++) ka[D[$]] = null
    };
})();