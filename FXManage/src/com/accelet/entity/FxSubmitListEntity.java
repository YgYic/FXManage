package com.accelet.entity;

import java.util.Date;


public class FxSubmitListEntity{

	private int sn;
	private int accountSn;//�������ĸ������˺�
	private int infoSn;//��Ϣ���ݱ��
	private String mobile;//�û��ֻ���
	private int notifyFlag;
	private int result;//���ͽ�� 0δ֪ 1�ɹ� 2ʧ��
	private String srcSn;//��Ӧ��sms_submit�е�sn��
	private int status;//״̬��0δ����1�ǻ�Ա�ѷ�����δ�ظ���2�û��ܾ��ӻ�Ա�������˶���3�ѷ���
	private Date submitTime;//�ύʱ��
	private int teleCorp;//�û��ֻ������ͣ�1�ƶ���2��ͨ��3����

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