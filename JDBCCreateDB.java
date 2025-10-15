import java.sql.*;

public class JDBCCreateDB {
	// JDBC DRIVER Name and Database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	
	// 1. Database User Name and Password
	static final String USER = "Custom";
	static final String PWD = "Custom123";
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = null;
		Statement statement = null;
		
			// 2. Register JDBC DRIVER
			Class.forName(JDBC_DRIVER);
			
			// 3. Open a COnnection
			System.out.println("Connecting to Database...");
			con = DriverManager.getConnection(DB_URL, USER, PWD);
			
			// 4. Execute a Query
			System.out.println("Creating Database...");
			statement = con.createStatement();
			
			String sql = "Create Database customtest";
			boolean result = statement.execute(sql);
			System.out.println(result);
			System.out.println("Database Created Successfully!!");
		
			if(statement != null)
				statement.close();
			if(con != null)
				con.close();
	}
}
