package com.rose.dao;

import java.util.Date;

import com.google.common.base.Throwables;
import com.rose.entity.RoseLog;
import com.rose.spring.ApplicationContextUtil;

/**
 * 数据库日志记录
 *
 * @author echo
 */
public class LogUtil {
	
	/**
	 * 日志记录
	 * 
	 * @param source
	 * @param content
	 * @param action
	 */
	public static void info(String source, String content, String action){
		LogDao logDao = ApplicationContextUtil.getBean(LogDao.class);
		RoseLog roseLog = new RoseLog();
		roseLog.setAction(action);
		roseLog.setActTime(new Date());
		roseLog.setLog(content);
		roseLog.setSource(source);
		roseLog.setThreadId(Thread.currentThread().getName() + "_" + Thread.currentThread().getId());
		logDao.save(roseLog);
	}
	
	public static void error(String source, String content, String action, String errorMsg){
		LogDao logDao = ApplicationContextUtil.getBean(LogDao.class);
		RoseLog roseLog = new RoseLog();
		roseLog.setAction(action);
		roseLog.setActTime(new Date());
		roseLog.setLog(content);
		roseLog.setSource(source);
		roseLog.setExceptionMsg(errorMsg);
		roseLog.setThreadId(Thread.currentThread().getName() + "_" + Thread.currentThread().getId());
		logDao.save(roseLog);
	}
	
	public static void error(String source, String content, String action, Throwable e){
		LogDao logDao = ApplicationContextUtil.getBean(LogDao.class);
		RoseLog roseLog = new RoseLog();
		roseLog.setAction(action);
		roseLog.setActTime(new Date());
		roseLog.setLog(content);
		roseLog.setSource(source);
		roseLog.setExceptionMsg(Throwables.getStackTraceAsString(e));
		roseLog.setThreadId(Thread.currentThread().getName() + "_" + Thread.currentThread().getId());
		logDao.save(roseLog);
	}
	
}
