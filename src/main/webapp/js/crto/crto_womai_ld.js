if (!window.criteo_q || window.criteo_q instanceof Array) {
    var oldQueue = window.criteo_q || [];
    window.criteo_q = function() {
        var e = {
            bodyReady: !1,
            domReady: !1,
            queue: [],
            actions: [],
            disingScheduled: [],
            accounts: []
        },
        d = {
            tagVersion: "3.2.0",
            handlerUrlPrefix: ("https:" === document.location.protocol ? "https://sslwidget.": "http://widget.") + "criteo.com/event",
            handlerResponseType: "single",
            handlerParams: {
                v: "3.2.0"
            },
            extraData: [],
            customerInfo: [],
            manualDising: !1,
            manualFlush: !1,
            disOnce: !1,
            partialDis: !1,
            eventMap: {
                viewitem: "vp",
                viewhome: "vh",
                viewlist: "vl",
                viewbasket: "vb",
                viewsearch: "vs",
                tracktransaction: "vc",
                calldising: "dis",
                setdata: "exd",
                setlogin: "cl",
                setemail: "ce"
            },
            propMap: {
                event: "e",
                account: "a",
                currency: "c",
                product: "p",
                item: "p",
                "item.id": "i",
                "item.price": "pr",
                "item.quantity": "q",
                "product.id": "i",
                "product.price": "pr",
                "product.quantity": "q",
                data: "d",
                keywords: "kw",
                checkin_date: "din",
                checkout_date: "dout",
                deduplication: "dd",
                user_segment: "si",
                new_customer: "nc",
                customer_id: "ci",
                login: "i",
                email: "m",
                hash_method: "h"
            },
            setters: {
                seturl: {
                    cfg: "handlerUrlPrefix",
                    evt: "url"
                },
                setaccount: {
                    cfg: "account",
                    evt: "account"
                },
                setcalltype: {
                    cfg: "handlerResponseType",
                    evt: "type"
                },
                oninitialized: {
                    cfg: "onInitialized",
                    evt: "callback"
                },
                ondomready: {
                    cfg: "onDOMReady",
                    evt: "callback"
                },
                beforeappend: {
                    cfg: "beforeAppend",
                    evt: "callback"
                },
                aftereval: {
                    cfg: "afterEval",
                    evt: "callback"
                },
                onflush: {
                    cfg: "onFlush",
                    evt: "callback"
                }
            },
            flags: {
                disonce: "disOnce",
                manualdising: "manualDising",
                manualflush: "manualFlush",
                nopartialflush: "noPartialFlush",
                disonpartialflush: "partialDis"
            }
        },
        p = function() {
            for (var a = [], b = e.queue, c = 0; c < b.length; ++c) {
                var h = b[c];
                if (h instanceof Array) b.splice.apply(b, [c + 1, 0].concat(h));
                else if (h instanceof Function) b.splice(c + 1, 0, h());
                else if (h && "[object Object]" === h.toString()) switch (k(h, c, b, a)) {
                case 0:
                    a.push(h);
                    break;
                case - 1 : a = a.concat(b.slice(c)),
                    c = b.length
                }
            }
            d.afterEval instanceof Function && (a = d.afterEval(b, a, e, d));
            e.queue = a || []; ! d.manualFlush && (!d.noPartialFlush || 0 === e.queue.length) && r(0 !== e.queue.length)
        },
        k = function(a, b, c, h) {
            if (!e.domReady && a.requiresDOM && "no" !== a.requiresDOM) return "blocking" === a.requiresDOM ? -1 : 0;
            delete a.requiresDOM;
            if (!a.event) return f(a),
            1;
            a.account && q(a.account, e.accounts);
            a.event = a.event.toLowerCase();
            switch (a.event) {
            case "setdata":
                return a = f(a),
                d.extraData.push(a),
                s(e.actions, f(a)),
                1;
            case "setparameter":
                for (var g in a)"event" !== g.toLowerCase() && a.hasOwnProperty(g) && (d.handlerParams[g] = a[g]);
                return 1;
            case "calldising":
                a.hasOwnProperty("account") || (a.account = e.accounts);
                b = d.handlerResponseType;
                a.hasOwnProperty("type") && (b = a.type, delete a.type);
                q(a.account, e.disingScheduled);
                "sequential" === b && (a.dc = !0);
                break;
            case "setcustomerid":
                return a.event = "setdata",
                a.customer_id = a.id,
                delete a.id,
                k(a);
            case "setemail":
            case "setlogin":
                return a.hasOwnProperty("hash_method") || (a.hash_method = "none"),
                a.hasOwnProperty("email") && (a.email && !(a.email instanceof Array)) && (a.email = [a.email]),
                a.hasOwnProperty("login") && (a.login && !(a.login instanceof Array)) && (a.login = [a.login]),
                b = f(a),
                d.customerInfo.push(b),
                t(e.actions, f(a)),
                1;
            case "sethashedlogin":
            case "clh":
                return a.event = "setlogin",
                a.hasOwnProperty("hash_method") || (a.hash_method = "md5"),
                k(a);
            case "sethashedemail":
            case "ceh":
                return a.event = "setemail",
                a.hasOwnProperty("hash_method") || (a.hash_method = "md5"),
                k(a);
            case "setsitetype":
                b = "d";
                if ("mobile" === a.type || "m" === a.type) b = "m";
                if ("tablet" === a.type || "t" === a.type) b = "t";
                a.event = "setdata";
                delete a.type;
                a.site_type = b;
                return k(a);
            case "appendtag":
                e.bodyReady && !d.container && ((b = document.body) ? (c = document.createElement("div"), c.setAttribute("id", "criteo-tags-div"), c.style.display = "none", b.appendChild(c), b = c) : b = void 0, d.container = b);
                d.beforeAppend instanceof Function && (a.element = d.beforeAppend(a.element, e, d));
                f(a);
                if (a.element && a.element.tagName) if (!d.container && "script" === a.element.tagName.toLowerCase()) b = document.getElementsByTagName("script")[0],
                a.element.setAttribute("data-owner", "criteo-tag"),
                b.parentNode.insertBefore(a.element, b);
                else if (d.container) d.container.appendChild(a.element);
                else return 0;
                return 1;
            case "gettagstate":
                return a.callback instanceof Function ? a.callback(e, d) : 1;
            case "flush":
            case "flushevents":
                return r(b !== c.length - 1 || 0 !== h.length),
                1
            }
            if (b = d.setters[a.event]) return d[b.cfg] = a[b.evt],
            1;
            if (b = d.flags[a.event]) return d[b] = !0,
            1;
            e.actions.push(f(a));
            return 1
        },
        r = function(a) {
            d.onFlush instanceof Function && (e.actions = d.onFlush(e.actions, e, d));
            if (0 !== e.actions.length) {
                for (var b = 0; b < d.extraData.length; ++b) s(e.actions, d.extraData[b]);
                for (b = 0; b < d.customerInfo.length; ++b) t(e.actions, d.customerInfo[b]);
                if (!d.manualDising && (!a || d.partialDis)) {
                    a = [];
                    for (b = 0; b < e.accounts.length; ++b) n(e.disingScheduled, e.accounts[b]) || a.push(e.accounts[b]);
                    0 < a.length && k({
                        event: "callDising",
                        account: a
                    })
                }
                a = e.actions;
                b = [];
                1 === e.accounts.length && (d.account = e.accounts[0]);
                d.account && b.push("a=" + l(d.account, []));
                if (d.handlerParams) {
                    var c = decodeURIComponent(l(d.handlerParams, []));
                    c && b.push(c)
                }
                for (c = 0; c < a.length; ++c) a[c].account && m(d.account, a[c].account) && delete a[c].account,
                b.push("p" + c + "=" + l(a[c], []));
                a = b.join("&");
                b = document.createElement("script");
                b.setAttribute("async", "true");
                b.setAttribute("type", "text/javascript");
                b.setAttribute("src", d.handlerUrlPrefix + "?" + a);
                e.actions = [];
                k({
                    event: "appendTag",
                    element: b
                });
                d.disOnce || (e.disingScheduled = [])
            }
        },
        s = function(a, b) {
            for (var c = 0; c < a.length; ++c) {
                var d = a[c];
                if (d.event === b.event && m(b.account, d.account)) {
                    for (var e in b) b.hasOwnProperty(e) && "account" !== e && (d[e] = b[e]);
                    return
                }
            }
            a.push(b)
        },
        t = function(a, b) {
            for (var c = 0; c < a.length; ++c) {
                var d = a[c];
                if (d.event === b.event && d.hash_method === b.hash_method && m(b.account, d.account)) {
                    b.hasOwnProperty("login") && (d.login = u(d.login, b.login));
                    b.hasOwnProperty("email") && (d.email = u(d.email, b.email));
                    return
                }
            }
            a.push(b)
        },
        f = function(a) {
            var b = a;
            if (a instanceof Function) return b = a(),
            b instanceof Function ? b: f(b);
            if (a instanceof Array) for (var b = [], c = 0; c < a.length; ++c) b[c] = f(a[c]);
            else if (a && "[object Object]" === a.toString()) for (c in b = {},
            a) a.hasOwnProperty(c) && (b[c] = f(a[c]));
            return b
        },
        v = function(a, b) {
            var c = b.join(".");
            return d.propMap[c] ? d.propMap[c] : a
        },
        m = function(a, b) {
            if (! (a instanceof Array)) return m([a], b);
            if (! (b instanceof Array)) return m(a, [b]);
            if (a.length !== b.length) return ! 1;
            for (var c = 0; c < a.length; ++c) if (!n(b, a[c])) return ! 1;
            return ! 0
        },
        l = function(a, b) {
            var c = "";
            if (a instanceof Function) c = l(a(), b);
            else if (a instanceof Array) {
                for (var e = [], g = 0; g < a.length; ++g) e[g] = l(a[g], b);
                c += "[" + e.join(",") + "]"
            } else if (a && "[object Object]" === a.toString()) {
                e = [];
                for (g in a) if (a.hasOwnProperty(g)) {
                    var f = b.concat([g]);
                    e.push(v(g, f) + "=" + l(a[g], f))
                }
                c += e.join("&")
            } else c = 1 === b.length && "event" === b[0] ? c + (d.eventMap[a.toLowerCase()] ? d.eventMap[a.toLowerCase()] : a) : c + a;
            return encodeURIComponent(c)
        },
        q = function(a, b) {
            if (a instanceof Array) for (var c = 0; c < a.length; ++c) q(a[c], b);
            else n(b, a) || b.push(a)
        },
        n = function(a, b) {
            for (var c = 0; c < a.length; ++c) if (a[c] === b) return ! 0;
            return ! 1
        },
        u = function(a, b) {
            for (var c = [], d = 0; d < b.length; ++d) n(a, b[d]) || c.push(b[d]);
            return a.concat(c)
        }; (function(a) { (function c() {
                document.body ? setTimeout(a, 0) : setTimeout(c, 10)
            })()
        })(function() {
            e.bodyReady = d.onInitialized instanceof Function ? d.onInitialized(e, d) : !0;
            p()
        }); (function(a, b) {
            if ("complete" === a.readyState) b();
            else if (a.addEventListener) a.addEventListener("DOMContentLoaded", b, !1),
            window.addEventListener("load", b, !1);
            else {
                a.attachEvent("onreadystatechange", b);
                window.attachEvent("onload", b);
                var c = !1;
                try {
                    c = null === window.frameElement && document.documentElement
                } catch(d) {}
                if (c && c.doScroll)(function w() {
                    if (c) {
                        try {
                            c.doScroll("left")
                        } catch(a) {
                            return setTimeout(w, 50)
                        }
                        b()
                    }
                })();
                else {
                    var e = !1,
                    f = a.onload,
                    k = a.onreadystatechange;
                    a.onload = a.onreadystatechange = function() {
                        k instanceof Function && k();
                        if (!e && (!a.readyState || "loaded" === a.readyState || "complete" === a.readyState)) f instanceof Function && f(),
                        e = !0,
                        b()
                    }
                }
            }
        })(document,
        function() {
            e.domReady = d.onDOMReady instanceof Function ? d.onDOMReady(e, d) : !0;
            p()
        }); (function(a) {
            try {
                if (a && a.referrer) {
                    var b = a.createElement("a");
                    b.href = a.referrer;
                    b.hostname !== a.location.hostname && d.extraData.push({
                        event: "setData",
                        ref: b.protocol + "//" + b.hostname
                    })
                }
            } catch(c) {}
        })(document);
        return {
            push: function() {
                for (var a = 0; a < arguments.length; ++a) e.queue.push(arguments[a]);
                p()
            }
        }
    } ();
    window.criteo_q.push.apply(window.criteo_q, oldQueue)
};