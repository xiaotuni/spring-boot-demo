package com.xtn.demo.models;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class ResultJSON<T> {
	private int code;
	private String msg;
	private T result;
	private Iterable<T> results;
	
	public T getResult() {
		return result;
	}
	
	public void setResult(T result) {
		this.result = result;
	}
	
	public Iterable<T> getResults() {
		return results;
	}
	
	public void setResults(Iterable<T> results) {
		this.results = results;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date currentTime;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Date getCurrentTime() {
		return currentTime;
	}
	
	public ResultJSON(int code, String msg) {
		this.code = code;
		this.msg = msg;
		this.currentTime = new Date();
	}
	
	public ResultJSON(int code, String msg, T t) {
		this.code = code;
		this.msg = msg;
		this.currentTime = new Date();
		this.result = t;
	}
	
	public ResultJSON(int code, String msg, Iterable<T> t) {
		this.code = code;
		this.msg = msg;
		this.currentTime = new Date();
		this.results = t;
	}
}
