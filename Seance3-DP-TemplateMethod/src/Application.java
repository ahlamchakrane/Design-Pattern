
public class Application {
	public static void main(String[] args) {
		Utilitaire utilitaire = new UtilitaireImpl1();
		System.out.println(utilitaire.compute("azerty"));
		utilitaire = new UtilitaireImpl2();
		System.out.println(utilitaire.compute("azerty"));
	}
}
