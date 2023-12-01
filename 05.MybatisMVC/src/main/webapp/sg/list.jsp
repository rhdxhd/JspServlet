<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<%@ include file="/include/header.jsp"%>

<section class="page-section">
	<div class="container">
	
	
	
	<button type="button" class="btn btn-dark align-middle" id="insertModalBtn">신규 추가</button>
	
	
	
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">순번</th>
					<th scope="col">직원번호</th>
					<th scope="col">성</th>
					<th scope="col">입사일</th>
					<th scope="col">연봉</th>
					<th scope="col">이메일</th>					
					<th scope="col">수정</th>
					<th scope="col">삭제</th>
				
					
				</tr>
			</thead>
			<tbody>


				<c:choose>
					<c:when test="${empty list}">
						<tr>
							<td colspan="7" class="text-center">데이터가 없습니다.</td>
						</tr>

					</c:when>
					<c:otherwise>
						<c:forEach items="${list}" var="vo" varStatus="i">

							<tr>
								<th scope="row">${i.index+1}</th>
								<td>${vo.employee_id }</td>
								<td>${vo.last_name }</td>
								<td>${vo.hire_date }</td>
								<td>${vo.salary }</td>
								<td>${vo.email }</td>
								<td><a onclick="updateSg(${i.index+1},${vo.employee_id});" class="btn btn-secondary">수정</a></td>
								<td><a onclick="deleteSg(${vo.employee_id});" class="btn btn-danger">삭제</a></td>
							</tr>

						</c:forEach>

					</c:otherwise>

				</c:choose>

			</tbody>
		</table>

	</div>
</section>



<!-- insert Modal -->
<div class="modal fade" id="insertModal" tabindex="-1" aria-labelledby="insertModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="insertModalLabel">고객 추가</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      
      <form action = "insert.sg" mehtod="get">
      <div class="modal-body">

      
  <div class="form-group">
    <label for="last_name">성</label>
    <input type="text" class="form-control" id="last_name" name="last_name" placeholder="first_name">
  </div>
  <div class="form-group">
    <label for="hire_date">hire_date</label>
    <input type="date" class="form-control" id="hire_date" name="hire_date" placeholder="hire_date">
  </div>
  
    <div class="form-group">
    <label for="salary">salary</label>
    <input type="number" class="form-control" id="salary" name="salary" placeholder="salary">
  </div>
  
      <div class="form-group">
    <label for="email">email</label>
    <input type="text" class="form-control" id="email" name="email" placeholder="email">
  </div>
  
  
  

  


      
      
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">취소</button>
        <input type="submit" class="btn btn-primary" value="추가"/>
      </div>
      
      
      </form>
      
      
    </div>
  </div>
</div>




<!-- Update Modal -->
<div class="modal fade" id="updateModal" tabindex="-1" aria-labelledby="updateModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="updateModalLabel">정보 수정</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      
      <form action = "update.sg" mehtod="get">
      <input type="hidden" name="employee_id">
      <div class="modal-body">
      
      
  <div class="form-group">
    <label for="last_name">last_name</label>
    <input type="text" class="form-control" id="last_name" name="last_name" placeholder="이름">
  </div>
  <div class="form-group">
    <label for="hire_date">hire_date</label>
    <input type="date" class="form-control" id="hire_date" name="hire_date" placeholder="입사일">
  </div>
  
    <div class="form-group">
    <label for="salary">salary</label>
    <input type="number" class="form-control" id="salary" name="salary" placeholder="연봉">
  </div>
  
  
        <div class="form-group">
    <label for="email">email</label>
    <input type="text" class="form-control" id="email" name="email" placeholder="salary">
  </div>


      
      
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">취소</button>
        <input type="submit" class="btn btn-primary" value="수정"/>
      </div>
      
      
      </form>
      
      
    </div>
  </div>
</div>




<script type="text/javascript">

	function updateSg(idx, employee_id) {
		console.log(idx + " : " + employee_id);
		var employee_id = $('table tr:eq('+ idx+') td:eq(0)').text();
		var last_name = $('table tr:eq('+ idx+') td:eq(1)').text();
		var hire_date = $('table tr:eq('+ idx+') td:eq(2)').text();
		var salary = $('table tr:eq('+ idx+') td:eq(3)').text();
		var email = $('table tr:eq('+ idx+') td:eq(4)').text();
	
		$('#updateModal input[name=employee_id]').val(employee_id);
		$('#updateModal input[name=last_name]').val(last_name);
		$('#updateModal input[name=hire_date]').val(hire_date);
		$('#updateModal input[name=salary]').val(salary);
		$('#updateModal input[name=email]').val(email);
		$('#updateModal').modal('show');

	}
	
	
	


	function deleteSg(employee_id) {
		if(confirm('정말 삭제 하시겠습니까?')) {
	
			location.href='delete.sg?employee_id=' + employee_id;
		}
	}
	
	
	
	
	
	
	
	$('#insertModalBtn').on("click", function () {
		$('#insertModal').modal('show');
	})
	
	
</script>






<%@ include file="/include/footer.jsp"%>
</html>