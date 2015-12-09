/**
 * 
 */
package org.naresh.javariders.observerpattern;

/**
 * @author nchinthakindi
 *
 */
public class GrabStocksMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setApplPrice(18.34);
		stockGrabber.setGoogPrice(34.34);
		stockGrabber.setIbmPrice(3434.34);
		
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.unRegister(observer1);
		
		stockGrabber.setApplPrice(13438.34);
		stockGrabber.setGoogPrice(324234.34);
		stockGrabber.setIbmPrice(4324324.34);
		
		Runnable runnable1 = new GetTheStock(stockGrabber, 2, "IBM", 3434.6);
		
		Runnable runnable2 = new GetTheStock(stockGrabber, 2, "AAPL", 54645.6);
		
		Runnable runnable3 = new GetTheStock(stockGrabber, 2, "GOOG", 545.6);
		
		new Thread(runnable1).start();
		new Thread(runnable2).start();
		new Thread(runnable3).start();

	}

}
