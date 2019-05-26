package Package2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope("prototype")
@Component
public class TennisCoach implements Coach {

//create parameter for the fortuneservice interface and give it a name
	
@Qualifier("randomFortuneService")
@Autowired
public FortuneService fortuneS;


// pass the interface parameter to the constructor of the tennis coach

/*@Autowired
public TennisCoach(FortuneService thefortune) {
	fortuneS=thefortune;
}
*/

//this is for setter method, above commented constructor was for constructor injection

//setter injection

public TennisCoach() {
	System.out.println("Inside Tennis Coach Constructor");
	
}

// lifecycle methods
@PostConstruct
public void ConstructLifecycle() {
	System.out.println("Inside Construct lifecycle");
}

@PreDestroy
public void DestroyLifecycle() {
	System.out.println("Inside Destroy lifecycle");
}

/*@Autowired
 public void setFortuneS(FortuneService fortuneS) {
	
	 System.out.println("Inside Setter method in TennisCoach");
	 this.fortuneS = fortuneS;
	
	
}
*/

/*
//test
@Autowired
public void Test(FortuneService fortuneS) {
	
	 System.out.println("Inside test method in TennisCoach");
	 this.fortuneS = fortuneS;
}
*/	
	@Override
	public String getdailyworkout() {
		
		return "Run 5 miles ";
	}

	@Override
	public String getFortune() {
		
		return fortuneS.getFortune();
	}

	@Override


public String getRandom() {
	return fortuneS.getRandom();
}

	}

