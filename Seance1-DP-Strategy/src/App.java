import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Context context = new Context();
		context.appliquerStrategy();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Donner le nom de la stratégie");
			String strategieClassName = scanner.nextLine();
			IStrategie strategie = (IStrategie) Class.forName(strategieClassName).newInstance();
			context.setStrategy(strategie);
			context.appliquerStrategy();
		}
	}
}
