public class Maroc implements IStrategie {
	@Override
	public double calculerIGR(double salaireBrutAnnuel) {
		if(salaireBrutAnnuel < 40000) {
			return 0.05;
		} else if(salaireBrutAnnuel > 40000 && salaireBrutAnnuel < 120000) {
			return 0.2;
		} else if(salaireBrutAnnuel > 120000) {
			return 0.42;
		}
		return 0;
	}

}
