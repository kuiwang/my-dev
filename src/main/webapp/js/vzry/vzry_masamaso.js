var pixel = {
    pixelConfig: null,
    segmentConfig: null,
    extraParams: null,
    cookieDomain: null,
    clickTrackers: null,
    initialize: null,
    finalize: null,
    paramArray: [],
    segParams: [],
    pageLoadStatusFlag: false,
    checkReadyStateOnIntervals: null,
    pixelFireStatus: false,
    parse: function() {
        try {
            if (! (pixel.pixelFireStatus || pixel.checkReadyStateOnIntervals)) {
                pixel.checkReadyStateOnIntervals = setInterval(function() {
                    if (!pixel.pixelFireStatus) {
                        pixel.checkIfPageLoadComplete();
                        if (pixel.pageLoadStatusFlag) {
                            try {
                                var b = pixel.detectCampaign();
                                pixel.initialize(b);
                                if (typeof pixel.getExtraParams != "undefined") {
                                    pixel.getExtraParams();
                                }
                                pixel.getParams();
                                pixel.finalize(b);
                                pixel.removeDuplicatePids();
                                pixel.fireAnalyze(pixel.getQueryString(pixel.paramArray));
                            } catch(c) {
                                pixel.paramArray.param = "999";
                                pixel.paramArray.err = c;
                                pixel.fireAnalyze(pixel.getQueryString(pixel.paramArray));
                            }
                        }
                    }
                },
                500, "Javascript");
            }
        } catch(a) {
            pixel.paramArray.param = "999";
            pixel.paramArray.err = a;
            pixel.fireAnalyze(pixel.getQueryString(pixel.paramArray));
        }
    },
    removeDuplicatePids: function() {
        var e = "",
        d = "",
        c = "";
        var b = pixel.paramArray.param.split("_")[0];
        try {
            if (b && (b == "e400")) {
                e = pixel.paramArray.pid1;
                d = pixel.paramArray.pid2;
                c = pixel.paramArray.pid3;
                if (e && d && (e == d)) {
                    pixel.deleteParam("2");
                }
                if (d && c && (d == c)) {
                    pixel.deleteParam("3");
                }
                if (e && c && (e == c)) {
                    pixel.deleteParam("3");
                }
            }
        } catch(a) {}
    },
    deleteParam: function(b) {
        try {
            delete pixel.paramArray["pid" + b];
            delete pixel.paramArray["catid" + b];
            delete pixel.paramArray["price" + b];
            delete pixel.paramArray["quantity" + b];
        } catch(a) {}
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
        var f = "",
        d = "",
        i = "",
        e = "";
        var h = "",
        j = "",
        c = "",
        b = "",
        g = "";
        for (var a in pixel.pixelConfig) {
            g = a.split("_Z")[0];
            if (pixel.paramArray[g]) {
                continue;
            }
            if (pixel.pixelConfig.hasOwnProperty(a) && pixel.pixelConfig[a]) {
                f = pixel.pixelConfig[a][1];
                d = pixel.pixelConfig[a][0];
                i = pixel.pixelConfig[a][2];
                e = pixel.pixelConfig[a][3];
                if (f) {
                    if (f === "xpath" && d && typeof pixel.getDataFromXPath != "undefined") {
                        pixel.paramArray[g] = pixel.getDataFromXPath(d, i);
                    } else {
                        if (f === "url" && d && e) {
                            if (e == "regex" && typeof pixel.getDataFromUrl != "undefined") {
                                pixel.paramArray[g] = pixel.getDataFromUrl(d, i);
                            } else {
                                if (e == "qstring" && typeof pixel.getParamFromUrl != "undefined") {
                                    pixel.paramArray[g] = pixel.getParamFromUrl(document.URL, d);
                                }
                            }
                        } else {
                            if (f == "jsvariable" && d && typeof pixel.getDataFromJSVar != "undefined") {
                                pixel.paramArray[g] = pixel.getDataFromJSVar(d);
                            } else {
                                if (f == "udf" && d && typeof pixel.getDataFromUDF != "undefined") {
                                    pixel.paramArray[g] = pixel.getDataFromUDF(d, i);
                                } else {
                                    if (f == "csspath" && d && typeof pixel.getDataFromCSSPath != "undefined") {
                                        pixel.paramArray[g] = pixel.getDataFromCSSPath(d, i);
                                    } else {
                                        if (f == "classname" && d && typeof pixel.getElementsByClass != "undefined") {
                                            pixel.paramArray[g] = pixel.getElementsByClass(d.split(",")[0], d.split(",")[1], d.split(",")[2]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    h = pixel.pixelConfig[a][4];
                    j = pixel.pixelConfig[a][5];
                    c = pixel.pixelConfig[a][6];
                    if (c && typeof pixel.getNumericField != "undefined") {
                        pixel.paramArray[g] = pixel.getNumericField(pixel.paramArray[g], c);
                    }
                    b = pixel.pixelConfig[a][7];
                    if (h && pixel.paramArray[g]) {
                        pixel.paramArray[g] = pixel.getSubstring(pixel.paramArray[g], h, j);
                    }
                    if (b && b.toLowerCase() == "md5" && typeof pixel.getMd5 != "undefined") {
                        pixel.paramArray[g] = pixel.getMd5(pixel.paramArray[g]);
                    }
                }
            }
        }
    },
    getSubstring: function(h, b, a) {
        var f = null;
        var e = "";
        var d = 1;
        var g;
        try {
            if (a) {
                g = new RegExp(b, a);
            } else {
                g = new RegExp(b);
            }
            f = h.toString().match(g);
            if (f && f[d]) {
                return f[d];
            }
        } catch(c) {
            e = "";
        }
        return e;
    },
    getSegParams: function() {
        var g = "",
        e = "",
        l = "",
        f = "",
        a = document.URL;
        var j = "",
        m = "",
        d = "",
        c = "",
        i = "",
        h = "";
        for (var k in pixel.segmentConfig) {
            if (pixel.segmentConfig.hasOwnProperty(k)) {
                pixel.segParams[k] = [];
                for (var b in pixel.segmentConfig[k]) {
                    h = b.split("_Z")[0];
                    if (pixel.segParams[k][h]) {
                        continue;
                    }
                    if (pixel.segmentConfig[k].hasOwnProperty(b) && pixel.segmentConfig[k][b]) {
                        g = pixel.segmentConfig[k][b][1];
                        e = pixel.segmentConfig[k][b][0];
                        l = pixel.segmentConfig[k][b][2];
                        f = pixel.segmentConfig[k][b][3];
                        if (g) {
                            if (g === "xpath" && e && typeof pixel.getDataFromXPath != "undefined") {
                                pixel.segParams[k][h] = pixel.getDataFromXPath(e, l);
                            } else {
                                if (g === "url" && e && f) {
                                    if (f == "regex" && typeof pixel.getDataFromUrl != "undefined") {
                                        pixel.segParams[k][h] = pixel.getDataFromUrl(e, l);
                                    } else {
                                        if (f == "qstring" && typeof pixel.getParamFromUrl != "undefined") {
                                            pixel.segParams[k][h] = pixel.getParamFromUrl(a, e);
                                        }
                                    }
                                } else {
                                    if (g == "jsvariable" && e && typeof pixel.getDataFromJSVar != "undefined") {
                                        pixel.segParams[k][h] = pixel.getDataFromJSVar(e);
                                    } else {
                                        if (g == "csspath" && e && typeof pixel.getDataFromCSSPath != "undefined") {
                                            pixel.segParams[k][h] = pixel.getDataFromCSSPath(e, l);
                                        } else {
                                            if (g == "udf" && e && typeof pixel.getDataFromUDF != "undefined") {
                                                pixel.segParams[k][h] = pixel.getDataFromUDF(e, l);
                                            } else {
                                                if (g == "classname" && e && typeof pixel.getElementsByClass != "undefined") {
                                                    pixel.segParams[k][h] = pixel.getElementsByClass(e.split(",")[0], e.split(",")[1], e.split(",")[2]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            j = pixel.segmentConfig[k][b][4];
                            m = pixel.segmentConfig[k][b][5];
                            d = pixel.segmentConfig[k][b][6];
                            if (d && typeof pixel.getNumericField != "undefined") {
                                pixel.segParams[k][h] = pixel.getNumericField(pixel.segParams[k][h], d);
                            }
                            c = pixel.segmentConfig[k][b][7];
                            i = (c && c.toLowerCase() == "md5");
                            if (j && pixel.segParams[k][h]) {
                                pixel.segParams[k][h] = pixel.getSubstring(pixel.segParams[k][h], j, m);
                            }
                        }
                    }
                }
                pixel.segParams[k]["URL"] = a;
            }
        }
    },
    getCookie: function(b) {
        var d = document.cookie;
        if (!b) {
            return "";
        }
        var a = d.split(";");
        for (var c in a) {
            if (a.hasOwnProperty(c)) {
                var e = a[c].match(/\s*(.*)=(.*)/);
                if (e) {
                    if (e[1] === b && e[2]) {
                        return e[2];
                    }
                }
            }
        }
        return "";
    },
    getMd5: function(D) {
        if (D && D !== "") {
            var E;
            var y = function(b, a) {
                return (b << a) | (b >>> (32 - a));
            };
            var I = function(k, b) {
                var W, a, d, x, c;
                d = (k & 2147483648);
                x = (b & 2147483648);
                W = (k & 1073741824);
                a = (b & 1073741824);
                c = (k & 1073741823) + (b & 1073741823);
                if (W & a) {
                    return (c ^ 2147483648 ^ d ^ x);
                }
                if (W | a) {
                    if (c & 1073741824) {
                        return (c ^ 3221225472 ^ d ^ x);
                    } else {
                        return (c ^ 1073741824 ^ d ^ x);
                    }
                } else {
                    return (c ^ d ^ x);
                }
            };
            var r = function(a, c, b) {
                return (a & c) | ((~a) & b);
            };
            var q = function(a, c, b) {
                return (a & b) | (c & (~b));
            };
            var p = function(a, c, b) {
                return (a ^ c ^ b);
            };
            var n = function(a, c, b) {
                return (c ^ (a | (~b)));
            };
            var v = function(X, W, ab, aa, k, Y, Z) {
                X = I(X, I(I(r(W, ab, aa), k), Z));
                return I(y(X, Y), W);
            };
            var f = function(X, W, ab, aa, k, Y, Z) {
                X = I(X, I(I(q(W, ab, aa), k), Z));
                return I(y(X, Y), W);
            };
            var G = function(X, W, ab, aa, k, Y, Z) {
                X = I(X, I(I(p(W, ab, aa), k), Z));
                return I(y(X, Y), W);
            };
            var u = function(X, W, ab, aa, k, Y, Z) {
                X = I(X, I(I(n(W, ab, aa), k), Z));
                return I(y(X, Y), W);
            };
            var e = function(W) {
                var X;
                var d = W.length;
                var c = d + 8;
                var b = (c - (c % 64)) / 64;
                var x = (b + 1) * 16;
                var Y = new Array(x - 1);
                var a = 0;
                var k = 0;
                while (k < d) {
                    X = (k - (k % 4)) / 4;
                    a = (k % 4) * 8;
                    Y[X] = (Y[X] | (W.charCodeAt(k) << a));
                    k++;
                }
                X = (k - (k % 4)) / 4;
                a = (k % 4) * 8;
                Y[X] = Y[X] | (128 << a);
                Y[x - 2] = d << 3;
                Y[x - 1] = d >>> 29;
                return Y;
            };
            var s = function(d) {
                var a = "",
                b = "",
                k, c;
                for (c = 0; c <= 3; c++) {
                    k = (d >>> (c * 8)) & 255;
                    b = "0" + k.toString(16);
                    a = a + b.substr(b.length - 2, 2);
                }
                return a;
            };
            var t = function(a) {
                if (a === null || typeof a === "undefined") {
                    return "";
                }
                var Y = (a + "");
                var Z = "",
                k, b;
                b = k = 0;
                var c = Y.length;
                for (var d = 0; d < c; d++) {
                    var X = Y.charCodeAt(d);
                    var W = null;
                    if (X < 128) {
                        k++;
                    } else {
                        if (X > 127 && X < 2048) {
                            W = String.fromCharCode((X >> 6) | 192, (X & 63) | 128);
                        } else {
                            if ((X & 63488) != 55296) {
                                W = String.fromCharCode((X >> 12) | 224, ((X >> 6) & 63) | 128, (X & 63) | 128);
                            } else {
                                if ((X & 64512) != 55296) {
                                    throw new RangeError("Unmatched trail surrogate at " + d);
                                }
                                var x = Y.charCodeAt(++d);
                                if ((x & 64512) != 56320) {
                                    throw new RangeError("Unmatched lead surrogate at " + (d - 1));
                                }
                                X = ((X & 1023) << 10) + (x & 1023) + 65536;
                                W = String.fromCharCode((X >> 18) | 240, ((X >> 12) & 63) | 128, ((X >> 6) & 63) | 128, (X & 63) | 128);
                            }
                        }
                    }
                    if (W !== null) {
                        if (k > b) {
                            Z += Y.slice(b, k);
                        }
                        Z += W;
                        b = k = d + 1;
                    }
                }
                if (k > b) {
                    Z += Y.slice(b, c);
                }
                return Z;
            };
            var F = [],
            M,
            h,
            H,
            w,
            g,
            V,
            U,
            T,
            S,
            P = 7,
            N = 12,
            K = 17,
            J = 22,
            C = 5,
            B = 9,
            A = 14,
            z = 20,
            o = 4,
            m = 11,
            l = 16,
            j = 23,
            R = 6,
            Q = 10,
            O = 15,
            L = 21;
            D = t(D);
            F = e(D);
            V = 1732584193;
            U = 4023233417;
            T = 2562383102;
            S = 271733878;
            E = F.length;
            for (M = 0; M < E; M += 16) {
                h = V;
                H = U;
                w = T;
                g = S;
                V = v(V, U, T, S, F[M + 0], P, 3614090360);
                S = v(S, V, U, T, F[M + 1], N, 3905402710);
                T = v(T, S, V, U, F[M + 2], K, 606105819);
                U = v(U, T, S, V, F[M + 3], J, 3250441966);
                V = v(V, U, T, S, F[M + 4], P, 4118548399);
                S = v(S, V, U, T, F[M + 5], N, 1200080426);
                T = v(T, S, V, U, F[M + 6], K, 2821735955);
                U = v(U, T, S, V, F[M + 7], J, 4249261313);
                V = v(V, U, T, S, F[M + 8], P, 1770035416);
                S = v(S, V, U, T, F[M + 9], N, 2336552879);
                T = v(T, S, V, U, F[M + 10], K, 4294925233);
                U = v(U, T, S, V, F[M + 11], J, 2304563134);
                V = v(V, U, T, S, F[M + 12], P, 1804603682);
                S = v(S, V, U, T, F[M + 13], N, 4254626195);
                T = v(T, S, V, U, F[M + 14], K, 2792965006);
                U = v(U, T, S, V, F[M + 15], J, 1236535329);
                V = f(V, U, T, S, F[M + 1], C, 4129170786);
                S = f(S, V, U, T, F[M + 6], B, 3225465664);
                T = f(T, S, V, U, F[M + 11], A, 643717713);
                U = f(U, T, S, V, F[M + 0], z, 3921069994);
                V = f(V, U, T, S, F[M + 5], C, 3593408605);
                S = f(S, V, U, T, F[M + 10], B, 38016083);
                T = f(T, S, V, U, F[M + 15], A, 3634488961);
                U = f(U, T, S, V, F[M + 4], z, 3889429448);
                V = f(V, U, T, S, F[M + 9], C, 568446438);
                S = f(S, V, U, T, F[M + 14], B, 3275163606);
                T = f(T, S, V, U, F[M + 3], A, 4107603335);
                U = f(U, T, S, V, F[M + 8], z, 1163531501);
                V = f(V, U, T, S, F[M + 13], C, 2850285829);
                S = f(S, V, U, T, F[M + 2], B, 4243563512);
                T = f(T, S, V, U, F[M + 7], A, 1735328473);
                U = f(U, T, S, V, F[M + 12], z, 2368359562);
                V = G(V, U, T, S, F[M + 5], o, 4294588738);
                S = G(S, V, U, T, F[M + 8], m, 2272392833);
                T = G(T, S, V, U, F[M + 11], l, 1839030562);
                U = G(U, T, S, V, F[M + 14], j, 4259657740);
                V = G(V, U, T, S, F[M + 1], o, 2763975236);
                S = G(S, V, U, T, F[M + 4], m, 1272893353);
                T = G(T, S, V, U, F[M + 7], l, 4139469664);
                U = G(U, T, S, V, F[M + 10], j, 3200236656);
                V = G(V, U, T, S, F[M + 13], o, 681279174);
                S = G(S, V, U, T, F[M + 0], m, 3936430074);
                T = G(T, S, V, U, F[M + 3], l, 3572445317);
                U = G(U, T, S, V, F[M + 6], j, 76029189);
                V = G(V, U, T, S, F[M + 9], o, 3654602809);
                S = G(S, V, U, T, F[M + 12], m, 3873151461);
                T = G(T, S, V, U, F[M + 15], l, 530742520);
                U = G(U, T, S, V, F[M + 2], j, 3299628645);
                V = u(V, U, T, S, F[M + 0], R, 4096336452);
                S = u(S, V, U, T, F[M + 7], Q, 1126891415);
                T = u(T, S, V, U, F[M + 14], O, 2878612391);
                U = u(U, T, S, V, F[M + 5], L, 4237533241);
                V = u(V, U, T, S, F[M + 12], R, 1700485571);
                S = u(S, V, U, T, F[M + 3], Q, 2399980690);
                T = u(T, S, V, U, F[M + 10], O, 4293915773);
                U = u(U, T, S, V, F[M + 1], L, 2240044497);
                V = u(V, U, T, S, F[M + 8], R, 1873313359);
                S = u(S, V, U, T, F[M + 15], Q, 4264355552);
                T = u(T, S, V, U, F[M + 6], O, 2734768916);
                U = u(U, T, S, V, F[M + 13], L, 1309151649);
                V = u(V, U, T, S, F[M + 4], R, 4149444226);
                S = u(S, V, U, T, F[M + 11], Q, 3174756917);
                T = u(T, S, V, U, F[M + 2], O, 718787259);
                U = u(U, T, S, V, F[M + 9], L, 3951481745);
                V = I(V, h);
                U = I(U, H);
                T = I(T, w);
                S = I(S, g);
            }
            var i = s(V) + s(U) + s(T) + s(S);
            return i.toLowerCase();
        }
        return "";
    },
    removeJunk: function(a) {
        if (a) {
            a = a.toString();
            a = a.replace(/\&lt\;/g, "<").replace(/\&gt\;/g, ">").replace(/\&quot\;/g, '"').replace(/\&amp\;/g, "&").replace(/\&nbsp\;/g, " ");
            a = a.replace(/(<([^>]+)>)/ig, "").replace(/[ \t\r\n]+/g, " ").replace(/^\s+|\s+$/g, "");
            return a;
        }
        return "";
    },
    encodeParam: function(a) {
        if (a) {
            a = pixel.removeJunk(a);
            a = encodeURIComponent(encodeURIComponent(a));
            return a;
        }
        return "";
    },
    getQueryString: function(a) {
        var c = a.account_id;
        var e = "?account_id=" + c;
        delete a.account_id;
        var d = "";
        for (var b in a) {
            if (a.hasOwnProperty(b)) {
                d = a[b];
                if (b == "param") {
                    d = a[b].split("_")[0];
                }
                e += "&" + b + "=" + this.encodeParam(d);
            }
        }
        return e;
    },
    contains: function(b, a) {
        if (! (b && a)) {
            return false;
        }
        return b.indexOf(a) > -1;
    },
    greater_than: function(b, a) {
        return Number(b) > Number(a);
    },
    greater_or_equal: function(b, a) {
        return Number(b) >= Number(a);
    },
    getDataFromJSVar: function(d) {
        var e = d.split(".");
        var c = e.length;
        var b = null;
        var l = null;
        var f = /[\['"]?((\w|-|\s)+)['"\]]?/;
        var g, o, a;
        try {
            g = e[0];
            if (g.indexOf("[") > 0) {
                b = g.split("[");
                a = window[b[0]];
                for (var k = 1; k < b.length; k++) {
                    l = b[k].match(f);
                    a = a[l[1]];
                }
            } else {
                a = window[g];
            }
        } catch(n) {
            return "";
        }
        var m = a;
        try {
            for (var k = 1; k < c; k++) {
                g = e[k];
                if (g.indexOf("[") > 0) {
                    b = g.split("[");
                    a = a[b[0]];
                    for (var h = 1; h < b.length; h++) {
                        l = b[h].match(f);
                        a = a[l[1]];
                    }
                } else {
                    a = a[g];
                }
            }
            m = a;
        } catch(n) {
            return "";
        }
        return (typeof m == "undefined" ? "": m);
    },
    getDataFromXPath: function(j, k) {
        var r = [],
        f = [],
        b = [];
        var h = "",
        e, p = "",
        d = "";
        var q = "";
        var g = 0;
        var c = document.getElementsByTagName("body")[0];
        var a = true;
        e = j.replace("/html/body/", "");
        if (j.indexOf('@id="') !== -1) {
            r = j.match(/.*\[@id="(.+)"\].*/);
            if (r && r.length >= 1) {
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
                if (c.getAttribute(k) && (k != "href" || k != "src")) {
                    d = c.getAttribute(k);
                }
                if (k == "href" && c.getAttribute("href")) {
                    d = c.href;
                } else {
                    if (k == "src" && c.getAttribute("src")) {
                        d = c.src;
                    } else {
                        if (k == "value" && c.value) {
                            d = c.value;
                        }
                    }
                }
            }
            return pixel.removeJunk(d);
        } else {
            return "";
        }
    },
    getCurrentNode: function(e, c, f) {
        var b = "No Data";
        var a = 1,
        d = 0;
        if (e.childNodes) {
            var g = e.childNodes;
            for (a = 0; a < g.length; a++) {
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
    getDataFromUrl: function(b, a) {
        var e, d = document.URL;
        var c = 1;
        var f;
        if (a) {
            f = new RegExp(b, a);
        } else {
            f = new RegExp(b);
        }
        e = d.match(f);
        if (e && e[c]) {
            return e[c];
        }
        return "";
    },
    getDataFromUDF: function(e, c) {
        var b = "";
        try {
            var d = window.pixel[e];
            if (c) {
                b = d(c);
            } else {
                b = d();
            }
        } catch(a) {}
        return b;
    },
    getExtraParams: function() {
        var a, c;
        for (var b in pixel.extraParams) {
            if (pixel.extraParams.hasOwnProperty(b)) {
                a = pixel.extraParams[b]["param"];
                c = pixel.extraParams[b]["days"];
                pixel.paramArray[a] = pixel.getCookieForNDays(a, c);
            }
        }
    },
    getCookieForNDays: function(c, f) {
        var e = c;
        var d = pixel.getCookie(e);
        var a = 0;
        var b = pixel.paramArray.param.split("_")[0];
        if (d) {
            a = parseInt(d.split("|")[0]);
        }
        if ((e == "Nprd" && b != "e300") || (e == "Nsc" && b != "e400") || (e == "Nty" && b != "e500")) {
            return a;
        }
        if (a > 0) {
            a++;
            d = a + "|" + d.split("|")[1];
            pixel.setCookieForNDays(e, d, f, true);
        } else {
            pixel.setCookieForNDays(e, 1, f, false);
        }
        d = pixel.getCookie(e);
        if (d) {
            a = parseInt(d.split("|")[0]);
        } else {
            a = 0;
        }
        return a;
    },
    setCookieForNDays: function(j, b, n, k) {
        var c = "";
        var l = "";
        var e = false;
        if (typeof pixel.cookieDomain != "undefined" && pixel.cookieDomain != "") {
            c = pixel.cookieDomain;
            l = ";domain=" + c;
        }
        if (j == "Nclk") {
            var d = pixel.clickTrackers;
            if (typeof d != "undefined") {
                var f = d.split(",");
                var a = document.URL;
                if (f != null) {
                    for (var o in f) {
                        var h = f[o];
                        if (typeof h != "undefined" && h != "" && a.indexOf(h) > -1) {
                            e = true;
                        }
                    }
                }
                if (!e) {
                    return;
                }
            }
        }
        if (n !== -1) {
            var m = new Date();
            var i;
            if (k) {
                var g = new Date(parseInt(b.split("|")[1]));
                i = b + (!(g) ? "": ";expires=" + g.toUTCString()) + l + ";path=/";
                document.cookie = j + "=" + i;
            } else {
                m.setDate(m.getDate() + parseInt(n));
                b = b + "|" + m.getTime();
                i = b + (!(m) ? "": ";expires=" + m.toUTCString()) + l + ";path=/";
                document.cookie = j + "=" + i;
            }
        } else {
            document.cookie = j + "=" + b;
        }
    }
};
pixel.getElementsByAttribute = function(m, c, g, a) {
    var b = document.getElementById(g) || document;
    var o = a || "*";
    var h = c || "";
    var j = m || "class";
    var l = new RegExp("(?:^|\\s)(" + h + ")(?:\\s|$)", "i");
    var n = [],
    d = 0,
    f = 0;
    var e = (o === "*" && b.all) ? b.all: b.getElementsByTagName(o);
    for (f = d = 0; f < e.length; f++) {
        if (l.test(e[f].getAttribute(j))) {
            n[d++] = e[f];
        }
    }
    if (n.length > 0) {
        return n;
    }
    return [];
};
pixel.getE205Pids = function() {
    var b = 0;
    var a = pixel.getElementsByAttribute("class", "in_pic", "", "a");
    for (b = 0; b < 3; b++) {
        if (a[b] && /goods_(\d+[^\/?#.])/i.test(a[b].href)) {
            pixel.paramArray["pid" + (b + 1)] = a[b].href.match(/goods_(\d+[^\/?#.])/i)[1];
        }
    }
};
pixel.cartCount = function() {
    var b = 0;
    var a = pixel.getElementsByAttribute("class", "flowNum", "mini_cart_box", "span");
    if (a.length > 0) {
        b = a[0].innerHTML.replace(/[^0-9]/g, "");
    }
    return Number(b);
};
pixel.loginCheck = function() {
    var d = false,
    b = "";
    var a = pixel.getCookie("userLogin");
    if (!a) {
        a = 0;
    }
    var c = document.getElementById("index_login");
    if (c) {
        b = c.getElementsByTagName("a")[0];
        if (b && b.href.indexOf("web/register/login.php") == -1) {
            d = true;
        }
    }
    if (d && a == 0) {
        a = 1;
        pixel.setCookieForNDays("userLogin", 1, 30, false);
    }
    return a;
};
pixel.outOfstcok = function() {
    var b = document.getElementById("selectSizeBox");
    var c = 1;
    if (b) {
        var d = b.getElementsByTagName("div");
        for (var a = 0; a < d.length; a++) {
            if (d[a].className === "sizeBox" && !(/%E5%B7%B2%E5%94%AE%E7%A9%BA/.test(encodeURIComponent(d[a].textContent)))) {
                c = 0;
                break;
            }
        }
    }
    return c;
};
pixel.fireAnalyze = function(d) {
    var b = ("https:" == document.location.protocol ? "https://cn-pl": "http://cn-pl") + ".vizury.com/analyze/analyze.php";
    clearInterval(pixel.checkReadyStateOnIntervals);
    if (! (pixel.pixelFireStatus)) {
        var c = document.createElement("iframe");
        c.src = b + d;
        c.scrolling = "no";
        c.width = 1;
        c.height = 1;
        c.marginheight = 0;
        c.marginwidth = 0;
        c.frameborder = 0;
        c.style.display = "none";
        pixel.pixelFireStatus = true;
        var a = document.getElementsByTagName("script")[0];
        a.parentNode.insertBefore(c, a);
    }
};
pixel.detectCampaign = function() {
    var a = "VIZVRM1359";
    var b = document.URL;
    if ((true)) {
        a = "VIZVRM1359";
    }
    return a;
};
pixel.initialize = function(d) {
    var b = document.URL;
    var f = document.referrer;
    pixel.paramArray.URL = b;
    pixel.paramArray.referrer = f ? f: "";
    pixel.paramArray.fp34 = pixel.getMd5(pixel.getCookie("_ga"));
    if (d == "VIZVRM1359") {
        pixel.paramArray.account_id = d;
        pixel.paramArray.param = "e000";
        pixel.paramArray.section = 1;
        pixel.paramArray.level = 1;
        pixel.segmentConfig = {
            e500: [],
            e400: {
                buttonCart: ['//*[@id="container"]/div[4]/div/a[2]', "xpath", "href", "", "(.*)", "", "", ""]
            },
            e400_1: [],
            e300: {
                buyButton: ['//*[@id="submit_btn"]', "xpath", "class", "", "(.*)", "", "", ""]
            },
            e205_1: [],
            e205: [],
            e100: []
        };
        pixel.getSegParams();
        pixel.extraParams = [{
            param: "Nprd",
            days: "30"
        },
        {
            param: "Nsc",
            days: "30"
        },
        {
            param: "Nclk",
            days: "30"
        },
        {
            param: "Nty",
            days: "30"
        }];
        pixel.cookieDomain = ".masamaso.com";
        pixel.clickTrackers = "utm_source";
        var g = {
            orderid: ["_zzOrderId", "jsvariable", "", "", "(.*)", "", "", ""],
            orderid_Z1: ["s.orderid", "jsvariable", "", "", "(.*)", "", "", ""],
            orderprice: ["_zzOrderTotal", "jsvariable", "", "", "(.*)", "", "", ""],
            orderprice_Z1: ["s.ordermoney", "jsvariable", "", "", "(.*)", "", "", ""]
        };
        var e = {
            pid1: ['//*[@id="container"]/div[2]/table/tbody/tr/td[2]/p/a', "xpath", "href", "", "goods_(\\d+[^\\/?#.])", "i", "", ""],
            pid1_Z1: ["BFD_ITEM_INFO.items[0][0]", "jsvariable", "", "", "(.*)", "", "", ""],
            pid2: ['//*[@id="container"]/div[2]/table/tbody/tr[2]/td[2]/p/a', "xpath", "href", "", "goods_(\\d+[^\\/?#.])", "i", "", ""],
            pid2_Z1: ["BFD_ITEM_INFO.items[1][0]", "jsvariable", "", "", "(.*)", "", "", ""],
            pid3: ['//*[@id="container"]/div[2]/table/tbody/tr[3]/td[2]/p/a', "xpath", "href", "", "goods_(\\d+[^\\/?#.])", "i", "", ""],
            pid3_Z1: ["BFD_ITEM_INFO.items[2][0]", "jsvariable", "", "", "(.*)", "", "", ""],
            buttonCart: ['//*[@id="container"]/div[4]/div/a[2]', "xpath", "href", "", "(.*)", "", "", ""]
        };
        var h = {
            pid1: ['//*[@id="container"]/div[4]/table/tbody/tr[1]/td[1]', "xpath", "", "", "(\\d+[\\d.,]*)", "", "", ""],
            pid2: ['//*[@id="container"]/div[4]/table/tbody/tr[2]/td[1]', "xpath", "", "", "(\\d+[\\d.,]*)", "", "", ""],
            pid3: ['//*[@id="container"]/div[4]/table/tbody/tr[3]/td[1]', "xpath", "", "", "(\\d+[\\d.,]*)", "", "", ""]
        };
        var c = {
            pid: ["goods_(\\d+[^\\/?#.])", "url", "i", "regex", "(.*)", "", "", ""],
            pid_Z1: ["s.product", "jsvariable", "", "", "(.*)", "", "", ""],
            pname: ["BFD_ITEM_INFO.name", "jsvariable", "", "", "(.*)", "", "", ""],
            lp: ["(.[^?&#]*)", "url", "", "regex", "(.*)", "", "", ""],
            image: ["BFD_ITEM_INFO.bigimage_link", "jsvariable", "", "", "(.[^?&#]*)", "", "", ""],
            image_Z1: ["/html/body/div[1]/div[5]/div[1]/div[1]/div[1]/div/div/div/div[1]/a", "xpath", "href", "", "(.[^?&#]*)", "", "", ""],
            catid: ["/html/body/div[1]/div[5]/div[1]/div[1]/div[1]/div/div/p/a[2]", "xpath", "", "", "(.*)", "", "", ""],
            catid_Z1: ["/html/body/div[2]/div[5]/div[1]/div[1]/div[1]/div/div/p/a[2]", "xpath", "", "", "(.*)", "", "", ""],
            "new": ["BFD_ITEM_INFO.sale_price", "jsvariable", "", "", "(.*)", "", "", ""],
            new_Z1: ['//*[@id="submit_product"]/div[1]/div[1]/div[1]/div/strong', "xpath", "", "", "(\\d+[\\d.,]*)", "", "", ""],
            old: ["BFD_ITEM_INFO.price", "jsvariable", "", "", "(.*)", "", "", ""],
            old_Z1: ['//*[@id="submit_product"]/div[1]/div[1]/div[1]/div/div/span', "xpath", "", "", "(\\d+[\\d.,]*)", "", "", ""],
            subcat1id: ["/html/body/div[1]/div[5]/div[1]/div[1]/div[1]/div/div/p/a[3]", "xpath", "", "", "(.*)", "", "", ""],
            subcat1id_Z1: ["/html/body/div[2]/div[5]/div[1]/div[1]/div[1]/div/div/p/a[3]", "xpath", "", "", "(.*)", "", "", ""],
            std_catid: ["pixel.paramArray.catid", "jsvariable", "", "", "(.*)", "", "", ""],
            std_subcat1id: ["pixel.paramArray.subcat1id", "jsvariable", "", "", "(.*)", "", "", ""],
            buyButton: ['//*[@id="submit_btn"]', "xpath", "class", "", "(.*)", "", "", ""],
            loginCheck: ["loginCheck", "udf", "", "", "(.*)", "", "", ""]
        };
        var j = {
            pid1: ['//*[@id="customer_order_list_UserHistory"]/div/div/ul/li[1]/div/p[1]/a', "xpath", "href", "", "goods_(\\d+[^\\/?#.])", "i", "", ""],
            pid2: ['//*[@id="customer_order_list_UserHistory"]/div/div/ul/li[2]/div/p[1]/a', "xpath", "href", "", "goods_(\\d+[^\\/?#.])", "i", "", ""],
            pid3: ['//*[@id="customer_order_list_UserHistory"]/div/div/ul/li[3]/div/p[1]/a', "xpath", "href", "", "goods_(\\d+[^\\/?#.])", "i", "", ""]
        };
        var a = [];
        var i = [];
        if (pixel.segParams.e500["subcat1id"] != undefined && pixel.segParams.e500["subcat1id"] != "" && pixel.segParams.e500["catid"] != undefined && pixel.segParams.e500["catid"] != "") {
            pixel.segParams.e500["subcat1id"] = pixel.segParams.e500["catid"] + "_" + pixel.segParams.e500["subcat1id"];
        }
        if (pixel.segParams.e500["subcat2id"] != undefined && pixel.segParams.e500["subcat2id"] != "" && pixel.segParams.e500["catid"] != undefined && pixel.segParams.e500["catid"] != "" && pixel.segParams.e500["subcat1id"] != undefined && pixel.segParams.e500["subcat1id"] != "") {
            pixel.segParams.e500["subcat2id"] = pixel.segParams.e500["subcat1id"] + "_" + pixel.segParams.e500["subcat2id"];
        }
        if (pixel.segParams.e400["subcat1id"] != undefined && pixel.segParams.e400["subcat1id"] != "" && pixel.segParams.e400["catid"] != undefined && pixel.segParams.e400["catid"] != "") {
            pixel.segParams.e400["subcat1id"] = pixel.segParams.e400["catid"] + "_" + pixel.segParams.e400["subcat1id"];
        }
        if (pixel.segParams.e400["subcat2id"] != undefined && pixel.segParams.e400["subcat2id"] != "" && pixel.segParams.e400["catid"] != undefined && pixel.segParams.e400["catid"] != "" && pixel.segParams.e400["subcat1id"] != undefined && pixel.segParams.e400["subcat1id"] != "") {
            pixel.segParams.e400["subcat2id"] = pixel.segParams.e400["subcat1id"] + "_" + pixel.segParams.e400["subcat2id"];
        }
        if (pixel.segParams.e400_1["subcat1id"] != undefined && pixel.segParams.e400_1["subcat1id"] != "" && pixel.segParams.e400_1["catid"] != undefined && pixel.segParams.e400_1["catid"] != "") {
            pixel.segParams.e400_1["subcat1id"] = pixel.segParams.e400_1["catid"] + "_" + pixel.segParams.e400_1["subcat1id"];
        }
        if (pixel.segParams.e400_1["subcat2id"] != undefined && pixel.segParams.e400_1["subcat2id"] != "" && pixel.segParams.e400_1["catid"] != undefined && pixel.segParams.e400_1["catid"] != "" && pixel.segParams.e400_1["subcat1id"] != undefined && pixel.segParams.e400_1["subcat1id"] != "") {
            pixel.segParams.e400_1["subcat2id"] = pixel.segParams.e400_1["subcat1id"] + "_" + pixel.segParams.e400_1["subcat2id"];
        }
        if (pixel.segParams.e300["subcat1id"] != undefined && pixel.segParams.e300["subcat1id"] != "" && pixel.segParams.e300["catid"] != undefined && pixel.segParams.e300["catid"] != "") {
            pixel.segParams.e300["subcat1id"] = pixel.segParams.e300["catid"] + "_" + pixel.segParams.e300["subcat1id"];
        }
        if (pixel.segParams.e300["subcat2id"] != undefined && pixel.segParams.e300["subcat2id"] != "" && pixel.segParams.e300["catid"] != undefined && pixel.segParams.e300["catid"] != "" && pixel.segParams.e300["subcat1id"] != undefined && pixel.segParams.e300["subcat1id"] != "") {
            pixel.segParams.e300["subcat2id"] = pixel.segParams.e300["subcat1id"] + "_" + pixel.segParams.e300["subcat2id"];
        }
        if (pixel.segParams.e205["subcat1id"] != undefined && pixel.segParams.e205["subcat1id"] != "" && pixel.segParams.e205["catid"] != undefined && pixel.segParams.e205["catid"] != "") {
            pixel.segParams.e205["subcat1id"] = pixel.segParams.e205["catid"] + "_" + pixel.segParams.e205["subcat1id"];
        }
        if (pixel.segParams.e205["subcat2id"] != undefined && pixel.segParams.e205["subcat2id"] != "" && pixel.segParams.e205["catid"] != undefined && pixel.segParams.e205["catid"] != "" && pixel.segParams.e205["subcat1id"] != undefined && pixel.segParams.e205["subcat1id"] != "") {
            pixel.segParams.e205["subcat2id"] = pixel.segParams.e205["subcat1id"] + "_" + pixel.segParams.e205["subcat2id"];
        }
        if (pixel.segParams.e205_1["subcat1id"] != undefined && pixel.segParams.e205_1["subcat1id"] != "" && pixel.segParams.e205_1["catid"] != undefined && pixel.segParams.e205_1["catid"] != "") {
            pixel.segParams.e205_1["subcat1id"] = pixel.segParams.e205_1["catid"] + "_" + pixel.segParams.e205_1["subcat1id"];
        }
        if (pixel.segParams.e205_1["subcat2id"] != undefined && pixel.segParams.e205_1["subcat2id"] != "" && pixel.segParams.e205_1["catid"] != undefined && pixel.segParams.e205_1["catid"] != "" && pixel.segParams.e205_1["subcat1id"] != undefined && pixel.segParams.e205_1["subcat1id"] != "") {
            pixel.segParams.e205_1["subcat2id"] = pixel.segParams.e205_1["subcat1id"] + "_" + pixel.segParams.e205_1["subcat2id"];
        }
        if (pixel.segParams.e100["subcat1id"] != undefined && pixel.segParams.e100["subcat1id"] != "" && pixel.segParams.e100["catid"] != undefined && pixel.segParams.e100["catid"] != "") {
            pixel.segParams.e100["subcat1id"] = pixel.segParams.e100["catid"] + "_" + pixel.segParams.e100["subcat1id"];
        }
        if (pixel.segParams.e100["subcat2id"] != undefined && pixel.segParams.e100["subcat2id"] != "" && pixel.segParams.e100["catid"] != undefined && pixel.segParams.e100["catid"] != "" && pixel.segParams.e100["subcat1id"] != undefined && pixel.segParams.e100["subcat1id"] != "") {
            pixel.segParams.e100["subcat2id"] = pixel.segParams.e100["subcat1id"] + "_" + pixel.segParams.e100["subcat2id"];
        }
        if (((pixel.contains(pixel.segParams.e500["URL"], "order.masamaso.com")) && (pixel.contains(pixel.segParams.e500["URL"], "order_id=")) && (pixel.contains(pixel.segParams.e500["URL"], "a=success&orderid=")))) {
            pixel.pixelConfig = g;
            pixel.paramArray.param = "e500";
        } else {
            if (((pixel.contains(pixel.segParams.e400_1["URL"], "order.masamaso.com")) && (pixel.contains(pixel.segParams.e400_1["URL"], "c=order")))) {
                pixel.pixelConfig = h;
                pixel.paramArray.param = "e400_1";
            } else {
                if (((pixel.contains(pixel.segParams.e400["URL"], "order.masamaso.com"))) && ((pixel.contains(pixel.segParams.e400["URL"], "cart")) || (pixel.contains(pixel.segParams.e400["URL"], "rgphits")) || (pixel.contains(pixel.segParams.e400["buttonCart"], "c=order&rgphits=")))) {
                    pixel.pixelConfig = e;
                    pixel.paramArray.param = "e400";
                } else {
                    if (((pixel.contains(pixel.segParams.e300["URL"], "masamaso.com/goods_")) && (pixel.contains(pixel.segParams.e300["buyButton"], "goods_buy_btn fl")))) {
                        pixel.pixelConfig = c;
                        pixel.paramArray.param = "e300";
                    } else {
                        if (((pixel.contains(pixel.segParams.e205_1["URL"], ".masamaso.com/vcategory")) || (pixel.contains(pixel.segParams.e205_1["URL"], "masamaso.com/vkind_")))) {
                            pixel.pixelConfig = a;
                            pixel.paramArray.param = "e205_1";
                        } else {
                            if (((pixel.contains(pixel.segParams.e205["URL"], "masamaso.com/search.php")))) {
                                pixel.pixelConfig = j;
                                pixel.paramArray.param = "e205";
                            } else {
                                if (((pixel.contains(pixel.segParams.e100["URL"], "masamaso.com")))) {
                                    pixel.pixelConfig = i;
                                    pixel.paramArray.param = "e100";
                                }
                            }
                        }
                    }
                }
            }
        }
    }
};
pixel.finalize = function(b) {
    if (b == "VIZVRM1359") {
        if (pixel.paramArray.param == "e205_1") {
            pixel.getE205Pids();
        }
        if (pixel.paramArray.subcat1id != undefined && pixel.paramArray.subcat1id != "" && pixel.paramArray.catid != undefined && pixel.paramArray.catid != "") {
            pixel.paramArray.subcat1id = pixel.paramArray.catid + "_" + pixel.paramArray.subcat1id;
        }
        if (pixel.paramArray.subcat2id != undefined && pixel.paramArray.subcat2id != "" && pixel.paramArray.catid != undefined && pixel.paramArray.catid != "" && pixel.paramArray.subcat1id != undefined && pixel.paramArray.subcat1id != "") {
            pixel.paramArray.subcat2id = pixel.paramArray.subcat1id + "_" + pixel.paramArray.subcat2id;
        }
        if (pixel.paramArray.param == "e500") {
            pixel.paramArray.section = 1;
            pixel.paramArray.level = 1;
        } else {
            if (pixel.paramArray.param == "e400") {
                pixel.paramArray.section = 1;
                pixel.paramArray.level = 1;
            } else {
                if (pixel.paramArray.param == "e400_1") {
                    pixel.paramArray.section = 1;
                    pixel.paramArray.level = 2;
                } else {
                    if (pixel.paramArray.param == "e300") {
                        pixel.paramArray.section = 1;
                        pixel.paramArray.level = 1;
                        if ((pixel.greater_than(pixel.paramArray.Nty, "0")) && (pixel.greater_than(pixel.paramArray["new"], "750"))) {
                            pixel.paramArray.section = 1;
                            pixel.paramArray.level = 5;
                        } else {
                            if ((pixel.greater_than(pixel.paramArray.Nty, "0"))) {
                                pixel.paramArray.section = 1;
                                pixel.paramArray.level = 4;
                            } else {
                                if ((pixel.greater_than(pixel.paramArray.loginCheck, "0"))) {
                                    pixel.paramArray.section = 1;
                                    pixel.paramArray.level = 3;
                                } else {
                                    if ((pixel.greater_than(pixel.paramArray.Nclk, "0"))) {
                                        pixel.paramArray.section = 1;
                                        pixel.paramArray.level = 2;
                                    } else {
                                        if ((pixel.greater_or_equal(pixel.paramArray.Nprd, "10"))) {
                                            pixel.paramArray.section = 2;
                                            pixel.paramArray.level = 2;
                                        } else {
                                            if ((pixel.greater_or_equal(pixel.paramArray.Nprd, "5"))) {
                                                pixel.paramArray.section = 2;
                                                pixel.paramArray.level = 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (pixel.paramArray.param == "e205") {
                            pixel.paramArray.section = 1;
                            pixel.paramArray.level = 3;
                        } else {
                            if (pixel.paramArray.param == "e205_1") {
                                pixel.paramArray.section = 1;
                                pixel.paramArray.level = 1;
                                if ((pixel.contains(pixel.paramArray.URL, "masamaso.com/vkind_"))) {
                                    pixel.paramArray.section = 1;
                                    pixel.paramArray.level = 2;
                                }
                            } else {
                                if (pixel.paramArray.param == "e100") {
                                    pixel.paramArray.section = 1;
                                    pixel.paramArray.level = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        var c = pixel.cartCount();
        var a = pixel.outOfstcok();
        if (pixel.paramArray.param == "e300" && a > 0) {
            pixel.paramArray = [];
            pixel.paramArray.account_id = b;
            pixel.paramArray.param = "e100";
            pixel.paramArray.section = 1;
            pixel.paramArray.level = 2;
        } else {
            if ((pixel.paramArray.param == "e300" || pixel.paramArray.param == "e205" || pixel.paramArray.param == "e205_1" || pixel.paramArray.param == "e100") && c > 0) {
                var d = 5;
                if (pixel.paramArray.param == "e300") {
                    d = 3;
                } else {
                    if (pixel.paramArray.param == "e205" || pixel.paramArray.param == "e205_1") {
                        d = 4;
                    } else {
                        d = 5;
                    }
                }
                pixel.paramArray = [];
                pixel.paramArray.URL = document.URL;
                pixel.paramArray.account_id = b;
                pixel.paramArray.param = "e400";
                pixel.paramArray.section = 1;
                pixel.paramArray.level = d;
            }
        }
    }
};
if (! (pixel.pixelFireStatus)) {
    pixel.parse();
}