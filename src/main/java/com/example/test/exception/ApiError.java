package com.example.test.exception;

import java.util.Date;

public class ApiError {
	private Date timestamp;
	private String msg;
	private String errorresponse;
	public  ApiError(Date timestamp, String msg, String errorrespons) {
		super();
		this.timestamp=timestamp;
		this.msg=msg;
		this.errorresponse=errorresponse;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getErrorresponse() {
		return errorresponse;
	}
	public void setErrorresponse(String errorresponse) {
		this.errorresponse = errorresponse;
	}
	
	

}
