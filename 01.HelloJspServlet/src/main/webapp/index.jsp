<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>HelloJspServlet</h3>
	<table border="1px solid black;">
		<tr>
			<td>GET 방식</td>
			<td>
				<form action="Ex02_Servlet" method="get">
					<input type="text" name="param1" /> <input type="submit" />
				</form>
			</td>
		</tr>
		<tr>
			<td>POST 방식</td>
			<td>
				<form action="Ex02_Servlet" method="post">
					<input type="text" name="param1" /> <input type="submit" />
				</form>
			</td>
		</tr>
	</table>


	<tr>
		<td>POST 방식</td>
		<td>
			<form action="Ex03" method="post">
				<input type="text" name="id" /> <input type="text" name="pw" /> <input
					type="submit" />
			</form>
		</td>
	</tr>


</body>
</html>