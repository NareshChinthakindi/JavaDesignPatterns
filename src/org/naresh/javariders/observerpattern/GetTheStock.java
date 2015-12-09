/**
 * 
 */
package org.naresh.javariders.observerpattern;

import java.text.DecimalFormat;

/**
 * @author nchinthakindi
 *
 */
public class GetTheStock implements Runnable{

	
	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	
	public GetTheStock(Subject stockGrabber,int newStartTime,String stock,double price)
	{
		this.stockGrabber = stockGrabber;
		this.startTime = newStartTime;
		this.price = price;
		this.stock = stock;
	}
	
	@Override
	public void run() 
	{
		for(int i = 0; i<=20;i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ex){}
			
			double randomNum = (Math.random()*(.06))-.03;
			
			DecimalFormat df = new DecimalFormat("#.##");
			
			price = Double.valueOf(df.format(price+randomNum));
			
			if(stock == "IBM") ((StockGrabber)stockGrabber).setIbmPrice(price);
			if(stock == "APPL") ((StockGrabber)stockGrabber).setApplPrice(price);
			if(stock == "GOOG") ((StockGrabber)stockGrabber).setGoogPrice(price);
			
			System.out.println("-----------------------------");
				
		}
		
	}

}
