/**
 * 
 */
package org.naresh.javariders.strategypattern;

/**
 * @author nchinthakindi
 *
 */
public class WorkWithAnimals {

	public static void main(String [] args)
	{
		Animal animal = new Dog();
		
		System.out.println(animal.tryToFly());
		
		Animal animal3 = new Bird();
		
		System.out.println(animal3.tryToFly());
	}
}
