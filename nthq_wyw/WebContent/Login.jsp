<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<link rel="stylesheet" type="text/css" href="css/main.css" />
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script type="text/jscript" src="js/jquery.js" charset="UTF-8"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/jscript" src="js/main.js" charset="UTF-8"></script>

	<head>
		<meta charset="UTF-8">
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="renderer" content="webkit">
		<title>登陆1</title>
	</head>

	<body class="wbody">
		<div class="container">
			<form id="formlogin" class="form-signin" action="Login" method="post">
				<h2 class="form-signin-heading">南通化轻微业务平台</h2>
				<label for="inputEmail" class="sr-only">用户名</label>
				<input name="account" type="text" id="inputEmail" class="form-control" placeholder="用户名" required autofocus/>
				<label for="inputPassword" class="sr-only">密码</label>
				<input name="password" type="password" id="inputPassword" class="form-control" placeholder="密码" required/>
				<div class="checkbox">
					<label>
            <input type="checkbox" value="remember-me"> 记住密码
          </label>
				</div>
				<button id = "btnlogin" class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
			</form>
		</div>
		
	</body>

</html>