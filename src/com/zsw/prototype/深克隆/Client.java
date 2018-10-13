package com.zsw.prototype.深克隆;

import java.util.Date;

/**
 * 原型模式深克隆
 * @author zhangshiwei
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Date date=new Date(327728623823L);
		Sheep s1=new Sheep("多利",date);
		Sheep s2=(Sheep) s1.clone();
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
