
public abstract class Component {
	protected String name;
	protected int level=0;
	public abstract void show();
	
	public Component (String name) {
		this.name = name;
	}
	public String tabulation() {
		String tabulation="";
		for(int i=0; i< level; i++) {
			tabulation+="\t";
		}
		return tabulation;
	}
}
