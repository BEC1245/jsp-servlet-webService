package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;
import todo.util.closestatement;

public class TodoViewService {
	
	TodoDAO dao;
	
	private TodoViewService(){
		this.dao = TodoDAO.getInstance();
	}
	
	private static TodoViewService service = new TodoViewService();
	
	public static TodoViewService getInstance() {
		return service;
	}
	
	public TodoDTO getTodo(int tno){
		Connection conn = null;
		TodoDTO todo = null;
		
		try {
			conn = ConnectionProvider.get();
			
			todo = dao.selectByTno(conn, tno);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closestatement.close(conn);
		}
		
		return todo;
	}
	
}
