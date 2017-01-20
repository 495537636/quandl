$(function(){
	
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
				if(null!=data){
					$(".message").html(data.message);
					$(".msg-error").show();
					$("#username").select();
				}
			}
		});
	});
	
	//跳转到登录页面
	$('#toLogin').click(function(){
		document.location.href = "login.html";
	});

});