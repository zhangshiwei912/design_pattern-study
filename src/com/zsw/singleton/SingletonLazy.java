package com.zsw.singleton;

/**
 * 单例模式--懒汉式
 * @author zhangshiwei
 *
 */
public class SingletonLazy {
	/* 类初始化的时候不加载这个对象，真正使用的时候再创建此对象，延时加载（懒加载 lazy load） */
	private static SingletonLazy instance=null;
	
	private SingletonLazy() {
		
	}
	/* 保证线程安全，方法同步，效率低 */
	public static synchronized SingletonLazy getInstance() {
		if(instance==null) {
			instance=new SingletonLazy();
		}
		return instance;
	}
	
}
