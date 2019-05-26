package Package2;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Componentinput;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:sport.properties")

//@Componentinput("Package2")

public class SportConfig {

	
	
	//syntax for putting bean id for NSFS and Swimcoach
	@Bean
	public FortuneService nosadFortuneService() {
		return new NosadFortuneService();
	}
	@Bean
	public Coach swimCoach() {
		return new  SwimCoach(nosadFortuneService());
	}
}
