   <%@include file = "header.jsp" %>
 <div class ="container">
 <div style = "background-color:orange">
 Total Payment : $ {Total_Payment}
 </div>
 <a href="<c:url value='/orderdetails/'></c:url>">
 <table class = "table border">
 <tr>
 <td colspan = "colspan-2"> Payment Detail </td>
 </tr>
 <tr>
 <td>CardNo </td>
 <td><input type = "text" name="CardNo"/></td>
 </tr>
 <tr>
 <td>valid upto </td>
 <td><input type = "text" name = "valid"></td>
 <td>CCV </td>
 <td><input type = "text" name="CCV"/></td>
 </tr>
 <tr>
 <td>Name</td>
 <td><input type = "text" name="Name"/></td>
 </tr>
 <tr>
 <td colspan = "colspan-2">
 <input type ="submit" value = "Receipt">
 </td>
 </tr>