<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>Todo ����</h1>

		<form method="post">

		��ȣ : <input type="text" name="no" value="${todo.tno}" readonly> <br>
		���� : <input type="text" name="todo" value="${todo.todo}"> <br>
		��¥ : <input type="date" name="duedate" value="${todo.duedate}"> <br>
		�Ϸ� : <input type="checkbox" name="complete" ${todo.finished == 'done' ? 'checked' : ''}> <br>
		<!-- checkbox value�� => "on" �ƴϸ� "off"�� ���� -->
		<input type="reset"> <input type="submit" value="Modify">
		
		</form>
		
		<!-- �ش� todo�� ���� Ȥ�� �����ϴ� ��ư�� -> ���������� ���� -->
		
</body>

</html>