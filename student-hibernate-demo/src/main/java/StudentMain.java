

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.StudentEntity;

public class StudentMain {

	public static void main(String[] args) {
		// 1) obtain the session factory from HibernateUtil (step 1 and step 2 of JDBC)
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		// 2) from the sessionFactory open the session
		Session session = sessionFactory.openSession();
		
		// 3) from the session begin the transaction
		Transaction transaction = session.beginTransaction();
		
		// 4) perform the dml operation
		StudentEntity student = new StudentEntity(103, "ACV", "Marietta", 90); // here student is in transient state
		session.save(student); // insert query is not exwecuted here // now student persistant state
		System.out.println("Student saved....");
		
		// 5) commit the transaction - the sql query is executed
		transaction.commit(); // insert is executed in this line
		System.out.println("transaction committed....");
		
		// 6) close the session
		session.close(); // here student object will come to detached state
		System.out.println("Session closed.....");
		
		
		HibernateUtil.shutdown();
	}

}
