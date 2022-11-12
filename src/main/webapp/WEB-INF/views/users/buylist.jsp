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
	<div id="cotainer'">
		<h2>구매내역 보기</h2>
		<table class="table table-product" id="datatable" border="2">
			<thead>
				<tr>
					<th>번호</th>
					<th>상품이름</th>
					<th>구매갯수</th>
					<th>상품가격</th>
					<th>구매시시간</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="buy" items="${buy}">
					<tr>
						<td>${buy.id }</td>
						<td>${buy.productName}</td>
						<td>${buy.buyQty}</td>
						<td>${buy.productPrice}</td>
						<td>${buy.createdAt}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>
<%@ include file="../layout/footer.jsp"%>