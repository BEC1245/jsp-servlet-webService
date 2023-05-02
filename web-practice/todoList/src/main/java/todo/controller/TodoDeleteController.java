package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.service.TodoDeleteService;

@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {
	
	TodoDeleteService deleteService;
	
	public TodoDeleteController() {
		deleteService = TodoDeleteService.getinstance();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		System.out.println("TodoDeleteController....list");
		
		// 사용자로부터 no 닫기
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// 서비스로 no 전달 -> 삭제 처리
		int result = deleteService.delete(no);
		
		if(result > 0) {
			System.out.println(no + "번 할일이 삭제 되었습니다.");
		}
		
		// redirect ( list )
		// 상대 경오 todo의 list로 들어감
		response.sendRedirect("list");
	}

}
