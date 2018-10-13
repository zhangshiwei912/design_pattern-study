package com.zsw.singleton;

/**
 * 单例模式--饿汉式
 * @author zhangshiwei
 *
 */
public class SingletonHungry {
	/* 类初始化的时候就加载此对象，天然的线程安全，但是不是延时加载 */
	private static SingletonHungry instance=new  SingletonHungry();
	
	private SingletonHungry() {
		
	}
	/* 不用同步，效率高 */
	public static SingletonHungry getInstance() {
		return instance;
	} 
	
}
