<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>提示信息</title>
	</head>
	<script language="javascript">
		function jump(count) {
			window.setTimeout(function(){
				count--;
				if(count >= 0) {
					$('#num').html(count);
					jump(count);
				} else {
					location.href = "home_index.action";
				}
			}, 1000);
		}
		jump(3);
	</script>
	<body style="background-color: #EEEFFF;" data-spy="scroll">
		<br/><br/>
		<div class="alert" style='margin-top: 50px;'>
			<span class="badge badge-important">
				<font size="4">
					提示信息
				</font>
			</span>
			<hr>
			<center>
				<img src="common/images/myqx.png" />
				<br />
				<br />
				<p>
					您没有操作的权限。
				</p>
				<p>
					<font color="red" size="4"><span id="num">3</span></font>
					&nbsp;&nbsp;秒后跳转到首页，如果没有跳转，请点击
					<a href="home_index.action">跳转</a>
				</p>
			</center>
		</div>
	</body>
</html>