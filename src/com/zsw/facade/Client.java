package com.zsw.facade;

public class Client {
	public static void main(String[] args) {
		/* 不使用外观模式 */
		Bank bank=new JianSheBank();
		bank.kaihu();
		Check check=new ShenHeCheck();
		check.shenhe();
		Gov gov=new ZhuCeGov();
		gov.zhuce();
		
		System.out.println("--------------------");
		
		/* 使用外观模式 */
		new FacadeRegister().register();
	}
}
