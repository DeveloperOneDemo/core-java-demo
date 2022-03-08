import java.util.List;

import javax.persistence.NamedNativeQuery;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import entity.StudentEntity;

public class StudentFetchAllNativeQueryMain {

	public static void main(String[] args) {
		// 1) obtain the session factory from HibernateUtil (step 1 and step 2 of JDBC)
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		// 2) from the sessionFactory open the session
		Session session = sessionFactory.openSession();
		
		// 3) from the session begin the transaction
		Transaction transaction = session.beginTransaction();
		
		// 4) perform the select operation
		String city = "Marietta";
		// native query is SQL and it works on the table in the DB
		String nativeQuery = "SELECT * FROM student_details WHERE student_city='"+city+"'";
		NativeQuery query = session.createNativeQuery(nativeQuery).addEntity(StudentEntity.class);
		List<StudentEntity> allStudentsEntity = query.getResultList();
		allStudentsEntity.forEach((student)-> System.out.println(student));
		
		// 5) commit the transaction - the sql query is executed
		transaction.commit(); // insert is executed in this line
		System.out.println("transaction committed....");
		
		// 6) close the session
		session.close();
		System.out.println("Session closed.....");
		
		
		HibernateUtil.shutdown();


	}

}
