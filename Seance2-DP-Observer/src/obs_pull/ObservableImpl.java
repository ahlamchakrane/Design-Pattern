package obs_pull;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
	private int state;
	private List<Observer> observers = new ArrayList<>();
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(this);
		}
	}

	public void setState(int state) {
		this.state = state;
		this.notifyObservers(); //une fois l'etat de l'observable se change on notifie les observateurs
	}
	public int getState() {
		return this.state;
	}
}
