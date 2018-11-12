package com.zsw.ChainOfResponsibility;
/**
 * 主任
 * @author zhangshiwei
 *
 */
public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getDays()<3) {
			System.out.println("员工"+leaveRequest.getName()+"请假"+leaveRequest.getDays()+"天，原因"+leaveRequest.getReason());
			System.out.println("主任"+this.name+"审批通过");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}

}
