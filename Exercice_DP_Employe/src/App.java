import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Employe context = new Employe();
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Donner le nom du Paye");
			String strategieClassName = scanner.nextLine();
			System.out.println("Donner le salaire Mensuel");
			context.setSalaireBrutMensuel(scanner.nextDouble());
			IStrategie strategie = (IStrategie) Class.forName(strategieClassName).newInstance();
			context.setStrategy(strategie);
			System.out.println(context.getSalaireNetMensuel());
		}
	}
}
