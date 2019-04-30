$(function () {
	form_post();
	$(window).resize(function() {
		form_post();
	})

	//div大小自适应
	$(window).load(function() {
		$(".block-main").height($(window).height() - 50);
		$(".text-body").width($(window).width() - 120);
	})

    //登陆校验
	$("#btnlogin").click(function() {
		if ($("#inputEmail").val() == "") {
			alert("用户名不能为空！");
		}
		else if ($("#inputPassword").val() == "") {
			alert("密码不能为空！");
		}
	})

 	//导航条弹出效果
	$(".nav1-body-btn").click(function(){
	 	var m = $(this).parent().children().last();
		if(m.css("display")=="none"){
			$(".nav1-body-list").css({ "display": "none" });
	 		m.css({"display":"block"});
		}
		else {
			m.css({"display":"none"});
		}
	 }) 

	$(".text-body").mousedown(function(){
		$(".text-body").mouseup(function(){
			$(".nav1-body-list").css({ "display": "none" });
		})
	})


	$("#dropdownMenu2").click(function() {
		$(this).css({ "border": "none" });
		$(".dropdown").css({ "border": "none" });
		$(".set").css({ "padding-left": "10px", "width": "100%" });
		$("#hw-menu1").css({ "min-width": "56px" });
	})

	$("#dropdownMenu2").mouseleave(function() {
		$(this).css({ "border": "none" });
		$(".dropdown").css({ "border": "none" });
	})

	$("#dropdownMenu2").mouseout(function () {
		$(this).css({ "border": "none" });
		$(".dropdown").css({ "border": "none" });
	})

	//$(".inp4").blur(function(){
		//$(document).click(function(){
	//		alert($(this).prop("tagName"));
	//		$(".inp4").attr("readonly","readonly");
	//		$(".inp4").css({ "background-color": "rgb(240, 240, 240)","border":"none","border-width":"0px","border-style":"solid" });
	//	})
	//})

})

function form_post() {
	var sw = $(document.body).width();
	var sh = $(window).height();
	var nav_sh = $("#nav1").height();
	$("#formlogin").offset({ top: sh / 2 - 200, left: sw / 2 - 110 })
	$("#dropdownMenu1").height(nav_sh - 12);
}

//修改基础信息
function clrev(obj){
	var tep = obj;
    $(tep).parent().prev().children().removeAttr('readonly');
    $(tep).parent().prev().children().css({ "background-color": "white","border":"rgb(240, 240, 240)","border-width":"1px","border-style":"solid" });
}

function clout(obj){
	var tep =obj;
	$(document).click(function(me){
		$(tep).parent().next().children().attr("readonly","readonly");
		$(tep).parent().next().children().css({ "background-color": "rgb(240, 240, 240)","border":"none","border-width":"0px","border-style":"solid" });

	})
}