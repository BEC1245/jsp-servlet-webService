<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>Todo ���</h1>
	
	<!-- forword�� post ��û�� ������ �Ȱ��� url�̴� �ٽ� ���������� ���� �ٽ� ����� ���ƿ� -->
	<form method="post">
	
		���� : <input type="text" name="todo"> <br>
		��¥ : <input type="date" name="duedate"> <br>
		
		<!-- type reset�� form�� ��� �Է°��� �ʱ�ȭ ���� -->
		<input type="reset" value="reset">
		<input type="submit" value="register">
	
	</form>
</body>

</html>