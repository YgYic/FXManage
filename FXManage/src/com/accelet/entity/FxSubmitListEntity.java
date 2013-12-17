package com.accelet.entity;

import java.util.Date;


public class FxSubmitListEntity{

	private int sn;
	private int accountSn;//隶属于哪个飞信账号
	private int infoSn;//信息内容编号
	private String mobile;//用户手机号
	private int notifyFlag;
	private int result;//发送结果 0未知 1成功 2失败
	private String srcSn;//对应的sms_submit中的sn串
	private int status;//状态：0未处理，1非会员已发邀请未回复，2用户拒绝加会员或者已退订，3已发送
	private Date submitTime;//提交时间
	private int teleCorp;//用户手机号类型：1移动，2联通，3电信

    public FxSubmitListEntity() {
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

	public int getInfoSn() {
		return this.infoSn;
	}

	public void setInfoSn(int infoSn) {
		this.infoSn = infoSn;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getNotifyFlag() {
		return this.notifyFlag;
	}

	public void setNotifyFlag(int notifyFlag) {
		this.notifyFlag = notifyFlag;
	}

	public int getResult() {
		return this.result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getSrcSn() {
		return this.srcSn;
	}

	public void setSrcSn(String srcSn) {
		this.srcSn = srcSn;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public int getTeleCorp() {
		return this.teleCorp;
	}

	public void setTeleCorp(int teleCorp) {
		this.teleCorp = teleCorp;
	}

}