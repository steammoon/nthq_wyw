<!DOCTYPE html>
<html>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <%@ page contentType="text/html; charset=UTF-8"%>
	<link rel="stylesheet" type="text/css" href="css/main.css" />
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script type="text/jscript" src="js/jquery.js" charset="UTF-8"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/jscript" src="js/main.js" charset="UTF-8"></script>
	<script type="text/jscript" src="js/json_parse.js" charset="UTF-8"></script>
	<script type="text/jscript" src="js/json2.js" charset="UTF-8"></script>
	<head>
		<meta charset="UTF-8">
		<title>RPList</title>
	</head>
	<body>
		<div>
		<script type="text/javascript">
		   
		   $(function(){
			   $.ajax({
				   type:'get',
				   url:'http://localhost:8080/nthq_wyw/Query_DiffRPSV',
				   dataType:'text',
				   error: function(){
					   alert("获取数据失败！");
				   },
				   success: function(data){
					   alert("获取数据成功！");
					   if(data){
						   //var json = eval('(' + data + ')');
						   alert(data);
					   }
				   }
			   })
		   })
		</script>
		<form>
			<input type="submit" value="提交"/>
		</form>
			<%
				out.println("Your IP address is " + request.getRemoteAddr());
			%>
		</div>
	</body>
</html>
