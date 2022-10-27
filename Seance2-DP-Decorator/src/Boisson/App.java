package Boisson;

import Decorator.Chocolat;
import Decorator.Noisette;
import Decorator.Vanille;

public class App {
	public static void main(String[] args) throws Exception {
		Boisson b = new Espresso();
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		//decoration
		b= new Chocolat(b);
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		b = new Noisette(b);
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		b= new Vanille(b);
		System.out.println(b.getDescription());
		System.out.println(b.cout());
	}
}
