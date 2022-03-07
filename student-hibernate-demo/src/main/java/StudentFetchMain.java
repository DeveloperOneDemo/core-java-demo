import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.StudentEntity;

public class StudentFetchMain {

	public static void main(String[] args) {
		// 1) obtain the session factory from HibernateUtil (step 1 and step 2 of JDBC)
				SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
				
				// 2) from the sessionFactory open the session
				Session session = sessionFactory.openSession();
				
				// 3) from the session begin the transaction
				Transaction transaction = session.beginTransaction();
				
				// 4) perform the dml operation
				StudentEntity fetchedStudent = session.find(StudentEntity.class, 109);
				System.out.println(fetchedStudent);
				
				// 5) commit the transaction - the sql query is executed
				transaction.commit();
				System.out.println("transaction committed....");
				
				// 6) close the session
				session.close();
				System.out.println("Session closed.....");
				
				
				HibernateUtil.shutdown();


	}

}
