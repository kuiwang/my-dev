(function() {
    try {
        var b = window.mediav || {};
        window.mediav = b;
        b.test = function(c) {
            return
        };
        if (window.mba_lite) {
            return
        }
        window.mba_lite = 1;
        window.$mat = 1;
        b.cookie = {};
        b.$version = "3.3.ka.14";
        b.cookie._isValidKey = function(c) {
            return (new RegExp('^[^\\x00-\\x20\\x7f\\(\\)<>@,;:\\\\\\"\\[\\]\\?=\\{\\}\\/\\u0080-\\uffff]+\x24')).test(c)
        };
        b.cookie.getRaw = function(d) {
            if (b.cookie._isValidKey(d)) {
                var e = new RegExp("(^| )" + d + "=([^;]*)(;|\x24)"),
                c = e.exec(document.cookie);
                if (c) {
                    return c[2] || null
                }
            }
            return null
        };
        b.cookie.get = function(c) {
            var d = b.cookie.getRaw(c);
            if ("string" == typeof d) {
                try {
                    d = decodeURIComponent(d)
                } catch(f) {}
                return d
            }
            return null
        };
        b.cookie.setRaw = function(e, f, d) {
            d = d || {};
            var c = d.expires;
            if ("number" == typeof d.expires) {
                c = new Date();
                c.setTime(c.getTime() + d.expires)
            }
            document.cookie = e + "=" + f + (d.path ? "; path=" + d.path: "/") + (c ? "; expires=" + c.toGMTString() : "") + (d.domain ? "; domain=" + d.domain: "") + (d.secure ? "; secure": "")
        };
        b.cookie.remove = function(d, c) {
            c = c || {};
            c.expires = new Date(0);
            b.cookie.setRaw(d, "", c)
        };
        b.cookie.set = function(d, e, c) {
            b.cookie.setRaw(d, encodeURIComponent(e), c)
        };
        b.oOrganic = function(d, c) {
            this.srcName = d;
            this.keyword = c
        };
        b.cOrganics = [new b.oOrganic("baidu", "word"), new b.oOrganic("baidu", "wd"), new b.oOrganic("google", "q"), new b.oOrganic("sogou", "query"), new b.oOrganic("zhongsou", "w"), new b.oOrganic("soso", "w"), new b.oOrganic("search.114.vnet.cn", "kw"), new b.oOrganic("youdao", "q"), new b.oOrganic("gougou", "search"), new b.oOrganic("bing", "q"), new b.oOrganic("msn", "q"), new b.oOrganic("live", "q"), new b.oOrganic("aol", "query"), new b.oOrganic("aol", "q"), new b.oOrganic("aol", "encquery"), new b.oOrganic("lycos", "query"), new b.oOrganic("ask", "q"), new b.oOrganic("altavista", "q"), new b.oOrganic("netscape", "query"), new b.oOrganic("cnn", "query"), new b.oOrganic("looksmart", "qt"), new b.oOrganic("about", "terms"), new b.oOrganic("pchome", "q")];
        b.queryToJson = function(e) {
            var g = {};
            var k = e.split("?");
            k.shift();
            var j = k.shift();
            if (k.length >= 1) {
                var h = k.join("?")
            }
            var j = e.split("?")[1];
            if (j) {
                j = j.split("&");
                for (var f = 0,
                c = j.length; f < c; f++) {
                    var d = j[f].split("=");
                    g[d[0]] = d[1];
                    if (h && f == c - 1) {
                        g[d[0]] = d[1] + "?" + h
                    }
                }
            }
            return g
        };
        b.jsonp = function(f, c) {
            var e = (new Date).getTime();
            var i = "jsonp" + e + Math.floor(Math.random() * 10000);
            f = f + "&cb=" + i;
            window[i] = window[i] ||
            function(j) {
                h(j);
                window[i] = undefined;
                try {
                    delete window[i]
                } catch(k) {}
                if (g) {
                    g.removeChild(d)
                }
            };
            var g = document.getElementsByTagName("head")[0] || document.documentElement;
            var d = document.createElement("script");
            d.src = f;
            g.insertBefore(d, g.firstChild);
            function h(j) {
                if (typeof(c) == "function") {
                    c(j)
                }
            }
        };
        b.sendRequestByJsonp = function(c, d) {
            b.jsonp(c, d)
        };
        b.createCampaignSource = function(d) {
            var c = d._mvsrc || d._mvmix;
            var e = d._mvcam;
            if (c) {
                return new b.sourceX("(camp)", c, e)
            }
        };
        b.createSearchSource = function(c) {
            if (c == null || c.indexOf("://") < 0) {
                return
            }
            var k = function(l) {
                var i = "";
                i = l.split("://")[1]; (i.indexOf("/") >= 0) && (i = i.split("/")[0]);
                return i
            };
            var j = k(c);
            var m = b.cOrganics;
            var d = b.queryToJson(c);
            for (var f = 0,
            e = m.length; f < e; f++) {
                var h = m[f];
                if (j.indexOf(h.srcName) >= 0) {
                    var g = d[h.keyword];
                    if (g) {
                        return new b.sourceX("(search)", h.srcName, g)
                    }
                }
            }
        };
        b.createRefSource = function(c) {
            if (c == null || c.indexOf("://") < 0) {
                return
            }
            var e = c.split("://")[1].toLowerCase();
            if (e.indexOf("/") >= 0) {
                var d = e.substring(e.indexOf("/"));
                if (d.indexOf("?") >= 0) {
                    d = d.split("?")[0]
                }
                e = e.split("/")[0]
            }
            if (0 == e.indexOf("www.")) {
                e = e.substring(4)
            }
            return new b.sourceX("(ref)", e, d || "")
        };
        b.sourceX = function(d, c, e) {
            this.srcName = c.replace(/\./g, "%2E").replace(/\|/g, "%7C");
            this.content = e.replace(/\./g, "%2E").replace(/\|/g, "%7C")
        };
        b.updateSingleSource = function(d, h, c, f, i) {
            if (!c) {
                return
            }
            var e = "jzqsr=" + (c.srcName) + "|jzqct=" + (c.content);
            var g = h.split(".");
            if (g.length < 6) {
                g[0] = 1;
                g[1] = f;
                g[2] = f;
                g[3] = 1;
                g[4] = "jzqsr=" + (c.srcName) + "|jzqct=" + (c.content);
                g[5] = g[4]
            } else {
                if (g[4] != e) {
                    g[3] = g[3] - 0 + 1;
                    g[2] = f;
                    g[5] = e
                }
            }
            return g.join(".")
        };
        b.sendRequest = function(d, e) {
            var c = new Image(1, 1);
            c.onload = function() {
                c.onload = null;
                e && e()
            };
            c.src = d;
            window["mv_" + (new Date() - 0)] = c
        };
        b.sendByAjaxRequest = function(f, g, c) {
            var e, d = window.XDomainRequest;
            if (d) {
                e = new d;
                e.open("POST", c)
            } else {
                if (d = window.XMLHttpRequest) {
                    d = new d;
                    if ("withCredentials" in d) {
                        e = d;
                        e.open("POST", c, true);
                        e.setRequestHeader("Content-Type", "text/plain")
                    }
                }
            }
            if (e) {
                e.onreadystatechange = function() {
                    if (e.readyState == 4) {
                        g && g();
                        e = null
                    }
                };
                e.send(f);
                return true
            }
            return false
        }
    } catch(a) {
        b.test("t3=error1" + a.type)
    } (function() {
        function E(m) {
            return encodeURIComponent(m)
        }
        var ac = new RegExp("(^[\\s\\t\\xa0\\u3000]+)|([\\u3000\\xa0\\s\\t]+\x24)", "g");
        function aa(m) {
            return String(m).replace(ac, "")
        }
        function e(q, m) {
            q[m] = "" + (q[m] ? q[m] * 1 + 1 : 1)
        }
        var j;
        var v = {};
        var x = true;
        var o = b.commands = {};
        b.runCmd = {
            push: function() {
                var q = arguments.length;
                for (var ad = 0; ad < q; ad++) {
                    var m = [];
                    Array.prototype.push.apply(m, arguments[ad]);
                    var ae = m.shift();
                    o[ae] && o[ae].apply(this.runner, m)
                }
            }
        };
        function A() {
            var m = window.location.host;
            return m
        }
        function F() {
            var ad = document.domain;
            if ("www." == ad.substring(0, 4)) {
                ad = ad.substring(4)
            } else {
                var m = ad.split(".");
                var q = m[m.length - 1];
                if (m.length > 2 && isNaN(q - 0)) {
                    m[0] = "";
                    ad = m.join(".")
                }
            }
            return ad
        }
        function W(ae) {
            var ad = 1,
            q = 0,
            m;
            if (ae) {
                ad = 0;
                for (m = ae.length - 1; m >= 0; m--) {
                    q = ae.charCodeAt(m);
                    ad = (ad << 6 & 268435455) + q + (q << 14);
                    q = ad & 266338304;
                    ad = q != 0 ? ad ^ q >> 21 : ad
                }
            }
            return ad
        }
        function R() {
            return Math.round(Math.random() * 2147483647) ^ W(p + r) & 2147483647
        }
        function K() {
            var m = (new Date() - 0);
            return [1, R(), m, m, m, m, m, 0, 0, 0, 0, 0]
        }
        function I() {
            var m = (new Date() - 0);
            return [1, m, 0, 0, 1, 0]
        }
        function G() {
            return 1
        }
        function f() {
            return [0, 0, 0]
        }
        b.mkC = function() {
            if ("https:" == document.location.protocol) {
                return
            }
            function m(q) {
                var ad = document.createElement("iframe");
                ad.style.width = "1px";
                ad.style.border = 0;
                ad.style.position = "absolute";
                ad.style.left = "-100px";
                ad.style.top = "-100px";
                ad.style.height = "1px";
                ad.src = q;
                ad.id = "mv_cm";
                setTimeout(function() {
                    document.body.insertBefore(ad, null)
                },
                0)
            }
            m("http://ckmap.mediav.com/b?type=10")
        };
        var X = new Date();
        X.setDate(X.getDate() + 1);
        X.setHours(0);
        X.setMinutes(0);
        X.setSeconds(0);
        var s = X - new Date();
        var y = 63072000000;
        var u = 15768000000;
        var M = 1800000;
        var g = new Date() - 0;
        var p = document.referrer;
        var r = A();
        var t = F();
        var D = b.cookie;
        var L = D.get("_qzja");
        var J = D.get("_qzjb");
        var H = D.get("_qzjc");
        var Y = D.get("_qzjto");
        var C;
        var z = D.get("_jzqco");
        var B = [];
        window.random = B;
        if (!z) {
            var n = D.get("_jzqx") || "";
            var l = D.get("_jzqy") || "";
            var k = D.get("_jzqz") || "";
            var h = D.get("_jzqosr") || ""
        } else {
            var V = z.split("|");
            L = V[5] || "";
            n = V[0] || "";
            l = V[1] || "";
            k = V[2] || "";
            h = V[3] || "";
            C = V[4];
            L = decodeURIComponent(L);
            n = decodeURIComponent(n);
            l = decodeURIComponent(l);
            k = decodeURIComponent(k);
            h = decodeURIComponent(h)
        }
        if (t) {
            b.cookie.remove("_qzja");
            b.cookie.remove("_qzjb");
            b.cookie.remove("_qzjc");
            b.cookie.remove("_qzjto");
            b.cookie.remove("_qzja", {
                path: "/"
            });
            b.cookie.remove("_qzjb", {
                path: "/"
            });
            b.cookie.remove("_qzjc", {
                path: "/"
            });
            b.cookie.remove("_qzjto", {
                path: "/"
            })
        }
        if (window.location.pathname != "/") {
            b.cookie.remove("_qzja");
            b.cookie.remove("_qzjb");
            b.cookie.remove("_qzjc");
            b.cookie.remove("_qzjto")
        }
        var Z = !L || !J || !H;
        L = L ? L.split(".") : K();
        J = J ? J.split(".") : I();
        H = H || G();
        Y = Y ? Y.split(".") : f();
        var P;
        function d() {
            var m = new Date() - 0;
            if (Z) {
                L[3] = L[4];
                L[4] = m;
                J[4] = 1;
                e(L, 11);
                e(Y, 1)
            } else {
                J[4] = 0
            }
            L[5] = L[6];
            L[6] = m;
            e(L, 10);
            e(J, 2);
            e(Y, 0)
        }
        function Q() {
            var m = encodeURIComponent(n || "") + "|" + encodeURIComponent(l || "") + "|" + encodeURIComponent(k || "") + "|" + encodeURIComponent(h || "") + "|" + (C || "");
            m += "|" + encodeURIComponent(L.join(".") || "");
            D.set("_jzqco", m, {
                expires: u,
                domain: t,
                path: "/"
            })
        }
        function ab(ag, m) {
            try {
                if (J[5] && v.userName) {
                    L[8] = 1;
                    Q()
                }
                var ae = [L[0], L[1], (L[2] + "").substring(0, 10), (L[3] + "").substring(0, 10), (L[4] + "").substring(0, 10), L[10]].join(".");
                var q = ["_jzqa=" + ae];
                n && (q.push("_jzqx=" + n));
                l && (q.push("_jzqy=" + l));
                k && (q.push("_jzqz=" + k));
                q = encodeURIComponent(q.join(";+"));
                ag = ag || [];
                ag.push("type=3&db=none");
                if (!m) {
                    ag.push("qzja=" + L.join("."), "qzjb=" + J.join("."), "qzjto=" + Y.join("."));
                    ag.push("jzqh=" + r);
                    ag.push("jzqpt=" + E(v.pageTitle || document.title));
                    ag.push("jzqre=" + E(p));
                    L[7] && ag.push("qzjhn=" + L[7]);
                    v.userId && ag.push("qzjui=" + E(v.userId));
                    v.userName && ag.push("qzjun=" + E(v.userName));
                    v.pageType && ag.push("qzjpt=" + E(v.pageType));
                    v.pageId && ag.push("qzjpi=" + E(v.pageId))
                }
                h && ag.push("jzqosr=" + h);
                ag.push("jzqc=" + q);
                ag.push("jzqs=" + j);
                ag.push("jzqv=" + b.$version);
                if (ag[0].indexOf("logtype") < 0) {
                    ag.push("jzqrd=" + ((window._mv_loader && window._mv_loader.getRandom && window._mv_loader.getRandom("mba")) || (new Date() - 0)))
                } else {
                    if (v.goodsId) {
                        ag.push("qzjgoi=" + v.goodsId)
                    }
                    if (v.sign) {
                        ag.push(v.ss ? "qzjcode=": "qzjsign=" + v.sign)
                    }
                    ag.push("jzqrd=0" + g)
                }
                paramStr = ag.join("&").replace(/%0A|%0D|%09/g, "")
            } catch(af) {
                b.test("t3=err3" + af.type)
            }
            var ad = ("https:" == document.location.protocol ? "https://secure.mediav.com/t?": "http://mvp.mediav.com/t?") + paramStr;
            if (ad.length < 2036) {
                if (true) {
                    ad = ad.replace("type=3&db=none", "type=6&db=none");
                    b.sendRequestByJsonp(ad,
                    function(ak) {
                        if (! (C && (new Date() - 0 - C) < 86400000)) {
                            b.mkC();
                            C = new Date() - 0
                        }
                        ak = "?status=" + ak.replace("_mvctn=", "");
                        var an = b.queryToJson(ak);
                        var ah = an.status;
                        if (ah == "0") {
                            var aj = an.time;
                            var am = an.rdom;
                            h = an.osr;
                            var ai = b.createCampaignSource(an);
                            k = b.updateSingleSource("_jzqz=", k, ai, aj);
                            try {
                                am = decodeURIComponent(am)
                            } catch(al) {}
                            if (am != "") {
                                ai = b.createSearchSource(am);
                                if (ai) {
                                    l = b.updateSingleSource("_jzqy=", l, ai, aj)
                                } else {
                                    ai = b.createRefSource(am);
                                    n = b.updateSingleSource("_jzqx=", n, ai, aj)
                                }
                            }
                            Q()
                        }
                    })
                } else {
                    b.sendRequest(ad,
                    function() {
                        if (J[4] == 0) {
                            return
                        }
                        J[4] = 0;
                        Q()
                    })
                }
            } else {
                var ad = "https:" == document.location.protocol ? "https://secure.mediav.com/t?": "http://mvp.mediav.com/t?";
                b.sendByAjaxRequest(paramStr,
                function() {
                    if (paramStr.indexOf("logtype=ecom") >= 0 || J[4] == 0) {
                        return
                    }
                    J[4] = 0;
                    Q()
                },
                "http://mvp.mediav.com/t?")
            }
        }
        o.$setAccount = function(m) {
            j = m;
            if (j.indexOf("m-") != 0) {
                j = "m-" + j + "-0"
            }
        };
        function S(q, m, ad) {
            var ae = q + m + (ad || "");
            return W(ae)
        }
        o.$setGeneral = function(q, m, af, ad, ae) {
            if (q != v.pageType) {
                x = true
            }
            if (q == "goodsdetail" || q == "cartview") {
                x = false
            }
            ae && (v.pageTyp = ae);
            v.pageType = q || "";
            v.pageId = m || "";
            v.userName = af || "";
            L[7] = E(af).replace(/\./g, "_");
            v.userId = ad || "";
            if (q == "registered" || (J[5] == 1 && af && L[8] != 1)) {
                o.$logOrder(ad || ("rad" + new Date() - 0), 0, af || "", "", "", "0");
                L[8] = 1;
                J[5] = 1;
                J[6] = 1;
                Q()
            }
        };
        o.$logConversion = function() {
            if (x) {
                ab()
            }
            x = false
        };
        o.$setRef = function(m) {
            b.ref = m
        };
        o.$log = function(m) {
            ab(m, 1)
        };
        o.$logData = function(af) {
            try {
                var ai = ["logtype=ecom"];
                var q = [];
                for (var ae = 0,
                m = c.length; ae < m; ae++) {
                    var ad = c[ae],
                    ag = w[ad];
                    if (v.pageType != "ordercreate" && aa(ad) == "qzjorg") {
                        ag = ag.split("%7C");
                        q.push(ag[1])
                    } else {
                        if (ag) {
                            ae;
                            ai.push(aa(ad) + "=" + ag)
                        }
                        if (ad == "qzjor") {
                            delete w[ad]
                        }
                        if (ad == "qzjgo" && !v.sign) {
                            v.sign = S(j, ag, v.pageUrl)
                        }
                    }
                }
                if (q.length > 0) {
                    ai.push("qzjgoi=" + q.join(","))
                }
                if (af) {
                    ai.push(af)
                }
                if (ai.length == 1) {
                    return
                }
                if (v.ref) {
                    ai.push("ref=" + E(v.ref))
                }
                c = [];
                ab(ai)
            } catch(ah) {
                throw (ah)
            }
        };
        o.custom = function() {
            var ad = arguments[0];
            var ah = arguments;
            var af = [];
            for (var ag = 1,
            q = ah.length; ag < q; ag++) {
                try {
                    af[ag - 1] = ah[ag] == null ? "0": (ah[ag] + "").replace(/\|/g, " ")
                } catch(ai) {}
            }
            if (af[af.length - 1] == "") {
                af[af.length - 1] = "-"
            }
            var m = E(af.shift());
            var ae = E(af.shift());
            var aj = af.join("|");
            var ak = i(w, ad);
            c.push("jzqval");
            w.jzqval = encodeURIComponent(aj);
            o["$logData"]("&jzqotp=5&jzqt=tran&jzqkey=" + ak + "&jzqo=" + m + "&jzqot=" + ae)
        };
        o.$logAction = function(m, ag, ae, ad, q) {
            J[5] = 1;
            Q();
            var af = ["&qzjecom=1&logtype=ecom"];
            af.push("qzjregc=1");
            ab(af)
        };
        var w = {};
        var c = [];
        function i(ad, q) {
            var m = q;
            while (ad[m]) {
                m = m + " "
            }
            return m
        }
        function T(af, ad, ae, q, ag, m) {
            q = q || "|";
            o[af] = function() {
                if (ag) {
                    if (ag.apply(window, arguments) === true) {
                        return
                    }
                }
                var am = [];
                var ai = m ? m.apply(window, arguments) : arguments;
                for (var ak = 0,
                ah = ai.length; ak < ah; ak++) {
                    try {
                        am[ak] = ai[ak] == null ? "0": (ai[ak] + "").replace(/\|/g, " ")
                    } catch(an) {}
                }
                if (am[am.length - 1] == "") {
                    am[am.length - 1] = "-"
                }
                var al = am.join(q);
                if (ad == "qzjgono" && arguments[2]) {
                    ad = "qzjgo"
                }
                var aj = i(w, ad);
                c.push(aj);
                w[aj] = encodeURIComponent(al)
            }
        }
        T("$addBrand", "qzjbr");
        T("$addCategory", "qzjca");
        T("$addGoods", "qzjgono", 0, null,
        function(ag, ai, m, ad, af, ah) {
            v.pageId = ad;
            v.goodsId = ad;
            if (b.ref) {
                var q = document.location.href.split("#")[0];
                var ae = b.ref.replace("#{url}", q);
                v.ref = ae
            }
        });
        T("$addCartGoods", "qzjcag", 0);
        T("$addCartPackage", "qzjcap", 0);
        T("$addCartPackageGoods", "qzjcapg", 0);
        T("$addOrderInner", "qzjor", 0, null,
        function(q) {
            v.pageId = q;
            try {
                e(L, 9);
                e(J, 3);
                e(Y, 2);
                Q()
            } catch(m) {}
        },
        function(m, ad, ag, af, ae, q) {
            return [m, ad]
        });
        o["$logOrder"] = function(m, ad, ah, af, ae, q) {
            m = m + "";
            var ag = ["jzqt=tran"];
            ag.push("jzqo=" + E(m));
            ag.push("jzqot=" + E(ad));
            ah && ag.push("jzqo1=" + E(ah));
            af && ag.push("jzqo2=" + E(af));
            ae && ag.push("jzqo3=" + E(ae));
            q && ag.push("jzqo4=" + E(q));
            o.$log(ag);
            if (q + "" == "0") {
                L[8] = 1;
                J[5] = 1;
                return
            }
            if (m == "" || m == "0") {
                return
            }
            o.$addOrderInner(m, ad, ah, af, ae, q);
            o.$logData()
        };
        o["$addOrder"] = o["$logOrder"];
        o["$logItem"] = function(m, ag, q, ad, ae) {
            var af = ["jzqt=item"];
            af.push("jzqo=" + E(m));
            af.push("jzqix=" + E(ag));
            af.push("jzqin=" + E(q));
            af.push("jzqip=" + E(ad));
            af.push("jzqiq=" + E(ae));
            o.$log(af)
        };
        T("$setPageUrl", "qzjurl", 0, null,
        function(m) {
            v.pageUrl = m
        });
        T("setPageUrl", "qzjurl", 0, null,
        function(m) {
            v.pageUrl = m
        });
        T("$addOrderPackage", "qzjorp", 0);
        T("$addOrderPackageGoods", "qzjorpg", 0);
        T("$addItem", "qzjorg", 0, null,
        function(m, q) {},
        function(m, ai, ae, ag, ah) {
            var ad = [];
            for (var af = 0,
            q = arguments.length; af < q; af++) {
                ad[af] = arguments[af]
            }
            ad[4] = ad[4] - 0;
            isNaN(ad[4]) && (ad[4] = 0);
            if (ad[5] && ad[5].indexOf("http") != 0) {
                ad[5] = "http://" + window.location.hostname + ad[5]
            }
            if (v.pageType == "ordercreate") {
                o.$logItem(m, ai, ae, ag, ah)
            }
            return ad
        });
        T("$addSearchResult", "qzjse");
        T("$addComparedGoods", "qzjcog", 0);
        T("$addGoodsFavorite", "qzjgof", 0);
        T("$addGift", "qzjgi", 0);
        T("$addHistory", "qzjorg", 0);
        T("$addOrderDetail", "qzjord");
        T("$addRecentOrderedGoods", "qzjreog");
        window._MBAInit = false;
        if (!window._MBAInit) {
            d();
            Q()
        } else {
            return
        }
        window._MBAInit = true;
        var N = window._mvq || [];
        if (window._mv_loader) {
            var O = window._mv_loader,
            U = O.cmdList;
            O.reg(b.runCmd, b.runCmd.push);
            b.runCmd.push.apply(b.runCmd, U);
            return
        } else {
            if (N instanceof Array) {
                b.runCmd.push.apply(b.runCmd, N);
                window._mvq = b.runCmd
            }
        }
    })()
})();