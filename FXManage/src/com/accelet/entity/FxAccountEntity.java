package com.accelet.entity;

import java.util.Date;

public class FxAccountEntity {

	private int sn;
	private Date createTime;//�����˻���ͨʱ��
	private int freeSmsLimit;//�����˻���Ѷ������ޣ�ÿ�죩
	private String fxAdmin;//���ŵ�½�˺�
	private String fxPwd;//���ŵ�¼����
	private int onlineFlag;//0 ������ 1����
	private int simcardType;//simcard���ͣ���¼simcard����ͨ�Ź�˾�����������ÿ���ʷѵ�
	private int status;//�����˻�״̬��0δ��ͨ��1�ѿ�ͨ
	private int threadNo;//�鼸���̴߳���
	private int userLimit;//�����˻�ͨ��¼����
	private int userType;//�û����ͣ�1��ҵ֪ͨ��2�����칫

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