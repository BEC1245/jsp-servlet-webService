package todo.util;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

public class Loader extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// 서버 실행시 한번 실행해주는 코드
		System.out.println("Loader...init()..");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
	}

}
