

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import entity.StudentEntity;

public class StudentFetchAllMain {

	public static void main(String[] args) {
		// 1) obtain the session factory from HibernateUtil (step 1 and step 2 of JDBC)
				SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
				
				// 2) from the sessionFactory open the session
				Session session = sessionFactory.openSession();
				
				// 3) from the session begin the transaction
				Transaction transaction = session.beginTransaction();
				
				// 4) perform the select operation
				String city = "Marietta";
				// HQL works on the enitity class and not the table in DB
				String hqlQuery = "FROM StudentEntity where studentCity=:myCity";
				Query query = session.createQuery(hqlQuery);
				query.setParameter("myCity", city);
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
