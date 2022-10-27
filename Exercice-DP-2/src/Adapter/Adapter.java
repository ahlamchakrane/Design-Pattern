package Adapter;
import Strategy.IStrategie1;

public class Adapter extends ImplNonStandard implements IStrategie1 {
	@Override
	public int[] filter(int[] data) {
		appliquerFiltre("test", data);
		return null;
	}
	

}
