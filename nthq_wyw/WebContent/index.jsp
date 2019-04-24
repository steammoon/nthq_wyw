<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/jscript" src="js/jquery.js" charset="UTF-8"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/jscript" src="js/main.js" charset="UTF-8"></script>

<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="renderer" content="webkit">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>南通化轻 — 微业务平台</title>
</head>

<body>
	<% String account = (String)request.getSession().getAttribute("account"); %>
	<nav id="nav1" class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
		
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
					aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<img class="ico2" src="img/logo-new.png" />
				<a class="navbar-brand" style="font-size:20px;font-weight:500;" href="#">&nbsp;&nbsp;微业务</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active">
						<a href="Login">主页</a>
					</li>
					<li>
						<!--<a href="#about">业务</a>-->
						<div class="dropdown">
							<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1"
								data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
								业务 <span class="caret"></span>
							</button>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
								<li>
									<a href="#">贸易流向</a>
								</li>
								<li>
									<a href="#">价格表</a>
								</li>
								<li>
									<a href="yw_01_zdjjsgzb.jsp">暂定价结算跟踪表</a>
								</li>
							</ul>
						</div>
					</li>
					<li>
						<a href="#contact">管理</a>
					</li>
					<li>
						<a href="#contact">论坛</a>
					</li>
				</ul>
				<li>
					<div class="dropdown" style="float:right;">
						<button class="btn btn-default1 dropdown-toggle1" type="button" id="dropdownMenu2"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" style="height:50px;">
							<img class="ico" src="img/github-fill-blue.png" />&nbsp;&nbsp;<%=account%> <span class="caret"></span>
						</button>
						<ul id="hw-menu1" class="dropdown-menu" aria-labelledby="dropdownMenu2">
							<li>	
								<a class="set" href="Setting?account=<%=account %>">&nbsp;&nbsp;<img class="ico1" src="img/icon_setting.png" />个人设置</a>
							</li>
							<li>
								<a class="set" href="#">&nbsp;&nbsp;<img class="ico1" src="img/edit-square.png" />修改密码</a>
							</li>
							<li>
								<a class="set" href="Login">&nbsp;&nbsp;<img class="ico1" src="img/close-circle.png" />登出</a>
							</li>
						</ul>
					</div>
				</li>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
	<div class="block-main">
		<div class="block-1">
			<div class="block-11"></div>
			<div class="block-12"></div>
		</div>
		<div class="block-2"></div>
	</div>
</body>

</html>