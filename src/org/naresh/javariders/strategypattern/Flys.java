package org.naresh.javariders.strategypattern;

public interface Flys {

	String fly();
}

class ItFlys implements Flys
{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Flying High";
	}
	
}

class ItCanntFly implements Flys
{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I cann't fly";
	}
	
}
