<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<title>login</title>
	</head>
	<body>
		<form action="user/login" method="post">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="username"/></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="text" name="password"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="登陆"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>