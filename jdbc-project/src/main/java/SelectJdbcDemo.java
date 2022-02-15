import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectJdbcDemo {

	public static void main(String[] args) {
	
		
		// step 1 - Load the driver into the memory
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection conn = null;
		try {
			// step 2 - establish connection with DB
			// specify ipaddress, port number, protocol, credentials
			// connection url has protocol//ipaddress:portnumber/dbname
			String connectionUrl = "jdbc:postgresql://localhost:5432/sample";
			String userName = "postgres";
			String password = "root";
			
			conn = DriverManager.getConnection(connectionUrl, userName, password);
			if(conn != null) {
				System.out.println("Connection Established....");
			}else{
				System.out.println("Connection not Established....");
			}
			// step 3 -  create a statement and execute it.
			// create the statement
			Statement stmt = conn.createStatement();
			// execute the statement
			String query = "select * from student_details";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
			}
		} catch (SQLException e) {
			// step 4 - handle the exceptions
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		

	}

}
