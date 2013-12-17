package com.accelet.entity;

import java.util.Date;

public class FxSubmitInfoEntity{

	private int sn;
	private String cellCode;
	private String circleId;
	private String content;//¶ÌÐÅÄÚÈÝ
	private Date insertTime;

    public FxSubmitInfoEntity() {
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

}