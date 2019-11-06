<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootstrap.jsp" />
</head>
<body>
<c:import url="../layout/nav.jsp" />
	<div class="container">
		<table class="table">
			<thead>
				<tr><th class ="col-lg-6" style="text-align: center;">TITLE</th><th class ="col-lg-2" style="text-align: center;">WRITER</th><th class ="col-lg-2" style="text-align: center;">DATE</th><th class ="col-lg-2" style="text-align: center;">HIT</th></tr>
				
			</thead>
			<tbody>

				<tr>
					
					<td style="text-align: center;">${requestScope.dto.title}</td>
					<td style="text-align: center;">${requestScope.dto.writer}</td>
					<td style="text-align: center;">${requestScope.dto.reg_date}</td>
					<td style="text-align: center;">${requestScope.dto.hit}</td>
				</tr>

			</tbody>
			
		</table>
	</div>
	<div class="container">
  		<div class="jumbotron">
  			<h4>${requestScope.dto.contents}</h4>

  		</div>
  		<div>
  			<ul class="pager">
				
			</ul>
			<div style="float: left;">
				<a href="noticeList.notice" class="btn btn-success">List</a>
			</div>
  			<div style="width: 142px; height: 33px; float: right;">
			
  				<a href="noticeUpdate.notice?num=${requestScope.dto.num}" class="btn btn-primary">Update</a>
  				<a href="" class="btn btn-danger" data-toggle="modal" data-target="#myModal">Delete</a>
  				
  			  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">삭제 확인</h4>
        </div>
        <div class="modal-body">
          <p>정말 삭제하시겠습니까?</p>
        </div>
        <div class="modal-footer">
          <button id="btn" type="button" class="btn btn-danger" data-dismiss="modal">예</button>
          <button type="button" class="btn btn-primary" data-dismiss="modal">아니오</button>
        </div>
      </div>
      
    </div>
  </div>
  			
  			</div>
  			
  		</div>
      
</div>

<script type="text/javascript">
<%-- $("#btn").click(function() {
	location.href="noticeDeleteResult.jsp?num=<%= noticeDTO.getNum() %>"
}); --%>


</script>

</body>
</html>