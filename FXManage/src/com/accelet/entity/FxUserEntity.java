package com.accelet.entity;

import java.util.Date;


public class FxUserEntity {

	private int sn;
	private int accountSn;//���������˺�
	private Date cancelTime;//�û��˶�ʱ��
	private String fetionId;//�����˷���ID
	private Date inviteTime;//����������ʱ��
	private String inviterName;//����������
	private String mobile;//�������ֻ���
	private Date replyTime;//�û��ظ�ʱ��
	private int status;//�û�״̬��0δ�����룬1�ѷ�����δ�ظ���2�Ѷ��ģ�3�ܾ����ģ�4���˶�

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