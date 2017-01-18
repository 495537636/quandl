$(function(){
	
	//加载头部文件
	$.ajax({
		url : "loadHeader",
		type : "post",
		data : {
			"operateName" : "注册"
		},
		success : function(data) {
			$("#header").html(data);
		}
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
				alert(data.message);
			}
		});
	});
	
	//跳转到登录页面
	$('#toLogin').click(function(){
		document.location.href = "login.html";
	});

});