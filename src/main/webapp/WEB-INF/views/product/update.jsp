<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/css/update.css" rel="stylesheet">
<title>숙제</title>
</head>

<body>
	<div id=cotainer>
		<div class="titleupdate">상품수정하기</div>

		<div class="mb-8 mt-8">
			<input id="name" type="text" class="form-control" placeholder="상품이름">
		</div>
		<div class="mb-3 mt-3">
			<input id="name" type="text" class="form-control" placeholder="가격">
		</div>
		<div class="mb-3 mt-3">
			<input id="name" type="text" class="form-control" placeholder="재고">
		</div>

		<button id="btnupdate" type="button" class="btn btn-primary">
			<a href="/product" class=updatebutton>상품수정 완료</a>
		</button>

	</div>
</body>
</html>
<%@ include file="../layout/footer.jsp"%>