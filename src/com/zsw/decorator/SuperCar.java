package com.zsw.decorator;

/**
 * 装饰器角色(Decorator)
 * @author zhangshiwei
 *
 */
public class SuperCar implements ICar{

	protected ICar car;
	
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}


	@Override
	public void move() {
		car.move();
	}

}
