<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숙제</title>
</head>
<body>
	<h1>이렇게 하는게 맞나..?</h1>
	<table class="table table-product" id="datatable" width="50%" border="2">
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