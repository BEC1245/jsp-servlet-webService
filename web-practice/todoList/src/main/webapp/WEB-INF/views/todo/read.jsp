<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>Todo �󼼺���</h1>

		��ȣ : <input type="text" name="no" value="${todo.tno}" readonly> <br>
		���� : <input type="text" name="todo" value="${todo.todo}" readonly> <br>
		��¥ : <input type="date" name="duedate" value="${todo.duedate}" readonly> <br>
		�Ϸ� : <input type="checkbox" name="complete" ${todo.finished == 'done' ? 'checked' : ''}> <br>
		<!-- checkbox value�� => "on" �ƴϸ� "off"�� ���� -->
		
		<!-- �ش� todo�� ���� Ȥ�� �����ϴ� ��ư�� -> ���������� ���� -->
		<!-- a �±״� get ����� ���� -->
		<a href="modify?no=${todo.tno}">����</a> 
		
		<%-- <a href="modify?no=${no}">����</a> <a href="#">����</a>--%>
		<form action="delete" method="post">
			<input type="hidden" name="no" value="${todo.tno}">
			<input type="submit" value="����">
		</form>
		
</body>

</html>