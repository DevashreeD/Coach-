package Package2;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	
	private String[] data= {
			"Hey there",
			"Hope you are doing well",
			"Workout harder today"
	};
	
	private Random MyRandom = new Random();
	
	
	@Override
	public String getRandom() {
	
		int index= MyRandom.nextInt(data.length);
		String MyFortune= data[index];
		
		return MyFortune;
	}

//need to return something in get fortune as well because this class is used in qualifier and get fortune will be implemented as well else it will show null
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "In RandomFS ";
	}


	

}
