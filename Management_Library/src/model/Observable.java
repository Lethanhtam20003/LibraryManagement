package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	private List<Observer> observers;

	public Observable() {
		this.observers = new ArrayList<>();
	}

	public void add(Observer...observers) {
		this.observers.addAll(List.of(observers));
	}
	
	public void remove(Observer...observers) {
		this.observers.removeAll(List.of(observers));
	}
	
	public void notifyChanged() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

}
