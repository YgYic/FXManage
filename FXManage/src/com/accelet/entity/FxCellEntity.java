package com.accelet.entity;

public class FxCellEntity {

	private int sn;
	private String cellCode;
	private String circleId;
	private String inviterName;
	private int status;//״̬��0������1ֹͣʹ��
	private String userSign;
	private int userType;//�û����ͣ�1��ҵ֪ͨ��2�����칫

    public FxCellEntity() {
    }

	public int getSn() {
		return this.sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getCellCode() {
		return this.cellCode;
	}

	public void setCellCode(String cellCode) {
		this.cellCode = cellCode;
	}

	public String getCircleId() {
		return this.circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public String getInviterName() {
		return this.inviterName;
	}

	public void setInviterName(String inviterName) {
		this.inviterName = inviterName;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUserSign() {
		return this.userSign;
	}

	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}

	public int getUserType() {
		return this.userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

}