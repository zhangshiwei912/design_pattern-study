package com.zsw.proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		Star realStar=new RealStar();
		Star proxy=new ProxyStar(realStar);
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.collectMoney();
		
	}
}
