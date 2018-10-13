package com.zsw.singleton.反射和反序列化破解单例.反射;

/**
 * 单例模式--懒汉式,测试反射破解单例模式
 * @author zhangshiwei
 *
 */
public class SingletonLazyTest {
	/* 类初始化的时候不加载这个对象，真正使用的时候再创建此对象，延时加载（懒加载 lazy load） */
	private static SingletonLazyTest instance=null;
	
	private SingletonLazyTest() {
		/*
		 * 添加如下代码防止被反射破解单例
		 */
		/*if(instance!=null) {
			throw new RuntimeException();
		}*/
	}
	/* 保证线程安全，方法同步，效率低 */
	public static synchronized SingletonLazyTest getInstance() {
		if(instance==null) {
			instance=new SingletonLazyTest();
		}
		return instance;
	}
	
}
