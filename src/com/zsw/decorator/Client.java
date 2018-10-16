package com.zsw.decorator;

public class Client {
	public static void main(String[] args) {
		ICar car=new Car();
		car.move();
		System.out.println("------------------------------");
		
		FlyCar flyCar=new FlyCar(car) ;
		flyCar.move();
		
		System.out.println("------------------------------");
		
		SwimCar swimCar=new SwimCar(car);
		swimCar.move();

		System.out.println("------------------------------");
		
		SwimCar SuperCar=new SwimCar(new FlyCar(new Car()));
		SuperCar.move();
	
	}
}
