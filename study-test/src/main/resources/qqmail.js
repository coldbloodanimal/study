var Dom = ";电信1;网通1;教育1;网通2;;电信2;教育2;电信3;网通3".split(";");

//window.onerror=function(){return true;};

var S = function (object) {
	return document.getElementById(object);
};

Object.prototype._attachEvent = Object.prototype.attachEvent;
Object.prototype.attachEvent = function (eventType, method, type) {
	if (document.all) {
		return this._attachEvent(eventType, method);
	} else {
		return this.addEventListener(eventType.replace(/\bon/ig, ""), method, type);
	}
}
function isblank(s) {
	for (var i = 0; i < s.length; i++) {
		var c = s.charAt(i);
		if ((c != ' ') && (c != '\n') && (c != '\t'))
			return false;
	}
	return true;
}

function checkInput() {
	setCookie("dm_login_weixin_rem", "", new Date((+new Date()) + 1 * 24 * 3600 * 1000), "/", "qq.com");
	window.org_pass = S("pp").value;
	if (!window.RSAKey) {
		document.getElementById("downError").style.display = "block";
		document.getElementById("returnMsg").style.display = "none";
		return false;
	}
	if (!checkCookie()) {
		return false;
	}
	var inputUin = document.form1.inputuin.value.toLowerCase();
	var firstStep = document.form1.first_step.value;
	if (inputUin == "") {
		showMsg("emptyUserName");
		document.form1.inputuin.focus();
		return false;
	}
	if (-1 == inputUin.indexOf("@")) {
		inputUin += "@biz.mail.qq.com";
		if (firstStep === "qyh") {
			document.form1.fun.value = "bizmail_admin_bind_wxqy";
		} else {
			document.form1.fun.value = "bizmail_admin";
		}
	}

	if (("" != "true") && (inputUin.indexOf("@qq.com") > 0 || inputUin.indexOf("@vip.qq.com") > 0 || inputUin.indexOf("@foxmail.com") > 0)) {
		showMsg("errorLoginWithQQAccount");
		return false;
	} else if (-1 == inputUin.indexOf("@")) {
		showMsg("errorUserName");
		document.form1.inputuin.focus();
		return false;
	} else {
		document.form1.uin.value = trim(inputUin.substring(0, inputUin.indexOf("@")));
		document.form1.domain.value = trim(inputUin.substring(inputUin.indexOf("@") + 1));
	}

	if (S('pp').value == "") {
		showMsg("emptyPassword");
		S('pp').focus();
		return false;
	}

	if (S('pp').value.length >= 100) {
		S('pp').focus();
		showMsg("errorPassowrdTooLong");
		S('pp').focus();
		return false;
	}

	if (S("VerifyArea").style.display != "none" && document.form1.verifycode.value == "") {
		showMsg("emptyVerifyCode");
		document.form1.verifycode.focus();
		return false;
	}
	document.form1.btlogin.disabled = true;
	document.form1.starttime.value = (new Date()).valueOf();

	var PublicKey = "CF87D7B4C864F4842F1D337491A48FFF54B73A17300E8E42FA365420393AC0346AE55D8AFAD975DFA175FAF0106CBA81AF1DDE4ACEC284DAC6ED9A0D8FEB1CC070733C58213EFFED46529C54CEA06D774E3CC7E073346AEBD6C66FC973F299EB74738E400B22B1E7CDC54E71AED059D228DFEB5B29C530FF341502AE56DDCFE9";
	var RSA = new RSAKey();
	RSA.setPublic(PublicKey, "10001");
	var PublicTs = "1490588317";

	var Res = RSA.encrypt(S('pp').value + '\n' + document.form1.ts.value + '\n');
	if (Res) {
		if (document.form1.chg.value == 1) {
			document.form1.p.value = hex2b64(Res);
		} else {
			if (document.form1.ppp.value != "") {
				document.form1.p.value = document.form1.ppp.value;
			} else {
				document.form1.p.value = hex2b64(Res);
			}
		}
	}

	setCookie("logout_page", "dm_loginpage", new Date((+new Date()) + 1 * 24 * 3600 * 1000), "/", "qq.com");

	/*
	var MaskValue = "";
	for (var Loop = 0; Loop < document.form1.pp.value.length; Loop++, MaskValue += "0");
	document.form1.pp.value = MaskValue;
	 */

	/*document.form1.pp.value = "";*/
	var sd = S("sel_domain");
	if (sd && sd.options[sd.selectedIndex].text == "@foxmail.com") {
		return true;
	} else {
		return true;
	}
}

