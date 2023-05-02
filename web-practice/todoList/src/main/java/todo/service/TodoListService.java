package todo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoListService {
	TodoDAO dao;
	
	private TodoListService() {
		dao = TodoDAO.getInstance();
	}
	
	private static TodoListService service = new TodoListService();
	
	public static TodoListService getInstance() {
		return service;
	}
	
	public List<TodoDTO> getList(){
		Connection conn = null;
		List<TodoDTO> result = null;
		
		try {
			conn = ConnectionProvider.get();	
			result = dao.getTodoDTO(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		return result;		
	}
}
