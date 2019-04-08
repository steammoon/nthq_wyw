$(function(){
	form_post();
	$(window).resize(function(){
		form_post();
	})
})

function form_post(){
	var sw = $(document.body).width();
    var sh = $(window).height();
    $("#formlogin").offset({top:sh/2-200,left:sw/2-110})
}
