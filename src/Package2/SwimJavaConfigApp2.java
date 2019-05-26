package Package2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import Package2.Coach;

public class SwimJavaConfigApp2 {

	public static void main(String[] args) {
	
		//load the spring configuration file
		
				AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
				
				//retrieve bean from the container
				//the "swimCoach " used in the below line is the default bean id
				
				SwimCoach theCoach = context.getBean("swimCoach" ,SwimCoach.class);
				
				System.out.println(theCoach.getdailyworkout());
				
				
				// this is for dependency injection chapter
				System.out.println(theCoach.getFortune());
				System.out.println(theCoach.getRandom());
				System.out.println("Email..." +theCoach.getEmail());
				
				System.out.println("Team..." +theCoach.getTeam());
				
				//close the context
				
				context.close();

	}

}
