/**
 * 
 */
package org.naresh.javariders.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nchinthakindi
 *
 */
public class StockGrabber implements Subject{

	private List<Observer> observers;
	
	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	
	public StockGrabber()
	{
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer ob) 
	{
		observers.add(ob);
		
	}

	@Override
	public void notifyObserver() {
		
		for (Observer observer : observers)
		{
			observer.update(ibmPrice, applPrice, googPrice);
		}
		
	}

	@Override
	public void unRegister(Observer ob) 
	{
		
		observers.remove(ob);
	}

	
	/**
	 * @param ibmPrice the ibmPrice to set
	 */
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	

	/**
	 * @param applPrice the applPrice to set
	 */
	public void setApplPrice(double applPrice) {
		this.applPrice = applPrice;
		notifyObserver();
	}

	
	/**
	 * @param googPrice the googPrice to set
	 */
	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

}
