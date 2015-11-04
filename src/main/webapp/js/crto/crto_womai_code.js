function getUserLevel() {
    var level = '1',
    vizuryCookie = readCookie("vizurylevel");
    if (vizuryCookie != null && vizuryCookie != "") {
        var values = jQuery.trim(vizuryCookie).split('|');
        level = values[0];
    }
    return level;
}

var email = "";
email = getUserEmail();
var level = getUserLevel();
window.criteo_q = window.criteo_q || [];
window.criteo_q.push({
    event: "setAccount",
    account: 15708
},
{
    event: "setEmail",
    email: [email]
},
{
    event: "setSiteType",
    type: "d"
},
{
    event: "viewHome",
    user_segment: level
});