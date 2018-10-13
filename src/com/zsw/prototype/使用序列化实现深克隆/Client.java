package com.zsw.prototype.使用序列化实现深克隆;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式 使用序列化与反序列化实现深克隆
 * @author zhangshiwei
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Date date=new Date(327728623823L);
		Sheep s1=new Sheep("多利",date);
		/* 使用序列化与反序列化实现深克隆 */
		//1.序列化
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] byteArray = bos.toByteArray();
		//2.反序列化
		ByteArrayInputStream bis=new ByteArrayInputStream(byteArray);
		ObjectInputStream ois=new ObjectInputStream(bis);
		Sheep s2=(Sheep) ois.readObject();
		
		System.out.println(s1);
		System.out.println(s1.getBirthday());//Wed May 21 11:43:43 CST 1980
		System.out.println(s2.getBirthday());//Wed May 21 11:43:43 CST 1980
		System.out.println(s1.getBirthday()==s2.getBirthday());//false 对于引用类型，引用的是不同对象，称之为深克隆
		date.setTime(6257387263L);//S1的属性变化后S2的属性还是保持最初克隆的值
		System.out.println(s1.getBirthday());//Sat Mar 14 18:09:47 CST 1970
		System.out.println(s2.getBirthday());//Wed May 21 11:43:43 CST 1980
		System.out.println("----------------------");
		System.out.println(s2);
		
	}
}
