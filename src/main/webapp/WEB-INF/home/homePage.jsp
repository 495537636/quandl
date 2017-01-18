<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../commons/jsp/taglib.jsp"%>
<%@ include file="../commons/jsp/navigation.jsp"%>
<%@ include file="../commons/jsp/search.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<title>全得利网上商城 - 咱内丘的网上商城</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="text/javascript" src="<%=basePath%>home/homePage.js"></script>
	</head>
	<body>
		<div class="container">
			<form name="goodsFm">
				<input type="hidden" id="hid_spid" name="hid_spid"/>
				<div id="goodsList" class="container">
							
				</div>
			</form>
			<div class="pagination pagination-right"></div>
		</div>
		<div class="container" id="bottomDiv"></div>
	</body>
</html>