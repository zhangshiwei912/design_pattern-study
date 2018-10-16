package com.zsw.decorator;

public class SwimCar extends SuperCar{

	public SwimCar(ICar car) {
		super(car);
	}
	
	public void swim() {
		System.out.println("水上游");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}
