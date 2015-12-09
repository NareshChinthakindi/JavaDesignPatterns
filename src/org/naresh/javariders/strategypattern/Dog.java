package org.naresh.javariders.strategypattern;

public class Dog extends Animal{
	
	public void digHole()
	{
		System.out.println("Dug a hole");
	}

	public Dog()
	{
		super();
		setSound("Bark");
		setFlyingType(new ItCanntFly());
	}
}
