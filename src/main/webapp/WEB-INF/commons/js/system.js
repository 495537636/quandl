$(function(){
	
	//加载头部文件
	$.ajax({
		url : "base/loadHeader",
		type : "post",
		data : {"operateName": operateName},
		success : function(data) {
			$("#header").html(data);
		}
	});
	
	//加载尾部文件
	$.ajax({
		url : "base/loadFooter",
		type : "post",
		success : function(data) {
			$("#footer").html(data);
		}
	});
	
});