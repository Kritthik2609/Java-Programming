import java.sql.*;

public class JDBCCreateTable {
	// JDBC DRIVER Name and Database URL
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost:3306/customtest";
		
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
				
				String sql = "INSERT INTO user values"
	                    + "(2,'Sam','George',23),"
	                    +"(3,'Anil','Pate',21),"
	                    +"(1,'Ram','Naik',20)";
				statement.executeUpdate(sql);
				
				if(statement != null)
					statement.close();
				if(con != null)
					con.close();
	}
}
