package headfirst.combining.observer;

import java.util.*;

public class Observable implements QuackObservable {
	private List<Observer> observers = new ArrayList<Observer>();
	private QuackObservable duck;
 
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = (Observer)iterator.next();
			observer.update(duck);
		}
	}
 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
