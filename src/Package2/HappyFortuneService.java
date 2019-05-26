package Package2;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Its Your Lucky Day";
	}

	public static void main(String[] args) {
	

	}

	@Override
	public String getRandom() {
		// TODO Auto-generated method stub
		return null;
	}


}
