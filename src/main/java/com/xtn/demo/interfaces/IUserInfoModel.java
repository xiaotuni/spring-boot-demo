package com.xtn.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.xtn.demo.models.UserInfoModel;

public interface IUserInfoModel extends CrudRepository<UserInfoModel, Integer> {
	
}
