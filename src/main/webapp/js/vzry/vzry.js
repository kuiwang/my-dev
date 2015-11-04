var pixel = {
	pixelConfig : null,
	initialize : null,
	finalize : null,
	paramArray : [],
	pageLoadStatusFlag : false,
	checkReadyStateOnIntervals : null,
	pixelFireStatus : false,
	baseUrl : null,
	parse : function() {
		var b = "", c = "";
		try {
			if (!pixel.pixelFireStatus) {
				pixel.checkReadyStateOnIntervals = setInterval(function() {
					pixel.checkIfPageLoadComplete();
					if (pixel.pageLoadStatusFlag && !pixel.pixelFireStatus) {
						try {
							pixel.initialize();
							pixel.getParams();
							pixel.finalize();
						} catch (d) {
							pixel.paramArray.param = "999";
							pixel.paramArray.err = d;
							b = pixel.getQueryString(pixel.paramArray);
							c = pixel.baseUrl + b;
							pixel.fireAnalyze(c);
						}
					}
				}, 3000, "Javascript");
			}
		} catch (a) {
			pixel.paramArray.param = "999";
			pixel.paramArray.err = a;
			b = pixel.getQueryString(pixel.paramArray);
			c = pixel.baseUrl + b;
			pixel.fireAnalyze(c);
		}
	},
	checkIfPageLoadComplete : function() {
		if (document.readyState === "interactive"
				|| document.readyState === "complete") {
			pixel.pageLoadStatusFlag = true;
			clearInterval(pixel.checkReadyStateOnIntervals);
		} else {
			pixel.pageLoadStatusFlag = false;
		}
	},
	getParams : function() {
		var b = "", a = "", c = "";
		for ( var d in pixel.pixelConfig) {
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
	getDataFromXPath : function(j, k) {
		var r = [], f = [], b = [];
		var h = "", e, d = "";
		var q = "", p = "";
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
	removeJunk : function(a) {
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
	getCurrentNode : function(e, c, f) {
		var b = "No Data";
		var a = 1, d = 0;
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
	getDataFromUrl : function(d, c) {
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
	getParamFromUrl : function(c, e) {
		var d = new RegExp("(?:\\?|&)" + e + "=(.*?)(?=&|$)", "gi");
		var b = [], a;
		while (a = d.exec(c)) {
			b[b.length] = a[1];
		}
		if (b.length !== 0) {
			return b[0];
		}
		return "";
	},
	fireAnalyze : function(c) {
		if (!(pixel.pixelFireStatus)) {
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
	paramChange : function(a) {
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
	getCookie : function(b) {
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
	setCookie : function(b, f, c) {
		var e = ".sfbest.com";
		var a = e ? ("; domain=" + e) : "";
		if (c > 0) {
			var g = new Date();
			g.setDate(g.getDate() + c);
			var d = encodeURIComponent(f)
					+ ((c == null) ? "" : "; expires=" + g.toUTCString())
					+ "; path=/" + a;
			document.cookie = b + "=" + d;
		} else {
			document.cookie = b + "=" + encodeURIComponent(f);
		}
	},
	getQueryString : function(a) {
		var c = a.account_id;
		var e = "?account_id=" + c;
		delete a.account_id;
		var d = "";
		for ( var b in a) {
			if (a.hasOwnProperty(b)) {
				d = a[b];
				e += "&" + b + "=" + pixel.paramChange(d);
			}
		}
		return e;
	},
	getElementsByClass : function(f, b, k) {
		var h = [];
		k = k || "*";
		b = b || document;
		var d = b.getElementsByTagName(k);
		var a = d.length;
		var g = new RegExp("(^|\\s)" + f + "(\\s|$)");
		for (var e = 0, c = 0; e < a; e++) {
			if (g.test(d[e].className)) {
				h[c] = d[e];
				break;
			}
		}
		return h;
	}
};
pixel.baseUrl = ("https:" == document.location.protocol ? "https://ssl"
		: "http://serv3")
		+ ".vizury.com/analyze/analyze.php";
pixel.initialize = function() {
	var g = document, d = "undefined", k = encodeURIComponent, z = decodeURIComponent;
	var J = "", e = "", C = "", A = "", o, N = "", F = "", b = "", u = "";
	var R = "", l = false, H = "", D = "", a = "", y = "", m = "", K = "", B = [
			"", "", "" ], Q = 0, f = 1, v = 1, x = 0;
	var P = "Nprd", G = "Nclk", t = "userLogin", h = "Nsc", n = "NTy", r = "NCviz";
	var I = "";
	var c = g.URL.toLowerCase();
	pixel.paramArray.account_id = "VIZVRM1326";
	pixel.paramArray.section = pixel.paramArray.level = "1";
	if (typeof google_tag_params !== d && google_tag_params !== null) {
		if (typeof google_tag_params.ecomm_pagetype !== d
				&& google_tag_params.ecomm_pagetype !== null) {
			u = google_tag_params.ecomm_pagetype;
		}
		if (typeof google_tag_params.ecomm_prodid !== d
				&& google_tag_params.ecomm_prodid !== null) {
			K = google_tag_params.ecomm_prodid;
		}
	}
	var q = "%E5%8A%A0%E5%85%A5%E8%B4%AD%E7%89%A9%E8%BD%A6";
	o = g.getElementById("cart-add-btn-sf");
	if (o) {
		A = o.getElementsByTagName("a")[0];
		if (typeof A !== d && A !== null && k(A.innerHTML).indexOf(q) !== -1) {
			l = true;
		}
	}
	var M = pixel.getCookie(P);
	if (!M) {
		M = 0;
	}
	var E = pixel.getCookie(n);
	if (!E) {
		E = 0;
	}
	var L = pixel.getCookie(r);
	if (!L) {
		L = 0;
	}
	var j = pixel.getCookie(G);
	if (!j) {
		j = 0;
	}
	var w = pixel.getCookie(h);
	if (!w) {
		w = 0;
	}
	if (c.indexOf("utm_source") !== -1 || c.indexOf("gclid") !== -1) {
		if (j != 0) {
			j = Number(j) + 1;
			pixel.setCookie(G, j, 30);
		} else {
			pixel.setCookie(G, 1, 30);
		}
	}
	if (L != 0) {
		L = Number(L) + 1;
		pixel.setCookie(r, L, 30);
	} else {
		pixel.setCookie(r, 1, 30);
	}
	if (c.indexOf("cart.sfbest.com/order/prompt/?orderid=") !== -1
			|| u == "purchase"
			|| c.indexOf("cart.sfbest.com/order/msg/?orderid=") !== -1) {
		if (typeof google_tag_params !== d && google_tag_params) {
			if (google_tag_params.ecomm_totalvalue) {
				e = google_tag_params.ecomm_totalvalue;
			}
		}
		if (!e) {
			if (typeof s !== d && s !== null && typeof s.ordermoney !== d
					&& s.ordermoney !== null) {
				e = s.ordermoney;
			}
		}
		o = g.getElementById("orderId");
		if (o && o.value !== null) {
			J = o.value;
		}
		if (!J) {
			if (typeof s !== d && s !== null && typeof s.orderid !== d
					&& s.orderid !== null) {
				J = s.orderid;
			}
		}
		if (K[0] && K[0] !== null) {
			if (K[0].indexOf(",") !== -1) {
				N = K[0].split(",");
				for (Q = 0; Q < 3; Q++) {
					if (N[Q] !== null && typeof N[Q] !== d) {
						B[x++] = N[Q];
					}
				}
			} else {
				B[0] = K[0];
			}
		}
		o = g.getElementById("main");
		if (o) {
			A = pixel.getElementsByClass("newdingdan", o, "table");
			if (typeof A[0] !== d && A[0] !== null && A[0].rows[1] !== null
					&& A[0].rows[1].cells[3] !== null) {
				var p = A[0].rows[1].cells[3];
				I = pixel.removeJunk(p.innerHTML.replace(/(<([^>]+)>)/ig, ""))
						.replace(/[0-9.,]/g, "");
			}
		}
		if (c.indexOf("cart.sfbest.com/order/msg/?orderid=") !== -1) {
			pixel.paramArray.level = "2";
			if (E != 0) {
				E = Number(E) + 1;
				pixel.setCookie(n, E, 45);
			} else {
				pixel.setCookie(n, 1, 45);
			}
		}
		if (J && e && I && (B[0] || B[1] || B[2])) {
			pixel.paramArray.param = "e500";
			pixel.paramArray.orderid = J;
			pixel.paramArray.orderprice = e;
			pixel.paramArray.pid1 = B[0];
			pixel.paramArray.pid2 = B[1];
			pixel.paramArray.pid3 = B[2];
			pixel.paramArray.currency = I;
		} else {
			pixel.paramArray.level = 2;
			pixel.paramArray.param = "e100";
		}
	} else {
		if (u == "cart" || c.indexOf("cart.sfbest.com/cart/index") !== -1
				|| c.indexOf("cart.sfbest.com/order/index") !== -1) {
			if (K[0] && K[0] !== null) {
				if (K[0].indexOf(",") !== -1) {
					N = K[0].split(",");
					for (Q = 0; Q < 3; Q++) {
						if (N[Q] !== null && typeof N[Q] !== d) {
							B[x++] = N[Q];
						}
					}
				} else {
					B[0] = K[0];
				}
			} else {
				if (typeof s !== d && s !== null && typeof s.shopcart !== d
						&& s.shopcart !== null) {
					N = s.shopcart;
					if (N.indexOf("|") !== -1) {
						N = N.split("|");
						for (Q = 0; Q < 3; Q++) {
							if (N[Q] !== null && typeof N[Q] !== d) {
								B[x++] = N[Q];
							}
						}
					} else {
						B[0] = N;
					}
				}
			}
			if (w != 0) {
				w = Number(w) + 1;
				pixel.setCookie(h, w, 30);
			} else {
				pixel.setCookie(h, 1, 30);
			}
			if (c.indexOf("/order/") !== -1) {
				pixel.paramArray.level = 2;
			}
			pixel.paramArray.pid1 = B[0];
			pixel.paramArray.pid2 = B[1];
			pixel.paramArray.pid3 = B[2];
			if (B[0] || B[1] || B[2]) {
				pixel.paramArray.param = "e400";
			} else {
				pixel.paramArray.param = "e100";
				pixel.paramArray.level = "2";
			}
		} else {
			if (l || u == "product") {
				pixel.paramArray.param = "e300";
				A = pixel.getElementsByClass("breadcrumb", "", "div");
				if (typeof A[0] !== d && A[0] !== null) {
					H = A[0].getElementsByTagName("a");
					for (Q = 1; Q < H.length; Q++) {
						if (typeof H[Q] !== d && H[Q] !== null) {
							B[x++] = pixel.removeJunk(H[Q].innerHTML);
							if (x == 3) {
								break;
							}
						}
					}
				}
				if (!K) {
					if (typeof _SF_CFG !== d && _SF_CFG !== null) {
						if (typeof _SF_CFG.number !== d
								&& _SF_CFG.number !== null) {
							K = _SF_CFG.number;
						}
					}
				}
				if (typeof _SF_CFG !== d && _SF_CFG !== null) {
					if (typeof _SF_CFG.price !== d && _SF_CFG.price !== null) {
						y = _SF_CFG.price;
					}
					if (typeof _SF_CFG.sfprice !== d
							&& _SF_CFG.sfprice !== null) {
						m = _SF_CFG.sfprice;
					}
				}
				var O = "%E4%BA%A7%E5%9C%B0%EF%BC%9A";
				A = pixel.getElementsByClass("pItemsSide", "", "div");
				if (typeof A[0] !== d && A[0] !== null) {
					H = A[0].getElementsByTagName("li");
					for (Q = 0; Q < H.length; Q++) {
						if (H[Q]) {
							N = k(H[Q].innerHTML.replace(/(<([^>]+)>)/ig, ""));
							if (N.indexOf(O) !== -1) {
								a = z(N.split(O)[1]);
								break;
							}
						}
					}
				}
				o = g.getElementById("zoom-jpg");
				if (o && o !== null) {
					A = o.getElementsByTagName("img")[0];
					if (typeof A !== d && A.src !== null) {
						b = A.src;
					}
				}
				o = g.getElementById("base_name-sf");
				if (o && o.innerHTML) {
					F = o.innerHTML;
				}
				if (!m) {
					m = y;
				} else {
					if (!y) {
						y = m;
					}
				}
				if (M != 0) {
					M = Number(M) + 1;
					pixel.setCookie(P, M, 30);
				} else {
					pixel.setCookie(P, 1, 30);
				}
				if (E > 0) {
					f = 5;
				} else {
					if (w > 5) {
						f = 4;
					} else {
						if (M >= 8) {
							f = 3;
						} else {
							if (L >= 8) {
								f = 2;
							} else {
								if (/union_source=(cps-yqf|cps-lkt|cps-dm)/i
										.test(c)) {
									f = 4;
									v = 2;
								} else {
									if (/union_source=(DSP-mediav|DSP-jingzan)/i
											.test(c)) {
										f = 3;
										v = 2;
									} else {
										if (/union_source=/i.test(c)) {
											f = 2;
											v = 2;
										} else {
											if (j > 0) {
												f = 1;
												v = 2;
											}
										}
									}
								}
							}
						}
					}
				}
				C = g.URL;
				if (C.indexOf("?") !== -1 || C.indexOf("&") !== -1
						|| C.indexOf("#") !== -1) {
					C = C.split(/[?&#]/)[0];
				}
				pixel.paramArray.level = f;
				pixel.paramArray.section = v;
				pixel.paramArray.pid = K;
				pixel.paramArray.pname = F;
				pixel.paramArray.catid = B[0];
				pixel.paramArray.subcat1id = B[1];
				pixel.paramArray.subcat2id = B[2];
				pixel.paramArray.image = b;
				pixel.paramArray.lp = C;
				pixel.paramArray["new"] = y;
				pixel.paramArray.old = m;
				pixel.paramArray.misc = a;
			} else {
				if (u == "category"
						|| c.indexOf("sfbest.com/productlist/search?") !== -1) {
					pixel.paramArray.param = "e205";
					A = g.getElementsByTagName("div");
					for (Q = 0; Q < A.length; Q++) {
						if (A[Q] && A[Q].className == "title-c") {
							H = A[Q].getElementsByTagName("a")[0];
							if (H && H.href
									&& H.href.match(/\/(\d+[^\.htm])\.htm/ig)) {
								N = H.href.match(/\/(\d+[^\.htm])\.htm/ig)[0];
								K = N.replace(/[^0-9]/g, "");
								if (B.indexOf(K) == -1) {
									B[x++] = K;
								}
								if (x == 3) {
									break;
								}
							}
						}
					}
					if (c.indexOf("sfbest.com/productlist/search?") !== -1) {
						pixel.paramArray.level = "2";
					}
					if (!(B[0] || B[1] || B[2])) {
						pixel.paramArray.param = "e100";
						pixel.paramArray.level = "2";
					} else {
						pixel.paramArray.pid1 = B[0];
						pixel.paramArray.pid2 = B[1];
						pixel.paramArray.pid3 = B[2];
					}
				} else {
					pixel.paramArray.param = "e100";
				}
			}
		}
	}
};
pixel.finalize = function() {
	var m = document, e = 0, p = "", l = "", n = [ "", "", "" ], c = 0, j = 0, h = "", k = "", a = 1, d = "undefined";
	var g = m.getElementById("cartNum");
	if (g) {
		e = Number(g.innerHTML);
	}
	g = m.getElementById("tEvent");
	if (g) {
		p = g.getElementsByTagName("li");
		for (j = 0; j < p.length; j++) {
			if (typeof p[j] !== d && p[j] !== null) {
				l = p[j].getElementsByTagName("a")[0];
				if (typeof l !== d && l !== null && l.href
						&& l.href.match(/\/(\d+[^\.htm])\.htm/ig)) {
					h = l.href.match(/\/(\d+[^\.htm])\.htm/ig)[0];
					k = h.replace(/[^0-9]/g, "");
					if (n.indexOf(k) == -1) {
						n[c++] = k;
					}
					if (c == 3) {
						break;
					}
				}
			}
		}
	}
	if (e > 0
			&& (pixel.paramArray.param == "e300"
					|| pixel.paramArray.param == "e205" || (pixel.paramArray.param == "e100" && pixel.paramArray.level == "1"))) {
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
		pixel.paramArray.pid1 = n[0];
		pixel.paramArray.pid2 = n[1];
		pixel.paramArray.pid3 = n[2];
	}
	var f = pixel.getQueryString(pixel.paramArray);
	if (pixel.paramArray.param == "e500") {
		var o = decodeURIComponent(decodeURIComponent(pixel.paramArray.currency));
		if (f.indexOf("currency=") !== -1) {
			f = f.split("currency=")[0] + "currency=" + encodeURIComponent(o);
		}
	}
	var b = pixel.baseUrl + f;
	pixel.fireAnalyze(b);
};