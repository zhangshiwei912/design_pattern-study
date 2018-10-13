package com.zsw.bridge;

/**
 * 电脑类
 * @author zhangshiwei
 *
 */
public class Computer {
	protected Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	public void sale() {
		brand.sale();
	}
}

/**
 * 台式电脑
 * @author zhangshiwei
 *
 */
class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式电脑");
	}
}
/**
 * 笔记本电脑
 * @author zhangshiwei
 *
 */
class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售笔记本电脑");
	}
}