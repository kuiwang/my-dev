var pixel = {
    pixelConfig: null,
    initialize: null,
    finalize: null,
    paramArray: [],
    pageLoadStatusFlag: false,
    checkReadyStateOnIntervals: null,
    pixelFireStatus: false,
    baseUrl: null,
    parse: function() {
        var b = "",
        c = "";
        try {
            if (!pixel.pixelFireStatus) {
                pixel.checkReadyStateOnIntervals = setInterval(function() {
                    pixel.checkIfPageLoadComplete();
                    if (pixel.pageLoadStatusFlag && !pixel.pixelFireStatus) {
                        try {
                            pixel.initialize();
                            pixel.getParams();
                            pixel.finalize();
                        } catch(d) {
                            pixel.paramArray.param = "999";
                            pixel.paramArray.err = d;
                            b = pixel.getQueryString(pixel.paramArray);
                            c = pixel.baseUrl + b;
                            pixel.fireAnalyze(c);
                        }
                    }
                },
                3000, "Javascript");
            }
        } catch(a) {
            pixel.paramArray.param = "999";
            pixel.paramArray.err = a;
            b = pixel.getQueryString(pixel.paramArray);
            c = pixel.baseUrl + b;
            pixel.fireAnalyze(c);
        }
    },
    checkIfPageLoadComplete: function() {
        if (document.readyState === "interactive" || document.readyState === "complete") {
            pixel.pageLoadStatusFlag = true;
            clearInterval(pixel.checkReadyStateOnIntervals);
        } else {
            pixel.pageLoadStatusFlag = false;
        }
    },
    getParams: function() {
        var b = "",
        a = "",
        c = "";
        for (var d in pixel.pixelConfig) {
            if (pixel.pixelConfig.hasOwnProperty(d) && pixel.pixelConfig[d]) {
                b = pixel.pixelConfig[d][1];
                a = pixel.pixelConfig[d][0];
                c = pixel.pixelConfig[d][2];
                if (b) {
                    if (b === "xpath" && a) {
                        pixel.paramArray[d] = pixel.getDataFromXPath(a, c);
                    } else {
                        if (b === "url" && c && a) {
                            pixel.paramArray[d] = pixel.getDataFromUrl(a, c);
                        }
                    }
                }
            }
        }
    },
    getDataFromXPath: function(j, k) {
        var r = [],
        f = [],
        b = [];
        var h = "",
        e, d = "";
        var q = "",
        p = "";
        var g = 0;
        var c = document.getElementsByTagName("body")[0];
        var a = true;
        e = j.replace("/html/body/", "");
        if (j.indexOf('@id="') !== -1) {
            r = j.match(/.*\[@id="(.+)"\].*/);
            if (r && r[1]) {
                h = r[1];
            }
        }
        if (h) {
            c = document.getElementById(h);
            var o = '/*[@id="' + h + '"]/';
            var n = '//*[@id="' + h + '"]/';
            var l = '//*[@id="' + h + '"]';
            var m = '*//*[@id="' + h + '"]/';
            e = e.replace(m, "");
            e = e.replace(n, "");
            e = e.replace(o, "");
            e = e.replace(l, "");
        }
        if (!e) {
            c = document.getElementById(h);
        } else {
            f = e.split("/");
            for (g = 0; g < f.length; g++) {
                if (f[g]) {
                    b = f[g].match(/(\w*)(\[(\d+)\])?/);
                    if (b) {
                        q = b[1];
                        p = 1;
                        if (b[3]) {
                            p = b[3];
                        }
                    }
                }
                if (c && c != "No Data") {
                    c = pixel.getCurrentNode(c, q, p);
                } else {
                    a = false;
                    break;
                }
            }
        }
        if (c && a && c != "No Data") {
            if (!k) {
                if (c.innerHTML) {
                    d = c.innerHTML;
                }
            } else {
                if (c.getAttribute(k)) {
                    d = c.getAttribute(k);
                }
            }
            return pixel.removeJunk(d);
        } else {
            return "";
        }
    },
    removeJunk: function(a) {
        if (a) {
            a = a.toString();
            a = a.replace(/(^\s*)|(\s*$)/gi, "");
            a = a.replace(/[ ]{2,}/gi, " ");
            a = a.replace(/\n /, "\n");
            a = a.replace(/<.*?>/g, "");
            a = a.replace(/[ \t\r\n]+/g, " ");
            a = a.replace(/^\s+|\s+$/g, "");
            a = a.replace(/&amp;/g, "&");
            return a;
        }
        return "";
    },
    getCurrentNode: function(e, c, f) {
        var b = "No Data";
        var a = 1,
        d = 0;
        if (e.childNodes) {
            var g = e.childNodes;
            for (a = 0; a <= g.length; a++) {
                if (g[a] && g[a].tagName && g[a].tagName.toLowerCase() === c) {
                    d++;
                }
                if (d == f) {
                    b = g[a];
                    break;
                }
            }
            return b;
        } else {
            return null;
        }
    },
    getDataFromUrl: function(d, c) {
        var b, a = document.URL;
        c = parseInt(c);
        b = a.match(d);
        if (b && b[c]) {
            if (c >= 0) {
                return b[c];
            } else {
                c = Math.abs(c);
                return b[b.length - c];
            }
        }
        return "";
    },
    getParamFromUrl: function(c, e) {
        var d = new RegExp("(?:\\?|&)" + e + "=(.*?)(?=&|$)", "gi");
        var b = [],
        a;
        while (a = d.exec(c)) {
            b[b.length] = a[1];
        }
        if (b.length !== 0) {
            return b[0];
        }
        return "";
    },
    fireAnalyze: function(c) {
        if (! (pixel.pixelFireStatus)) {
            var b = document.createElement("iframe");
            b.src = c;
            b.scrolling = "no";
            b.width = 1;
            b.height = 1;
            b.marginheight = 0;
            b.marginwidth = 0;
            b.frameborder = 0;
            b.style.display = "none";
            pixel.pixelFireStatus = true;
            var a = document.getElementsByTagName("script")[0];
            a.parentNode.insertBefore(b, a);
        }
    },
    paramChange: function(a) {
        if (a) {
            a = a.toString();
            a = a.replace(/<.*?>/g, "");
            a = a.replace(/[ \t\r\n]+/g, " ");
            a = a.replace(/^\s+|\s+$/g, "");
            a = a.replace(/&amp;/g, "&");
            a = encodeURIComponent(encodeURIComponent(a));
            return a;
        }
        return "";
    },
    getCookie: function(b) {
        var d = document.cookie;
        if (!b) {
            return "";
        }
        if (d.length > 0) {
            var c = d.indexOf(b + "=");
            if (c != -1) {
                c = c + b.length + 1;
                var a = d.indexOf(";", c);
                if (a == -1) {
                    a = d.length;
                }
                if (d.substring(c, a)) {
                    return decodeURIComponent(d.substring(c, a));
                }
            }
        }
        return "";
    },
    setCookie: function(b, f, c) {
        var e = ".sfbest.com";
        var a = e ? ("; domain=" + e) : "";
        if (c > 0) {
            var g = new Date();
            g.setDate(g.getDate() + c);
            var d = encodeURIComponent(f) + ((c == null) ? "": "; expires=" + g.toUTCString()) + "; path=/" + a;
            document.cookie = b + "=" + d;
        } else {
            document.cookie = b + "=" + encodeURIComponent(f);
        }
    },
    getQueryString: function(a) {
        var c = a.account_id;
        var e = "?account_id=" + c;
        delete a.account_id;
        var d = "";
        for (var b in a) {
            if (a.hasOwnProperty(b)) {
                d = a[b];
                e += "&" + b + "=" + pixel.paramChange(d);
            }
        }
        return e;
    },
    getElementsByClass: function(f, b, k) {
        var h = [];
        k = k || "*";
        b = b || document;
        var d = b.getElementsByTagName(k);
        var a = d.length;
        var g = new RegExp("(^|\\s)" + f + "(\\s|$)");
        for (var e = 0,
        c = 0; e < a; e++) {
            if (g.test(d[e].className)) {
                h[c] = d[e];
                break;
            }
        }
        return h;
    }
};
pixel.baseUrl = ("https:" == document.location.protocol ? "https://cn-pl": "http://cn-pl") + ".vizury.com/analyze/analyze.php";
pixel.initialize = function() {
    var h = document,
    e = "undefined",
    l = encodeURIComponent,
    B = decodeURIComponent;
    var L = "",
    f = "",
    E = "",
    C = "",
    p, A, P = "",
    H = "",
    b = "",
    v = "";
    var T = "",
    m = false,
    J = "",
    F = "",
    a = "",
    z = "",
    n = "",
    M = "",
    D = ["", "", ""],
    S = 0,
    g = 1,
    w = 1,
    y = 0;
    var R = "Nprd",
    I = "Nclk",
    u = "userLogin",
    j = "Nsc",
    o = "NTy",
    t = "NCviz";
    var K = "",
    d;
    var c = h.URL.toLowerCase();
    pixel.paramArray.account_id = "VIZVRM1326";
    pixel.paramArray.section = pixel.paramArray.level = "1";
    if (typeof google_tag_params !== e && google_tag_params) {
        if (google_tag_params.ecomm_pagetype) {
            v = google_tag_params.ecomm_pagetype;
        }
        if (google_tag_params.ecomm_prodid) {
            M = google_tag_params.ecomm_prodid;
        }
    }
    var r = "%E5%8A%A0%E5%85%A5%E8%B4%AD%E7%89%A9%E8%BD%A6";
    p = h.getElementById("cart-add-btn-sf");
    if (p) {
        C = p.getElementsByTagName("a")[0];
        if (C && l(C.innerHTML).indexOf(r) !== -1) {
            m = true;
        }
    }
    var O = pixel.getCookie(R);
    if (!O) {
        O = 0;
    }
    var G = pixel.getCookie(o);
    if (!G) {
        G = 0;
    }
    var N = pixel.getCookie(t);
    if (!N) {
        N = 0;
    }
    var k = pixel.getCookie(I);
    if (!k) {
        k = 0;
    }
    var x = pixel.getCookie(j);
    if (!x) {
        x = 0;
    }
    if (c.indexOf("utm_source") !== -1 || c.indexOf("gclid") !== -1) {
        if (k != 0) {
            k = Number(k) + 1;
            pixel.setCookie(I, k, 30);
        } else {
            pixel.setCookie(I, 1, 30);
        }
    }
    if (N != 0) {
        N = Number(N) + 1;
        pixel.setCookie(t, N, 30);
    } else {
        pixel.setCookie(t, 1, 30);
    }
    if (c.indexOf("cart.sfbest.com/order/prompt/?orderid=") !== -1 || v == "purchase" || c.indexOf("cart.sfbest.com/order/msg/?orderid=") !== -1) {
        if (typeof google_tag_params !== e && google_tag_params) {
            if (google_tag_params.ecomm_totalvalue) {
                f = google_tag_params.ecomm_totalvalue;
            }
        }
        if (!f) {
            if (typeof s !== e && s && s.ordermoney) {
                f = s.ordermoney;
            }
        }
        p = h.getElementById("orderId");
        if (p) {
            L = p.value;
        }
        if (!L) {
            if (typeof s !== e && s && s.orderid) {
                L = s.orderid;
            }
        }
        if (M[0] && M[0] !== null) {
            if (M[0].indexOf(",") !== -1) {
                P = M[0].split(",");
                for (S = 0; S < 3; S++) {
                    if (P[S] !== null && typeof P[S] !== e) {
                        D[y++] = P[S];
                    }
                }
            } else {
                D[0] = M[0];
            }
        }
        p = h.getElementById("main");
        if (p) {
            C = pixel.getElementsByClass("newdingdan", p, "table");
            if (C[0] && C[0].rows[1] && C[0].rows[1].cells[3]) {
                var q = C[0].rows[1].cells[3];
                K = pixel.removeJunk(q.innerHTML.replace(/(<([^>]+)>)/ig, "")).replace(/[0-9.,]/g, "");
            }
        }
        if (c.indexOf("cart.sfbest.com/order/msg/?orderid=") !== -1) {
            pixel.paramArray.level = "2";
            if (G != 0) {
                G = Number(G) + 1;
                pixel.setCookie(o, G, 45);
            } else {
                pixel.setCookie(o, 1, 45);
            }
        }
        if (L && f && K && (D[0] || D[1] || D[2])) {
            pixel.paramArray.param = "e500";
            pixel.paramArray.orderid = L;
            pixel.paramArray.orderprice = f;
            pixel.paramArray.pid1 = D[0];
            pixel.paramArray.pid2 = D[1];
            pixel.paramArray.pid3 = D[2];
            pixel.paramArray.currency = K;
        } else {
            pixel.paramArray.level = 2;
            pixel.paramArray.param = "e100";
        }
    } else {
        if (v == "cart" || c.indexOf("cart.sfbest.com/cart/index") !== -1 || c.indexOf("cart.sfbest.com/order/index") !== -1) {
            if (M[0]) {
                if (M[0].indexOf(",") !== -1) {
                    P = M[0].split(",");
                    for (S = 0; S < 3; S++) {
                        if (P[S]) {
                            D[y++] = P[S];
                        }
                    }
                } else {
                    D[0] = M[0];
                }
            } else {
                if (typeof s !== e && s && s.shopcart) {
                    P = s.shopcart;
                    if (P.indexOf("|") !== -1) {
                        P = P.split("|");
                        for (S = 0; S < 3; S++) {
                            if (P[S]) {
                                D[y++] = P[S];
                            }
                        }
                    } else {
                        D[0] = P;
                    }
                }
            }
            if (x != 0) {
                x = Number(x) + 1;
                pixel.setCookie(j, x, 30);
            } else {
                pixel.setCookie(j, 1, 30);
            }
            if (c.indexOf("/order/") !== -1) {
                pixel.paramArray.level = 2;
            }
            pixel.paramArray.pid1 = D[0];
            pixel.paramArray.pid2 = D[1];
            pixel.paramArray.pid3 = D[2];
            if (D[0] || D[1] || D[2]) {
                pixel.paramArray.param = "e400";
            } else {
                pixel.paramArray.param = "e100";
                pixel.paramArray.level = "2";
            }
        } else {
            if (m || v == "product") {
                pixel.paramArray.param = "e300";
                C = pixel.getElementsByClass("breadcrumb", "", "div");
                if (C[0]) {
                    J = C[0].getElementsByTagName("a");
                    for (S = 1; S < J.length; S++) {
                        if (J[S]) {
                            D[y++] = pixel.removeJunk(J[S].innerHTML);
                            if (y == 3) {
                                break;
                            }
                        }
                    }
                }
                if (typeof _SF_CFG !== e && _SF_CFG) {
                    if (_SF_CFG.number) {
                        M = _SF_CFG.number;
                    }
                }
                C = pixel.getElementsByClass("priceBox", "", "div");
                if (C[0]) {
                    A = C[0].getElementsByTagName("strong");
                    if (A[0]) {
                        P = pixel.removeJunk(A[0].innerHTML);
                        d = new RegExp("(\\d[.,\\d]+)");
                        if (d.test(P)) {
                            z = n = P.match(d)[1];
                        }
                    }
                }
                var Q = "%E4%BA%A7%E5%9C%B0%EF%BC%9A";
                C = pixel.getElementsByClass("pItemsSide", "", "div");
                if (C[0]) {
                    J = C[0].getElementsByTagName("li");
                    for (S = 0; S < J.length; S++) {
                        if (J[S]) {
                            P = l(J[S].innerHTML.replace(/(<([^>]+)>)/ig, ""));
                            if (P.indexOf(Q) !== -1) {
                                a = B(P.split(Q)[1]);
                                break;
                            }
                        }
                    }
                }
                p = h.getElementById("zoom-jpg");
                if (p) {
                    C = p.getElementsByTagName("img")[0];
                    if (C) {
                        b = C.src;
                    }
                }
                p = h.getElementById("base_name-sf");
                if (p && p.innerHTML) {
                    H = p.innerHTML;
                }
                if (!n) {
                    n = z;
                } else {
                    if (!z) {
                        z = n;
                    }
                }
                if (O != 0) {
                    O = Number(O) + 1;
                    pixel.setCookie(R, O, 30);
                } else {
                    pixel.setCookie(R, 1, 30);
                }
                if (G > 0) {
                    g = 5;
                } else {
                    if (x > 5) {
                        g = 4;
                    } else {
                        if (O >= 8) {
                            g = 3;
                        } else {
                            if (N >= 8) {
                                g = 2;
                            } else {
                                if (/union_source=(cps-yqf|cps-lkt|cps-dm)/i.test(c)) {
                                    g = 4;
                                    w = 2;
                                } else {
                                    if (/union_source=(DSP-mediav|DSP-jingzan)/i.test(c)) {
                                        g = 3;
                                        w = 2;
                                    } else {
                                        if (/union_source=/i.test(c)) {
                                            g = 2;
                                            w = 2;
                                        } else {
                                            if (k > 0) {
                                                g = 1;
                                                w = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                E = h.URL;
                if (E.indexOf("?") !== -1 || E.indexOf("&") !== -1 || E.indexOf("#") !== -1) {
                    E = E.split(/[?&#]/)[0];
                }
                pixel.paramArray.level = g;
                pixel.paramArray.section = w;
                pixel.paramArray.pid = M;
                pixel.paramArray.pname = H;
                pixel.paramArray.catid = D[0];
                pixel.paramArray.subcat1id = D[1];
                pixel.paramArray.subcat2id = D[2];
                pixel.paramArray.image = b;
                pixel.paramArray.lp = E;
                pixel.paramArray["new"] = z;
                pixel.paramArray.old = n;
                pixel.paramArray.misc = a;
            } else {
                if (v == "category" || c.indexOf("sfbest.com/productlist/search?") !== -1) {
                    pixel.paramArray.param = "e205";
                    C = h.getElementsByTagName("div");
                    for (S = 0; S < C.length; S++) {
                        if (C[S] && C[S].className == "title-c") {
                            J = C[S].getElementsByTagName("a")[0];
                            if (J && J.href && J.href.match(/\/(\d+[^\.htm])\.htm/ig)) {
                                P = J.href.match(/\/(\d+[^\.htm])\.htm/ig)[0];
                                M = P.replace(/[^0-9]/g, "");
                                if (D.indexOf(M) == -1) {
                                    D[y++] = M;
                                }
                                if (y == 3) {
                                    break;
                                }
                            }
                        }
                    }
                    if (c.indexOf("sfbest.com/productlist/search?") !== -1) {
                        pixel.paramArray.level = "2";
                    }
                    if (! (D[0] || D[1] || D[2])) {
                        pixel.paramArray.param = "e100";
                        pixel.paramArray.level = "2";
                    } else {
                        pixel.paramArray.pid1 = D[0];
                        pixel.paramArray.pid2 = D[1];
                        pixel.paramArray.pid3 = D[2];
                    }
                } else {
                    pixel.paramArray.param = "e100";
                }
            }
        }
    }
};
pixel.finalize = function() {
    var n = document,
    e = 0,
    q = "",
    m = "",
    o = ["", "", ""],
    c = 0,
    j = 0,
    h = "",
    k = "",
    a = 1,
    d = "undefined",
    l;
    var g = n.getElementById("cartNum");
    if (g) {
        e = Number(g.innerHTML);
    }
    g = n.getElementById("tEvent");
    if (g) {
        q = g.getElementsByTagName("li");
        l = new RegExp("\\/(\\d+[^\\.htm])\\.htm", "ig");
        for (j = 0; j < q.length; j++) {
            if (q[j]) {
                m = q[j].getElementsByTagName("a")[0];
                if (m && l.test(m.href)) {
                    h = m.href.match(l)[0];
                    k = h.replace(/[^0-9]/g, "");
                    if (o.indexOf(k) == -1) {
                        o[c++] = k;
                    }
                    if (c == 3) {
                        break;
                    }
                }
            }
        }
    }
    if (e > 0 && (pixel.paramArray.param == "e300" || pixel.paramArray.param == "e205" || (pixel.paramArray.param == "e100" && pixel.paramArray.level == "1"))) {
        if (pixel.paramArray.param == "e300") {
            a = 3;
        } else {
            if (pixel.paramArray.param == "e205") {
                a = 4;
            } else {
                if (pixel.paramArray.param == "e100") {
                    a = 5;
                }
            }
        }
        pixel.paramArray = [];
        pixel.paramArray.account_id = "VIZVRM1326";
        pixel.paramArray.level = a;
        pixel.paramArray.section = "1";
        pixel.paramArray.param = "e400";
        pixel.paramArray.pid1 = o[0];
        pixel.paramArray.pid2 = o[1];
        pixel.paramArray.pid3 = o[2];
    }
    var f = pixel.getQueryString(pixel.paramArray);
    if (pixel.paramArray.param == "e500") {
        var p = decodeURIComponent(decodeURIComponent(pixel.paramArray.currency));
        if (f.indexOf("currency=") !== -1) {
            f = f.split("currency=")[0] + "currency=" + encodeURIComponent(p);
        }
    }
    var b = pixel.baseUrl + f;
    pixel.fireAnalyze(b);
};