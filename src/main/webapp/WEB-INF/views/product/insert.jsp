<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숙제</title>
</head>
<body>
	<h1>추가하기</h1>

	<div class="mb-8 mt-8">
		<input id="name" type="text" class="form-control" placeholder="상품이름">
	</div>
	<div class="mb-3 mt-3">
		<input id="name" type="text" class="form-control" placeholder="가격">
	</div>
	<div class="mb-3 mt-3">
		<input id="name" type="text" class="form-control" placeholder="재고">
	</div>
	<button id="btnInsert" type="button" class="btn btn-primary" href="/product">상품등록 완료</button>


</body>
</html>
<%@ include file="../layout/footer.jsp"%>