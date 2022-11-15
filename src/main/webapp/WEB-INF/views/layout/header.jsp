<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>숙제</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="/css/insert.css" rel="stylesheet">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">숙제</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<c:choose>
						<c:when test="${empty principal}">
							<li class="nav-item"><a class="nav-link" href="/login">로그인</a></li>
							<li class="nav-item"><a class="nav-link" href="/join">회원가입</a></li>
						</c:when>
						<c:otherwise>
							<li class="nav-item"><a class="nav-link" href="/product">상품전체보기페이지</a></li>
							<li class="nav-item"><a class="nav-link" href="/buy/buylist/${principal.id}">구매내역보기</a></li>
							<li class="nav-item"><a class="nav-link" href="/logout">로그아웃</a></li>
					<!--<li class="nav-item"><a class="nav-link" href="/product/insert">상품등록페이지</a></li> 
						 	<li class="nav-item"><a class="nav-link" href="/users/${principal}">회원정보보기</a></li> -->
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
	</nav>