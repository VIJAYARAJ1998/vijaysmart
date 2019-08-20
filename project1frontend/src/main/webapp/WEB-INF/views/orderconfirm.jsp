 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>YOUR CARTED PRODUCTS</title>
</head>
<body background="resources/images/pay.jpg">
<div class="container">
<p align="center"><b> YOUR CARTED PRODUCTS</b></p>
<c:if test="${ !empty(cartItems) }">
</c:if>
<table class="table table-striped">
<thead id="thead">
<tr><th>ProductName</th><th>Image</th><th>Quantity</th><th>Total Price</th>
</thead>
<c:set var="grandTotal" value="0"></c:set>
<tbody id="tbody"><!-- cartItems is List<CartItem>, cartItem is CartItem obj -->
<c:forEach items="${cartItems }" var="cartItem">
<tr>
<td>${cartItem.product.productname }</td>
 <c:url value="/resources/images/${cartItem.product.id }.png" var="imgUrl"></c:url>
                                        <td><img src="${imgUrl }" height="50px" width="50px">  </td>
                             
<td>${cartItem.quantity }</td>
<td>${cartItem.totalPrice }</td>
<c:set var="grandTotal" value="${grandTotal + cartItem.totalPrice }"></c:set>

</a></td>
</tr>
</c:forEach>
</tbody>
</table>
Total Price : ${grandTotal }
<c:if test="${empty(cartItems) }">
<h3>Your Cart is Empty</h3>
</c:if>
<c:if test="${!empty(cartItems) }">
</c:if>
</div>
<h2>confirm order</h2>                        
<a href="<c:url value='/payment/'></c:url>">
<span class="glyphicon glyphicon-shopping-cart"></span> way to payment  </a>
</div>
</body>
</html> 