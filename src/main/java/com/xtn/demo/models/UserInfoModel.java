package com.xtn.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserInfoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private Date CreateDate;
	private Date UpdateDate;
	private Boolean isLock;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getCreateDate() {
		return CreateDate;
	}
	
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
	public Date getUpdateDate() {
		return UpdateDate;
	}
	
	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}
	
	public Boolean getIsLock() {
		return isLock;
	}
	
	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}
	
}
