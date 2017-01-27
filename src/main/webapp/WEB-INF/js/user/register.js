var registerFlag = false;

$(function(){
	
	$("input").each(function(){
		$(this).bind('blur',function(){
			var value = $.trim($(this).val());
			var name = $(this).attr("placeholder");
			if("" == value){
				$(".message").html("请输入" + name);
				$(".msg-error").show();
				registerFlag = false;
				return;
			}
		});
	});
	
	//验证用户名是否存在
	$("#username").bind('blur',function(){
		var username = $.trim($("#username").val());
		if("" == username){
			$(".message").html("请输入用户名");
			$(".msg-error").show();
			return;
		}
		$.ajax({
			url : "user/checkUsername",
			type : "post",
			data : {
				"username" : username
			},
			success : function(data) {
				if(data.message){
					$(".message").html(data.message);
					$(".msg-error").show();
					$("#username").select();
				}else{
					//用户名可以使用
					$(".msg-error").hide();
				}
			}
		});
	});
	
	//注册用户
	$("#register").click(function(){
		checkForm();
		if(registerFlag){
			var username = $.trim($("#username").val());
			var password = $.trim($("#password").val());
			var email = $.trim($("#email").val());
			$.ajax({
				url : "user/register",
				type : "post",
				data : ({
					"username" : username,
					"password" : password,
					"email" : email
				}),
				success : function(data){
					var flag = data.flag;
					var message = data.message;
					if(flag){
						alert(message);
						document.getElementById("registerForm").reset();
					}else{
						alert(message);
					}
				}
			});
		}
	});
	
	//跳转到登录页面
	$('#toLogin').click(function(){
		document.location.href = "login.html";
	});

});

function checkForm() {
	//验证输入内容
	$("input").each(function(){
		var value = $.trim($(this).val());
		var name = $(this).attr("placeholder");
		if("" == value){
			$(".message").html("请输入" + name);
			$(".msg-error").show();
			registerFlag = false;
			return;
		}
	});
	var password = $.trim($("#password").val());
	var repassword = $.trim($("#repassword").val());
	if(password != repassword){
		$(".message").html("两次密码输入不一致");
		$(".msg-error").show();
		registerFlag = false;
		return;
	}
	registerFlag = true;
}