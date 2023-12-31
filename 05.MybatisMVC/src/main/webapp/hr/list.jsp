<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<%@ include file="/include/header.jsp"%>

<section class="page-section">
	<div class="container">


<form action="list.hr" method="get">
		<div class="row g-3 align-items-center">
			<div class="col-auto">


				<select class="form-select" aria-label="Default select example" name="option">
					<option value="all" ${option eq 'all' ? 'selected' : ''}>전체</option>
					<option value="name" ${option eq 'name' ? 'selected' : ''}>이름</option>
					<option value="department_name" ${option eq 'department_name' ? 'selected' : ''}>부서명</option>
					<option value="job_title" ${option eq 'job_title' ? 'selected' : ''}>업무명</option>
				</select>



			</div>
			<div class="col-auto">
				<input type="text" class="form-control" name="keyword" placeholder="검색어를 입력하세요" value="${keyword}"/>
			</div>
			<div class="col-auto">
				<input type="submit" value="검색" class="btn btn-primary" />
			</div>
		</div>
</form>




		<table class="table table-striped">

			<thead>
				<tr>
					<th scope="col">사번</th>
					<th scope="col">이름</th>
					<th scope="col">이메일</th>
					<th scope="col">입사일</th>
					<th scope="col">급여</th>
					<th scope="col">부서명</th>
					<th scope="col">업무명</th>


				</tr>
			</thead>
			<tbody>

				<!-- c:if, c:choose ..
			when: test = 조건1
			when: test = 조건2
			otherwise: = else
			
			empty: 리스트가 비어있거나 null인지
			
			 -->
				<c:choose>
					<c:when test="${empty list}">
						<tr>
							<td colspan="7" class="text-center">데이터가 없습니다.</td>
						</tr>

					</c:when>
					<c:otherwise>
						<c:forEach items="${list}" var="vo" varStatus="i">


							<tr>

								<td>${vo.employee_id }</td>
								<td>${vo.name }</td>
								<td>${vo.email }</td>
								<td>${vo.hire_date }</td>
								<td>${vo.salary }</td>
								<td>${vo.department_name }</td>
								<td>${vo.job_title }</td>

							</tr>

						</c:forEach>

					</c:otherwise>

				</c:choose>

			</tbody>
		</table>

	</div>
</section>


<%@ include file="/include/footer.jsp"%>
</html>