<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<script type="text/javascript" src="common/js/search.js"></script>
	<script type="text/javascript" src="common/js/bootstrap-typeahead.js"></script>
	<body style="background-color: #EEEFFF;">
		<div class="container">
			<div align="center" class="row">
				<div class="span2">
					<img src="common/images/jay.jpg"/>
				</div>
				<div class="span8" style="padding-top: 25px;">
					<form class="form-search">
						<div class="input-append">
							<input type="text" class="search-query input-xxlarge"
								autocomplete="off" placeholder="请输入要搜索的商品名称" id="content" value="小米">
							<button type="button" class="btn btn-primary" id="search">
								搜索
							</button>
						</div>
					</form>
				</div>
				<div class="span2"></div>
			</div>
			<br/>
			<div class="row-fluid">
				<div class="span12" id="spcj">
					
				</div>
			</div>
			<div id="loading" align="center" style="display:none;"><img src="common/images/loading.gif"/></div>
		</div>
	</body>
</html>