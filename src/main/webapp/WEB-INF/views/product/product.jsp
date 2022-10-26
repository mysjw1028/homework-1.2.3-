﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숙제</title>
</head>
<body>
	<h1> 상품전체보기</h1>
	<table class="table table-product" id="datatable"  border="2">
		<thead>
			<tr>
				<th>이름</th>
				<th>가격</th>
				<th>재고</th>
				<th>시간</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${product}">
				<tr>
					<td>${product.productName}</td>
					<td>${product.productPrice}</td>
					<td>${product.productQty}</td>
					<td>${product.createdAt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
<%@ include file="../layout/footer.jsp"%>