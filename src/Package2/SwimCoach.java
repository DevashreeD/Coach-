package Package2;



import org.springframework.beans.factory.annotation.Value;

import  Package2.Coach;
import  Package2.FortuneService;

public class SwimCoach implements Coach {

	
	private FortuneService fortune;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public SwimCoach (FortuneService service) {
		fortune=service;
	}
	@Override
	public String getdailyworkout() {
	
		return "Swim 1000 mtrs atleast";
	}

	@Override
	public String getFortune() {
		
		return fortune.getFortune();
	}

	public static void main(String[] args) {
	

	}
	@Override
	public String getRandom() {
		// TODO Auto-generated method stub
		return "In Random string in SwimCoach";
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

}

