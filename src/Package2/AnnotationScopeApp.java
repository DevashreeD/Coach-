package Package2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeApp {
	public static void main(String[] args) {
		
	//load the spring configuration file
	
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext2.xml");
	
	//retrieve bean from the container
	
	
	Coach theCoach = context.getBean("tennisCoach" ,Coach.class);
	Coach alphacoach = context.getBean("tennisCoach" ,Coach.class);

	boolean result= (alphacoach==theCoach);
	
	
	
	System.out.println("are both values same: "+result);
	
	System.out.println("location of alpha coach "+alphacoach);
	
	System.out.println("Loaction of the coach" +theCoach);
	

	
	//close the context
	
	context.close();
	
	
	
	}
	
	
}
