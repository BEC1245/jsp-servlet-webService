<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>Todo LIST</h1>
	
	<ul>
		
		<c:forEach items="${todoList}" var="todo">
			<li><a href="${pageContext.request.contextPath}/todo/read?no=${todo.tno}">${todo.tno}. ${todo.todo} </a> ${todo.duedate} ${finished ? 'DONE' : 'NOT YET' } </li>
		</c:forEach>
	</ul>
	
	<div>
		${todoList}
	</div>
	
	<a href ="${pageContext.request.contextPath}/todo/register">Todo Regist</a>
	
</body>
</html>