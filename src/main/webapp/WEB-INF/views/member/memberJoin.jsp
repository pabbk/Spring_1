<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<c:import url="../layout/nav.jsp" />
	<div class="container">
		<h2>SignIn</h2>
		<form action="memberJoin" method="post" id="form">
			<div class="form-group">
				<label for="id">아이디:</label> <input type="text" class="form-control"
					id="id" name="id" >
				<p id="input_id" class="btn_check"></p>
			</div>
			<div class="form-group">
				<label for="pw">비밀번호:</label> <input type="password"
					class="form-control" id="pw" name="pw" >
				<p id="input_pw" class="btn_check"></p>
			</div>
			<div class="form-group">
				<label for="pwCheck">비밀번호 확인:</label> <input type="password"
					class="form-control" id="pwCheck" name="pwCheck" >
				<p id="input_pwCheck" class="btn_check"></p>
			</div>
			<div class="form-group">
				<label for="name">이름:</label> <input type="text"
					class="form-control" id="name1" name="name" >
				<p id="input_name1" class="btn_check"></p>
			</div>
			<div class="form-group">
				<label for="email">이메일:</label> <input type="email"
					class="form-control" id="email" name="email" >
				<p id="input_email" class="btn_check"></p>
			</div>
			<div class="form-group">
				<label for="phone">연락처:</label> <input type="tel"
					class="form-control" id="phone" name="phone" >
				<p id="input_phone" class="btn_check"></p>
			</div>
			<button type="submit" class="btn btn-default">SignIn</button>
		</form>
	</div>

</body>
</html>