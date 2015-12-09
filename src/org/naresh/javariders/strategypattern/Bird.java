/**
 * 
 */
package org.naresh.javariders.strategypattern;

/**
 * @author nchinthakindi
 *
 */
public class Bird extends Animal{

	public Bird()
	{
		super();
		
		setName("Teet");
		setFlyingType(new ItFlys());
	}
}
