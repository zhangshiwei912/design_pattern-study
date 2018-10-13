package com.zsw.singleton.反射和反序列化破解单例.反序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 使用反序列化破解单例模式
 * @author zhangshiwei
 *
 */
public class BreakSingletonByDeserialization {
	public static void main(String[] args) {
		SingletonLazyTest instance1=SingletonLazyTest.getInstance();
		SingletonLazyTest instance2=SingletonLazyTest.getInstance();
		System.out.println(instance1);//com.zsw.singleton.反射和反序列化破解单例.反序列化.SingletonLazyTest@33909752
		System.out.println(instance2);//com.zsw.singleton.反射和反序列化破解单例.反序列化.SingletonLazyTest@33909752
		try {
			/* 通过反序列化构建多个对象 */
			FileOutputStream fos=new FileOutputStream("/Users/zhangshiwei/Documents/test.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(instance1);
			oos.close();
			fos.close();
			
			FileInputStream fis=new FileInputStream("/Users/zhangshiwei/Documents/test.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			SingletonLazyTest instance3=(SingletonLazyTest) ois.readObject();
			ois.close();
			fis.close();
			System.out.println(instance3);//com.zsw.singleton.反射和反序列化破解单例.反序列化.SingletonLazyTest@682a0b20
			/*
			 * instance3 和instance1、2的值不同，说明获取了新的对象，表示单例被破解
			 */
			/*
			 * 在单例的类中添加如下代码，防止被反序列化破解
			 * public Object readResolve() {
			 *		return instance;
			 * }
			 * 
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
