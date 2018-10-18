package com.zsw.facade;
/**
 * 外观模式门面构件角色
 * @author zhangshiwei
 *
 */
public class FacadeRegister {
	public void register() {
		Bank bank=new JianSheBank();
		bank.kaihu();
		Check check=new ShenHeCheck();
		check.shenhe();
		Gov gov=new ZhuCeGov();
		gov.zhuce();
	}
}
