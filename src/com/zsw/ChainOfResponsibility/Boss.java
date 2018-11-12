package com.zsw.ChainOfResponsibility;
/**
 * 老板
 * @author zhangshiwei
 *
 */
public class Boss extends Leader{

	public Boss(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getDays()<30) {
			System.out.println("员工"+leaveRequest.getName()+"请假"+leaveRequest.getDays()+"天，原因"+leaveRequest.getReason());
			System.out.println("老板"+this.name+"审批通过");
		}else {
			System.out.println("请假时间太长不通过");
		}
	}

}
