package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.TodoDTO;
import todo.service.TodoViewService;

@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {
	
	TodoViewService viewservice;
	
	public TodoReadController() {
		this.viewservice = TodoViewService.getInstance();
	}
	
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		
		// 상세보기 페이지는 get 요청에 화면을 보여주는 처리
		// 어떤 Todo의 데이터인지 석별 할 수 있는키 데이터를 받아서 처리 -> 리스트별 데이터를 pk로 구분
		
		String noStr = request.getParameter("no");
		
		int no = Integer.parseInt(noStr);
		
		// no 값으로 리스트별 데이터를 가져와 read.jsp에 전달
		// 여기는 받을 데이터를 임의로 주는 코드
		
		TodoDTO todo = viewservice.getTodo(no);
		
		request.setAttribute("todo", todo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/read.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