function ShowSysService() {

	return false;
}

function qqping_url_build() {
	p = document.URL.indexOf("?");
	if (-1 == p)
		p = document.URL.indexOf("&");
	if (-1 == p)
		address = "u=" + document.URL;
	else
		address = "u=" + document.URL.substring(0, p);
	p = document.referrer.indexOf("?");
	if (-1 == p)
		p = document.referrer.indexOf("&");
	if (-1 == p)
		refer = "r=" + document.referrer;
	else
		refer = "r=" + document.referrer.substring(0, p);
	return address + "&" + refer;
}
var bAlwaysShowVerifyCode = (false == true);
function CheckName() {
	var _account = document.form1.inputuin.value.toLowerCase();

	if (_account.indexOf("@qq.com") > 0 || _account.indexOf("@vip.qq.com") > 0 || _account.indexOf("@foxmail.com") > 0) {
		showMsg("errorLoginWithQQAccount");
		return false;
	} else if (S("errorLoginWithQQAccount") != null) {
		S("msgContainer").innerHTML = "";
		S("msgContainer").style.display = "none";
		return true;

	}
}

function checkCookie() {

	var agt,
	cookieEnabled,
	isSafari,
	number;

	agt = navigator.userAgent.toLowerCase();
	cookieEnabled = navigator.cookieEnabled;
	isSafari = (agt.indexOf("safari") != -1);
	number = Math.random();
	document.cookie = number;

	if (((document.cookie.indexOf(number) == -1 || !cookieEnabled) && !isSafari) || (!cookieEnabled && isSafari)) {
		S("infobarNoCookie").style.display = "block";
		return false;
	} else {
		return true;
	}
}

function changeimg() {
	S('vfcode').src = 'https://exmail.qq.com/cgi-bin/getverifyimage?aid=23000101&f=html&ck=1&' + Math.random();
}

function showMsgDomain(msgId, method, txt) {
	var msg,
	msgTemplate;
	if (method && method == 2) {
		msgTemplate = '<div class="infobar error" id="%_id_%">%_msg_%</div>';
	} else {
		msgTemplate = '<div class="infobar error" id="%_id_%">%_msg_%</div>';
	}

	if (msgId != undefined && msgId != "") {
		if (!txt)
			txt = msg[msgId];
		S("LeftContainer").innerHTML = txt;
		return true;
	} else {
		return false;
	}

}
function showMsg(msgId, method, txt) {

	var msg,
	msgTemplate;

	msg = {
		errorAdminName : "此管理员帐号不存在，请重新输入",
		errorUserName : "您输入的邮箱帐号不正确，请重新输入。",
		emptyUserName : "请填写您的邮箱帐号。",
		emptyPassword : "请填写邮箱密码。",
		emptyVerifyCode : "请填写验证码。",
		errorPassowrdTooLong : "邮箱密码不能超过100个字符。",

		errorNamePassowrd : "您填写的帐号或密码不正确，请再次尝试。",
		errorRequireSecondPassword : "请使用邮箱的“独立密码”登录。",
		errorVerifyCode : "您填写的验证码不正确。",
		frequent : "为了保障邮箱安全，请输入验证码。",
		errorSecondPassword : "独立密码输入有误。",
		errorSecondPwdNeedQQErr : "您设置了网页登录须先输入QQ密码。",
		errorNeedQQProtect : '<p style="line-height:140%;">您的QQ帐号处于未保护状态，暂时无法登录。<br/><a onclick="ShowUrl()" style="text-decoration:underline;cursor:pointer;" >填写帐号保护资料</a></p>',
		errorBlockIPErr : "为了保障邮箱安全，暂时不能使用页面登录，请登录QQ后跳转邮箱。",
		errorDistinctValid : "为了保障邮箱安全，请再次输入验证码登录。",
		errorNeedJumpFoxmail : "请到www.foxmail.com登录该帐户",
		errorPermissionDenied : "您还未被邀请使用企业邮箱。<br/>您可以登录您的QQ邮箱，在体验室中自助开通。",
		errorLoginWithQQAccount : "请使用企业邮箱帐号登录。",
		errorBizmailMX : "登录失败。您域名的MX记录未通过验证，请联系管理员。",
		errorBizmailLocked : "登录失败。您的域名已被锁定，请联系管理员。",
		errorBindNullUin : "帐号为空，请重输",
		errorBindErr : "帐号绑定关系错误，请联系管理员",
		errorBindFail : "帐号绑定关系查询出错，请稍后再试",
		errorSysErr : "登录失败，请咨询企业邮箱客服。",
		errorNeedOpen : "您的企业邮箱账号未开通，请联系企业邮箱管理员。",
		errorBizmailLoginLimit : "管理员限制该IP登录企业邮箱",
		errorWeixinBind : "您的微信没有绑定企业邮箱，请先登录后绑定",
		errorDynPwdSendFailed : "动态密码推送失败，请稍后重试"
	};

	if (method && method == 2) {
		msgTemplate = '<div class=" error" id="%_id_%">%_msg_%</div>';
	} else {
		msgTemplate = '<div class=" error" id="%_id_%">%_msg_%</div>';
	}

	if (msgId != undefined && msgId != "") {
		if (!txt)
			txt = msg[msgId];
		S("msgContainer").innerHTML = msgTemplate.replace(/%_msg_%/ig, txt).replace(/%_id_%/ig, msgId);
		S("msgContainer").style.display = "";
		return true;
	} else {
		return false;
	}

}

