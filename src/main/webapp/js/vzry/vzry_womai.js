var pixel = {
    params: "?account_id=",
    account_id: {
        default1: "VIZVRM815",
        jiu: "VIZVRM1555"
    },
    pageStatusFlag: false,
    checkMyReadyState: null,
    pixelFireStatus: false,
    parse: function() {
        var f = document,
        b = encodeURIComponent,
        e = "undefined";
        var a = f.URL.toLowerCase();
        var d = false;
        try {
            pixel.checkMyReadyState = setInterval(function() {
                try {
                    pixel.pageloadStatus();
                    if (pixel.pageStatusFlag && !pixel.pixelFireStatus) {
                        var r = "",
                        s = 1,
                        B = 1;
                        var X = "",
                        Q = "",
                        p = "",
                        N = "",
                        y = "",
                        F = "",
                        k = "",
                        q, an = "",
                        O = "",
                        H = "";
                        var af = "",
                        V = "",
                        T = "",
                        R = "";
                        var ae = "",
                        J = "",
                        P = "",
                        w = "";
                        var z = "",
                        D = "",
                        S = "",
                        M = "",
                        aj = "",
                        Y = "",
                        am = "",
                        E = "";
                        var ak = 0,
                        ad = 0,
                        l = 0,
                        ab = "";
                        var u = [],
                        h = ["", "", ""];
                        var L = false,
                        ah = false,
                        I = false,
                        o = false;
                        var ag = "",
                        v = pixel.getCookieValue("scItms");
                        pixel.params += pixel.account_id.default1;
                        var W = "nprdC",
                        t = "Nsc",
                        aa = "isRegUsr",
                        C = "Vclk";
                        var G = pixel.getCookieValue(W),
                        n = pixel.getCookieValue(t);
                        var g = pixel.getCookieValue(aa);
                        if (G) {
                            G = Number(G.split("_")[1]);
                        } else {
                            G = 0;
                        }
                        if (n) {
                            n = Number(n.split("_")[1]);
                        } else {
                            n = 0;
                        }
                        if (g) {
                            g = Number(g.split("_")[1]);
                        } else {
                            g = 0;
                        }
                        if (a.indexOf("criteo") !== -1 || a.indexOf("utm_source=") !== -1) {
                            if (a.indexOf("criteo") !== -1) {
                                pixel.setCookieValue(C, "criteo", 10);
                            } else {
                                if (a.indexOf("utm_source=baidu") !== -1) {
                                    pixel.setCookieValue(C, "baidu", 10);
                                } else {
                                    pixel.setCookieValue(C, "others", 10);
                                }
                            }
                        }
                        var ac = pixel.getCookieValue(C);
                        if (ac) {
                            ac = ac.split("_")[1];
                        } else {
                            ac = "";
                        }
                        if (a.indexOf("/cart/showcart.do") !== -1) {
                            L = true;
                            pixel.setCookieValue(t, ++n, 30);
                        } else {
                            if (a.indexOf("tuan.womai.com/tuan/product-") !== -1 || (a.indexOf("tuan.womai.com/tuan/product.do") !== -1 && a.indexOf("id=") !== -1) || a.indexOf("/wine/product/") !== -1 || a.indexOf("product-") !== -1) {
                                ah = true;
                            } else {
                                if (a.indexOf("womai.com/related") !== -1 || a.indexOf("productlist.do") !== -1) {
                                    I = true;
                                }
                            }
                        }
                        var x = pixel.getDataFromXPath('//*[@id="top_login_span"]/li[2]/a', "href");
                        if (x.indexOf("Member/Exit.do") !== -1 && !g) {
                            pixel.setCookieValue(aa, 1, 90);
                            g = 1;
                        }
                        var Z = f.getElementById("IncludeSmallCartDiv");
                        if (Z) {
                            S = Z.getElementsByTagName("span");
                            if (S.length > 0 && S[0].className == "GoodsCount" && /(\d+)/.test(S[0].innerHTML)) {
                                l = S[0].innerHTML.match(/(\d+)/)[1];
                            }
                        } else {
                            Z = f.getElementById("smallcart_items_amount");
                            if (Z) {
                                l = Z.value;
                            }
                        }
                        if (l > 0) {
                            o = true;
                        }
                        if (L) {
                            M = f.getElementsByTagName("div");
                            for (ak = 0; ak < M.length; ak++) {
                                if (M[ak].className == "ordercont_content") {
                                    aj = M[ak].getElementsByTagName("a");
                                    break;
                                }
                            }
                            for (ak = ad = 0; ak < aj.length && ad < 3; ak++) {
                                if (aj[ak].className == "img_a" && aj[ak].href) {
                                    if (/product-(.+)\.htm/i.test(aj[ak].href)) {
                                        u.push(aj[ak].href.match(/product-(.+)\.htm/i)[1]);
                                        ad++;
                                    }
                                }
                            }
                            for (ak = 0; ak < 3; ak++) {
                                if (!u[ak]) {
                                    u[ak] = "";
                                } else {
                                    if (ak !== 0) {
                                        ag += "|" + u[ak];
                                    } else {
                                        ag = u[ak];
                                    }
                                }
                            }
                            if (ag && ag.length < 100) {
                                pixel.setCookieValue("scItms", ag, 30);
                            }
                            M = f.getElementsByTagName("span");
                            for (ak = 0; ak < M.length; ak++) {
                                if (M[ak].className == "oar_total") {
                                    ab = M[ak].innerHTML.match(/(\d+[\d.,]*)/)[1];
                                    af = M[ak].innerHTML.replace(/(<([^>]+)>)/ig, "").replace(/[0-9.,]/g, "");
                                    break;
                                }
                            }
                            r = "e400";
                            pixel.params = pixel.params + "&section=" + B + "&level=" + s + "&param=" + r + "&pid1=" + u[0] + "&pid2=" + u[1] + "&pid3=" + u[2] + "&currency=" + b(b(af)) + "&price1=" + b(ab);
                            d = true;
                        } else {
                            if (o) {
                                r = "e400";
                                Z = f.getElementById("IncludeSmallCartDiv");
                                if (Z) {
                                    Z = f.getElementById("shoppingcarnav");
                                    if (Z) {
                                        M = Z.getElementsByTagName("div");
                                        for (ak = ad = 0; ak < M.length && ad < 3; ak++) {
                                            if (M[ak].className == "shoppingcarnav_11") {
                                                aj = M[ak].getElementsByTagName("a");
                                                if (aj[0] && aj[0].href) {
                                                    u.push(pixel.getProductId(aj[0].href));
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    Z = f.getElementById("smallcart_scroll");
                                    if (Z) {
                                        M = Z.getElementsByTagName("div");
                                        for (ak = ad = 0; ak < M.length && ad < 3; ak++) {
                                            if (M[ak].className == "title") {
                                                aj = M[ak].getElementsByTagName("a");
                                                if (aj[0] && aj[0].href) {
                                                    u.push(pixel.getProductId(aj[0].href));
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!u[0] && v) {
                                    v = v.split("_")[1];
                                    u = v.split("|");
                                }
                                for (ak = 0; ak < 3; ak++) {
                                    if (!u[ak]) {
                                        u[ak] = "";
                                    }
                                }
                                B = 2;
                                if (ah) {
                                    s = 1;
                                } else {
                                    if (I) {
                                        s = 2;
                                    } else {
                                        s = 3;
                                    }
                                }
                                pixel.params = pixel.params + "&section=" + B + "&level=" + s + "&param=" + r + "&pid1=" + u[0] + "&pid2=" + u[1] + "&pid3=" + u[2];
                                d = true;
                            } else {
                                if (ah) {
                                    r = "e300";
                                    X = pixel.getProductId(a);
                                    if (a.indexOf(".htm") !== -1) {
                                        N = b(b(a.split(".htm")[0] + ".htm"));
                                    } else {
                                        N = b(b(a));
                                    }
                                    if (a.indexOf("/wine/product/") !== -1 || a.indexOf("product-") !== -1) {
                                        Q = b(f.title).split("%E2%80%93")[0];
                                        Q = b((Q));
                                        if (a.indexOf("wine") !== -1 || a.indexOf("jiu.womai.com/packbuyproduct-") !== -1) {
                                            M = f.getElementsByTagName("div");
                                            for (ak = 0; ak < M.length; ak++) {
                                                if (M[ak].className == "Site") {
                                                    aj = M[ak].getElementsByTagName("a");
                                                    for (ai = 0; ai < aj.length && ad < 3; ai++) {
                                                        if (aj[ai].href && aj[ai].href.indexOf("/ProductList.do") !== -1) {
                                                            if (/\?id=(.{4})&/i.test(aj[ai].href)) {
                                                                h[ad++] = aj[ai].href.match(/\?id=(.{4})&/i)[1];
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            am = X.split("-");
                                            an = am[0] + "-" + h[0];
                                            if (h[1]) {
                                                O = am[0] + "-" + h[1];
                                            } else {
                                                O = am[0];
                                            }
                                            var U = "img_" + am[1];
                                            Z = f.getElementById(U);
                                            if (Z && Z.src) {
                                                p = b(b(Z.src));
                                            }
                                            Z = f.getElementById("marketPrice");
                                            if (Z) {
                                                y = b(b(Z.innerHTML.replace(/[^\d.]/g, "")));
                                            }
                                            Z = f.getElementById("productPrice");
                                            if (Z) {
                                                S = Z.getElementsByTagName("span");
                                                for (ak = 0; ak < S.length; ak++) {
                                                    if (S[ak].className == "buyprice") {
                                                        F = b(b(S[ak].innerHTML.replace(/[^\d.]/g, "")));
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Z = f.getElementById("combiProductBuyPrice");
                                                if (Z && Z.innerHTML) {
                                                    F = b(b(Z.innerHTML.replace(/[^\d.]/g, "")));
                                                }
                                            }
                                            Z = f.getElementById("productInfo");
                                            if (Z) {
                                                M = Z.getElementsByTagName("div");
                                                for (ak = 0; ak < M.length; ak++) {
                                                    if (M[ak].className === "productProperty") {
                                                        z = M[ak].getElementsByTagName("ul");
                                                        if (z[0]) {
                                                            D = z[0].getElementsByTagName("li");
                                                            if (D[0]) {
                                                                k = pixel.getMisc(D[0]);
                                                            }
                                                        }
                                                        if (z[1]) {
                                                            D = z[1].getElementsByTagName("li");
                                                            if (D[1]) {
                                                                q = pixel.getMisc(D[0]);
                                                            }
                                                            if (D[2]) {
                                                                q = q + "_" + pixel.getMisc(D[2]);
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!p) {
                                                Z = f.getElementById("preview");
                                                if (typeof Z !== e && Z !== null) {
                                                    Y = Z.getElementsByTagName("img")[0];
                                                    if (Y && Y.src) {
                                                        p = b(b(Y.src));
                                                    }
                                                }
                                            }
                                            pixel.params = "?account_id=" + pixel.account_id.jiu;
                                            pixel.params += "&section=" + B + "&level=" + s + "&param=" + r + "&pid=" + X + "&catid=" + an;
                                            pixel.params += "&subcat1id=" + O + "&pname=" + Q + "&image=" + p + "&lp=" + N + "&old=" + y;
                                            pixel.params += "&new=" + F + "&misc=" + b(b(k)) + "&misc1=" + b(b(q));
                                            pixel.params = pixel.smartTagValidation(r, pixel.params, X, an, O);
                                        } else {
                                            if (typeof a.split("product-")[1] !== e) {
                                                E = a.split("product-")[1];
                                                X = E.split(".htm")[0];
                                                X = pixel.paramChange(X);
                                            }
                                            if (X.indexOf("-") !== -1) {
                                                J = X.split("-");
                                                if (typeof J[0] !== e && J[0] !== null) {
                                                    P = J[0];
                                                }
                                                if (typeof J[1] !== e && J[1] !== null) {
                                                    w = J[1];
                                                }
                                            }
                                            if (a.indexOf("wine") == -1) {
                                                k = 1;
                                                M = f.getElementsByTagName("div");
                                                for (ak = 0; ak < M.length; ak++) {
                                                    if (M[ak].className == "w position") {
                                                        aj = M[ak].getElementsByTagName("a");
                                                        for (ai = 0; ai < aj.length && ai <= 4; ai++) {
                                                            if (aj[ai].href) {
                                                                if (aj[ai].href.indexOf("-") !== -1) {
                                                                    ae = aj[ai].href.substring(aj[ai].href.indexOf("-") + 1);
                                                                    if (ae.indexOf(".htm") !== -1) {
                                                                        ae = ae.substring(0, ae.indexOf(".htm"));
                                                                    }
                                                                }
                                                                if (ai == 2) {
                                                                    an = ae;
                                                                } else {
                                                                    if (ai == 3) {
                                                                        O = ae;
                                                                    } else {
                                                                        if (ai == 4) {
                                                                            H = ae;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                            } else {
                                                k = 2;
                                                Z = f.getElementById("upTop");
                                                if (Z) {
                                                    M = Z.getElementsByTagName("div");
                                                    for (ak = 0; ak < M.length; ak++) {
                                                        if (M[ak].className == "Site") {
                                                            aj = M[ak].getElementsByTagName("a");
                                                            if (aj[1]) {
                                                                E = aj[1].getAttribute("href");
                                                                if (E.indexOf("id=") !== -1) {
                                                                    an = E.split("id=")[1];
                                                                    if (an.indexOf("&") !== -1) {
                                                                        an = an.split("&")[0];
                                                                        an = P + "-" + an;
                                                                    }
                                                                }
                                                            }
                                                            if (aj[2]) {
                                                                E = aj[2].getAttribute("href");
                                                                if (E.indexOf("id=") !== -1) {
                                                                    O = E.split("id=")[1];
                                                                    if (O.indexOf("&") !== -1) {
                                                                        O = O.split("&")[0];
                                                                        O = P + "-" + O;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            Z = f.getElementById("preview");
                                            if (!Z) {
                                                Z = f.getElementById("img_" + w);
                                            }
                                            if (Z) {
                                                Y = Z.getElementsByTagName("img")[0];
                                                if (Y && Y.src) {
                                                    p = b(b(Y.src));
                                                }
                                            }
                                            Z = f.getElementById("marketPrice");
                                            if (Z && Z.innerHTML) {
                                                y = b(b(Z.innerHTML.replace(/[^\d.]/g, "")));
                                            }
                                            Z = f.getElementById("buyPrice");
                                            if (!Z) {
                                                Z = f.getElementById("combiProductBuyPrice");
                                            }
                                            pixel.setCookieValue(W, ++G, 7);
                                            if (g && G >= 10 && n >= 5) {
                                                s = 5;
                                            } else {
                                                if (n >= 5) {
                                                    s = 4;
                                                } else {
                                                    if (G >= 10) {
                                                        s = 3;
                                                    } else {
                                                        if (g) {
                                                            s = 2;
                                                        } else {
                                                            if (ac.indexOf("criteo") !== -1) {
                                                                B = 2;
                                                                s = 3;
                                                            } else {
                                                                if (ac.indexOf("baidu") !== -1) {
                                                                    B = 2;
                                                                    s = 2;
                                                                } else {
                                                                    if (ac.indexOf("others") !== -1) {
                                                                        B = 2;
                                                                        s = 1;
                                                                    } else {
                                                                        s = 1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Z) {
                                                F = b(b(Z.innerHTML.replace(/[^\d.]/g, "")));
                                                pixel.params = pixel.params + "&section=" + B + "&level=" + s + "&param=" + r + "&pid=" + b(b(X)) + "&catid=" + b(b(an)) + "&subcat1id=" + b(b(O)) + "&subcat2id=" + b(b(H)) + "&pname=" + b(b(Q)) + "&image=" + b(b(p)) + "&lp=" + N + "&old=" + y + "&new=" + F + "&misc=" + k;
                                                pixel.params = pixel.smartTagValidation(r, pixel.params, X, an, O, H);
                                            }
                                        }
                                    } else {
                                        if (a.indexOf("tuan.womai.com/tuan/product-") !== -1 || (a.indexOf("tuan.womai.com/tuan/product.do") !== -1 && a.indexOf("id=") !== -1)) {
                                            if (~a.indexOf("product-") && ~a.indexOf(".htm")) {
                                                X = a.split("product-")[1].split(".htm")[0];
                                                N = a.split(".htm")[0] + ".htm";
                                            } else {
                                                if (~a.indexOf("product.do") && ~a.indexOf("id=")) {
                                                    X = a.split(/[&?#]id=/)[1].split(/[&?#]/)[0];
                                                    if (a.indexOf("mid=") !== -1) {
                                                        var m = a.split(/[?&#]mid=/)[1].split(/[&?#]/)[0];
                                                        X = m + "-" + X;
                                                    }
                                                    N = b(b("http://tuan.womai.com/tuan/product-" + X + ".htm"));
                                                }
                                            }
                                            an = "Tuan";
                                            p = b(b(pixel.getDataFromXPath("/html/body/div[3]/div/div[3]/div[3]/div[2]/a/img", "src")));
                                            y = b(b((pixel.getDataFromXPath('//*[@id="topBuyPrice"]/strong')).replace(/[^0-9,.]/, "")));
                                            F = b(b((pixel.getDataFromXPath('//*[@id="buyPrice"]')).replace(/[^0-9,.]/, "")));
                                            Q = pixel.getDataFromXPath("/html/body/div[3]/div/div[3]/div[1]/a");
                                            Q = b(Q);
                                            if (Q.indexOf("%E3%80%90") !== -1) {
                                                Q = Q.substr(Q.lastIndexOf("%E3%80%90") + 9);
                                                if (Q.indexOf("%E3%80%91") !== -1) {
                                                    Q = Q.substring(0, Q.indexOf("%E3%80%91"));
                                                }
                                            }
                                            Q = b((Q));
                                            pixel.setCookieValue(W, ++G, 7);
                                            if (g && G >= 10 && n >= 5) {
                                                s = 5;
                                            } else {
                                                if (n >= 5) {
                                                    s = 4;
                                                } else {
                                                    if (G >= 10) {
                                                        s = 3;
                                                    } else {
                                                        if (g) {
                                                            s = 2;
                                                        } else {
                                                            if (ac.indexOf("criteo") !== -1) {
                                                                B = 2;
                                                                s = 3;
                                                            } else {
                                                                if (ac.indexOf("baidu") !== -1) {
                                                                    B = 2;
                                                                    s = 2;
                                                                } else {
                                                                    if (ac.indexOf("others") !== -1) {
                                                                        B = 2;
                                                                        s = 1;
                                                                    } else {
                                                                        s = 1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            pixel.params = pixel.params + "&section=" + B + "&level=" + s + "&param=" + r + "&pid=" + b(b(X)) + "&catid=" + b(b(an)) + "&pname=" + b(b(Q)) + "&image=" + b(b(p)) + "&lp=" + N + "&old=" + y + "&new=" + F;
                                            pixel.params = pixel.smartTagValidation(r, pixel.params, X, an, Q, F);
                                        }
                                    }
                                    d = true;
                                } else {
                                    if (I) {
                                        r = "e205";
                                        if (a.indexOf("productlist.do") !== -1) {
                                            M = f.getElementsByTagName("div");
                                            if (a.indexOf("wine") !== -1) {
                                                for (ak = ad = 0; ak < M.length; ak++) {
                                                    if (M[ak].className == "Commodity") {
                                                        var al = M[ak].getElementsByTagName("div");
                                                        for (var ai = 0; ai < al.length && ad < 3; ai++) {
                                                            if (al[ai].className == "list_r2t") {
                                                                aj = al[ai].getElementsByTagName("a")[0];
                                                                if (aj && aj.href) {
                                                                    u.push(pixel.getSearchProductId(aj.href));
                                                                    ad++;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (ak = ad = 0; ak < M.length && ad < 3; ak++) {
                                                    if (M[ak].className == "product_item_img") {
                                                        var A = M[ak - 1];
                                                        if (A.className == "proitem_list") {
                                                            aj = M[ak].getElementsByTagName("a")[0];
                                                            if (aj && aj.href) {
                                                                u.push(pixel.getSearchProductId(aj.href));
                                                                ad++;
                                                            }
                                                        }
                                                    } else {
                                                        if (M[ak].className == "list_r2img" && a.indexOf("/wine/") !== -1) {
                                                            B = 2;
                                                            aj = M[ak].getElementsByTagName("a")[0];
                                                            if (aj && aj.href) {
                                                                u.push(pixel.getSearchProductId(aj.href));
                                                                ad++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            for (ak = 0; ak < 3; ak++) {
                                                if (!u[ak]) {
                                                    u[ak] = "";
                                                }
                                            }
                                            V = pixel.paramChange(u[0]);
                                            T = pixel.paramChange(u[1]);
                                            R = pixel.paramChange(u[2]);
                                            pixel.params = "?account_id=" + pixel.account_id.jiu;
                                            pixel.params = pixel.params + "&section=" + B + "&level=" + s + "&param=" + r + "&pid1=" + V + "&pid2=" + T + "&pid3=" + R;
                                            pixel.params = pixel.smartTagValidation(r, pixel.params, V, T, R);
                                        } else {
                                            if (a.indexOf("womai.com/related") !== -1) {
                                                B = 2;
                                                s = 1;
                                                V = a.split("related-")[1].split(".htm")[0];
                                                V = pixel.paramChange(V);
                                                pixel.params = pixel.params + "&section=" + B + "&level=" + s + "&param=" + r + "&pid1=" + V;
                                                pixel.params = pixel.smartTagValidation(r, pixel.params, V);
                                            }
                                        }
                                        d = true;
                                    } else {
                                        r = "e100";
                                        pixel.params = pixel.params + "&section=" + B + "&level=" + s + "&param=" + r;
                                        d = true;
                                    }
                                }
                            }
                        }
                        if (d && !(pixel.pixelFireStatus)) {
                            pixel.fireAnalyze(pixel.params);
                        }
                    }
                } catch(K) {
                    pixel.fireAnalyze(pixel.params + "&param=999&err=" + b(K));
                }
            },
            3000, "Javascript");
        } catch(c) {
            pixel.fireAnalyze(pixel.params + "&param=999&err=" + b(c));
        }
    },
    pageloadStatus: function() {
        if (document.readyState === "interactive" || document.readyState === "complete") {
            pixel.pageStatusFlag = true;
            clearInterval(pixel.checkMyReadyState);
        } else {
            pixel.pageStatusFlag = false;
        }
    },
    fireAnalyze: function(d) {
        var c = ("https:" == document.location.protocol ? "https://cn-pl": "http://cn-pl") + ".vizury.com/analyze/analyze.php";
        d += pixel.viz_call_fp();
        var a = document.createElement("iframe");
        a.src = c + d;
        a.scrolling = "no";
        a.width = 1;
        a.height = 1;
        a.marginheight = 0;
        a.marginwidth = 0;
        a.frameborder = 0;
        a.style.display = "none";
        var b = document.getElementsByTagName("script")[0];
        b.parentNode.insertBefore(a, b);
        pixel.pixelFireStatus = true;
        clearInterval(pixel.checkMyReadyState);
    },
    getMisc: function(b) {
        if (b) {
            var a = b.getElementsByTagName("span");
            if (a[0] && a[0].getAttribute("title")) {
                return a[0].getAttribute("title");
            }
        }
        return "";
    },
    getProductId: function(c) {
        var a = "";
        if (/product-(.+)\.htm/i.test(c)) {
            a = c.match(/product-(.+)\.htm/i)[1];
        } else {
            if (typeof c.toLowerCase().split("product-")[1] !== "undefined") {
                var d = c.toLowerCase().split("product-")[1];
                a = d.split(".htm")[0];
                a = pixel.paramChange(a);
            }
        }
        if (!a) {
            if (!a && ~c.indexOf("product.do") && ~c.indexOf("id=")) {
                a = c.split(/[&?#]id=/)[1].split(/[&?#]/)[0];
                if (c.indexOf("mid=") !== -1) {
                    var b = c.split(/[?&#]mid=/)[1].split(/[&?#]/)[0];
                    a = b + "-" + a;
                }
            }
        }
        return a;
    },
    getSearchProductId: function(a) {
        var b;
        a = a.toLowerCase();
        if (a.indexOf(".htm") !== -1) {
            b = a.substring(0, a.indexOf(".htm"));
            return b.substring(b.indexOf("-") + 1);
        }
        return "";
    },
    getCookieValue: function(b) {
        var a = "";
        var d = document.cookie.split(b + "=");
        if (typeof d[1] !== "undefined") {
            var c = d[1].split(";");
            a = decodeURIComponent(c[0]);
        }
        return a;
    },
    setCookieValue: function(b, e, c) {
        var a = "",
        d;
        var f = new Date();
        f.setDate(f.getDate() + c);
        var g = pixel.getCookieValue(b);
        if (g !== "" && g !== null) {
            a = g.split("_")[0];
            f = new Date(a);
            d = encodeURIComponent(e) + ((c === null) ? "": "; expires=" + f.toUTCString()) + ";domain=.womai.com; path=/";
            document.cookie = b + "=" + f.toUTCString() + "_" + d;
        } else {
            d = encodeURIComponent(e) + ((c === null) ? "": "; expires=" + f.toUTCString()) + ";domain=.womai.com; path=/";
            document.cookie = b + "=" + f.toUTCString() + "_" + d;
        }
    },
    paramChange: function(a) {
        if (a !== null && a !== "undefined") {
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
    smartTagValidation: function(h, g, f, e, d, c) {
        var a = g.substring(g.indexOf("account_id=") + 11, g.indexOf("&"));
        var i = h.substring(0, 1);
        f = typeof f !== "undefined" ? f: "";
        e = typeof e !== "undefined" ? e: "";
        d = typeof d !== "undefined" ? d: "";
        c = typeof c !== "undefined" ? c: "";
        var b = g;
        switch (i) {
        case "t":
            if (f === "" || e === "") {
                b = "?account_id=" + a + "&section=1&level=2&param=t100";
            }
            break;
        default:
            if (f === "" && e === "" && d === "" && c === "") {
                b = "?account_id=" + a + "&section=1&level=2&param=" + i + "100";
            }
            break;
        }
        return b;
    },
    getDataFromXPath: function(e, g) {
        var d = [],
        n = [],
        a = [];
        var c = "",
        f = "",
        j = "",
        s = "",
        l = 0;
        var h = document.getElementsByTagName("body")[0];
        var b = "undefined";
        var r = true;
        var k = e.replace("/html/body/", "");
        if (e.indexOf('@id="') !== -1) {
            d = e.match(/.*\[@id="(.+)"\].*/);
            if (typeof d !== "undefined" && d !== null && d.length >= 1) {
                c = d[1];
            }
        }
        if (typeof c !== "undefined" && c !== null && c !== "") {
            h = document.getElementById(c);
            var q = '/*[@id="' + c + '"]/';
            var p = '//*[@id="' + c + '"]/';
            var m = '//*[@id="' + c + '"]';
            var o = '*//*[@id="' + c + '"]/';
            k = k.replace(o, "");
            k = k.replace(p, "");
            k = k.replace(q, "");
            k = k.replace(m, "");
        }
        if (typeof k === "undefined" || k === null || k === "") {
            h = document.getElementById(c);
        } else {
            n = k.split("/");
            for (l = 0; l < n.length; l++) {
                if (typeof n[l] !== "undefined" && n[l] !== null) {
                    a = n[l].match(/(\w*)(\[(\d+)\])?/);
                    if (typeof a !== "undefined" && a !== null) {
                        s = a[1];
                        f = 1;
                        if (a.length >= 3 && a[3] != undefined && a[3] != "") {
                            f = a[3];
                        }
                    }
                }
                if (typeof h !== b && h !== null && h != "No Data") {
                    h = pixel.getCurrentNode(h, s, f);
                } else {
                    r = false;
                    break;
                }
            }
        }
        if (typeof h !== b && h !== null && r && h != "No Data") {
            if (g === "" || g === null || g == undefined) {
                if (typeof h.innerHTML !== b && h.innerHTML !== null) {
                    j = h.innerHTML;
                }
            } else {
                if (typeof h.getAttribute(g) !== b && h.getAttribute(g) !== null) {
                    j = h.getAttribute(g);
                }
            }
            return pixel.removeJunk(j);
        } else {
            return "";
        }
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
    getCurrentNode: function(f, c, g) {
        var b = "";
        var a = 1,
        e = 0;
        var d = "undefined";
        if (typeof f.childNodes !== d && f.childNodes !== null) {
            var h = f.childNodes;
            for (a = 0; a <= h.length; a++) {
                if (typeof h[a] !== d && h[a] !== null && typeof h[a].tagName !== d && h[a].tagName !== null && h[a].tagName.toLowerCase() === c) {
                    e++;
                }
                if (e == g) {
                    b = h[a];
                    break;
                }
            }
            return b;
        } else {
            return null;
        }
    }
};
pixel.viz_call_fp = function() {
    if (pixel.viz_isSafari()) {
        var a = "_vz";
        var b = pixel.viz_getFPCookieValue(a);
        if (b == "" || !b.match("^vizSF_")) {
            b = pixel.viz_randomString();
            pixel.viz_setFPCookieValue(a, b, 365);
        }
        return "&cb=" + b + "&csm=2";
    } else {
        return "";
    }
};
pixel.viz_setFPCookieValue = function(b, d, c) {
    var a = new Date();
    a.setDate(a.getDate() + c);
    document.cookie = b + "=" + d + ";path=/;expires=" + a.toGMTString();
};
pixel.viz_getFPCookieValue = function(c) {
    var d = document.cookie;
    if (d.length > 0) {
        var b = d.indexOf(c + "=");
        if (b != -1) {
            b = b + c.length + 1;
            var a = d.indexOf(";", b);
            if (a == -1) {
                a = d.length;
            }
            if (typeof(d.substring(b, a)) !== "undefined" && (d.substring(b, a)) != null) {
                return decodeURIComponent(d.substring(b, a));
            }
        }
    }
    return "";
};
pixel.viz_randomString = function() {
    var e = new Date();
    var d = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz";
    var f = 5;
    var c = "";
    for (var b = 0; b < f; b++) {
        var a = Math.floor(Math.random() * d.length);
        c += d.substring(a, a + 1);
    }
    return ("vizSF_" + e.getTime() + c);
};
pixel.viz_isSafari = function() {
    var b = navigator.userAgent;
    var a = pixel.viz_getUserBrowserName(b);
    return /safari/i.test(a);
};
pixel.viz_getUserBrowserName = function(a) {
    if (a == null) {
        return "UNKNOWN";
    }
    if (/mqqbrowser/i.test(a)) {
        if (/adr/i.test(a) || /android/i.test(a)) {
            return "MOBILE_ANDRIOD_MQQ";
        } else {
            if (/iphone/i.test(a)) {
                return "MOBILE_IOS_MQQ";
            } else {
                if (/nokia/i.test(a)) {
                    return "MOBILE_WINDOWS_MQQ";
                }
            }
        }
    }
    if (/opera/i.test(a) || /opr/i.test(a)) {
        if (/mobi/i.test(a) || /mini/i.test(a)) {
            return "MOBILE_ANDROID_OPERA";
        } else {
            if (/tablet/i.test(a)) {
                return "MOBILE_ANDROID_OPERA_TAB";
            } else {
                return "DESKTOP_OPERA";
            }
        }
    }
    if (/tencenttraveler/i.test(a)) {
        return "MOBILE_WINDOWS_TENCENT";
    }
    if (/baidubrowser/i.test(a)) {
        return "MOBILE_WINDOWS_BAIDU";
    }
    if (/iemobile/i.test(a)) {
        return "MOBILE_WINDOWS_IE";
    }
    if (/criOS/i.test(a)) {
        return "MOBILE_IOS_CHROME";
    }
    if (/ucbrowser/i.test(a)) {
        if (/linux/i.test(a)) {
            return "MOBILE_ANDROID_UCBROWSER";
        }
        if (/ios/i.test(a) || /ipad/i.test(a)) {
            return "MOBILE_IOS_UCBROWSER";
        }
    }
    if (/android/i.test(a) && /mobile safari/i.test(a) && !/chrome/i.test(a)) {
        return "MOBILE_ANDROID_DEFAULT";
    }
    if (/chrome/i.test(a)) {
        if (/android/i.test(a)) {
            return "MOBILE_ANDROID_CHROME";
        }
        return "DESKTOP_CHROME";
    } else {
        if (/msie/i.test(a)) {
            return "DESKTOP_IE";
        } else {
            if (/firefox/i.test(a)) {
                if (/android/i.test(a)) {
                    return "MOBILE_ANDROID_FIREFOX";
                }
                return "DESKTOP_FIREFOX";
            } else {
                if (/ipad/i.test(a) || /iphone/i.test(a)) {
                    return "MOBILE_IOS_SAFARI";
                } else {
                    if (/safari/i.test(a)) {
                        return "DESKTOP_SAFARI";
                    }
                }
            }
        }
    }
    return "OTHER";
};