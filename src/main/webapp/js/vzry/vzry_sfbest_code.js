(function() {
    try {
        var viz = document.createElement("script");
        viz.type = "text/javascript";
        viz.async = true;
        viz.src = ("https:" == document.location.protocol ? "https://cdn6.vizury.com": "http://cdn6.vizury.com") + "/analyze/pixel.php?account_id=VIZVRM1326";

        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(viz, s);
        viz.onload = function() {
            try {
                pixel.parse();
            } catch(i) {}
        };
        viz.onreadystatechange = function() {
            if (viz.readyState == "complete" || viz.readyState == "loaded") {
                try {
                    pixel.parse();
                } catch(i) {}
            }
        };
    } catch(i) {}
})();