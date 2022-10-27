
public class Application {
	public static void main(String[] args) {
		Folder root = new Folder("Design Patterns");
		Folder d1= (Folder) root.addComonant(new Folder("Comportement"));
		Folder d2= (Folder) root.addComonant(new Folder("Structure"));
		Folder d3= (Folder) root.addComonant(new Folder("Creation"));
		
		d1.addComonant(new File("Strategy"));
		d1.addComonant(new File("Observer"));
		d2.addComonant(new File("Decorator"));
		d2.addComonant(new File("Composite"));
		d2.addComonant(new File("Adapter"));
		d3.addComonant(new File("Singleton"));
		Folder d21 = (Folder) d2.addComonant(new Folder("Str21"));
		d21.addComonant(new File("C211"));
		d21.addComonant(new File("C212"));
		d21.addComonant(new File("C213"));
		root.show();
		
	}
}
