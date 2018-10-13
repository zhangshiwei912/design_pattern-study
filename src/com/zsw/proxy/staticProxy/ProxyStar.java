package com.zsw.proxy.staticProxy;
/**
 * 代理角色
 * @author zhangshiwei
 *
 */
public class ProxyStar implements Star {
	
	private Star realSatr;
	
	public ProxyStar(Star realSatr) {
		super();
		this.realSatr = realSatr;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	@Override
	public void sing() {
		realSatr.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

}
