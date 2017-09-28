package com.xtn.demo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.xtn.demo.interfaces.IUserInfoModel;
import com.xtn.demo.models.*;

@Service
public class UserInfoService {
	
	@Resource
	private IUserInfoModel iUserInfo;
	
	// public UserInfoModel getUserInfo(String name) {
	// iUserInfo.
	// }
	@Transactional
	public ResultJSON<Object> save(UserInfoModel model) {
		iUserInfo.save(model);
		System.out.println("保存操作完成");
		return new ResultJSON<Object>(200, "保存成功");
	}
	
	@Transactional
	public ResultJSON<Object> delete(int id) {
		iUserInfo.delete(id);
		return new ResultJSON<Object>(200, "删除成功");
	}
	
	@Transactional
	public ResultJSON<UserInfoModel> getAll() {
		return new ResultJSON<UserInfoModel>(200, "", iUserInfo.findAll());
	}
	//
	// @Transactional
	// public void save(UserInfoModel model) {
	// iUserInfo.save(model);
	// }
}
