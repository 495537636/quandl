$(function () {

	//加载底部页面
	$("#bottomDiv").load("common/jsp/bottom.jsp");
	
});

//加入购物车
function addToCart(spid) {
	$.ajax({
		type : "post",
		cache : false,
		async : false,
		url : "gwc_addToCart.action",
		data : ({
			"spid" : spid
		}),
		success : function(data){
			var message = data.message;
			getAddToCartFlag(message);
			loadGwc();
		}
	});
}

//跳转到商品明细页面
function toGoodsMx(spid){
	document.goodsFm.action = "goods_toGoodsMxPage.action?spid="+spid;
	document.goodsFm.method = "post";
	document.goodsFm.target = "_blank";
	document.goodsFm.submit();
}