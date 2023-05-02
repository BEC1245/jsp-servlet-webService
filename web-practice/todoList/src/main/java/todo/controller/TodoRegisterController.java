package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.RequestTodo;
import todo.service.TodoInsertService;

@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {
	
	TodoInsertService insertService;
	
	public TodoRegisterController() {
		insertService = TodoInsertService.getInstance();
	}
	
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
	
		// todo 입력 폼 화면 출력
		System.out.println("TodoRegisterController...doGet()...");

		// doGet
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/registerForm.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		System.out.println("TodoRegusterController..doPost()...");
		
		
		
		// 입력폼에서 전달한 데이터를 받아서 처리
		
		// post 방식의 데이터 전달 => 파라미터 한글처리
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		// redirection 처리를 하면 유저한테 정송하고 받는것이기 때문에 get 요청을 받는다
		// 정보 받는 변수
		String todo = request.getParameter("todo");
		String dueDate = request.getParameter("duedate");		
		//System.out.println(todo + " / " + dueDate);
		 
		RequestTodo requestTodo = new RequestTodo(todo, dueDate);
		
		System.out.println(requestTodo);
		
		// 해당 태이블에 커럼이 삽입 됬는지 여부
		int result = insertService.register(requestTodo);

		if(result > 0) {
			System.out.println("입력 성곰");
		} else {
			System.out.println("입력 실패");
		}
		
		// redirect : "list"
		response.sendRedirect("list"); // 외부에서 접속하는 URI
	}

}
