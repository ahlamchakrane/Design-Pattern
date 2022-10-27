package obs_pull;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class App {
	public static void main(String[] args) throws Exception {
		ObservableImpl observableImpl = new ObservableImpl();
		Observer o1 = new ObserverImpl1();
		Observer o2 = new ObserverImpl2();
		Observer o3 = new ObserverImpl3();
		observableImpl.subscribe(o1);
		observableImpl.subscribe(o2);
		observableImpl.subscribe(o3);
		observableImpl.subscribe(observable -> {
			System.out.println(((ObservableImpl)observable).getState());

		});
//		Button  button = new Button("OK");
//		button.setOnAction(event -> {
//			event.getSource();
//		});
		//chaque seconde on execute ca
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			int counter;
			@Override
			public void run() {
				++counter;
				System.out.println(String.format("Counter = %d",counter));
				observableImpl.setState(new Random().nextInt(1000));
				if(counter == 10) observableImpl.unsubscribe(o3);
				if(counter == 15) timer.cancel();
			}
		}, 1000, 1000);
		System.in.read();
	}
}
