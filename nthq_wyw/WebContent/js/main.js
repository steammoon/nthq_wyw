$(function(){
	form_post();
	$(window).resize(function(){
		form_post();
	})
	$("#btnlogin").click(function(){
		if($("#inputEmail").val()==""){
			alert("用户名不能为空！");
		}
		else if($("#inputPassword").val()==""){
			alert("密码不能为空！");
		}
	})

	$("#dropdownMenu2").click(function(){
		$(this).css({"border":"none"});
		$(".dropdown").css({"border":"none"});
		$(".set").css({"padding-left":"10px","width":"100%"});
		$(".set:hover").css({"background-color":"blue"});
		$("#hw-menu1").css({"min-width":"56px"});
	})

	$("#dropdownMenu2").mouseleave(function(){
		$(this).css({"border":"none"});
		$(".dropdown").css({"border":"none"});
	})

	$("#dropdownMenu2").mouseout(function(){
		$(this).css({"border":"none"});
		$(".dropdown").css({"border":"none"});
	})
})

function form_post(){
	var sw = $(document.body).width();
    var sh = $(window).height();
    var nav_sh = $("#nav1").height();
    $("#formlogin").offset({top:sh/2-200,left:sw/2-110})
    $("#dropdownMenu1").height(nav_sh-12);
}
