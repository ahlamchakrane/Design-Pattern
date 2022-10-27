package obs_pull;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl3 implements Observer {
	int lastState;
	@Override
	public void update(Observable observable) {
		int state = ((ObservableImpl) observable).getState();
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
