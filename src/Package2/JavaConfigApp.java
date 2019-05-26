package Package2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Package2.Coach;

public class JavaConfigApp {

	public static void main(String[] args) {
	
		//load the spring configuration file
		
				AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
				
				//retrieve bean from the container
				//the "swimCoach " used in the below line is the bean id 
				
				Coach theCoach = context.getBean("swimCoach" ,Coach.class);
				
				System.out.println(theCoach.getdailyworkout());
				
				
				// this is for dependency injection chapter
				System.out.println(theCoach.getFortune());
				System.out.println(theCoach.getRandom());
				
				//close the context
				
				context.close();

	}

}
