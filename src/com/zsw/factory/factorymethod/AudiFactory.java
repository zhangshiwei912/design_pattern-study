package com.zsw.factory.factorymethod;

public class AudiFactory implements CarFactory{

	@Override
	public Car getCar() {
		return new Audi();
	}

}
