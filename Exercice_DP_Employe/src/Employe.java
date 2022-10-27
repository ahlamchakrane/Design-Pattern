public class Employe {
	private String CIN;
	private double salaireBrutMensuel;
	private IStrategie strategy;
	public Employe(String CIN, double salaireBrutMensuel, IStrategie strategy) {
		this.setCIN(CIN);
		this.setSalaireBrutMensuel(salaireBrutMensuel);
	}
	public Employe() {
		
	}
	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public double getSalaireBrutMensuel() {
		return salaireBrutMensuel;
	}

	public void setSalaireBrutMensuel(double salaireBrutMensuel) {
		this.salaireBrutMensuel = salaireBrutMensuel;
	}
	public IStrategie getStrategy() {
		return strategy;
	}
	public void setStrategy(IStrategie strategy) {
		this.strategy = strategy;
	}
	public double calculerIGR() {
		double salaireBrutAnnuel = salaireBrutMensuel * 12;
		// la l y a diff d'un paye à l'autre
		double taux = strategy.calculerIGR(salaireBrutAnnuel);
		return salaireBrutAnnuel* taux/1000;
	}
	public double getSalaireNetMensuel() {
		double igr = calculerIGR();
		double salaireNetAnnuel = salaireBrutMensuel*12-igr;
		return salaireNetAnnuel/12;
	}

}
