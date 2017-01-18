<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<body style="background-color: #EEEFFF;">
		<form name="searchFm">
			<div class="navbar navbar-fixed-top" role="navigation">
				<div class="navbar-inner">
					<a href="javascript:;" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</a>
					<a href="javascript:;" class="brand" style="display: none;">
						<font size="5"><b>&nbsp;&nbsp;全得利超市</b></font>
					</a>
					<div class="nav-collapse">
						<ul class="nav navigation">
							<li>
								&nbsp;&nbsp;
							</li>
							<li class="divider-vertical"></li>
							<li class="dropdown">
								<a class="dropdown-toggle" data-toggle="dropdown" id="spfl"
									href="javascript:;">
									<img src="common/images/spfl.png" style="vertical-align: middle;"/>
									全部商品分类
									<b class="caret"></b>
								</a>
								<ul class="dropdown-menu" id="spflMenu">
		
								</ul>
							</li>
							<li class="divider-vertical"></li>
							<li class="active" id="homePage" name="headSl">
								<a href="javascript:;">首页</a>
							</li>
							<li class="divider-vertical"></li>
							<li name="headSl">
								<a href="javascript:;">服装</a>
							</li>
							<li class="divider-vertical"></li>
							<li name="headSl">
								<a href="javascript:;">食品</a>
							</li>
							<li class="divider-vertical"></li>
							<li name="headSl">
								<a href="javascript:;">家居</a>
							</li>
							<li class="divider-vertical"></li>
							<li name="headSl">
								<a href="javascript:;">活动</a>
							</li>
							<li class="divider-vertical"></li>
						</ul>
						<ul class="nav pull-right">
							<li>
								<ul class="nav navigation">
									<li class="divider-vertical"></li>
									<li class="dropdown">
										<a class="dropdown-toggle" data-toggle="dropdown" href="javascript:;" id="loadGwc">
											<img src="common/images/gwc.png" />&nbsp;购物车
											<span class="badge badge-important" id="gwcSize">0</span>
											<b class="caret"></b>
										</a>
										<ul class="dropdown-menu">
											<li>
												<div align="center" id="gwc" style="width:300px"></div>
											</li>
										</ul>
									</li>
								</ul>
								<ul class="nav">
									<li class="divider-vertical"></li>
									<li id="userSelect">
										<a>
											<img src="common/images/yhdl.png" />用户登陆
										 </a>
									</li>
									<li class="divider-vertical"></li>
									<li>
										&nbsp;
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</form>
	</body>
</html>