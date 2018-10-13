package com.zsw.factory.abstractfactory;

public class LuxuryCarFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}

}
