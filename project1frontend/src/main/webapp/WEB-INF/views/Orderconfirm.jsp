<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>confirmorder</title>
</head>
<div class ="container">
<body background="resources/images/pay.jpg">
</div>
<h2>confirm order</h2>
 <address>
                                    <strong><button disabled>Shipping Address</button></strong><br/>
                                        ${customerorder.user.customer.shippingaddress.apartmentnumber },
                                   ${customerorder.user.customer.shippingaddress.streetname }
                                <br/>
                                    ${customerorder.user.customer.shippingaddress.state},
                                     ${customerorder.user.customer.shippingaddress.city}
                                <br/>
                                   ${customerorder.user.customer.shippingaddress.zipcode}
                                </address>
       <address>
                                    <strong><button disabled>Billing Address</button></strong><br/>
                                        ${customerorder.user.customer.billingaddress.apartmentnumber},
                                        ${customerorder.user.customer.billingaddress.streetname}
                                    <br/>
                                        ${customerorder.user.customer.billingaddress.city}, ${customerorder.user.customer.billingaddress.state}
                                    <br/>
                                        ${customerorder.user.customer.billingaddress.zipcode}
                                </address>                          
<a href="<c:url value='/payment/'></c:url>">
<span class="glyphicon glyphicon-shopping-cart"></span> way to payment  </a>

</body>
</html> 