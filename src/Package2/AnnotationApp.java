package Package2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Package2.Coach;

public class AnnotationApp {

	public static void main(String[] args) {
	
		//load the spring configuration file
		
				ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext2.xml");
				
				//retrieve bean from the container
				//the "tennisCoach " used in the below line is the default bean created by component for tennis coach
				
				Coach theCoach = context.getBean("tennisCoach" ,Coach.class);
				
				System.out.println(theCoach.getdailyworkout());
				
				
				// this is for dependency injection chapter
				System.out.println(theCoach.getFortune());
				System.out.println(theCoach.getRandom());
				
				//close the context
				
				context.close();

	}

}
