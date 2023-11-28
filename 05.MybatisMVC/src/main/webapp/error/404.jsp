<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>

  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Bootstrap 5 404 Error Page</title>
   
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body>
    <div class=" position-relative align-items-center justify-content-center vh-100 bg-primary">
    <div class="container" style="position: absolute; left: 50%; top: 50%;">
        <h1 class="display-1 fw-bold text-white" >404</h1>
        <a href='<c:url value="/"/>' class="btn btn-secondary">홈으로</a>
    
    
    </div>
    
      
        <!-- a태그 href에 /는 root를 의미함. -->
        <!-- c:url 서버 측에서 URL을 상대적으로 동적으로 구성할 수 있도록 해주는 태그 -->
    </div>
    
    
    
  </body>

</html>