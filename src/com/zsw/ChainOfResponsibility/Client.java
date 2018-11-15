package com.zsw.ChainOfResponsibility;

public class Client {
	public static void main(String[] args) {
		Leader a=new Director("张主任");
		Leader b=new Manager("李经理");
		Leader c=new Boss("王老板");
		
		// 组织责任链关系
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		// 开始请假操作
		LeaveRequest lq=new LeaveRequest("小金",33,"处理事情");
		a.handleRequest(lq);
	}
}
