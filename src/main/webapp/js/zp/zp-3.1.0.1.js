(function() {
    var cS = navigator.userAgent.toLowerCase() || '';
    if (cS.indexOf('spider') > -1 || cS.indexOf('msnbot') > -1 || cS.indexOf('networkbench') > -1) return false;
    var cF = "3.1.0.11";
    var F = document;
    var O = window;
    var bG = navigator;
    var bi = Image;
    var bj = Array;
    var k = encodeURIComponent;
    var f = decodeURIComponent;
    var aD = "cookie";
    var r = "length";
    var X = "indexOf";
    var aB = "substring";
    var t = "split";
    var aH = "location";
    var cd = "protocol";
    var bt = "replace";
    var U = "zpclkid";
    var cB = "zpdl";
    var bX = "";
    var v = "__zp_smartpixel_list";
    var ca = '';
    var aL;
    function _getZID(cz) {
        function _zpJsLoad(cP) {
            var aE = document.createElement('script');
            if (typeof cP.id != 'undefined') aE.id = cP.id;
            aE.setAttribute('type', 'text/javascript');
            aE.setAttribute('src', cP.url);
            aE.setAttribute('charset', 'utf-8');
            document.getElementsByTagName('head')[0].appendChild(aE);
            function _over() {
                aE.onreadystatechange = aE.onload = null;
            };
            function _call() {
                _over();
                cP.cu && cP.cu.apply(cP);
            };
            aE.onreadystatechange = function() {
                if (this.readyState == 'loaded' || this.readyState == 'complete') {
                    _call();
                }
            };
            aE.onload = aE.onerror = _call;
        };
        function _runFunList() {
            B['zid'] = B['zid'] || '';
            while (B['funList'][0]) {
                var cT = B['funList'].shift();
                cT && cT(B['zid']);
            }
        };
        var B = window['__zpCMSDCB'];
        if (!B) {
            B = window['__zpCMSDCB'] = function(cE) {
                if (B['zid'] || B['bw']) return;
                B['bw'] = B['zid'] = B['zid'] || B['bw'] || (cE && cE.data) || '';
            }
        }
        B['funList'] = B['cE'] = B['funList'] || B['cE'] || [];
        B['bw'] = B['zid'] = B['zid'] || B['bw'] || cz.bc;
        B['funList'].push(cz.cY);
        if (B['isGet'] || B['ds'] || B['zid']) {
            _runFunList();
        }
        if (!B['zid'] && !B['isTouch'] && !B['dj']) {
            B['isTouch'] = 1;
            B['dj'] = 1;
            _zpJsLoad({
                url: K('//cms.gtags.net/g?z=__zpCMSDCB'),
                cu: function() {
                    B['isGet'] = 1;
                    B['ds'] = 1;
                    _runFunList();
                }
            });
        }
    };
    function _isIE678() {
        var bw = navigator.userAgent || '';
        if (bw.indexOf('MSIE 8.0') > -1 || bw.indexOf('MSIE 7.0') > -1 || bw.indexOf('MSIE 6.0') > -1) return true;
        else return false;
    };
    function _isEmpty(cE) {
        for (var i in cE) {
            return false;
        }
        return true;
    };
    var aZ = function(name) {
        var cc = k(name) + "=";
        var bp = F[aD][X](cc);
        var bT = "";
        if (bp > -1) {
            var bE = F[aD][X](";", bp);
            if (bE == -1) {
                bE = F[aD][r];
            }
            bT = f(F[aD][aB](bp + cc[r], bE));
        }
        return bT;
    };
    var ba = function(name, value, expires, cv, domain, ci) {
        var aW = k(name) + "=" + k(value);
        if (expires instanceof Date) {
            aW += "; expires=" + expires.toGMTString();
        }
        if (cv) {
            aW += "; path=" + cv;
        }
        if (domain) {
            aW += "; domain=" + domain;
        }
        if (ci) {
            aW += "; secure";
        }
        F[aD] = aW;
    };
    var cC = function(name, cv, domain, ci) {
        ba(name, "", new Date(0), cv, domain, ci);
    };
    var af = function(URL) {
        var w = new Object();
        if (URL[X]("?") > 0) {
            var bv = URL[aB](URL[X]("?") + 1);
            if (bv[X]("#") > 0) {
                bv = bv[aB](0, bv[X]("#"));
            }
            var aO = bv[t]("&");
            for (var i = 0; i < aO[r]; i++) {
                w[aO[i][t]("=")[0]] = aO[i][t]("=")[1];
            }
        }
        if (w[U] == undefined || w[U] == '') {
            w[U] = window.__zpclkid;
        }
        return w;
    };
    var cw = function(aw, aC, aT) {
        if (aw.addEventListener) {
            aw.addEventListener(aC, aT, false);
        } else if (aw.attachEvent) {
            aw.attachEvent("on" + aC, aT);
        } else {
            aw["on" + aC] = aT;
        }
    };
    var cp = function(aw, aC, aT) {
        if (aw.removeEventListener) {
            aw.removeEventListener(aC, aT, false);
        } else if (aw.detachEvent) {
            aw.detachEvent("on" + aC, aT);
        } else {
            aw["on" + aC] = null;
        }
    };
    var bs = function() {
        var bm = O.screen;
        return bm.width + "x" + bm.height;
    };
    var bk = function() {
        return F.characterSet || F.charset;
    };
    var by = function() {
        return bG.language || bG.userLanguage;
    };
    var bO = function() {
        return F.title;
    };
    var K = function(cN) {
        var bD = "";
        try {
            bD = "https:" == F[aH][cd] ? "https:": "http:";
        } catch(e) {}
        return bD + cN;
    };
    var aN = function() {
        var cH = O[aH].href;
        if (cH && cH != "") {
            return cH[bt](/\s/g, " ");
        }
        return "";
    };
    var bx = function() {
        var cx = "";
        try {
            cx = F.referrer;
        } catch(ex) {}
        if (cx == "") {
            try {
                if (opener && opener[aH]) {
                    cx = opener[aH].href;
                }
            } catch(ex) {}
        }
        if (cx && cx != "") {
            return cx[bt](/\s/g, " ");
        }
        return cx;
    };
    var bJ = function(bR) {
        if (bR) return bR;
        var cH = aN();
        var aX = /[\w-]+\.(com|net|org|gov|cc|biz|info|cn|cc|tv|hk|biz|asia|me|mobi|name|info|so|co|in|la)(\.(cn|hk))*/;
        var be = cH.match(aX);
        if (be && be.length > 0) {
            return be[0];
        }
        return null;
    };
    var bb = function() {
        var ct = String(Date.parse(new Date()));
        return ct.substr(0, ct.length - 3);
    };
    var J = function(bW) {
        if (bW) {
            bW = bW.replace(/[\s#,|]/g, " ");
        }
        return bW;
    };
    var L = function(bW) {
        if (bW && typeof bW == "string") {
            bW = bW.replace(/^(\s|\u00A0)+/, '').replace(/(\s|\u00A0)+$/, '');
        }
        return bW;
    };
    var ac = [["m.baidu", "word"], ["wap.baidu", "word"], ["opendata.baidu", "wd"], ["baidu", "word"], ["baidu", "wd"], ["baidu", "q1"], ["baidu", "kw"], ["google", "q"], ["soso", "w"], ["sogou", "query"], ["youdao", "q"], ["bing", "q"], ["yahoo", "p"], ["so.360.cn", "q"], ["360so", "q"], ["360sou", "q"], ["so.com", "q"], ["ask", "q"], ["3721", "name"], ["vent", "kw"], ["ucweb", "keyword"], ["ucweb", "word"], ["114so", "kw"], ["haosou", "q"], ["chinaso", "q"], ["zhongsou", "w"], ["etao.com", "q"], [".sm.cn", "q"]];
    var at = function(bq) {
        var aX = /^https?:\/\/(.*?)($|\/.*)/;
        var be = aX.exec(bq);
        if (be != null) {
            var result = "";
            result = be[1];
            var w = af(bq);
            for (var i = 0; i < ac.length; i++) {
                if (result[X](ac[i][0]) >= 0) {
                    if (typeof w[ac[i][1]] != "undefined") {
                        return [2, J(result), "", "", J(w[ac[i][1]]), ""];
                    }
                }
            }
            return [3, J(result), "", "", "", ""];
        } else {
            return [3, J(bq), "", "", "", ""];
        }
    };
    var co = function() {
        var ag = false;
        var aQ = false;
        var aq = null;
        var cL = null;
        var aj = 0;
        var aV = 0;
        var au = 0;
        var T = 0;
        var an = 4;
        var ab = "";
        var Z = "";
        var V = "";
        var ad = "";
        var al = "";
        var aA = 0;
        var aU = 0;
        var R = "";
        var Y = "";
        var aa = "";
        var bB = "//dat.gtags.net/";
        var bV = "//cms.gtags.net/";
        var G = "w";
        var bh = "//ut.gtags.net/imp/material";
        var aG = "//ut.gtags.net/imp/conv";
        var aM = function(A) {
            if (A instanceof bj && A[r] == 2) return A[1];
            return "";
        };
        var cq = function(A) {
            if (A instanceof bj && A.length == 2) {
                if (A[1] == "p") {
                    G = "p";
                } else if (A[1] == "") {
                    G = "";
                }
            }
        };
        var bS = function(A) {
            if (A instanceof bj && A.length == 3) ac.push([A[1], A[2]]);
        };
        var D = "";
        var bU = function(A) {
            D = aM(A);
        };
        var aP = bJ();
        var cl = function(A) {
            aP = aM(A);
        };
        var as = "";
        var ck = function(A) {
            as = aM(A);
        };
        var o = "";
        var cg = function(A) {
            o = aM(A);
        };
        var av = "";
        var bK = function(A) {
            av = aM(A);
        };
        var bg = "";
        var ce = function(A) {
            bg = aM(A);
        };
        var l = "";
        var cf = function(A) {
            if (A instanceof bj) {
                var j = A[r];
                if (j > 16) {
                    j = 16;
                }
                var i = 1;
                var cj = [];
                while (i < j) {
                    cj.push(k(L(A[i])));
                    i++;
                }
                l = cj.join(",");
            }
        };
        var bZ = "",
        bo = {};
        var bC = {
            "_addOrganic": bS,
            "_setAccount": bU,
            "_setDomain": cl,
            "_setPageID": cg,
            "_setPageType": bK,
            "_setParams": cf,
            "_setUserID": ck,
            "_setMType": cq,
            "_setSiteID": ce
        };
        var am = "";
        var bH = "";
        var bF = "";
        var aI = "";
        var az = "";
        function processZamplusTagParams(c) {
            c = aL || c;
            am = "";
            if (typeof c == "object") {
                for (var i in c) {
                    if (c.hasOwnProperty(i)) {
                        var cr = L(i);
                        var value = c[i];
                        if (cr == "p_zp_type") {
                            if (typeof value == "string" || typeof value == "number") {
                                bH = k(L(value))
                            };
                        } else if (cr == "p_zp_uuid") {
                            if (typeof value == "string" || typeof value == "number") {
                                bF = k(L(value))
                            };
                        } else if (cr == "p_zp_conversion") {
                            if (typeof value == "string" || typeof value == "number") {
                                aI = k(L(value))
                            };
                        } else if (cr == "p_zp_convinfo") {
                            if (typeof value == "string" || typeof value == "number") {
                                az = k(L(value))
                            };
                        } else if (cr == "p_zp_prodstype") {
                            if (typeof value == "string" || typeof value == "number") {
                                bZ = k(L(value))
                            };
                        } else if (cr == "p_zp_prods") {
                            if (typeof value == "object" && (!(value instanceof Array)) && !_isEmpty(value)) {
                                for (var m in value) {
                                    if (value[m] != '') bo[m] = value[m];
                                }
                            }
                        } else {
                            if (value instanceof bj) {
                                for (var j in value) {
                                    if (value.hasOwnProperty(j)) {
                                        value[j] = k(L(value[j]));
                                    }
                                }
                                am += k(cr) + "=" + value.join(",") + ";";
                            } else if (typeof value == "string" || typeof value == "number" || typeof value == "boolean") {
                                am += k(cr) + "=" + k(L(value)) + ";";
                            }
                        }
                    }
                }
            }
            if (am != "") {
                return am[aB](0, am[r] - 1);
            }
            return am;
        };
        var bP = function() {
            if (G == "") {
                return;
            }
            if (O[v][G + '_' + D]) {
                return;
            }
            var cn = bV + G;
            var ap = K(cn) + "?a=" + D;
            ap += "&zid=" + ca;
            if (as != "") {
                ap += "&xid=" + as;
            }
            if (G == "w") {
                O[v][G + '_' + D] = true;
                var ak = F.createElement('iframe');
                ak.setAttribute('scrolling', 'no');
                ak.frameBorder = '0';
                ak.src = ap;
                ak.style.cssText = 'width:1px;height:1px;position:fixed;_position:absolute;left:0px;top:0px;margin:0px;padding:0px;z-index:2147483648';
                var ae = F.createElement('iframe');
                ae.setAttribute('scrolling', 'no');
                ae.frameBorder = '0';
                ae.src = 'about:blank';
                ae.style.cssText = 'width:1px;height:1px;position:fixed;_position:absolute;left:0px;top:0px;margin:0px;padding:0px;z-index:2147483648';
                setTimeout(function() {
                    try {
                        F.body.insertBefore(ak, F.body.firstChild);
                        F.body.insertBefore(ae, F.body.firstChild);
                        return;
                    } catch(e) {
                        setTimeout(arguments.callee, 13);
                    }
                },
                13);
                setTimeout(function() {
                    try {
                        ak.parentNode.removeChild(ak);
                        ae.parentNode.removeChild(ae);
                    } catch(e) {}
                },
                10000);
            } else if (G == "p") {
                var cA = new bi();
                cA.src = ap;
                O[v][G + '_' + D] = cA;
            }
        };
        var cV = function(P, H) {
            var ap = "";
            if (! (K()[X]("https") == 0 || G == "")) {
                var cn = bV + G;
                ap = K(cn) + "?a=" + D;
                ap += "&zid=" + ca;
                if (as != "") {
                    ap += "&xid=" + as;
                }
            }
            if (O[v][G + '_' + D]) {
                ap = "";
            }
            if (ap && (G == "w" || G == "") && !(K()[X]("https") == 0)) {
                O[v][G + '_' + D] = true;
                var ak = F.createElement('iframe');
                ak.setAttribute('scrolling', 'no');
                ak.frameBorder = '0';
                ak.src = H.replace('{{cm}}', '&url=' + encodeURIComponent(ap));
                ak.style.cssText = 'width:1px;height:1px;position:fixed;_position:absolute;left:0px;top:0px;margin:0px;padding:0px;z-index:2147483648';
                var ae = F.createElement('iframe');
                ae.setAttribute('scrolling', 'no');
                ae.frameBorder = '0';
                ae.src = 'about:blank';
                ae.style.cssText = 'width:1px;height:1px;position:fixed;_position:absolute;left:0px;top:0px;margin:0px;padding:0px;z-index:2147483648';
                setTimeout(function() {
                    try {
                        F.body && F.body.insertBefore(ak, F.body.firstChild);
                        F.body && F.body.insertBefore(ae, F.body.firstChild);
                        return;
                    } catch(e) {
                        setTimeout(arguments.callee, 13);
                    }
                },
                13);
                setTimeout(function() {
                    try {
                        ak.parentNode.removeChild(ak);
                        ae.parentNode.removeChild(ae);
                    } catch(e) {}
                },
                10000);
            } else {
                O[v][G + '_' + D] = true;
                aq = new bi();
                if (!O[v][P]) {
                    O[v][P] = [];
                }
                O[v][P].push(aq);
                aq.src = H.replace('{{cm}}', ap ? '&url=' + encodeURIComponent(ap) : '');
            }
        };
        var bu = function(type) {
            var P = "";
            var n = 'a=' + D;
            n += '&zid=' + ca;
            if (aa != "") {
                n = n + '&rid=' + k(aa);
            }
            if (as != "") {
                n = n + '&uid=' + k(as);
            }
            if (type == 2) {
                P = "imp/dasp";
                if (o != "") {
                    n = n + '&pi=' + o;
                }
                if (av != "") {
                    n = n + '&pt=' + av;
                }
                if (l != "") {
                    n = n + "&args=" + l;
                }
            } else if (type == 3) {
                P = "imp/dasp3";
                if (!O.zamplus_tag_params) {
                    O.zamplus_tag_params = {};
                }
                n = n + "&ext_args=" + k(processZamplusTagParams(O.zamplus_tag_params));
            }
            if (bH != "") {
                n = n + '&type=' + bH;
            }
            if (bF != "") {
                n = n + '&uuid=' + bF;
            }
            if (bg != "") {
                n = n + '&siteid=' + k(bg);
            }
            n = n + '&vc=' + aj + '&vt=' + aV + '&vpc=' + T + '&rvt=' + au + '&fr=' + aA + '&vrt=' + aU + '&ot=' + an;
            if (ab != "") {
                n = n + '&os=' + k(ab);
            }
            if (Z != "") {
                n = n + '&om=' + k(Z);
            }
            if (V != "") {
                n = n + '&oc=' + k(V);
            }
            if (ad != "") {
                n = n + '&ok=' + k(ad);
            }
            if (al != "") {
                n = n + '&oa=' + k(al);
            }
            if (Y != "") {
                n = n + '&u=' + k(Y);
            }
            n = n + '&sc=' + k(bs()) + '&ch=' + k(bk()) + '&la=' + k(by()) + '&ti=' + k(bO()) + '&v=' + cF;
            if (R != "") {
                n = n + '&ru=' + k(R);
            }
            n = n + '&t=1&r=' + Math.random();
            var H = K(bB + P) + "?" + n;
            if (H.length > 2084 && _isIE678()) {
                n = n.replace('&u=' + k(Y), '');
                H = (K(bB + P) + "?argserror=true&" + n).substring(0, 2084);
            }
            return [P, H];
        };
        var cy = function() {
            var P = "";
            var H = "";
            var bd = "";
            if (ag) {
                bd = bu(3);
            } else if (aQ) {
                bd = cK();
            }
            P = bd[0];
            H = bd[1];
            aq = new bi();
            if (!O[v][P]) {
                O[v][P] = [];
            }
            O[v][P].push(aq);
            aq.src = H;
            bP();
            aA = 0;
        };
        function _invokeZpdl(bN, cW) {
            var cJ = 'rid=' + cW + '&zid=' + ca;
            if (bN.indexOf('?') >= 0) {
                bN += '&' + cJ;
            } else {
                bN += '?' + cJ;
            }
            var aY = document.createElement('iframe');
            aY.setAttribute('scrolling', 'no');
            aY.frameBorder = '0';
            aY.src = bN;
            aY.style.cssText = 'width:1px;height:1px;position:fixed;_position:absolute;left:0px;top:0px;margin:0px;padding:0px;z-index:2147483648';
            setTimeout(function() {
                try {
                    document.body && document.body.insertBefore(aY, document.body.firstChild);
                    return;
                } catch(e) {
                    setTimeout(arguments.callee, 13);
                }
            },
            13);
            setTimeout(function() {
                try {
                    aY.parentNode.removeChild(aY);
                } catch(e) {}
            },
            10000);
        };
        var cs = function() {
            var n = 'a=' + D + '&t=' + bZ;
            for (var i in bo) {
                n += '&' + i + '=' + k(L(bo[i]));
            }
            n += '&_=' + (Math.random() + '').substr(2);
            var H = K(bh) + "?" + n;
            if (! (H.length > 2084 && _isIE678())) {
                var bI = new bi();
                O[v][bh] = bI;
                bI.src = H;
            }
        };
        var bY = function() {
            var n = "a=" + D + "&c=" + aI + '&zid=' + ca + '&allow=0&type=23';
            if (aa != "") {
                n = n + '&i=' + k(aa);
            }
            if (az != "") {
                n = n + "&info=" + az;
            }
            if (Y != "") {
                n = n + '&u=' + k(Y);
            }
            if (R != "") {
                n = n + '&ru=' + k(R);
            }
            n += "&r=" + Math.random();
            var H = K(aG) + "?" + n;
            if (H.length > 2084 && _isIE678()) {
                n = n.replace('&u=' + k(Y), '');
                H = (K(aG) + "?argserror=true&" + n).substring(0, 2084);
            }
            var bI = new bi();
            O[v][aG + '_' + D] = bI;
            bI.src = H;
        };
        var bA = function(M, C) {
            try {
                if (C.length >= 6) {
                    an = C[0];
                    ab = C[1];
                    Z = C[2];
                    V = C[3];
                    ad = C[4];
                    al = C[5];
                }
            } catch(cZ) {}
            var ao = [];
            var w = af(Y);
            if (typeof w[U] != "undefined" || (typeof w["utm_source"] != "undefined" && typeof w["utm_campaign"] != "undefined" && typeof w["utm_medium"] != "undefined")) {
                if (typeof w[U] != "undefined") {
                    ab = "zampda";
                    Z = "zampda";
                    V = J(w[U]);
                    ad = at(R)[4];
                    al = "";
                } else {
                    ab = J(w["utm_source"]);
                    Z = J(w["utm_medium"]);
                    V = J(w["utm_campaign"]);
                    if (typeof w["utm_term"] != "undefined") {
                        ad = J(w["utm_term"]);
                    } else {
                        ad = at(R)[4];
                    }
                    if (typeof w["utm_content"] != "undefined") {
                        al = J(w["utm_content"]);
                    } else {
                        al = "";
                    }
                }
                an = 1;
                return [true, [an, ab, Z, V, ad, al].join("|")];
            } else if (! (R == "" || R == null || R == "undefined")) {
                var cb = new RegExp("^https?:\/\/[\\w\\.]*?" + aP + "($|\/.*|:.*)");
                if (!cb.test(R)) {
                    ao = at(R);
                    if (ao[0] == 2 || (ao[0] == 3 && M)) {
                        an = ao[0];
                        ab = ao[1];
                        ad = ao[4];
                        Z = V = al = "";
                        return [true, ao.join("|")];
                    } else {
                        return [false, C.join("|")];
                    }
                }
            }
            if (M && C.length == 0) {
                an = 4;
                ab = Z = V = ad = al = "";
                return [true, [an, "", "", "", "", ""].join("|")];
            }
            return [false, C.join("|")];
        };
        var bM = function(url) {
            var w = af(Y);
            if (typeof w[U] != "undefined") {
                return w[U];
            }
            return "";
        };
        var bQ = function() {
            var aF = new Date();
            aF.setTime(aF.getTime() + 2 * 365 * 24 * 60 * 60 * 1000);
            aj = 0;
            aV = 0;
            var ah = 0;
            au = 0;
            var Q = 0;
            T = 0;
            var I = bb();
            var aK = "";
            var aS = bM(Y);
            var bz = "";
            var ar = aZ("__xsptplus" + D).split("#");
            var M = false;
            var C = [];
            var ay = 0;
            if (!ar || ar.length < 5) {
                M = true;
            } else {
                aK = ar[2];
                bz = ar[4];
                var ai = ar[0].split(".");
                C = ar[1].split("|");
                if (ai.length != 5 || C.length != 6) {
                    M = true;
                } else {
                    aj = ai[1];
                    ah = ai[2];
                    Q = ai[3];
                    T = ai[4];
                    try {
                        ay = (new Date(parseInt(Q + "000"))).getDate();
                    } catch(cZ) {}
                    if (I - Q >= 30 * 60) {
                        M = true;
                    }
                    if (ay != (new Date(parseInt(I + "000"))).getDate()) {
                        M = true;
                    }
                }
            }
            var aR = [true, ""];
            if (Q > 0) {
                aU = parseInt((I - Q) / 86400);
            }
            if (M) {
                aj++;
                aA = 1;
                aa = aS;
                T = 0;
                ah = I;
                aR = bA(M, C);
            } else {
                aR = bA(M, C);
                M = aR[0];
                if (M) {
                    aj++;
                    aA = 1;
                    aa = aS;
                    T = 0;
                    ah = I;
                } else {
                    aa = aK;
                    aV = I - ah;
                    au = I - Q;
                }
            }
            var ax = af(Y);
            if (ax[U] && (ax[cB] && decodeURIComponent(ax[cB])) && bz != ax[U]) {
                bz = ax[U];
                bX = decodeURIComponent(ax[cB]);
            }
            T++;
            var cG = D + "." + aj + "." + ah + "." + I + "." + T + "#" + aR[1] + "#" + aa + "#" + ca + "#" + bz;
            ba("__xsptplus" + D, cG, aF, "/", aP);
        };
        var bf = function(query) {
            if (query[r] == 0) {
                return false;
            }
            for (i in query) {
                if (query.hasOwnProperty(i)) {
                    if (bC.hasOwnProperty(query[i][0])) {
                        bC[query[i][0]](query[i]);
                    }
                }
            }
            if (D == "") return false;
            return true;
        };
        var cK = function() {
            var c = {};
            if (o == "240") {
                c["ptype"] = "homepage";
            } else if (o == "241") {
                c["ptype"] = "regpage";
            } else if (o == "242") {
                if (l != "") {
                    c["userid"] = f(l);
                }
                c["ptype"] = "regSuccPage";
            } else if (o == "243") {
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
                c["ptype"] = "mycartPage";
            } else if (o == "244") {
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
                c["ptype"] = "orderInfoPage";
            } else if (o == "245") {
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
                c["ptype"] = "orderInfoPage";
            } else if (o == "246") {
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId"] = f(g[0]);
                        c["inStock"] = f(g[1]);
                        c["isWine"] = f(g[2]);
                    }
                }
                c["ptype"] = "productPage";
            } else if (o == "247") {
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 4) {
                        c["productId_list"] = f(g[0]);
                        c["catname"] = f(g[1]);
                        c["catid"] = f(g[2]);
                        c["orderby"] = f(g[3]);
                    }
                }
                c["ptype"] = "categoryPage";
            } else if (o == "248") {
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["keyword"] = f(g[1]);
                        c["orderby"] = f(g[2]);
                    }
                }
                c["ptype"] = "searchPage";
            } else if (o == "358") {
                if (l != "") {
                    c["cityid"] = f(l);
                }
                c["ptype"] = "homepage";
            } else if (o == "360") {
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 2) {
                        c["channelid"] = f(g[0]);
                        c["categoryid"] = f(g[1]);
                    }
                }
                c["ptype"] = "category";
            } else if (o == "361") {
                if (l != "") {
                    c["productid"] = f(l);
                }
                c["ptype"] = "detailpage";
            } else if (o == "362") {
                if (l != "") {
                    c["productid"] = f(l);
                }
                c["ptype"] = "shoppingcart";
            } else if (o == "457") {
                c["ptype"] = "orderinfo";
            } else if (o == "809") {
                c["ptype"] = "homepage";
            } else if (o == "810") {
                c["ptype"] = "logregpage";
                if (l != "") {
                    c["action"] = f(l);
                }
            } else if (o == "811") {
                c["ptype"] = "regSuccPage";
                if (l != "") {
                    c["userid"] = f(l);
                }
            } else if (o == "812") {
                c["ptype"] = "searchPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["keyword"] = f(g[1]);
                        c["orderby"] = f(g[2]);
                    }
                }
            } else if (o == "813") {
                c["ptype"] = "categoryPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 4) {
                        c["productId_list"] = f(g[0]);
                        c["catname"] = f(g[1]);
                        c["catid"] = f(g[2]);
                        c["orderby"] = f(g[3]);
                    }
                }
            } else if (o == "814") {
                c["ptype"] = "topicPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 2) {
                        c["productId_list"] = f(g[0]);
                        c["topicName"] = f(g[1]);
                    }
                }
            } else if (o == "815") {
                c["ptype"] = "productPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 2) {
                        c["productId"] = f(g[0]);
                        c["inStock"] = f(g[1]);
                    }
                }
            } else if (o == "816") {
                c["ptype"] = "mycartPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
            } else if (o == "817") {
                c["ptype"] = "orderInfoPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
            } else if (o == "818") {
                c["ptype"] = "orderSuccPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
            } else if (o == "752") {
                c["ptype"] = "homepage";
            } else if (o == "753") {
                c["ptype"] = "regpage";
            } else if (o == "754") {
                c["ptype"] = "regSuccPage";
            } else if (o == "755") {
                c["ptype"] = "familysalesPage";
            } else if (o == "756") {
                c["ptype"] = "chanelPage";
                if (l != "") {
                    c["chanelName"] = f(l);
                }
            } else if (o == "757") {
                c["ptype"] = "searchPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["keyword"] = f(g[1]);
                        c["orderby"] = f(g[2]);
                    }
                }
            } else if (o == "758") {
                c["ptype"] = "categoryPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 4) {
                        c["productId_list"] = f(g[0]);
                        c["catname"] = f(g[1]);
                        c["brand"] = f(g[2]);
                        c["orderby"] = f(g[3]);
                    }
                }
            } else if (o == "759") {
                c["ptype"] = "productPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 4) {
                        c["productId"] = f(g[0]);
                        c["inStock"] = f(g[1]);
                        c["inventoryDiv"] = f(g[2]);
                        c["flashBuyTime"] = f(g[3]);
                    }
                }
            } else if (o == "760") {
                c["ptype"] = "mycartPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
            } else if (o == "761") {
                c["ptype"] = "orderInfoPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
            } else if (o == "762") {
                c["ptype"] = "orderSuccPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
            } else if (o == "854") {
                c["ptype"] = "homepage";
            } else if (o == "855") {
                c["ptype"] = "logregpage";
                if (l != "") {
                    c["action"] = f(l);
                }
            } else if (o == "856") {
                c["ptype"] = "regSuccPage";
                if (l != "") {
                    c["userid"] = f(l);
                }
            } else if (o == "857") {
                c["ptype"] = "specialPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["keyword"] = f(g[1]);
                        c["orderby"] = f(g[2]);
                    }
                }
            } else if (o == "858") {
                c["ptype"] = "promotionsPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 2) {
                        c["productId_list"] = f(g[0]);
                        c["orderby"] = f(g[1]);
                    }
                }
            } else if (o == "859") {
                c["ptype"] = "topicPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 2) {
                        c["productId_list"] = f(g[0]);
                        c["topicName"] = f(g[1]);
                    }
                }
            } else if (o == "860") {
                c["ptype"] = "productPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 2) {
                        c["productId"] = f(g[0]);
                        c["inStock"] = f(g[1]);
                    }
                }
            } else if (o == "861") {
                c["ptype"] = "mycartPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
            } else if (o == "862") {
                c["ptype"] = "orderInfoPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
            } else if (o == "863") {
                c["ptype"] = "orderSuccPage";
                if (l != "") {
                    var g = l[t](",");
                    if (g[r] >= 3) {
                        c["productId_list"] = f(g[0]);
                        c["totalPrice"] = f(g[1]);
                        c["totalNum"] = f(g[2]);
                    }
                }
            } else {
                c["pagetype"] = av;
                if (l != "") {
                    var g = l[t](",");
                    for (var i = 0; i < g.length; i++) {
                        var cO = av + "_k" + (i + 1);
                        c[cO] = f(g[i]).split(",");
                    }
                }
            }
            O.zamplus_tag_params = c;
            return bu(3);
        };
        this.cM = function() {
            if (typeof _zpq != "undefined") {
                aQ = bf(_zpq);
            }
            if (typeof _zampq != "undefined") {
                ag = bf(_zampq);
            }
            window.__zpSMConfig = window.__zpSMConfig || [];
            if (!ag && !aQ) {
                while (!ag && __zpSMConfig.length > 0) {
                    var cD = __zpSMConfig.shift();
                    if (!cD) continue;
                    var cQ = cD.query || [];
                    ag = bf(cQ);
                    aL = cD.args;
                };
                if (!ag) {
                    return;
                }
            }
            if (!O[v]) {
                O[v] = {};
            }
            if (arguments.length > 0) {
                R = Y;
                Y = arguments[0];
                Y = Y.replace(/\t|\n|\r/g, "");
            } else {
                Y = aN();
                R = bx();
            }
            _getZID({
                cY: function(d) {
                    ca = d;
                    bQ();
                    if (bX) _invokeZpdl(bX, bM(Y));
                    cy();
                    if (aI != "") {
                        bY();
                    }
                    if (bZ != "" && !_isEmpty(bo)) {
                        cs();
                    }
                },
                bc: aZ("__xsptplus" + D).split("#")[3]
            });
            if (aQ) {
                _zpq = [];
            }
            if (ag) {
                _zampq = [];
            }
        }
    };
    var bL = new co();
    bL.cM();
})()