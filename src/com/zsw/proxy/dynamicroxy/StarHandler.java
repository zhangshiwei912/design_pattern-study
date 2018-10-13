package com.zsw.proxy.dynamicroxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 * @author zhangshiwei
 *
 */
public class StarHandler implements InvocationHandler{
	
	private Star realStar;
	
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("真实方法调用之前");
		method.invoke(realStar, args);
		System.out.println("真实方法调用之后");
		return null;
	}

}
