package org.naresh.javariders.observerpattern;

public interface Subject {

	public void register(Observer ob);
	public void notifyObserver();
	public void unRegister(Observer ob);
}
