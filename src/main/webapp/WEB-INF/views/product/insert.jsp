<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<div id=cotainer>
	<form action="/product/insert" method="POST">
		<h3>추가하기</h3>

		<div class="mb-8 mt-8">
			<input id="name" type="text"  name ="productName" class="form-control" placeholder="상품이름">
		</div>
		<div class="mb-3 mt-3">
			<input id="price" type="text" name ="productPrice" class="form-control" placeholder="가격">
		</div>
		<div class="mb-3 mt-3">
			<input id="name" type="text"  name ="productQty" class="form-control" placeholder="재고">
		</div>

		<button id="btnInsert" type="submit" class="btn btn-primary"   href ="/product">
			상품등록 완료
		</button>
	</form>

</div>


<%@ include file="../layout/footer.jsp"%>