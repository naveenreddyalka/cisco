package com.exercise.cisco.domain.models.response;

import java.io.Serializable;
import java.util.Date;

import com.exercise.cisco.domain.constants.Status;



public class BaseResponse implements Serializable{
	

	private static final long serialVersionUID = 369877237856110092L;
	private Date requestDateTime;
	private Date responseDateTime;
	private Status status;
	
	public Date getRequestDateTime() {
		return requestDateTime;
	}
	public void setRequestDateTime(Date requestDateTime) {
		this.requestDateTime = requestDateTime;
	}
	public Date getResponseDateTime() {
		return responseDateTime;
	}
	public void setResponseDateTime(Date responseDateTime) {
		this.responseDateTime = responseDateTime;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
