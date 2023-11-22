<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Mybatis</h1>
	<a href="insert.mytbl?param=1">insert</a>
	<a href="update.mytbl">update</a>
	<a href="delete.mytbl">delete</a>
	<a href="select.mytbl">select</a>
	
	
	<form action="insert.mytbl">
		<input type="text" name="col1"/>
		<input type="text" name="col2"/>
		<input type="text" name="col3"/>
		<input type="submit" value="insert">
	</form>
	
	<form action="update.mytbl">
		<input type="text" name="col1" />
		<input type="text" name="col2"/>
		<input type="text" name="col3"/>
		<input type="submit" value="update">
	</form>
	
	
	<form action="delete.mytbl">
		<input type="text" name="col1" />
		<input type="submit" value="delete">
		
	</form>
	
	<table border="1px">
		
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.col1}</td>
				<td>${vo.col2}</td>
				<td>${vo.col3}</td>
			</tr>
		</c:forEach>
	
	
	</table>	

</body>
</html>