package Package2;



import Package2.FortuneService;

public class NosadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
	
		return "Not a sad day";
	}

	@Override
	public String getRandom() {
	
		return null;
	}

}
