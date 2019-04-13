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
				   dataType:'json',
				   error: function(){
					   alert("获取数据失败！");
				   },
				   success: function(data){
					   alert("获取数据成功！");
					   console.log(data);
					   var str = "";
					   for(var i=0; i < data.length; i++) {
						str += "<tr>";
						str += "<td style='text-align:center;'>" + data[i].BusinessDate + "</td>";
						str += "<td>" + data[i].Dept + "</td>";
						str += "<td>" + data[i].Item + "</td>";
						str += "<td>" + data[i].DocNo + "</td>";
						str += "<td>" + data[i].OrderBy + "</td>";
						str += "<td>" + data[i].Contract + "</td>";
						str += "<td>" + data[i].BLQty + "</td>";
						str += "<td>" + data[i].TemPrice + "</td>";
						str += "<tr>";
						}
					   $("#hs").append(str);
				   }
			   })
		   })
		</script>
		<table id= "hs" class="table table-striped table-bordered table-condensed"></table>
		</div>
	</body>
</html>
