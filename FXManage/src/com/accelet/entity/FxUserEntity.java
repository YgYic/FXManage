package com.accelet.entity;

import java.util.Date;


public class FxUserEntity {

	private int sn;
	private int accountSn;//所属飞信账号
	private Date cancelTime;//用户退订时间
	private String fetionId;//接收人飞信ID
	private Date inviteTime;//发送邀请信时间
	private String inviterName;//邀请人名称
	private String mobile;//接收人手机号
	private Date replyTime;//用户回复时间
	private int status;//用户状态：0未发邀请，1已发邀请未回复，2已订阅，3拒绝订阅，4已退订

    public FxUserEntity() {
    }

	public int getSn() {
		return this.sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public int getAccountSn() {
		return this.accountSn;
	}

	public void setAccountSn(int accountSn) {
		this.accountSn = accountSn;
	}

	public Date getCancelTime() {
		return this.cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getFetionId() {
		return this.fetionId;
	}

	public void setFetionId(String fetionId) {
		this.fetionId = fetionId;
	}

	public Date getInviteTime() {
		return this.inviteTime;
	}

	public void setInviteTime(Date inviteTime) {
		this.inviteTime = inviteTime;
	}

	public String getInviterName() {
		return this.inviterName;
	}

	public void setInviterName(String inviterName) {
		this.inviterName = inviterName;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}