<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.loving.quandl.bean.Userinfo"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Userinfo userinfo = (Userinfo)session.getAttribute("curr_user");
	String realname = "";
	String userid = null;
	if(null!=userinfo){
		realname = userinfo.getRealname();
		userid = userinfo.getUserid();
	}
%>
<!DOCTYPE html>
<html lang="en">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css"
		href="<%=basePath%>commons/bootstrap/css/bootstrap.min.css">
	<script type="text/javascript"
		src="<%=basePath%>commons/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>commons/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>commons/js/common.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>commons/js/navigation.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>commons/js/scrolltopcontrol.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>commons/js/jquery.raty.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>commons/fileupload/ajaxfileupload.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>commons/js/taglib.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>commons/js/jquery.backstretch.min.js"></script>
	<link href="<%=basePath%>commons/css/system.css" rel="stylesheet"/>
	<link href="<%=basePath%>commons/css/bootstrap-responsive.css" rel="stylesheet"/>
	<script type="text/javascript">
		var basePath = '<%=basePath%>';
		var realname = '<%=realname%>';
		var userid = '<%=userid%>';
	</script>
	<body style="background-color: #EEEFFF;">
		<div class="alert alert-block nosupport hide">
	        <h4>浏览器版本不支持</h4>
	        <hr>
	        <p>亲，您知道不？现在您使用的是十年前的浏览器！</p>
	        <p>假如世界上的更多的人都像您这样不愿意接受新技术、新科技，那么世界将被你们阻止进步。</p>
	        <p>亲，为了更好的体验效果，我们呼吁您，紧跟科技的脚步前行，您会发现更多的精彩。</p>
			<p>
				下面您可以
				<a
					href="http://windows.microsoft.com/zh-cn/internet-explorer/downloads/ie-10/worldwide-languages"
					target="_blank">升级 </a>您的浏览器版本或使用
				<a href="http://www.google.com/intl/zh-CN/chrome/browser/"
					target="_blank">Chrome</a> 或
				<a href="http://www.apple.com.cn/safari/" target="_blank">Safari  </a>
				等高级浏览器。
			</p>
			<hr>
	        <p><i>如果您用的是360、猎豹等国内浏览器，请开启极速模式后再试。仍然出现此错误，请更换浏览器。</i></p>
	    </div>
		<div id="alertMessage" class="modal hide fade" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">
					×
				</button>
				<h3 id="myModalLabel">
					提示信息
				</h3>
			</div>
			<div class="modal-body">
				<p id="alertMessageContent"></p>
			</div>
			<div class="modal-footer">
				<button class="btn" data-dismiss="modal" aria-hidden="true">
					关闭
				</button>
			</div>
		</div>
	</body>
</html>