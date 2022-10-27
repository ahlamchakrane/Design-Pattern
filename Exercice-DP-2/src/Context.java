import Strategy.IStrategie1;
import Strategy.StrategieImpl;
import TemplateMethod.TemplateMethod;
import TemplateMethod.TemplateMethodImpl;

public class Context {
	private IStrategie1 strategy= new StrategieImpl();
	private TemplateMethod templateMethod = new TemplateMethodImpl();
	

	public TemplateMethod getStrategy2() {
		return templateMethod;
	}

	public void setStrategy2(TemplateMethod templateMethod) {
		this.templateMethod = templateMethod;
	}

	public IStrategie1 getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategie1 strategy) {
		this.strategy = strategy;
	}
	

}
