var usernameFlag = false;
var passwordFlag = false;
var randcodeFlag = false;
$(function(){

	//加载底部页面
	$("#bottomDiv").load("common/jsp/bottom.jsp");
	
	//设置滚动图片3秒自动滚动
	$('#myCarousel').carousel({
    	interval: 3000
    });
	
	$('#login').click(function(){
		checkFlag();
	});
	
	$('#username').live('keydown',function(event){
		if ('13' == event.keyCode) {
			this.blur();
			checkFlag();
		}
	});
	
	$('#password').live('keydown',function(event){
		if ('13' == event.keyCode) {
			this.blur();
			checkFlag();
		}
	});
	
	$('#randcode').live('keydown',function(event){
		if ('13' == event.keyCode) {
			this.blur();
			checkFlag();
		}
	});
	
	$('#username').bind('blur',function(){
		var unameObj = $('#username');
		var username = $.trim(unameObj.val());
		if(''!=username&&null!=username){
			imgSuccess(unameObj);
			usernameFlag = true;
		}else{
			imgFalse(unameObj);
			$('.messageDiv').html("用户名不能为空！");
		}
	});
	
	$('#password').bind('blur',function(){
		var pwdObj = $('#password');
		var password = $.trim(pwdObj.val());
		if(''!=password&&null!=password){
			imgSuccess($('#password'));
			passwordFlag = true;
		}else{
			imgFalse($('#password'));
			$('.messageDiv').html("密码不能为空！");
		}
	});
	
	$('#randcode').bind('blur',function(){
		var codeObj = $('#randcode');
		var randcode = $.trim(codeObj.val());
		if(''!=randcode&&null!=randcode){
			if(randcode.length==4){
				checkKeyCode(randcode);
			}else{
				imgFalse(codeObj);
				$('.messageDiv').html("验证码长度为4位！");
			}
			
		}else{
			imgFalse(codeObj);
			$('.messageDiv').html("验证码不能为空！");
		}
	});
	
	$('#username').bind('change',function(){
		var unameObj = $('#username');
		var username = $.trim(unameObj.val());
		if(''!=username&&null!=username){
			imgSuccess(unameObj);
			usernameFlag = true;
		}else{
			imgFalse(unameObj);
			$('.messageDiv').html("用户名不能为空！");
		}
	});
	
	$('#password').bind('change',function(){
		var pwdObj = $('#password');
		var password = $.trim(pwdObj.val());
		if(''!=password&&null!=password){
			imgSuccess(pwdObj);
			passwordFlag = true;
		}else{
			imgFalse(pwdObj);
			$('.messageDiv').html("密码不能为空！");
		}
	});
	
	$('#randcode').bind('change',function(){
		var codeObj = $('#randcode');
		var randcode = $.trim(codeObj.val());
		if(''!=randcode&&null!=randcode){
			if(randcode.length==4){
				imgSuccess(codeObj);
				randcodeFlag = true;
			}else{
				imgFalse(codeObj);
				$('.messageDiv').html("验证码长度为4位！");
			}
		}else{
			imgFalse(codeObj);
			$('.messageDiv').html("验证码不能为空！");
		}
	});
	
	//跳转到注册页面
	$('#register').click(function(){
		document.fm.action = "login_toRegUserPage.action";
		document.fm.method = "post";
		document.fm.submit();
	});
	
	//刷新生成验证码
	$('#randCode').click(function(){
		getRandCode();
	});
	
});

//检测用户名、密码和验证码的输入状态
function checkFlag(){
	var unameObj = $('#username');
	var pwdObj = $('#password');
	var codeObj = $('#randcode');
	var username = $.trim(unameObj.val());
	var password = $.trim(pwdObj.val());
	var randcode = $.trim(codeObj.val());
	if(''==username||null==username){
		$('.messageDiv').html("用户名不能为空！");
		imgFalse(unameObj);
		unameObj.focus();
		usernameFlag = false;
		return false;
	}else{
		imgSuccess(unameObj);
		usernameFlag = true;
	}
	if(''==password||null==password){
		$('.messageDiv').html("密码不能为空！");
		imgFalse(pwdObj);
		$('#password').focus();
		return false;
	}else{
		imgSuccess(pwdObj);
		passwordFlag = true;
	}
	if(''==randcode||null==randcode){
		$('.messageDiv').html("验证码不能为空！");
		imgFalse(codeObj);
		$('#randcode').focus();
		randcodeFlag = false;
		return false;
	}else{
		if(randcode.length==4){
			var flag = checkKeyCode(randcode);
			if('false'==flag){
				$('.messageDiv').html("验证码错误！");
				imgFalse(codeObj);
				codeObj.focus();
				randcodeFlag = false;
			}else{
				imgSuccess(codeObj);
				randcodeFlag = true;
			}
		}else{
			imgFalse(codeObj);
			$('.messageDiv').html("验证码长度为4位！");
			randcodeFlag = false;
		}
	}
	if(usernameFlag&&passwordFlag&&randcodeFlag){
		ajaxCheckLogin();
	}
}

//执行登陆方法
function checkLogin(){
	$('.messageDiv').html('');
	document.fm.action = "login_checkLogin.action";
	document.fm.method = "post";
	document.fm.submit();
}

//验证验证码是否正确
function checkKeyCode(randcode){
	var flag;
	$.ajax({
		url : "login_checkKeyCode.action",
		method : "post",
		data : ({"keyCode":randcode}),
		cache : false,
		async : false,
		success : function(data){
			flag = data.flag;
		}
	});
	return flag;
}

//ajax请求后台验证登陆系统
function ajaxCheckLogin(){
	var username = $.trim($('#username').val());
	var password = $.trim($('#password').val());
	$.ajax({
		url : "login_ajaxCheckLogin.action",
		method : "post",
		data : ({"username":username,"password":password}),
		success : function(data){
			var message = data.message;
			if("false"==message){
				var unameObj = $('#username');
				var pwdObj = $('#password');
				var codeObj = $('#randcode');
				imgFalse(unameObj);
				imgFalse(pwdObj);
				imgFalse(codeObj);
				$('#randcode').val('');
				$(".messageDiv").html("用户名或密码错误！");
				unameObj.focus();
				//用户名密码验证错误，重新加载验证码
				getRandCode();
				return false;
			}
			checkLogin();
		}
	});
}

//生成验证码方式
function getRandCode(){
	$('#randCode').attr("src","login_getKeyCode.action?random="+Math.random());
}