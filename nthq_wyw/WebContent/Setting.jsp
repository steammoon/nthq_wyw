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
    <title>个人设置</title>
</head>
<body>
<% String account = (String)request.getSession().getAttribute("account"); %>
<nav class="nav1">
    <div class="nav1-top" onclick="navtop();"><img class="ico3" src="img/more.png"/></div>
    <diV class="nav1-body">
    <ul class="nav1-body-menu">
        <li>
            <button class="nav1-body-btn">我的账户</button>
            <ul class="nav1-body-list">
                <li>12</li>
                <li>34</li>
            </ul>
        </li>
        <li>
            <button class="nav1-body-btn">安全设置</button>
            <ul class="nav1-body-list">
                <li>wo</li>
                <li>shi</li>
            </ul>
        </li>
    </ul>
    </diV>
</nav>
</body>
</html>