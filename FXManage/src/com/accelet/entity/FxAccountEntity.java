package com.accelet.entity;

import java.util.Date;

public class FxAccountEntity {

	private int sn;
	private Date createTime;//飞信账户开通时间
	private int freeSmsLimit;//飞信账户免费短信上限（每天）
	private String fxAdmin;//飞信登陆账号
	private String fxPwd;//飞信登录密码
	private int onlineFlag;//0 不在线 1在线
	private int simcardType;//simcard类型：记录simcard所属通信公司、购买地区、每月资费等
	private int status;//飞信账户状态：0未开通，1已开通
	private int threadNo;//归几号线程处理
	private int userLimit;//飞信账户通信录上限
	private int userType;//用户类型：1企业通知，2政府办公

	public FxAccountEntity() {
	}

	public int getSn() {
		return this.sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getFreeSmsLimit() {
		return this.freeSmsLimit;
	}

	public void setFreeSmsLimit(int freeSmsLimit) {
		this.freeSmsLimit = freeSmsLimit;
	}

	public String getFxAdmin() {
		return this.fxAdmin;
	}

	public void setFxAdmin(String fxAdmin) {
		this.fxAdmin = fxAdmin;
	}

	public String getFxPwd() {
		return this.fxPwd;
	}

	public void setFxPwd(String fxPwd) {
		this.fxPwd = fxPwd;
	}

	public int getOnlineFlag() {
		return this.onlineFlag;
	}

	public void setOnlineFlag(int onlineFlag) {
		this.onlineFlag = onlineFlag;
	}

	public int getSimcardType() {
		return this.simcardType;
	}

	public void setSimcardType(int simcardType) {
		this.simcardType = simcardType;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getThreadNo() {
		return this.threadNo;
	}

	public void setThreadNo(int threadNo) {
		this.threadNo = threadNo;
	}

	public int getUserLimit() {
		return this.userLimit;
	}

	public void setUserLimit(int userLimit) {
		this.userLimit = userLimit;
	}

	public int getUserType() {
		return this.userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

}