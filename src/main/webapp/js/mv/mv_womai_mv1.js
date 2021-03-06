(function() {
    if (window._mvq && !(window._mvq instanceof Array)) {
        return
    }
    var c = window._mv_loader = {};
    c._cmdRunnerList = [];
    c.mv = 0;
    c.mba = 0;
    var g = new Date() - 0;
    c.version = "1.0.4";
    c.getRandom = function(k) {
        var j;
        if (k == "mv") {
            _mv_loader.mv++;
            j = _mv_loader.mv
        } else {
            _mv_loader.mba++;
            j = _mv_loader.mba
        }
        return _mv_loader.random && _mv_loader.random[j] || (g + "" + j)
    };
    c.reg = function(j, k) {
        this._cmdRunnerList.push([j, k])
    };
    c.KD = c.cmdList = [];
    c.runCmd = function() {
        for (var m = 0,
        j = this._cmdRunnerList.length; m < j; m++) {
            var k = this._cmdRunnerList[m];
            k[1].apply(k[0], arguments)
        }
    };
    c.support = function(k) {
        function j(o) {
            this.runner = o
        }
        j.prototype = {
            push: function() {
                var p = arguments.length;
                for (var q = 0; q < p; q++) {
                    var o = [];
                    Array.prototype.push.apply(o, arguments[q]);
                    var r = o.shift();
                    this.runner[r] && this.runner[r].apply(this.runner, o)
                }
            }
        };
        var n = window._mv_loader,
        l = n.cmdList,
        m = new j(k);
        n.reg(m, m.push);
        m.push.apply(m, l);
        return
    };
    var h = {};
    if ("https:" == document.location.protocol) {
        var b = ["https://material-ssl.mediav.com/bjjs/mba.js", "https://static-ssl.mediav.com/mv.js", "", "", "", "https://material-ssl.mediav.com/bjjs/fpass.js"]
    } else {
        var b = ["http://material.mediav.com/bjjs/mba.js", "http://static.mediav.com/mv.js", "", "", "", "http://material.mediav.com/bjjs/fpass.js"]
    }
    var e = ["masamaso.com", "orbis.com"];
    function d(k) {
        var n = false;
        for (var m = 0,
        j = e.length; m < j; m++) {
            k.indexOf(e[m]) >= 0 && (n = true)
        }
        return n
    }
    if (d(document.domain)) {
        b[1] = 0
    }
    if (document.domain.indexOf("yougou") >= 0) {
        b[0] = "https:" == document.location.protocol ? "https://material-ssl.mediav.com/bjjs/mba_yougou.js?20130906": "http://material.mediav.com/bjjs/mba_yougou.js?20130906";
        b[1] = 0
    }
    if (_mvq && _mvq[0] && _mvq[0][1] == "m-21811-0") {
        if ("https:" == document.location.protocol) {
            b[2] = "https://material-ssl.mediav.com/bjjs/js/ihg_tracker.js"
        } else {
            b[2] = "http://material.mediav.com/bjjs/js/ihg_tracker.js"
        }
    }
    if (_mvq && _mvq[0] && _mvq[0][1] == "m-9-1") {
        b[1] = 0;
        if ("https:" == document.location.protocol) {
            b[0] = "https://material-ssl.mediav.com/bjjs/mba_jingdong.js?1"
        } else {
            b[0] = "http://material.mediav.com/bjjs/mba_jingdong.js?1"
        }
    }
    function f(j) {
        j.sort(function(l, k) {
            if (l[0].indexOf("$setGeneral") < 0 || l[0].indexOf("$setAccount") < 0) {
                return true
            }
            if (l[0].indexOf("$logConversion") >= 0 || l[0].indexOf("$logData") >= 0) {
                return false
            }
        })
    }
    function i() {
        var p = window._mv_config = window._mv_config || {};
        m && m[0] && (p.siteid = m[0][1]);
        var o = window.mv_switch || 31;
        p.siteid && h[p.siteid] && (o = h[p.siteid]);
        var m = window._mvq;
        if (window._mvq) {
            for (var k = 0,
            j = m.length; k < j; k++) {
                c.runCmd.call(c, m[k]);
                c.cmdList.push(m[k])
            }
        }
        window._mvq = m = {};
        m.push = function() {
            c.runCmd.apply(c, arguments);
            Array.prototype.push.apply(c.cmdList, arguments)
        };
        for (var k = 0,
        j = b.length; k < j; k++) {
            if (o & Math.pow(2, k)) {
                try {
                    b[k] && a(b[k])
                } catch(n) {}
            }
        }
    }
    function a(k) {
        if (!k) {
            return
        }
        var j = document.createElement("script");
        j.type = "text/javascript";
        j.async = true;
        j.src = k;
        var l = document.getElementsByTagName("script")[0];
        l.parentNode.insertBefore(j, l)
    }
    i()
})();