/**
 * 
 */
package org.naresh.javariders.observerpattern;

/**
 * @author nchinthakindi
 *
 */
public class StockObserver implements Observer 
{

	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	
	private static int observerTrackerId= 0;
	
	private int observerId;
	
	private Subject stackGrabber;
	
	public StockObserver(Subject stackGrabber) 
	{
		this.stackGrabber = stackGrabber;
		this.observerId = ++observerTrackerId;
		this.stackGrabber.register(this);
	}
	
	
	/* (non-Javadoc)
	 * @see org.naresh.javariders.observerpattern.Observer#update(double, double, double)
	 */
	@Override
	public void update(double ibmPrice, double applPrice, double googPrice) {
		
		this.ibmPrice = ibmPrice;
		this.applPrice = applPrice;
		this.googPrice = googPrice;
		
		printPrice();
	}


	private void printPrice()
	{
		System.out.println("IBM "+this.ibmPrice+"\nAppl "+this.applPrice+"\nGoog "+this.googPrice);
		
	}

}
