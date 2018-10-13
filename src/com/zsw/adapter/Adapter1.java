package com.zsw.adapter;

/**
 * 适配器--类适配器方式
 * @author zhangshiwei
 *
 */
public class Adapter1 extends Adaptee implements Target {

	@Override
	public void reqHandle() {
		super.request();
	}

}
