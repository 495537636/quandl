//消息信息
var message;
var usernameFlag = false;
var nicknameFlag = false;
var passwordFlag = false;
var repasswordFlag = false;
var emailFlag = false;
$(function() {

	// 加载底部页面
//	$("#bottomDiv").load("common/jsp/bottom.jsp");
	$.backstretch( [ "common/images/1.jpg", "common/images/2.jpg",
			"common/images/3.jpg" ], {
		duration : 3000,
		fade : 750
	});
	
	//跳转到登陆页面
	$("#toLogin").click(function(){
		document.regForm.action = "login_index.action";
		document.regForm.method = "post";
		document.regForm.submit();
	});
	
	$('#username').live('keydown',function(event){
		if ('13' == event.keyCode) {
			this.blur();
			checkFlag();
		}
	});
	
	$('#nickname').live('keydown',function(event){
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
	
	$('#repassword').live('keydown',function(event){
		if ('13' == event.keyCode) {
			this.blur();
			checkFlag();
		}
	});
	
	$('#email').live('keydown',function(event){
		if ('13' == event.keyCode) {
			this.blur();
			checkFlag();
		}
	});
	
	$('#username').bind('blur',function(){
		var unameObj = $('#username');
		var username = $.trim(unameObj.val());
		if(''!=username&&null!=username){
			$.ajax( {
				type : "post",
				cache : false,
				url : "login_checkUser.action",
				data : ( {
					"username" : username
				}),
				success : function(data) {
					message = data.message;
					if ('' != message) {
						imgFalse(unameObj);
						$('.messageDiv').html(message);
						usernameFlag = false;
					} else {
						imgSuccess(unameObj);
						usernameFlag = true;
					}
				}
			});
		}else{
			imgFalse(unameObj);
			$('.messageDiv').html("用户名不能为空1！");
			usernameFlag = false;
		}
	});
	
	$('#nickname').bind('blur',function(){
		var nicknameObj = $('#nickname');
		var nickname = $.trim(nicknameObj.val());
		if(''!=nickname&&null!=nickname){
			imgSuccess($('#nickname'));
			nicknameFlag = true;
		}else{
			imgFalse($('#nickname'));
			$('.messageDiv').html("昵称不能为空！");
			nicknameFlag = false;
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
			passwordFlag = false;
		}
	});
	
	$('#repassword').bind('blur',function(){
		var repwdObj = $('#repassword');
		var repassword = $.trim(repwdObj.val());
		var password = $.trim($("#password").val());
		if(''!=repassword){
			if(password==repassword){
				imgSuccess(repwdObj);
				repasswordFlag = true;
			}else{
				imgFalse(repwdObj);
				$('.messageDiv').html("两次密码不一致！");
				repasswordFlag = false;
			}
		}else{
			imgFalse(repwdObj);
			$('.messageDiv').html("确认密码不能为空！");
			repasswordFlag = false;
		}
	});
	
	$('#email').bind('blur',function(){
		var emailObj = $('#email');
		var email = $.trim(emailObj.val());
		if(''!=email&&null!=email){
			var filter  = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
			if (filter.test(email)){
				$.ajax( {
					type : "post",
					cache : false,
					url : "login_checkEmail.action",
					data : ( {
						"email" : email
					}),
					success : function(data) {
						message = data.message;
						if ('' != message) {
							imgFalse(emailObj);
							$('.messageDiv').html(message);
							emailFlag = false;
						} else {
							imgSuccess(emailObj);
							emailFlag = true;
						}
					}
				});
			}else{
				imgFalse(emailObj);
				$('.messageDiv').html("邮箱格式不正确！");
				emailFlag = false;
			}
		}else{
			imgFalse(emailObj);
			$('.messageDiv').html("邮箱不能为空！");
			emailFlag = false;
		}
	});
	
	//检测用户名、密码和验证码的输入状态
	function checkFlag(){
		var unameObj = $('#username');
		var nicknameObj = $('#nickname');
		var pwdObj = $('#password');
		var repwdObj = $('#repassword');
		var emailObj = $('#email');
		var username = $.trim(unameObj.val());
		var nickname = $.trim(nicknameObj.val());
		var password = $.trim(pwdObj.val());
		var repassword = $.trim(repwdObj.val());
		var email = $.trim(emailObj.val());
		if(''==username||null==username){
			$('.messageDiv').html("用户名不能为空！");
			imgFalse(unameObj);
			unameObj.focus();
			usernameFlag = false;
			return false;
		}else{
			$.ajax( {
				type : "post",
				cache : false,
				url : "login_checkUser.action",
				data : ( {
					"username" : username
				}),
				success : function(data) {
					message = data.message;
					if ('' != message) {
						imgFalse(unameObj);
						$('.messageDiv').html(message);
						unameObj.focus();
						usernameFlag = false;
					} else {
						imgSuccess(unameObj);
						usernameFlag = true;
					}
				}
			});
		}
		if(''==nickname||null==nickname){
			$('.messageDiv').html("昵称不能为空！");
			imgFalse(nicknameObj);
			nicknameObj.focus();
			nicknameFlag = false;
			return false;
		}else{
			imgSuccess(nicknameObj);
			nicknameFlag = true;
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
		if(''==repassword||null==repassword){
			$('.messageDiv').html("确认密码不能为空！");
			imgFalse(repwdObj);
			$('#repassword').focus();
			return false;
		}else{
			if(password==repassword){
				imgSuccess(repwdObj);
				repasswordFlag = true;
			}else{
				imgFalse(repwdObj);
				$('#repassword').focus();
				$('.messageDiv').html("两次密码不一致！");
				return false;
			}
		}
		if(''==email||null==email){
			$('.messageDiv').html("邮箱不能为空！");
			imgFalse(emailObj);
			$('#email').focus();
			emailFlag = false;
			return false;
		}else{
			var filter  = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
			if (filter.test(email)){
				$.ajax( {
					type : "post",
					cache : false,
					url : "login_checkEmail.action",
					data : ( {
						"email" : email
					}),
					success : function(data) {
						message = data.message;
						if ('' != message) {
							imgFalse(emailObj);
							$('.messageDiv').html(message);
							emailFlag = false;
							$('#email').focus();
						} else {
							imgSuccess(emailObj);
							emailFlag = true;
						}
					}
				});
			}else{
				imgFalse(emailObj);
				$('.messageDiv').html("邮箱格式不正确！");
				$('#email').focus();
				return false;
			}
		}
		if(usernameFlag&&nicknameFlag&&passwordFlag&&repasswordFlag&&emailFlag){
			$('.messageDiv').html("");
			//验证成功，执行注册
			register();
		}
	}

	// 注册用户
	$("#register").click(function() {
		checkFlag();
	});

});

//验证通过，执行注册
function register(){
	var username = $.trim($("#username").val());
	var nickname = $.trim($("#nickname").val());
	var password = $.trim($("#password").val());
	var email = $.trim($("#email").val());
	$.ajax( {
		url : "login_insertUserInfo.action",
		type : "post",
		cache : false,
		async : false,
		data : ( {
			"username" : username,
			"nickname" : nickname,
			"password" : password,
			"email" : email
		}),
		success : function(data) {
			message = data.message;
			var html = "<div><img src='common/images/true.png'/>&nbsp;&nbsp;";
			html += "<font color='#7ABD54' size='5'>"+message+"</font>";
			html += "</div>";
			$("#alertMessageContent").html(html);
			alertMessage();
			$("#username").val("");
			$("#nickname").val("");
			$("#password").val("");
			$("#repassword").val("");
			$("#email").val("");
		}
	});
}