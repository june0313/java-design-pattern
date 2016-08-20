package design_pattern.chapter9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wayne on 2016. 6. 18..
 */
public abstract class Subject {
	private List<Observer> observerList = new ArrayList<>();

	public void attach(Observer observer) {
		this.observerList.add(observer);
	}

	public void detach(Observer observer) {
		this.observerList.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : this.observerList) {
			observer.update();
		}
	}
}
