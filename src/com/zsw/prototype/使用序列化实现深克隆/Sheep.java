package com.zsw.prototype.使用序列化实现深克隆;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 羊 原型模式
 * @author zhangshiwei
 *
 */
public class Sheep implements Cloneable,Serializable{
	
	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj=super.clone();
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
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public Sheep() {
	}
	
	
}
