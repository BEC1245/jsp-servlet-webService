<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>Todo 수정</h1>

		<form method="post">

		번호 : <input type="text" name="no" value="${todo.tno}" readonly> <br>
		할일 : <input type="text" name="todo" value="${todo.todo}"> <br>
		날짜 : <input type="date" name="duedate" value="${todo.duedate}"> <br>
		완료 : <input type="checkbox" name="complete" ${todo.finished == 'done' ? 'checked' : ''}> <br>
		<!-- checkbox value는 => "on" 아니면 "off"로 들어옴 -->
		<input type="reset"> <input type="submit" value="Modify">
		
		</form>
		
		<!-- 해당 todo를 수절 혹은 삭제하는 버튼들 -> 서블릿으로 보냄 -->
		
</body>

</html>