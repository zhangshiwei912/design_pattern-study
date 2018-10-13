package com.zsw.singleton;

/**
 * 单例模式--静态内部类
 * @author zhangshiwei
 *
 */
public class SingletonStaticInnerClass {
	
	/* 线程安全  不用同步效率高  可以延时加载  */
	private static class StaticInnerClass {
		private static final SingletonStaticInnerClass instance=new SingletonStaticInnerClass();
	}
	private SingletonStaticInnerClass() {
		
	}
	
	public static SingletonStaticInnerClass getInstance() {
		return StaticInnerClass.instance;
	}
}
