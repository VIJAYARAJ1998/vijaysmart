<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Update cartitem</h2>

	<form action="<c:url value ='/cart/getcart'/>"  method="post">
		<table align="center">
			<tr>
				<td>Enter Quantity</td>
				<td><input type="text" name="cartId"
					value="${cartdata.cartitemId}" /></td>
			</tr>
<tr>			
<td><input type="submit" value="Update cart" /></td> </tr>
				
</body>
</html>