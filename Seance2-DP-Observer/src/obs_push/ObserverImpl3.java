package obs_push;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl3 implements Observer {
	int lastState;
	@Override
	public void update(int state) {
		System.out.println("*****OBS 3********");
		if(state > lastState) {
			System.out.println("Up");
		} else {
			System.out.println("Down");
		}
		System.out.println("*************");
		lastState = state;
	}
}
