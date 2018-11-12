package com.zsw.ChainOfResponsibility;

/**
 * 请假请求
 * @author zhangshiwei
 *
 */
public class LeaveRequest {
	private String name;
	private int days;
	private String reason;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LeaveRequest(String name, int days, String reason) {
		super();
		this.name = name;
		this.days = days;
		this.reason = reason;
	}
	
}
