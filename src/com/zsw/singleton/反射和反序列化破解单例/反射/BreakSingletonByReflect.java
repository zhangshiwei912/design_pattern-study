package com.zsw.singleton.反射和反序列化破解单例.反射;

import java.lang.reflect.Constructor;

/**
 * 使用反射破解单例模式
 * @author zhangshiwei
 *
 */
public class BreakSingletonByReflect {
	public static void main(String[] args) {
		SingletonLazyTest instance1=SingletonLazyTest.getInstance();
		SingletonLazyTest instance2=SingletonLazyTest.getInstance();
		System.out.println(instance1);//com.zsw.singleton.反射和反序列化破解单例.反射.SingletonLazyTest@33909752
		System.out.println(instance2);//com.zsw.singleton.反射和反序列化破解单例.反射.SingletonLazyTest@33909752
		try {
			/* 通过反射调用私有构造器构建多个对象 */
			Class<SingletonLazyTest> clz = (Class<SingletonLazyTest>) Class.forName("com.zsw.singleton.反射和反序列化破解单例.反射.SingletonLazyTest");
			Constructor<SingletonLazyTest> constructor = clz.getDeclaredConstructor(null);
			constructor.setAccessible(true);
			SingletonLazyTest instance3 = constructor.newInstance();
			SingletonLazyTest instance4 = constructor.newInstance();
			System.out.println(instance3);//com.zsw.singleton.反射和反序列化破解单例.反射.SingletonLazyTest@55f96302
			System.out.println(instance4);//com.zsw.singleton.反射和反序列化破解单例.反射.SingletonLazyTest@3d4eac69
			/*
			 * instance3 instance4和instance1、2的值不同，说明获取了新的对象，表示单例被破解
			 */
			/*
			 * 在单例的类构造方法中添加如下代码，防止被反射破解
			 * private SingletonLazyTest() {
			 *		if(instance!=null) {
			 *			throw new RuntimeException();
			 *		}
			 *	}
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
