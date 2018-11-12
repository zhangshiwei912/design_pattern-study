package com.zsw.ChainOfResponsibility;
/**
 * 经理
 * @author zhangshiwei
 *
 */
public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getDays()<10) {
			System.out.println("员工"+leaveRequest.getName()+"请假"+leaveRequest.getDays()+"天，原因"+leaveRequest.getReason());
			System.out.println("经理"+this.name+"审批通过");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}

}
