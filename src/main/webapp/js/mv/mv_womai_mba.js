(function() {
    var a = window.mediav || {};
    window.mediav = a;
    a.paramFilter = function(g, c, f) {
        if (document.domain.indexOf("jiuxian") >= 0 && c.pageType == "cartview") {
            for (var e = 0,
            b = g.length; e < b; e++) {
                var d = g[e].split("=")[0];
                if (d == "qzjgo") {
                    g[e] = g[e].replace("qzjgo", "qzjgono")
                }
            }
        }
        if (f == "m-6-0" || f == "m-21037-0" || f == "m-21039-1") {
            for (var e = 0,
            b = g.length; e < b; e++) {
                var d = g[e].split("=")[0];
                if (d == "qzjgo") {
                    g[e] = g[e].replace("qzjgo", "qzjgono")
                }
            }
        }
        if (f == "m-214-0") {
            g.push("qzjurl=" + encodeURIComponent(window.location.href))
        }
    }
})(); (function() {
    try {
        var b = window.mediav || {};
        window.mediav = b;
        b.test = function(c) {};
        if (window.mba_lite) {
            return
        }
        window.mba_lite = 1;
        window.$mat = 1;
        b.cookie = {};
        b.$version = "3.3.9.1";
        b.cookie._isValidKey = function(c) {
            return (new RegExp('^[^\\x00-\\x20\\x7f\\(\\)<>@,;:\\\\\\"\\[\\]\\?=\\{\\}\\/\\u0080-\\uffff]+\x24')).test(c)
        };
        if (window._mv_loader && !window._mv_loader.$version && window._mv_loader.getRandom) { (function() {
                var c = new Date() - 0;
                window._mv_loader.getRandom = function(e) {
                    var d;
                    if (e == "mv") {
                        _mv_loader.mv++;
                        d = _mv_loader.mv
                    } else {
                        _mv_loader.mba++;
                        d = _mv_loader.mba
                    }
                    return _mv_loader.random && _mv_loader.random[d] || (c + "" + d)
                }
            })()
        }
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
        b.truncation = function(g, d, e) {
            for (var f = 0,
            h = 0; f < g.length && h < d; f++) {
                h++;
                if (g.charCodeAt(f) > 128) {
                    h += 8
                }
            }
            return g.substr(0, f) + ((e && g.length) > f ? "": "")
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
                i = l.split("://")[1];
                if (i) { (i.indexOf("/") >= 0) && (i = i.split("/")[0])
                }
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
            return new b.sourceX("(ref)", e, d)
        };
        b.sourceX = function(d, c, e) {
            this.srcName = c;
            this.content = e
        };
        b.updateSingleSource = function(d, h, c, f, i) {
            if (!c) {
                return
            }
            var e = "jzqsr=" + c.srcName + "|jzqct=" + c.content;
            var g = h.split(".");
            if (g.length < 6) {
                g[0] = 1;
                g[1] = f;
                g[2] = f;
                g[3] = 1;
                g[4] = "jzqsr=" + c.srcName + "|jzqct=" + c.content;
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
        function y() {
            if (window.$mv_fpass) {
                return
            }
            var m = document.createElement("script");
            m.type = "text/javascript";
            m.async = true;
            m.src = "http://material.mediav.com/bjjs/fpass.js";
            var q = document.getElementsByTagName("script")[0];
            q.parentNode.insertBefore(m, q)
        }
        function H(m) {
            return encodeURIComponent(m)
        }
        var af = new RegExp("(^[\\s\\t\\xa0\\u3000]+)|([\\u3000\\xa0\\s\\t]+\x24)", "g");
        function ad(m) {
            return String(m).replace(af, "")
        }
        function e(q, m) {
            q[m] = "" + (q[m] ? q[m] * 1 + 1 : 1)
        }
        var k;
        var x = {};
        var A = true;
        var r = b.commands = {};
        var i = function(ai) {
            ai = [].slice.call(ai, 0);
            var ah = [],
            q = [],
            m = [];
            for (var ag = 0; ai[ag]; ag++) {
                switch (ai[ag][0]) {
                case "$setGeneral":
                    ah.push(ai[ag]);
                    break;
                case "$setAccount":
                    ah.unshift(ai[ag]);
                    break;
                case "$logConversion":
                    q.push(ai[ag]);
                    break;
                case "$logData":
                    q.unshift(ai[ag]);
                    break;
                default:
                    m.push(ai[ag])
                }
            }
            return ah.concat(m).concat(q)
        };
        b.runCmd = {
            push: function() {
                var q = arguments.length;
                arguments = i(arguments);
                for (var ag = 0; ag < q; ag++) {
                    var m = [];
                    Array.prototype.push.apply(m, arguments[ag]);
                    var ah = m.shift();
                    r[ah] && r[ah].apply(this.runner, m)
                }
            }
        };
        function D() {
            var m = window.location.host;
            return m
        }
        function I() {
            if (document.domain.indexOf("banggo.com") >= 0) {
                return ".banggo.com"
            }
            if (document.domain.indexOf("xueersi.com") >= 0) {
                return ".xueersi.com"
            }
            if (document.domain.indexOf("cn100.com") >= 0) {
                return ".cn100.com"
            }
            if (document.domain.indexOf("shangpin.com") >= 0) {
                return ".shangpin.com"
            }
            return ""
        }
        function Z(ah) {
            var ag = 1,
            q = 0,
            m;
            if (ah) {
                ag = 0;
                for (m = ah.length - 1; m >= 0; m--) {
                    q = ah.charCodeAt(m);
                    ag = (ag << 6 & 268435455) + q + (q << 14);
                    q = ag & 266338304;
                    ag = q != 0 ? ag ^ q >> 21 : ag
                }
            }
            return ag
        }
        function U() {
            return Math.round(Math.random() * 2147483647) ^ Z(s + t) & 2147483647
        }
        function N() {
            var m = (new Date() - 0);
            return [1, U(), m, m, m, m, m, 0, 0, 0, 0, 0]
        }
        function L() {
            var m = (new Date() - 0);
            return [1, m, 0, 0, 1, 0]
        }
        function J() {
            return 1
        }
        function f() {
            return [0, 0, 0]
        }
        var aa = new Date();
        aa.setDate(aa.getDate() + 1);
        aa.setHours(0);
        aa.setMinutes(0);
        aa.setSeconds(0);
        var u = aa - new Date();
        var B = 63072000000;
        var w = 15768000000;
        var P = 1800000;
        var g = new Date() - 0;
        var s = document.referrer;
        var t = D();
        var v = I();
        var G = b.cookie;
        var O = G.get("_qzja");
        var M = G.get("_qzjb");
        var K = G.get("_qzjc");
        var ab = G.get("_qzjto");
        var h = G.get("_jzqosr");
        if (window.location.href.indexOf("_mvosr") >= 0) {
            osr = window.location.href.split("_mvosr=")[1];
            h = osr.split(/#|&/g)[0]
        }
        var C = G.get("_jzqco");
        var E = [];
        window.random = E;
        if (!C) {
            var o = G.get("_jzqx");
            var n = G.get("_jzqy");
            var l = G.get("_jzqz")
        } else {
            var Y = C.split("|");
            o = Y[0];
            n = Y[1];
            l = Y[2];
            o = decodeURIComponent(o);
            n = decodeURIComponent(n);
            l = decodeURIComponent(l)
        }
        if (v) {
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
        var ac = !O || !M || !K;
        O = O ? O.split(".") : N();
        M = M ? M.split(".") : L();
        K = K || J();
        ab = ab ? ab.split(".") : f();
        var S;
        function d() {
            var m = new Date() - 0;
            if (ac) {
                O[3] = O[4];
                O[4] = m;
                M[4] = 1;
                e(O, 11);
                e(ab, 1)
            } else {
                M[4] = 0
            }
            O[5] = O[6];
            O[6] = m;
            e(O, 10);
            e(M, 2);
            e(ab, 0)
        }
        function T() {
            G.set("_qzja", O.join("."), {
                expires: B,
                domain: v,
                path: "/"
            });
            G.set("_qzjb", M.join("."), {
                expires: P,
                domain: v,
                path: "/"
            });
            G.set("_qzjc", K, {
                domain: v,
                path: "/"
            });
            G.set("_qzjto", ab.join("."), {
                expires: u,
                domain: v,
                path: "/"
            });
            var m = encodeURIComponent(o || "") + "|" + encodeURIComponent(n || "") + "|" + encodeURIComponent(l || "")
        }
        function ae(al, m) {
            try {
                if (M[5] && x.userName) {
                    O[8] = 1;
                    T()
                }
                var ah = [O[0], O[1], (O[2] + "").substring(0, 10), (O[3] + "").substring(0, 10), (O[4] + "").substring(0, 10), O[10]].join(".");
                var q = ["_jzqa=" + ah];
                o && (q.push("_jzqx=" + o));
                n && (q.push("_jzqy=" + n));
                l && (q.push("_jzqz=" + l));
                q = encodeURIComponent(q.join(";+"));
                al = al || [];
                al.push("type=3&db=none");
                if (!m) {
                    al.push("qzja=" + O.join("."), "qzjb=" + M.join("."), "qzjto=" + ab.join("."));
                    al.push("jzqh=" + t);
                    al.push("jzqpt=" + H(x.pageTitle || b.truncation(document.title, 400)));
                    al.push("jzqre=" + H(s.substr(0, 400)));
                    O[7] && al.push("qzjhn=" + O[7]);
                    x.userId && al.push("qzjui=" + H(x.userId));
                    x.userName && al.push("qzjun=" + H(x.userName));
                    x.pageType && al.push("qzjpt=" + H(x.pageType));
                    x.pageId && al.push("qzjpi=" + H(x.pageId))
                }
                h && al.push("jzqosr=" + h);
                al.push("jzqc=" + q);
                al.push("jzqs=" + k);
                al.push("jzqv=" + b.$version);
                if (al[0].indexOf("logtype") < 0) {
                    al.push("jzqrd=" + ((window._mv_loader && window._mv_loader.getRandom && window._mv_loader.getRandom("mba")) || (new Date() - 0)))
                } else {
                    if (x.goodsId) {
                        al.push("qzjgoi=" + x.goodsId)
                    }
                    if (x.sign) {
                        al.push(x.ss ? "qzjcode=": "qzjsign=" + x.sign)
                    }
                    al.push("jzqrd=0" + g)
                }
                if (document.domain.indexOf("yougou.com") >= 0) {
                    al.push("ref=" + encodeURIComponent(window.location.href))
                }
                if (document.domain.indexOf("nuomi.com") >= 0) {
                    al.push("ref=" + encodeURIComponent("http://" + document.location.host + document.location.pathname))
                }
                if (window.location.href.indexOf("juxiao.mediav.com") >= 0) {
                    al.push("ref=" + encodeURIComponent(window.location.href))
                }
                if (b.paramFilter) {
                    b.paramFilter(al, x, k)
                }
                var ai = al.join("&").replace(/%0A|%0D|%09/g, "")
            } catch(aj) {
                b.test("t3=err3" + aj.type)
            }
            var ak = window.mediav_protocol || document.location.protocol;
            var ag = ("https:" == ak ? "https://secure.mediav.com/t?": "http://mvp.mediav.com/t?") + ai;
            if (ag.length < 2036) {
                if (ai.indexOf("logtype=ecom") < 0 && ai.indexOf("jzqt=") < 0) {
                    ag = ag.replace("type=3&db=none", "type=6&db=none");
                    b.sendRequestByJsonp(ag,
                    function(ap) {
                        ap = "?status=" + ap.replace("_mvctn=", "");
                        var at = b.queryToJson(ap);
                        var am = at.status;
                        if (am == "0") {
                            var ao = at.time;
                            var ar = at.rdom;
                            h = at.osr || h;
                            var an = b.createCampaignSource(at);
                            l = b.updateSingleSource("_jzqz=", l, an, ao);
                            try {
                                ar = decodeURIComponent(ar)
                            } catch(aq) {}
                            if (ar != "") {
                                an = b.createSearchSource(ar);
                                if (an) {
                                    n = b.updateSingleSource("_jzqy=", n, an, ao)
                                } else {
                                    an = b.createRefSource(ar);
                                    o = b.updateSingleSource("_jzqx=", o, an, ao)
                                }
                            }
                        }
                        if (M[4] == 0) {
                            return
                        }
                        M[4] = 0;
                        T()
                    })
                } else {
                    b.sendRequest(ag,
                    function() {
                        if (M[4] == 0) {
                            return
                        }
                        M[4] = 0;
                        T()
                    })
                }
                if (document.domain.indexOf("masamaso.com") >= 0) {
                    ai = ai.replace(/m-6-0/g, "m-23111-1");
                    b.sendRequest("http://mvp.mediav.com/t?" + ai)
                }
            } else {
                var ak = window.mediav_protocol || document.location.protocol;
                var ag = "https:" == ak ? "https://secure.mediav.com/t?": "http://mvp.mediav.com/t?";
                b.sendByAjaxRequest(ai,
                function() {
                    if (ai.indexOf("logtype=ecom") >= 0 || M[4] == 0) {
                        return
                    }
                    M[4] = 0;
                    T()
                },
                "http://mvp.mediav.com/t?")
            }
        }
        function V(q, m, ag) {
            m = m.replace(/%0A|%0D|%09/g, "");
            var ah = q + m + (ag || "");
            return Z(ah)
        }
        r.$setDomainName = function(m) {
            v = m
        };
        r.$setAccount = function(m) {
            k = m;
            if (k.indexOf("m-") != 0) {
                y();
                k = "m-" + k + "-0"
            }
            if (k == "m-26165-0") {
                window._mv_loader && (_mv_loader.reg = function() {});
                window.$mvt && ($mvt.$getTrackerByName = function() {
                    return {}
                })
            }
        };
        r.$setGeneral = function(q, m, ai, ag, ah) {
            if (q != x.pageType) {
                if (A == false && (q == "goodsdetail" || q == "cartview" || q == "ordercreate")) {
                    A = false
                } else {
                    A = true
                }
            }
            ah && (x.pageTyp = ah);
            x.pageType = q || x.pageType || "";
            x.pageId = m || "";
            x.userName = ai || "";
            O[7] = H(ai).replace(/\./g, "_");
            x.userId = ag || x.userId || "";
            if (q == "registered" || (M[5] == 1 && ai && O[8] != 1)) {
                r.$logOrder(ag || ("rad" + new Date() - 0), 0, ai || "", "", "", "0");
                O[8] = 1;
                M[5] = 1;
                M[6] = 1;
                T()
            }
            if (q == "cartview") {
                r["$addItem"] = function() {
                    if (arguments[3]) {
                        r["$addGoods"].apply(r, arguments)
                    } else {
                        for (var ak = 0,
                        aj = arguments.length; ak < aj; ak++) {
                            if (arguments[ak]) {
                                x.goodsId ? (x.goodsId += "," + arguments[ak]) : (x.goodsId = arguments[ak])
                            }
                        }
                    }
                    r["$logData"]("&")
                }
            }
        };
        r.$logConversion = function(m) {
            if (A || m) {
                if (x.pageType) {
                    ae()
                } else {
                    setTimeout(function() {
                        ae()
                    },
                    10)
                }
            } else {
                window._mv_loader && window._mv_loader.getRandom && window._mv_loader.getRandom("mba")
            }
            A = false
        };
        r.$setRef = function(m) {
            b.ref = m
        };
        r.$log = function(m) {
            ae(m, 1)
        };
        r.$logData = function(ah) {
            try {
                var ak = ["qzjecom=1&logtype=ecom"];
                for (var ag = 0,
                m = c.length; ag < m; ag++) {
                    var q = c[ag],
                    ai = z[q];
                    if (ai) {
                        ak.push(ad(q) + "=" + ai)
                    }
                    if (q == "qzjor") {
                        delete z[q]
                    }
                    if (q == "qzjgo" && !x.sign) {
                        x.sign = V(k, ai, x.pageUrl)
                    }
                }
                if (ah) {
                    ak.push(ah)
                }
                if (ak.length == 1 && !x.goodsId) {
                    return
                }
                if (x.ref) {
                    ak.push("ref=" + H(x.ref))
                }
                c = [];
                ae(ak)
            } catch(aj) {
                throw (aj)
            }
        };
        r.$logAction = function(m, aj, ah, ag, q) {
            var ai = ["&qzjecom=1&logtype=ecom"];
            if (m == "regbtnclick") {
                M[5] = 1;
                T();
                ai.push("qzjregc=1");
                ae(ai)
            }
        };
        var z = {};
        var c = [];
        function j(ag, q) {
            var m = q;
            while (ag[m]) {
                m = m + " "
            }
            return m
        }
        function W(ai, ag, ah, q, aj, m) {
            q = q || "|";
            r[ai] = function() {
                if (aj) {
                    if (aj.apply(window, arguments) === true) {
                        return
                    }
                }
                var ap = [];
                var al = m ? m.apply(window, arguments) : arguments;
                for (var an = 0,
                ak = al.length; an < ak; an++) {
                    try {
                        ap[an] = al[an] == null ? "0": (al[an] + "").replace(/\|/g, " ")
                    } catch(aq) {}
                }
                if (ap[ap.length - 1] == "") {
                    ap[ap.length - 1] = "-"
                }
                var ao = ap.join(q);
                if (ag == "qzjgo" && !arguments[2]) {
                    return
                }
                var am = j(z, ag);
                c.push(am);
                z[am] = encodeURIComponent(ao)
            }
        }
        r.custom = function() {
            var ag = arguments[0];
            var ak = arguments;
            var ai = [];
            for (var aj = 1,
            q = ak.length; aj < q; aj++) {
                try {
                    ai[aj - 1] = ak[aj] == null ? "0": (ak[aj] + "").replace(/\|/g, " ")
                } catch(al) {}
            }
            if (ai[ai.length - 1] == "") {
                ai[ai.length - 1] = "-"
            }
            var m = H(ai.shift());
            var ah = H(ai.shift());
            var am = ai.join("|");
            var an = j(z, ag);
            c.push("jzqval");
            z.jzqval = encodeURIComponent(am);
            r["$logData"]("&jzqotp=5&jzqt=tran&jzqkey=" + an + "&jzqo=" + m + "&jzqot=" + ah)
        };
        var F = (function() {
            var m = document.domain.indexOf("yougou") >= 0;
            return m
        })();
        W("$addBrand", "qzjbr", null,
        function(m, q) {
            x.pageId = q
        });
        W("$addPricing", "qzjpricing");
        W("$addCategory", "qzjca");
        W("$addGoods", F ? "qzjgono": "qzjgo", 0, null,
        function(aj, al, m, ag, ai, ak) {
            x.pageId = ag;
            x.goodsId = ag;
            if (b.ref) {
                var q = document.location.href.split("#")[0];
                var ah = b.ref.replace("#{url}", q);
                x.ref = ah
            }
        },
        function() {
            var m = Array.prototype.slice.apply(arguments);
            var q = m[11];
            if (q && isNaN(q)) {
                q = q.replace(/-/g, "/");
                m[11] = parseInt((new Date(q) - 0) / 1000)
            }
            return m
        });
        W("$addCartGoods", "qzjcag", 0);
        W("$addCartPackage", "qzjcap", 0);
        W("$addCartPackageGoods", "qzjcapg", 0);
        W("$addOrderInner", "qzjor", 0, null,
        function(q) {
            x.pageId = q;
            try {
                e(O, 9);
                e(M, 3);
                e(ab, 2);
                T()
            } catch(m) {}
        },
        function(m, ag, aj, ai, ah, q) {
            return [m, ag]
        });
        r["$logOrder"] = function(m, ag, ak, ai, ah, q) {
            m = m + "";
            var aj = ["jzqt=tran"];
            aj.push("jzqo=" + H(m));
            aj.push("jzqot=" + H(ag));
            ak = ak || x.userName;
            ai = ai || x.userId;
            ak && aj.push("jzqo1=" + H(ak));
            ai && aj.push("jzqo2=" + H(ai));
            ah && aj.push("jzqo3=" + H(ah));
            q && aj.push("jzqo4=" + H(q));
            r.$log(aj);
            window.mv_send_order = true;
            window.mv_order_callback && (window.mv_order_callback());
            if (q + "" == "0") {
                O[8] = 1;
                M[5] = 1;
                return
            }
            if (m == "" || m == "0") {
                return
            }
            r.$addOrderInner(m, ag, ak, ai, ah, q);
            r.$logData()
        };
        r["$addOrder"] = r["$logOrder"];
        r["$logItem"] = function(m, aj, q, ag, ah) {
            var ai = ["jzqt=item"];
            ai.push("jzqo=" + H(m));
            ai.push("jzqix=" + H(aj));
            ai.push("jzqin=" + H(q));
            ai.push("jzqip=" + H(ag));
            ai.push("jzqiq=" + H(ah));
            r.$log(ai)
        };
        r["$addSign"] = function(m) {
            x.sign = m;
            x.ss = true
        };
        W("$addOrderPackage", "qzjorp", 0);
        W("$addOrderPackageGoods", "qzjorpg", 0);
        W("$addItem", "qzjorg", 0, null, null,
        function(m, al, ah, aj, ak) {
            if (document.domain.indexOf("banggo.com") >= 0) {
                al = ("" + al).substr(0, 6)
            }
            var ag = [];
            for (var ai = 0,
            q = arguments.length; ai < q; ai++) {
                ag[ai] = arguments[ai]
            }
            ag[4] = ag[4] - 0;
            isNaN(ag[4]) && (ag[4] = 0);
            if (ag[5] && ag[5].indexOf("http") != 0) {
                ag[5] = "http://" + window.location.hostname + ag[5]
            }
            r.$logItem(m, al, ah, aj, ak);
            return ag
        });
        W("$addSearchResult", "qzjse");
        W("$addComparedGoods", "qzjcog", 0);
        W("$addGoodsFavorite", "qzjgof", 0, null,
        function(m) {
            x.pageType = "concern";
            x.goodsId = m
        });
        W("$setPageUrl", "qzjurl", 0, null,
        function(m) {
            if (!m) {
                return true
            }
            x.pageUrl = m
        });
        W("setPageUrl", "qzjurl", 0, null,
        function(m) {
            if (!m) {
                return true
            }
            x.pageUrl = m
        });
        W("$addGift", "qzjgi", 0);
        W("$addHistory", "qzjorg", 0);
        W("$addOrderDetail", "qzjord");
        W("$addRecentOrderedGoods", "qzjreog");
        window._MBAInit = false;
        if (!window._MBAInit) {
            d();
            T()
        } else {
            return
        }
        window._MBAInit = true;
        var Q = window._mvq;
        if (window._mv_loader) {
            var R = window._mv_loader,
            X = R.cmdList;
            R.reg(b.runCmd, b.runCmd.push);
            b.runCmd.push.apply(b.runCmd, X);
            return
        } else {
            if (Q instanceof Array) {
                b.runCmd.push.apply(b.runCmd, Q)
            }
            window._mvq = b.runCmd
        }
        function p(ag) {
            window._mba_cfg = function(aj) {
                if (aj.icon == 0) {
                    return
                }
                var ai = document.createElement("a");
                ai.href = "http://www.fenxi.com/";
                ai.className = "mba-icon";
                var ak = aj.icon > 2 ? "3": aj.icon + "-" + aj.iconcolor;
                ai.style.cssText = "display:block;position:absolute;left:0;height:30px;background:url('http://material.mediav.com/skuretarget/icons/" + ak + ".jpg')";
                ai.target = "_blank";
                ai.style.width = aj.icon == 1 ? "32px": "84px";
                var ah = Math.max(document.documentElement.scrollHeight, document.body.scrollHeight, document.documentElement.clientHeight);
                ai.style.top = ah - 30 + "px";
                document.body.insertBefore(ai, document.body.childNodes[0])
            };
            var m = document.createElement("script");
            m.type = "text/javascript";
            m.async = true;
            m.src = "http://static.fenxi.com/msc/" + ag + ".js";
            var q = document.getElementsByTagName("script")[0];
            q.parentNode.insertBefore(m, q)
        }
    })()
})();