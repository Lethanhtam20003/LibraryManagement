package model;

import java.util.ArrayList;

public abstract class SubjectThuVien {
	protected ArrayList<IObserver> observers;

	public abstract void addObserver(IObserver observer);

	public abstract void removeObserver(IObserver observer);

	public abstract void notifyObservers();

}
