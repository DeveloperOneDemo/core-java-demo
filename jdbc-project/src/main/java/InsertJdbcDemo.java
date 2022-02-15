import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbcDemo {

	public static void main(String[] args) {
		
		// step 1
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// step 2
		Connection conn = null;
		try {
			String connectionUrl = "jdbc:postgresql://localhost:5432/sample";
			String userName = "postgres";
			String password = "root";
			
			conn = DriverManager.getConnection(connectionUrl, userName, password);
			
			if(conn != null) {
				System.out.println("Connection Established....");
			}else{
				System.out.println("Connection not Established....");
			}
			
			//step 3
			Statement stmt = conn.createStatement();
			int studId = 108;
			String studName = "VBN";
			String studCity = "St.Louis";
			int studContact = 11111;
			int studMark = 55;
			
			String query = "insert into student_details values("+studId+",'"+studName+"',"+studContact+","+studMark+",'"+studCity+"')";
			System.out.println(query);
			
			int rows = stmt.executeUpdate(query); // for DML
			
			System.out.println(rows + " row(s) affected...");
		} catch (SQLException e) {
			//step 4
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

		
		
		
	}

}
