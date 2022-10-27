package Strategy;

public class StrategieImpl implements IStrategie1 {
	@Override
	public int[] filter(int[] data) {
		System.out.println("Implimentation1");
		for(int d : data) {
			System.out.println(d);
		}
		return null;
	}

}
