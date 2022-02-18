import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

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
					
					int fromAccount = 33333;
					int toAccount = 11111;
					int transferMoney = 500;
					
					String query1 = "UPDATE account_details SET account_balance=account_balance-"+transferMoney+" WHERE account_id="+fromAccount;
					String query2 = "UPDATE account_details SET account_balance=account_balance+"+transferMoney+" WHERE account_id="+toAccount;
					
					// some logic to check if balance of fromAccount is > transferMoney
					
					conn.setAutoCommit(false); // marks the start of the transaction
					int rows1 = stmt.executeUpdate(query1);
					// if something happened here
					if(true)
						throw new SQLException();
					int rows2 = stmt.executeUpdate(query2);
					conn.commit();// marks the end of the transaction and the changes are commited to the DB
										//transaction was successful and data is in the new state of consistency
					
					System.out.println("Money transfered...");
				} catch (SQLException e) {
					//step 4
					try {
						conn.rollback();// marks the end of the transaction but the transaction has failed, data
												// is in old state of consistency
						System.out.println("Transaction failed...");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
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
