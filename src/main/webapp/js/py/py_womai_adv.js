(function(y, k, m) {
    function n() {
        var f = location.hostname;
        if (/^\d{1,3}.\d{1,3}.\d{1,3}.\d{1,3}$/.test(f)) {
            return f
        }
        var d = f.split("."),
        g = d.length - 2;
        if (2 === d.length) {
            return f
        }
        for (; 0 <= g; --g) {
            if ("www" === d[g]) {
                return d.slice(g + 1).join(".")
            }
            if ( - 1 === ",com,net,org,gov,edu,info,name,int,mil,arpa,asia,biz,pro,coop,aero,museum,ac,ad,ae,af,ag,ai,al,am,an,ao,aq,ar,as,at,au,aw,az,ba,bb,bd,be,bf,bg,bh,bi,bj,bm,bn,bo,br,bs,bt,bv,bw,by,bz,ca,cc,cf,cg,ch,ci,ck,cl,cm,cn,co,cq,cr,cu,cv,cx,cy,cz,de,dj,dk,dm,do,dz,ec,ee,eg,eh,es,et,ev,fi,fj,fk,fm,fo,fr,ga,gb,gd,ge,gf,gh,gi,gl,gm,gn,gp,gr,gt,gu,gw,gy,hk,hm,hn,hr,ht,hu,id,ie,il,in,io,iq,ir,is,it,jm,jo,jp,ke,kg,kh,ki,km,kn,kp,kr,kw,ky,kz,la,lb,lc,li,lk,lr,ls,lt,lu,lv,ly,ma,mc,md,me,mg,mh,ml,mm,mn,mo,mp,mq,mr,ms,mt,mv,mw,mx,my,mz,na,nc,ne,nf,ng,ni,nl,no,np,nr,nt,nu,nz,om,pa,pe,pf,pg,ph,pk,pl,pm,pn,pr,pt,pw,py,qa,re,ro,ru,rw,sa,sb,sc,sd,se,sg,sh,si,sj,sk,sl,sm,sn,so,sr,st,su,sy,sz,tc,td,tf,tg,th,tj,tk,tm,tn,to,tp,tr,tt,tv,tw,tz,ua,ug,uk,us,uy,va,vc,ve,vg,vn,vu,wf,ws,ye,yu,za,zm,zr,zw,".indexOf("," + d[g] + ",")) {
                return d.slice(g).join(".")
            }
        }
        return f
    }
    _py.getLast = function(f) {
        for (var d = this.length - 1; 0 <= d; d--) {
            if (this[d][0] == f) {
                return this[d][1]
            }
        }
        return ""
    };
    _py.serialize = function() {
        function o(q, s) {
            for (var r = 0; r < q.length; r++) {
                if (q[r] === s) {
                    return r
                }
            }
            return - 1
        }
        for (var h = ["domain", "urlParam", "pi", "e", "p", "mapping"], d = [], g = [], p = [], f, e = 0; e < this.length; e++) {
            f = this[e][0],
            -1 === o(h, f) && (g[f] = g[f] || [], 0 < g[f].length ? -1 === o(g[f], this[e][1]) && g[f].push(this[e][1]) : (g[f].push(this[e][1]), d.push([f, g[f]])))
        }
        for (e = 0; e < d.length; e++) {
            p.push(d[e][0] + "=" + m(d[e][1].join(",")))
        }
        return p.join("&")
    };
    if (!_py.getLast("mapping")) {
        var t = "setTimeout(function() {var f=document;e = f.createElement('iframe');e.src='" + ("http:" != location.protocol ? "https://cm.ipinyou.com/cmas.html": "http://cm.ipinyou.com/cma.html") + "';f.body.insertBefore(e,f.body.firstChild);e.style.display='none';}, 5000)"
    }
    y.ipy = {
        r: /(^|&)jump=(\d*)/i,
        cookie: {
            set: function(h, g, f, d, e) {
                z = new Date();
                z.setTime(z.getTime() + (f || 0));
                k.cookie = h + "=" + m(g || "") + (f ? "; expires=" + z.toGMTString() : "") + ";path=/; domain=" + (d || location.host) + (e ? "; secure": "")
            },
            get: function(d) {
                return (d = k.cookie.match(RegExp("(^|;)\\s*" + d + "=([^;]*)", "i"))) ? decodeURIComponent(d[2]) : ""
            }
        },
        setCookie: function(f, d) {
            ipy.cookie.set(f, d, 31536000000, n())
        },
        setSession: function(f, d) {
            ipy.cookie.set(f, d, 0, n())
        },
        getJump: function() {
            var d = ipy.cookie.get("ipysession");
            return d && (d = d.match(ipy.r)) ? parseInt(d[2]) : 0
        },
        setJump: function(d) {
            var f = ipy.cookie.get("ipysession");
            f ? f.match(ipy.r) ? ipy.setSession("ipysession", f.replace(/jump=(\d*)/, "jump=" + d)) : ipy.setSession("ipysession", f + "&jump=" + d) : ipy.setSession("ipysession", "jump=" + d)
        },
        getInfo: function(e) {
            var d = ipy.cookie.get(e);
            if (d) {
                return d
            }
            if (y.localStorage) {
                if (localStorage.getItem(e)) {
                    return localStorage.getItem(e)
                }
            }
            return ""
        },
        setInfo: function(e, d) {
            if (d == null || d == "") {
                return
            }
            ipy.setCookie(e, d);
            if (y.localStorage) {
                localStorage.setItem(e, d)
            }
        },
        getQueryString: function(f) {
            if (f == "" || f == null) {
                return
            }
            var o = y.location.href,
            d = o.split(f),
            e = "";
            if (d.length > 1) {
                o = d[1];
                e = o.split("&")[0].replace("=", "");
                return e
            }
            var g = new RegExp("(^|&)" + f + "=([^&]*)(&|$)"),
            h = y.location.search.substr(1).match(g);
            if (h != null && h) {
                return h[2]
            }
            var p = y.location.hash.substr(1).match(g);
            if (p != null && p) {
                return p[2]
            }
            return ""
        },
        setExendParam: function(o, q, h) {
            var f = o || "",
            d = q || "",
            g = h || "";
            ipy.getExtendParam(f, d, g)
        },
        getExtendParam: function(d, h, p) {
            var o = "",
            f = "";
            if (d != null && d) {
                o = "p=" + d
            }
            if (h != null && h) {
                _py.push(["pv", h])
            }
            if (p != null && p) {
                o += "&ext=" + p
            }
            ipy.extendSend(o)
        },
        itemInfo: function(f) {
            var d = [],
            o;
            switch (typeof f) {
            case "string":
                o = f;
                break;
            case "object":
                var g = ["id", "name", "origPrice", "price", "brand", "imgUrl", "productUrl", "categoryId", "category", "promotion", "discount", "soldOut", "domain"];
                for (var e = 0; e < g.length; e++) {
                    var h = f[g[e]] || "";
                    h = h.toString();
                    d.push(m(h))
                }
                ipy.id = f.id || "";
                o = d.join(",");
                break;
            default:
                return o = ""
            }
            return o
        },
        extendSend: function(d) {
            var f = "";
            if (_py.getLast("e")) {
                f = "e=" + _py.getLast("e") + "&"
            }
            f += d,
            y = _py.getLast("domain"),
            j = ("https:" == location.protocol ? "https": "http") + "://" + y + "/adv?" + _py.serialize() + ipy.getSession() + "&e=" + m(f) + "&rd=" + new Date().getTime(); (new Image()).src = j
        },
        getSession: function() {
            var e = _py.getLast("c");
            if (e && e != null) {
                var d = ipy.getJump();
                if (!isNaN(d) && d == 0) {
                    ipy.setJump(d + 1);
                    return ""
                }
                d++;
                ipy.setJump(d);
                return "&s=" + d
            }
            return ""
        },
        getP: function() {
            var d = _py.getLast("p");
            var e = ipy.id ? ipy.id: "";
            d = d ? d: e;
            return d
        }
    };
    var j = location.href,
    b = k.referrer,
    v, l, i;
    y.parent != y && (j = b, b = "");
    j && _py.push(["u", j]);
    b && _py.push(["r", b]);
    var x = _py.getLast("urlParam"),
    w = ipy.getQueryString(x);
    w = w ? w: ipy.getInfo("ipycookie");
    ipy.setInfo("ipycookie", w);
    w && _py.push(["c", w]);
    y = _py.getLast("domain");
    v = _py.getLast("e");
    if (v != "" && v) {
        v = "e=" + _py.getLast("e")
    } else {
        v = ""
    }
    l = ipy.itemInfo(_py.getLast("pi"));
    j = ("https:" == location.protocol ? "https": "http") + "://" + y + "/adv?" + _py.serialize() + ipy.getSession() + "&pi=" + m(l) + "&p=" + m(ipy.getP()) + "&e=" + m(v) + "&rd=" + new Date().getTime();
    b = k.createElement("iframe");
    b.src = "javascript:false;";
    b.style.display = "none"; (function a() {
        if (k.body) {
            k.body.insertBefore(b, k.body.firstChild);
            try {
                c = b.contentWindow.document,
                c.write('<!doctype html><html><body onload="' + t + '"><script src="' + j + '"><\/script></body></html>'),
                c.close()
            } catch(d) {
                b.contentWindow.location.replace('javascript:void((function(){document.write("<!doctype html><html><body onload=\\"' + t + "\\\"><script>document.domain='" + document.domain + "';var s=document.createElement('script');document.body.insertBefore(s,document.body.firstChild);s.src='" + j + "';<\/script></body></html>\");document.close()})());")
            }
        } else {
            setTimeout(a, 50)
        }
    })()
})(window, document, encodeURIComponent);