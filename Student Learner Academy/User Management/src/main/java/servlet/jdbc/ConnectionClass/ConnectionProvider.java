package servlet.jdbc.ConnectionClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionProvider {
	public static Connection conn;

	public static Connection CreateConnection() throws SQLException {
		final String JDBC_LoadDriver = "com.mysql.cj.jdbc.Driver";
		final String Connection_URL = "jdbc:mysql://localhost:3306/students_db";
		final String MYSQL_User = "root";
		final String MYSQL_Password = "root";
		try {
			// driver load
			Class.forName(JDBC_LoadDriver);
			// connection creating
			conn = DriverManager.getConnection(Connection_URL, MYSQL_User, MYSQL_Password);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return conn;
	}

}
