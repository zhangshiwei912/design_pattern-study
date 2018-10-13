package com.zsw.adapter;

/**
 * 客户端类
 * @author zhangshiwei
 *
 */
public class Client {

	public void test1(Target t) {
		t.reqHandle();
	}
	public static void main(String[] args) {
		Client c=new Client();
		Adaptee adaptee=new Adaptee();
		//Target t=new Adapter1();
		Target t=new Adapter2(adaptee);
		c.test1(t);
	}
}
