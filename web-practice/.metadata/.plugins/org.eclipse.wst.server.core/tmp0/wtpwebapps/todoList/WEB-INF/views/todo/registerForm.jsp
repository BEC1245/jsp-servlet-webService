<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>Todo 등록</h1>
	
	<!-- forword로 post 요청을 받으면 똑같은 url이니 다시 서블릿으로 가서 다시 여기로 돌아옴 -->
	<form method="post">
	
		할일 : <input type="text" name="todo"> <br>
		날짜 : <input type="date" name="duedate"> <br>
		
		<!-- type reset은 form의 모든 입력값을 초기화 해줌 -->
		<input type="reset" value="reset">
		<input type="submit" value="register">
	
	</form>
</body>

</html>