package com.zsw.prototype.浅克隆;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 原型模式浅克隆
 * @author zhangshiwei
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Date date=new Date(327728623823L);
		List list=new ArrayList<>();
		String name="多利";
		list.add("aa");
		list.add("bb");
		Sheep s1=new Sheep(name,date,list);
		Sheep s2=(Sheep) s1.clone();
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());//Wed May 21 11:43:43 CST 1980
		System.out.println(s2.getBirthday());//Wed May 21 11:43:43 CST 1980
		System.out.println(s1.getName()==s2.getName());
		System.out.println(s1.getBirthday()==s2.getBirthday());//true 对于引用类型，引用的是同一个对象，称之为浅克隆
		System.out.println(s1.getFriends());
		
		//1.setName(name);
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		list.add("cc");
		date.setTime(6257387263L);//s1的引用类型属性发生变化后，s2的属性也发生变化
		System.out.println(s1.getBirthday());//Sat Mar 14 18:09:47 CST 1970
		System.out.println(s2.getBirthday());//Sat Mar 14 18:09:47 CST 1970
		System.out.println(s1.getFriends());
		System.out.println(s1.getBirthday()==s2.getBirthday());
		System.out.println("----------------------");
		System.out.println(s2);
		System.out.println(s2.getFriends());
		
	}
}
