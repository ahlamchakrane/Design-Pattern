package adapter;

public class StandardImpl implements Standard {

	@Override
	public void operation(double nb1, double nb2) {
		System.out.println("Standard Impl R�sultat = "+ nb1*nb2);
	}

}
