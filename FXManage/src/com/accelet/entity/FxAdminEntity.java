package com.accelet.entity;

import java.util.Date;

public class FxAdminEntity {

	private int sn;
	private Date createTime;//账户开通时间
	private String admin;//管理员账户
	private String pwd;//管理员密码
	private int validFlag;//是否可用 0不可用 1可用

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