$(function(){
	
	//设置滚动图片3秒自动滚动
	$('#myCarousel').carousel({
    	interval: 3000
    });
	
    $(".showpassword").each(function(index,input) {
        var $input = $(input);
        $("<p class='opt'/>").append(
            $("<input type='checkbox' class='showpasswordcheckbox' id='showPassword' />").click(function() {
                var change = $(this).is(":checked") ? "text" : "password";
                var rep = $("<input placeholder='密码' type='" + change + "' />")
                    .attr("id", $input.attr("id"))
                    .attr("name", $input.attr("name"))
                    .attr('class', $input.attr('class'))
                    .val($input.val())
                    .insertBefore($input);
                $input.remove();
                $input = rep;
             })
        ).append($("<label for='showPassword'/>").text("显示密码")).insertAfter($input.parent());
    });

    $('#showPassword').click(function() {
		if ($("#showPassword").is(":checked")) {
			$('.icon-lock').addClass('icon-unlock');
			$('.icon-unlock').removeClass('icon-lock');
		} else {
			$('.icon-unlock').addClass('icon-lock');
			$('.icon-lock').removeClass('icon-unlock');
		}
	});

	//登录系统
	$("#login").click(function() {
		/* 添加文本框抖动特效
		var emptyfields = $('input[value=]');
		console.log(emptyfields);
        if (emptyfields.size() > 0) {
            emptyfields.each(function() {
                $(this).stop()
                    .animate({ left: "-10px" }, 100).animate({ left: "10px" }, 100)
                    .animate({ left: "-10px" }, 100).animate({ left: "10px" }, 100)
                    .animate({ left: "0px" }, 100)
                    .addClass("required");
            });
        }
        */
		if (checkForm()) {
			var username = $.trim($("#username").val());
			var password = $.trim($("#password").val());
			$.ajax({
				type : "post",
				cache : false,
				url : "user/login",
				data : ({
					"username" : username,
					"password" : password
				}),
				success : function(data) {
					if(null!=data.message){
						//登录失败
						$(".message").html(data.message);
						$(".msg-error").show();
					}else{
						//登录成功，跳转到首页
						document.location.href = "home.html";
					}
				}
			});
		}
	});
	
	//跳转到注册页面
	$('#register').click(function(){
		document.location.href = "register.html";
	});
	
});

function checkForm() {
	var usernameObj = $("#username");
	var passwordObj = $("#password");
	var username = $.trim(usernameObj.val());
	var password = $.trim(passwordObj.val());
	if ('' == username) {
		$(".message").html("请输入用户名");
		$(".msg-error").show();
		usernameObj.focus();
		return false;
	}
	if ('' == password) {
		$(".message").html("请输入密码");
		$(".msg-error").show();
		passwordObj.focus();
		return false;
	}
	return true;
}