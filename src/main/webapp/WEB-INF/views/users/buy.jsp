<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<div id=cotainer>
	<form action="/buy" method="POST">
		<h3>구매하기</h3>
		<table class="table table-product" id="datatable" border="2">
			<thead>
				<tr>
					<th>이름</th>
					<th>가격</th>
					<th>재고</th>
					<th>시간</th>
				</tr>
			</thead>
			<tbody>
				<input type="hidden" name="productId" value="${product.productId }">
				<input type="hidden" name="id" value="${principal.id}">
				<input type="hidden"  id =  "productPricenumber" name="buyPrice" value="${product.productPrice}">
				<input type="hidden" name="buyName" value="${product.productName}">
				<tr>
					<td>${product.productName}</td>
					<td>${product.productPrice}</td>
					<td>${product.productQty}</td>
					<td>${product.createdAt}</td>
				</tr>
			</tbody>
		</table>
		<div class="mb-3 mt-3">
			<input id="buyQty" type="text" name="buyQty" class="form-control" placeholder="구매갯수">
			<button id="btnInsert" type="submit" class="btn btn-primary">상품구매 완료</button>
		</div>
	</form>
<script>
    
    $(document).ready( function() {
    
        //숫자만
        $(".productPricenumber").keyup(function(event){
            
            var str;
                            
            if(event.keyCode != 8){
                if (!(event.keyCode >=37 && event.keyCode<=40)) {
                    var inputVal = $(this).val();
                    
                    str = inputVal.replace(/[^-0-9]/gi,'');
                    
                    if(str.lastIndexOf("-")>0){ //중간에 -가 있다면 replace
                        if(str.indexOf("-")==0){ //음수라면 replace 후 - 붙여준다.
                            str = "-"+str.replace(/[-]/gi,'');
                        }else{
                            str = str.replace(/[-]/gi,'');
                        }
                    
                    }
                                            
                    $(this).val(str);
                    
                }                    
            }
 
        });
        
    });
      
  </script>

</div>

<%@ include file="../layout/footer.jsp"%>