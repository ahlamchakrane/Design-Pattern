package obs_pull;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
	private List<Integer> historique = new ArrayList<>();
	@Override
	public void update(Observable observable) {
		int state = ((ObservableImpl) observable).getState();
		historique.add(state);
		System.out.println("*****OBS 2*******");
		System.out.println(historique);
		System.out.println("************");
	}
}
