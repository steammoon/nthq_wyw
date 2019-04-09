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
})

function form_post(){
	var sw = $(document.body).width();
    var sh = $(window).height();
    var nav_sh = $("#nav1").height();
    $("#formlogin").offset({top:sh/2-200,left:sw/2-110})
    $("#dropdownMenu1").height(nav_sh-12);
}
