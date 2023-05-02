package todo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	public static Connection get() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/project";
		return DriverManager.getConnection(dbUrl, "testing", "1234");
	}

}
