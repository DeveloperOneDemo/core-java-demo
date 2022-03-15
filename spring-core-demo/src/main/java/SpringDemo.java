import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;
import com.beans.User;
import com.config.AppConfig;

public class SpringDemo {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserId(1234);
		user1.setUserName("ABC");
		
		Address add1 = new Address();
		add1.setStreet1("street1");
		add1.setZipcode(30123);
		
		user1.setAddress(add1); // example of setter injection done by us
		System.out.println(user1);
		
		//example of constructor injection done by us
		User user2 = new User(4444, "ASD", new Address("street2", 40234));
		System.out.println(user2);
		   
		//outsource the work of object creation to the spring IOC container
		
		//creating the IOC container based on xml configuration
//		ApplicationContext context = new ClassPathXmlApplicationContext("anyName.xml");
//		User user3 = context.getBean("myUser", User.class); // asking the spring core container to give 
															// an object of the bean with is myuser
		
//		user3.setUserId(9999);
//		user3.setUserName("GHJ");
		//System.out.println(user3);
		
		//creating the IOC container based on java configuration
//		ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
//		User user4 = context1.getBean("sendUser", User.class);
//		System.out.println(user4);
		
		
		//creating the IOC container based on java configuration
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		User user5 = context2.getBean("user", User.class);
		System.out.println(user5);
		
		
	}
   
}
