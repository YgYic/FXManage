package com.accelet.entity;

import java.util.Date;

public class FxAdminEntity {

	private int sn;
	private Date createTime;//�˻���ͨʱ��
	private String admin;//����Ա�˻�
	private String pwd;//����Ա����
	private int validFlag;//�Ƿ���� 0������ 1����

	public FxAdminEntity() {
	}
	
	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(int validFlag) {
		this.validFlag = validFlag;
	}
}