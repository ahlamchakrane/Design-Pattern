import java.util.ArrayList;
import java.util.Scanner;

import Strategy.IStrategie1;
import Strategy.StrategieImpl;
import TemplateMethod.TemplateMethod;
import TemplateMethod.TemplateMethodImpl;

public class App {
	public static void main(String[] args) throws Exception {
		Context context = new Context();
		Scanner scanner = new Scanner(System.in);
		//while(true) {
			//System.out.println("Donner le nom de la stratégie");
			//String strategieClassName = scanner.nextLine();
			int[] data = {1, 2, 3, 4, 9 };
			IStrategie1 strategie = new StrategieImpl();
			strategie.filter(data);
			context.setStrategy(strategie);
			TemplateMethod strategie2 = new TemplateMethodImpl();
			strategie2.compresser(data);
			context.setStrategy2(strategie2);
		//}
	}
}