function showLoginType(type) {
	if (type === "account") {
		show(S("loginby_wx"), false);
		show(S("loginby_account"), true);
		show(S("loginType_weixin"), true);
		show(S("loginType_account"), false);
	} else if (type === "weixin") {
		show(S("loginby_wx"), true);
		show(S("loginby_account"), false);
		show(S("loginType_weixin"), false);
		show(S("loginType_account"), true);
	}

}

function init() {
	checkCookie();
	CheckName();

	S("inputuin").attachEvent("onblur", CheckName);
	S("pp").attachEvent("onfocus", CheckName);

	if (S("inputuin") != null && S("inputuin").value == "") {
		S("inputuin").focus();
	} else if (S("qq") != null) {
		S("qq").focus();
	}
}
function OpenStatWin() {
	window.open("/cgi-bin/speedstat?actions=relogin", "speedstatwin", "height=500,width=500,status=yes,toolbar=no,menubar=no,location=no");
}
function ShowUrl(uin) {
	if (parseInt(uin) + "" == uin) {
		window.open('https://account.qq.com/cgi-bin/up/newreg_set_dna_login?from=qqmail&ret_url=http%3A%2F%2Fmail.qq.com&uin=' + uin);
	} else {
		window.open('https://account.qq.com/cgi-bin/up/newreg_set_dna_login?from=qqmail&ret_url=http%3A%2F%2Fmail.qq.com');
	}
}
function ChkPsw() {
	S("chg") && (S("chg").value = 1);
}
function ChkPswInput(event) {
	var gsAgent = navigator.userAgent.toLowerCase(),
	gbIsOpera = gsAgent.indexOf("opera") > -1,
	gbIsIE = (gsAgent.indexOf("compatible") > -1 && !gbIsOpera) || gsAgent.indexOf("msie") > -1,
	gnIEVer = /MSIE (\d+.\d+);/i.test(gsAgent) && parseFloat(RegExp["$1"]);

	if (!gbIsIE || (gbIsIE && gnIEVer <= 9)) {
		var caps_lock_tips = S("caps_lock_tips");

		var dom = document.getElementById("pp");
		var code = event.keyCode || event.which;
		isShift = (event.shiftKey || 16 == code || false);

		if (!dom.value) {
			caps_lock_tips.style.display = "none";
			return false;
		}

		var newKey = event.key;
		if (/^[A-Z]+$/.test(newKey) && caps_lock_tips.style.display != "block" && !isShift) {
			caps_lock_tips.style.display = "block";
		} else if (!/^[A-Z]+$/.test(newKey) && caps_lock_tips.style.display != "none") {
			caps_lock_tips.style.display = "none";
		}
	}
}
function HideLockTips() {
	S("caps_lock_tips").style.display = "none";
}



function SetHomeLang(_ashl) {
	var _sDomain = "exmail.qq.com",
	_oExpires = new Date(new Date().valueOf() + 7 * 24 * 3600 * 1000),
	_sCookie = "locate=" + escape(_ashl) + "; path=/; domain=" + _sDomain + "; expires=" + _oExpires;
	document.cookie = _sCookie;
	location.href = "/login/" + _ashl;
}
function JumpToEng() {
	var _sDomain = "exmail.qq.com",
	_oExpires = new Date(new Date().valueOf() + 7 * 24 * 3600 * 1000),
	_sCookie = "locate=; path=/; domain=" + _sDomain + "; expires=" + _oExpires;
	document.cookie = _sCookie;
	location.href = "http://en.exmail.qq.com";
}
