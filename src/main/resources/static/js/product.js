let productNameSameCheck = false;

$("#btnInsert").click(() => {
	insert();
});

$("#btnproductNameSameCheck").click(() => {
	checkProductName();

});



function insert() {

	if (productNameCheck() == false) {
		alert("상품명 다시 적어주세요");
		return;
	}

	if (price() == false) {
		alert("가격을  다시 적어주세요");
		return;
	}
	if (qty() == false) {
		alert("재고 다시 적어주세요");
		return;
	}

	let data = {
		productName: $("#name").val(),
		price: $("#price").val(),
		qty: $("#qty").val()
	}
	$.ajax("/product/insert", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data), // http body에 들고갈 요청 데이터
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) { // 성공
			alert("등록잘됨");
			location.href = "/";
		} else { // 실패
			alert("상품등록에 실패하였습니다.");
		}
	});
}

function checkProductName() {
	let productName = $("#name").val();

	$.ajax("/product/productNameCheck?productName=" + productName, {
		type: "GET",
		dataType: "json",
		async: true
	}).done((res) => {
		if (res.code == 1) { // 통신 성공
			if (res.data == false) {
				alert("상품명이 중복되지 않았습니다.");
				productNameSameCheck = true;

			} else {
				alert("상품명이 중복되었어요. 다른 아이디를 사용해주세요.");
				productNameSameCheck = false;
				$("#productName").val("");
			}
		}
	});
};





function priceCheck() {
	let price = $("#price").val();
	let priceRule = /^[0-9]{1,10}$/;
	if (priceRule.test(price)) {
		return true;
	} else {
		return false;
	}
}

function qtyCheck() {
	let qty = $("#qty").val();
	let qtyRule = /^[0-9]{1,10}$/;
	if (qtyRule.test(qty)) {
		return true;
	} else {
		return false;
	}
}

