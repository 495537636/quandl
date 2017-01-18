<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../commons/jsp/taglib.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<title>登陆全得利</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>common/css/login.css">
		<script type="text/javascript" src="<%=basePath%>login/login.js"></script>
	</head>

	<body>
		<div class="container">
			<div class="row-fluid">
				<div class="span8">
					<div id="myCarousel" class="carousel slide">
						<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1" class=""></li>
							<li data-target="#myCarousel" data-slide-to="2" class=""></li>
							<li data-target="#myCarousel" data-slide-to="3" class=""></li>
						</ol>
						<div class="carousel-inner">
							<div class="item active">
								<a href="http://www.baidu.com" target="_blank">
									<img src="<%=basePath %>common/images/01.jpg" alt="">
								</a>
								<div class="carousel-caption">
									<h4>
										First Thumbnail label
									</h4>
									<p>
										Cras justo odio, dapibus ac facilisis in, egestas eget quam.
										Donec id elit non mi porta gravida at eget metus. Nullam id dolor
										id nibh ultricies vehicula ut id elit.
									</p>
								</div>
							</div>
							<div class="item">
								<a href="">
									<img src="<%=basePath %>common/images/02.jpg" alt="">
								</a>
								<div class="carousel-caption">
									<h4>
										Second Thumbnail label
									</h4>
									<p>
										Cras justo odio, dapibus ac facilisis in, egestas eget quam.
										Donec id elit non mi porta gravida at eget metus. Nullam id dolor
										id nibh ultricies vehicula ut id elit.
									</p>
								</div>
							</div>
							<div class="item">
								<a>
									<img src="<%=basePath %>common/images/lbjn.jpg" alt="兰博基尼"/>
								</a>
								<div class="carousel-caption">
									<h4>
										第三张壁纸
									</h4>
									<p>
										兰博基尼汽车公司（Automobili Lamborghini S.p.A.）是一家坐落于意大利圣亚加塔·波隆尼
										（Sant'Agata Bolognese）的跑车制造商，公司由费鲁吉欧·兰博基尼在1963年创立。早期由于经营不善，
										于1980年破产；数次易主后，1998年归入奥迪旗下，现为大众集团（Volkswagen Group）旗下品牌之一。
										兰博基尼的标志是一头充满力量、正向对方攻击的斗牛，与大马力高性能跑车的特性相契合，同时彰显了创始人
										斗牛般不甘示弱的个性。
									</p>
								</div>
							</div>
							<div class="item">
								<a href="http://www.baidu.com" target="_blank">
									<img src="<%=basePath%>common/images/jay.jpg" alt="周杰伦"/>
								</a>
								<div class="carousel-caption">
									<h4>
										第四张壁纸
									</h4>
									<p>
										《Mine Mine》是周杰伦演唱的一首歌曲，由周杰伦作曲、作词，收录在周杰伦2011年发行的专辑《惊叹号》中。
									</p>
								</div>
							</div>
						</div>
						<a class="left carousel-control" href="#myCarousel" data-slide="prev"></a>
						<a class="right carousel-control" href="#myCarousel" data-slide="next"></a>
					</div>
				</div>
				<div class="span4">
					<form name="fm" method="post" class="well"
						style="width: 270px; margin: 0px auto;margin-top:40px;">
						<h3>
							用户登录
						</h3>
						<label>
							用户名:
						</label>
						<input type="text" placeholder="请输入用户名" name="userinfo.username"
							id="username" value="<s:property value="#request.userinfo.username"/>" 
							style="height: 30px;" class="span12"/>
						<label>
							密码：
						</label>
						<input type="password" placeholder="请输入密码" name="userinfo.password" 
							id="password" style="height: 30px" class="span12">
						<label>
							验证码：
						</label>
						<div class="input-prepend input-append">
							<input type="text" placeholder="请输入验证码" name="userinfo.randcode"
								autocomplete="off" id="randcode" style="width: 160px;"/>
							<span class="add-on">
								<img title="看不清，换一张"
									id="randCode"
									src="login_getKeyCode.action"
									style="margin-top: -2px; cursor: pointer;" />
							</span>
						</div>
						<div class="messageDiv"></div>
						<button type="button" class="btn btn-primary" id="login">
							登陆系统
						</button>
						&nbsp;&nbsp;&nbsp;&nbsp;
						没有帐号？<a href="javascript:;" id="register">点此注册</a>
					</form>
				</div>
			</div>
		</div>
		<div class="container" id="bottomDiv"></div>
	</body>
</html>