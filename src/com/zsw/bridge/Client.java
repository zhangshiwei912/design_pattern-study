package com.zsw.bridge;

public class Client {
	public static void main(String[] args) {
		Computer c1=new Desktop(new Lenovo());
		c1.sale();
		Computer c2=new Laptop(new Dell());
		c2.sale();
	}
}
