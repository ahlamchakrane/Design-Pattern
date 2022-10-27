public class Context {
	private IStrategie strategy= new StrategyImpl1();
	public void appliquerStrategy() {
		strategy.appliquer();	
	}
	public void setStrategy(IStrategie strategy) {
		this.strategy = strategy;
	}
}
