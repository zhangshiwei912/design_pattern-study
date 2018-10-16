package com.zsw.decorator;

/**
 * 具体构件角色（真实对象）concreteComponent
 * @author zhangshiwei
 *
 */
public class Car implements ICar {

	@Override
	public void move() {
		System.out.println("陆地上跑");
	}

}
