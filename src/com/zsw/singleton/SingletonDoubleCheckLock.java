package com.zsw.singleton;

/**
 * 单例模式--双重检查锁
 * @author zhangshiwei
 *
 */
public class SingletonDoubleCheckLock {
	/* 使用了volatile关键字后，重排序被禁止，所有的写（write）操作都将发生在读（read）操作之前。 */
	private volatile static SingletonDoubleCheckLock instance=null;
	
	private SingletonDoubleCheckLock() {
		
	}
	
	public static SingletonDoubleCheckLock getInstance() {
		if(null==instance) {
			synchronized (SingletonDoubleCheckLock.class) {
				if(null==instance) {
					instance=new SingletonDoubleCheckLock();	
				}
			}
		}
		return instance;
	}
}
