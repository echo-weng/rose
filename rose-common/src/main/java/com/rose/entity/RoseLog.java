package com.rose.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_rose_log")
public class RoseLog{
	
	@Id
	@GeneratedValue
	protected Long id;
	
	//执行时间
	@Column(name = "act_time")
	private Date actTime; 
	
	//动作
	@Column
	private String action;
	
	//日志
	@Column
	private String log;
	
	//异常信息
	@Column(name = "exception_msg")
	private String exceptionMsg;
	
	//线程id
	@Column
	private String threadId;
	
	@Column(name = "ota_code")
	private String source;

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getActTime() {
		return actTime;
	}

	public void setActTime(Date actTime) {
		this.actTime = actTime;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getThreadId() {
		return threadId;
	}

	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
