<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>sorry</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<style>
body {
	background: #f3f7ff;
	margin: 0;
	padding: 20px;
	text-align: center;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 14px;
}

.error_page {
	width: 600px;
	padding: 50px;
	margin: auto;
}

a {
	color: #9caa6d;
	text-decoration: none;
}

a:hover {
	color: #9caa6d;
	text-decoration: underline;
}

p {
	margin-bottom: 10px;
	font-size: 20;
	color: #145ecf;
}
</style>
	</head>
	<body class="login">
		<div class="error_page">
			<img alt="error" src="<%=basePath%>common/images/503.png">
			<p>
				我考..又出问题了...谁做的找谁！
			</p>
		</div>

	</body>
</html>
