<%@ page import="com.entity.cn.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/jscript" src="js/jquery.js" charset="UTF-8"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/jscript" src="js/main.js" charset="UTF-8"></script>
<script src="js/upload.js"></script>
<script src="dist/distpicker.js"></script>

<head>
    <meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="renderer" content="webkit">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>个人设置</title>
</head>
<body>
<% String account = (String)request.getSession().getAttribute("account"); %>
<% User user = (User)request.getAttribute("user"); %>
<nav class="nav1">
    <div class="nav1-top"><a class="homepage" href="Login?account=<%=account %>" ><img class="ico3" src="img/more.png"/></a></div>
    <diV class="nav1-body">
    <ul class="nav1-body-menu">
        <li>
            <button class="nav1-body-btn">我的账户</button>
            <ul class="nav1-body-list">
                <li class="nav1-body-list-item"><a href="#">基本信息</a></li>
                <li class="nav1-body-list-item"><a href="#">安全设置</a></li>
                <li class="nav1-body-list-item"><a href="#">个性设置</a></li>
            </ul>
        </li>
        <li>
            <button class="nav1-body-btn">积分管理</button>
            <ul class="nav1-body-list">
                <li class="nav1-body-list-item"><a href="#">积分明细</a></li>
                <li class="nav1-body-list-item"><a href="#">积分兑换</a></li>
                <li class="nav1-body-list-item"><a href="#">成长记录</a></li>
            </ul>
        </li>
        <li>
            <button class="nav1-body-btn">用户数据</button>
            <ul class="nav1-body-list">
                <li class="nav1-body-list-item"><a href="#">行为分析</a></li>
                <li class="nav1-body-list-item"><a href="#">趋势预测</a></li>
            </ul>
        </li>
    </ul>
    </diV>
</nav>
<div class="text-body" >
    <diV class="text-body-1">
        <div class="text-body-1-1">
            <diV class="text-body-1-1-1">
            <div id="text-title1">基本信息</div>
            <table id="text-table1">
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" value="<%=user.getName()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);"/></td>
                    <td class="td4"></td>
                </tr>
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;昵&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" value="<%=user.getNickname()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);"/></td>
                    <td class="td4"></td>
                </tr>
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" value="<%=user.getBirthday()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);"/></td>
                    <td class="td4"></td>
                </tr>
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;手&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" value="<%=user.getPhoneNum()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);"/></td>
                    <td class="td4"></td>
                </tr>
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" value="<%=user.getEmail()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);"/></td>
                    <td class="td4"></td>
                </tr>
            </table>
            <table id="text-table2">
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;国&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;籍：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" value="<%=user.getNation()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);"/></td>
                    <td class="td7"></td>
                </tr>
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" value="<%=user.getSex()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);"/></td>
                    <td class="td7"></td>
                </tr>
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" value="<%=user.getEducation()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);"/></td>
                    <td class="td7"></td>
                </tr>
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;婚姻状况：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" value="<%=user.getMarstatus()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);" /></td>
                    <td class="td7"></td>
                </tr>
                <tr>
                    <td class="td1"><div class="td1-1">&nbsp;&nbsp;星&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;座：</div></td>
                    <td class="td7"></td>
                    <td class="td2"><input class="inp4" readonly="readonly" type="text" onblur="clout(this);" value="<%=user.getConstellation()%>"/></td>
                    <td class="td3"><img class="ico4" src="img/revised-3.png" onclick="clrev(this);" /></td>
                    <td class="td7"></td>
                </tr>
            </table>
            </div>
            <div class="text-body-1-1-2">
                <div class="head-img-frame">
                    <div class="head-img-title">我的头像</div>
                    <div id="drop_area"></div>
                    <script type="text/javascript">
                        var imc= "<%=user.getImgpath()%>";
                        if(imc == ""){
                            imc = "img/upload.png";
                        }
                        var dragImgUpload = new DragImgUpload("#drop_area",imc,{
	                        callback:function (files) {
                            var file = files[0];
                            var formData = new FormData();
                            formData.append("myfile", file);   
                            $.ajax({
				                type:'post',
				                url:'http://localhost:8080/nthq_wyw/AccountInfo?account=<%=account%>',
                                contentType: false,
                                processData: false,
                                data : formData,
				                error: function(){
					            alert("上传图片失败！");
				                },
				                success: function(){
					            alert("上传图片成功！");
                                }
			                });
                            console.log(file.name);
                            }
                        })
                    </script>
                </div>
            </div>
        </diV>
    </div>
    <div class="text-body-2">
    <div class="text-body-2-1">
    <div id="text-title1">地址信息</div>
    <table id="text-table3">
        <tr class="text-table3-tr">
            <div data-toggle="distpicker">
            <div class="sel0">&nbsp;&nbsp;居&nbsp;&nbsp;住&nbsp;&nbsp;地：</div>
            <div class="sel2"></div>
            <%if(user.getLive_province() == ""){%>
            <select class="sel1" data-province="------ 选择省 ------"></select>
            <%}%>
            <%if(user.getLive_province() != ""){%>
            <select class="sel1" data-province="<%=user.getLive_province()%>"></select>
            <%}%>
            <div class="sel2"></div>
            <%if(user.getLive_city() == ""){%>
            <select class="sel1" data-city="------ 选择市 ------"></select>
            <%}%>
            <%if(user.getLive_city() != ""){%>
            <select class="sel1" data-city="<%=user.getLive_city()%>"></select>
            <%}%>
            <div class="sel2"></div>
            <%if(user.getLive_area() == ""){%>
            <select class="sel1" data-district="------ 选择区 ------"></select>
            <%}%>
            <%if(user.getLive_area() != ""){%>
            <select class="sel1" data-district="<%=user.getLive_area()%>"></select>
            <%}%>
            </div>
        </tr>
        <tr class="text-table3-tr">
            <div data-toggle="distpicker">
            <div class="sel0">&nbsp;&nbsp;居&nbsp;&nbsp;住&nbsp;&nbsp;地：</div>
            <div class="sel2"></div>
            <%if(user.getHome_province() == ""){%>
            <select class="sel1" data-province="------ 选择省 ------"></select>
            <%}%>
            <%if(user.getHome_province() != ""){%>
            <select class="sel1" data-province="<%=user.getHome_province()%>"></select>
            <%}%>
            <div class="sel2"></div>
            <%if(user.getHome_city() == ""){%>
            <select class="sel1" data-city="------ 选择市 ------"></select>
            <%}%>
            <%if(user.getHome_city() != ""){%>
            <select class="sel1" data-city="<%=user.getHome_city()%>"></select>
            <%}%>
            <div class="sel2"></div>
            <%if(user.getHome_area() == ""){%>
            <select class="sel1" data-district="------ 选择区 ------"></select>
            <%}%>
            <%if(user.getHome_area() != ""){%>
            <select class="sel1" data-district="<%=user.getHome_area()%>"></select>
            <%}%>
            </div>
        </tr>
    </table>
    </div>
    </div>
</div>
</body>
</html>