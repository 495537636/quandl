<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../commons/jsp/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<head>
		<title>用户注册</title>
		<script type="text/javascript" src="<%=basePath%>login/register.js"></script>
	</head>
	<style>
/*
 *
 * Template Name: Fullscreen Responsive Register Template
 * Template URI: http://azmind.com
 * Author: Anli Zaimi
 * Author URI: http://azmind.com
 *
 */
strong {
	font-weight: 700;
}

.red {
	color: #eb4141;
}

a:hover {
	text-decoration: none;
}

.logo h1 {
	padding-left: 50px;
	font-family: 'Oleo Script', cursive;
	font-size: 36px;
	font-weight: 400;
}

.logo h1 a {
	color: #555;
}

.links {
	text-align: right;
}

.links a {
	display: inline-block;
	width: 30px;
	height: 30px;
	margin: 15px 0 0 20px;
}

.register-container {
	margin-top: 50px;
}

/* ----- iPhone ----- */
.computer {
	background-image: url("commons/images/computer.png");
	background-position: center;
	background-repeat: no-repeat;
	height: 600px;
	width: 448px;
	position: relative;
	right: -40%;
}

.textDiv {
	position: relative;
	text-align: center;
	top: 30%;
	padding-left: 20px;
	padding-top: 20px;
	padding-right: 20px;
	padding-bottom: 20px;
}

/* ----- Registration Form ----- */
.register form {
	padding: 20px 50px 40px 50px;
	-moz-border-radius: 8px;
	-webkit-border-radius: 8px;
	border-radius: 8px;
	-moz-box-shadow: 0 1px 5px 0 rgba(0, 0, 0, .3);
	-webkit-box-shadow: 0 1px 5px 0 rgba(0, 0, 0, .3);
	box-shadow: 0 1px 5px 0 rgba(0, 0, 0, .3);
	text-align: center;
	background-color: rgb(248, 248, 248);
	background-image: url("commons/images/pattern.jpg");
}

.register form h2 {
	margin-bottom: 25px;
	padding-bottom: 15px;
	border-bottom: 2px dotted #bbb;
	font-size: 30px;
	font-weight: 400;
	text-align: center;
}

.register form input {
	width: 95%;
	height: 30px;
	background: #fcfcfc;
	border: 1px solid #ddd;
	-moz-border-radius: 2px;
	-webkit-border-radius: 2px;
	border-radius: 2px;
	-moz-box-shadow: 0 1px 3px 0 rgba(0, 0, 0, .1) inset;
	-webkit-box-shadow: 0 1px 3px 0 rgba(0, 0, 0, .1) inset;
	box-shadow: 0 1px 3px 0 rgba(0, 0, 0, .1) inset;
	font-family: 'PT Sans', Helvetica, Arial, sans-serif;
	color: #888;
	font-size: 16px;
}

.register form input:focus {
	border: 1px solid #ccc;
	-moz-box-shadow: none;
	-webkit-box-shadow: none;
	box-shadow: none;
}

.register form label {
	margin: 7px 0 10px 5px;
	font-size: 16px;
	text-align: left;
}

.register form label span {
	font-style: italic;
}

.register form input:-moz-placeholder {
	color: #aaa;
}

.register form input:-ms-input-placeholder {
	color: #aaa;
}

.register form input::-webkit-input-placeholder {
	color: #aaa;
}

.register form button:hover {
	-moz-box-shadow: 0 -15px 30px 0 rgba(255, 255, 255, .05) inset;
	-webkit-box-shadow: 0 -15px 30px 0 rgba(255, 255, 255, .05) inset;
	box-shadow: 0 -15px 30px 0 rgba(255, 255, 255, .05) inset;
}

.register form button:active {
	-moz-box-shadow: 0 -15px 30px 0 rgba(255, 255, 255, .05) inset, 0 5px
		8px 0 rgba(0, 0, 0, .1) inset;
	-webkit-box-shadow: 0 -15px 30px 0 rgba(255, 255, 255, .05) inset, 0 5px
		8px 0 rgba(0, 0, 0, .1) inset;
	box-shadow: 0 -15px 30px 0 rgba(255, 255, 255, .05) inset, 0 5px 8px 0
		rgba(0, 0, 0, .1) inset;
}

/* ----- Media queries ----- */
@media ( max-width : 1200px) {
	.register form h2 {
		background: url(../img/pencil.png) 20px 6px no-repeat;
	}
}

@media ( min-width : 768px) and (max-width: 979px) {
	.register form h2 {
		background: none;
	}
}

@media ( max-width : 767px) {
	body {
		padding-left: 0;
		padding-right: 0;
	}
	.logo,.links {
		text-align: center;
	}
	.links {
		padding-bottom: 5px;
	}
	.logo h1 {
		padding-left: 0;
	}
	.links a.home {
		margin-left: 0;
	}
	.links a.blog {
		margin-right: 0;
	}
	.register-container {
		padding-left: 20px;
		padding-right: 20px;
	}
	.register form h2 {
		background: none;
	}
	.iphone img {
		display: none;
	}
}

@media ( max-width : 480px) {
	.register form button {
		width: 97%;
	}
}
.messageDiv {
	color:red;
	margin-bottom: 10px;
	min-height: 20px;
}
</style>

	<script type="text/javascript">
	$(function() {
		/*
		Background slideshow
		 */
		
	});
</script>

	<body>
		<div class="register-container container">
			<div class="row">
				<div class="register col-md-4">
					<form name="regForm">
						<h2>
							用户注册
						</h2>
						<label>
							用户名
						</label>
						<input type="text" id="username" autocomplete="off" name="username" placeholder="登陆时的帐号">
						<label>
							昵称
						</label>
						<input type="text" id="nickname" autocomplete="off" name="nickname" placeholder="显示的昵称">
						<label>
							密码
						</label>
						<input type="password" id="password" name="password" placeholder="登陆时的密码">
						<label>
							确认密码
						</label>
						<input type="password" id="repassword" name="repassword" placeholder="为了加深记住密码的印象">
						<label>
							邮箱
						</label>
						<input type="text" id="email" autocomplete="off" name="email" placeholder="用于找回密码">
						<div class="messageDiv"></div>
						<button type="button" class="btn btn-primary" id="register">
							注册
						</button>
						&nbsp;&nbsp;&nbsp;&nbsp; 已有账号？
						<a href="javascript:;" id="toLogin">用户登陆</a>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
