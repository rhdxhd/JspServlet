<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<table border="1">
  <%
  for(int i =2; i < 10; i++) { %>
  
  <% if(i%2 == 0) { %>
  <tr style="background: blue;">
  <% } else { %>
  <tr style="background: red;">
  <% } %>
	  <% for(int j = 1; j < 10; j++) { %>
		 <td><%=i%> * <%=j%> = <%=i*j%></td>		  
	  <% }%>
  </tr>
  <% } %>
</table>




</body>
</html>