<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>

<% %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="/include/header.jsp"%>
	<% String key = (String) request.getAttribute("key");
	   ArrayList<String> list = (ArrayList<String>) request.getAttribute("list");
	   for(int i=0; i<list.size(); i++) {
	 %>
		<%=list.get(i)%>
	<%} %>
		
	<h1>로그인 성공 <%=key %></h1>
	<h3>${key} : 해당하는 규칙은 request.getAttribute("key") <- 줄여서 사용이 가능하게 해줌</h3>
	<C:forEach var="i" begin="0" end="10">
		<p>반복문: ${i}</p> 
	
	</C:forEach>
	
	<C:forEach items="${list}" var="str">
	<p>${str}</p>
	
	
	</C:forEach>
	
	
	
	
	
	<%@ include file="/include/footer.jsp"%>
	

</body>
</html>