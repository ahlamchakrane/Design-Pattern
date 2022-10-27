package obs_push;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl1 implements Observer {
	@Override
	public void update(int state) {
		double res = state * state +9;
		System.out.println("*****OBS 1*******");
		System.out.println("******"+res+"******");
	}
}
