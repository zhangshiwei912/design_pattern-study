package com.zsw.factory.abstractfactory;
public interface CarFactory {
	Engine createEngine();
	Tyre createTyre();
	Seat createSeat();
}
