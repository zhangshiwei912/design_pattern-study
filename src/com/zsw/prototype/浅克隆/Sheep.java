package com.zsw.prototype.浅克隆;

import java.util.Date;
import java.util.List;

/**
 * 羊 原型模式
 * @author zhangshiwei
 *
 */
public class Sheep implements Cloneable{
	
	private String name;
	private Date birthday;
	private List friends;
	
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

	public List getFriends() {
		return friends;
	}

	public void setFriends(List friends) {
		this.friends = friends;
	}

	
	

	public Sheep(String name, Date birthday, List friends) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.friends = friends;
	}

	public Sheep() {
	}
	
	
}
