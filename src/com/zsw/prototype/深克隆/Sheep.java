package com.zsw.prototype.深克隆;

import java.util.Date;

/**
 * 羊 原型模式
 * @author zhangshiwei
 *
 */
public class Sheep implements Cloneable{
	
	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj=super.clone();
		/* 添加下面代码实现深克隆 */
		Sheep s=(Sheep) obj;
		s.birthday=(Date) this.birthday.clone();//把属性也进行克隆
		
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Sheep(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public Sheep() {
	}
	
	
}
