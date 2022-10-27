import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
	List<Component> childs = new ArrayList<>();
	
	public Folder(String name) {
		super(name);
	}
	public Component addComonant(Component component) {
		component.level = this.level+1;
		childs.add(component);
		return component;
	}
	@Override
	public void show() {
		System.out.println(tabulation()+ "Folder : "+name);
		for (Component c : childs) {
			c.show();
		}
	}
	
}
