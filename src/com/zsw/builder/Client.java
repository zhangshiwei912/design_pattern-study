package com.zsw.builder;

/**
 * 客户端
 * @author zhangshiwei
 *
 */
public class Client {

	public static void main(String[] args) {
		AirshipDirector zswAirshipDirector=new ZswAirshipDirector(new ZswAirshipBuilder());
		Airship airship = zswAirshipDirector.createAirship();
		System.out.println(airship.getEscapeTower().getName());
		airship.luanch();
	}
}
