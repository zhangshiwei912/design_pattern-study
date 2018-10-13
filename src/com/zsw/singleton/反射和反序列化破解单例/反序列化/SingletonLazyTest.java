package com.zsw.singleton.反射和反序列化破解单例.反序列化;

import java.io.Serializable;

/**
 * 单例模式--懒汉式,测试反序列化破解单例模式
 * @author zhangshiwei
 *
 */
public class SingletonLazyTest implements Serializable{
	/* 类初始化的时候不加载这个对象，真正使用的时候再创建此对象，延时加载（懒加载 lazy load） */
	private static SingletonLazyTest instance=null;
	
	private SingletonLazyTest() {
	}
	/* 保证线程安全，方法同步，效率低 */
	public static synchronized SingletonLazyTest getInstance() {
		if(instance==null) {
			instance=new SingletonLazyTest();
		}
		return instance;
	}
	/**
	 * 反序列化时，如果定义了readResolve()方法，则直接返回该方法指定的对象，而不需要再单独创建新的对象
	 * @return
	 */
	public Object readResolve() {
		return instance;
	}
}
