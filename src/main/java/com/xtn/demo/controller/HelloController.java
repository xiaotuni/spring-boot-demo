package com.xtn.demo.controller;

import java.util.Date;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xtn.demo.models.*;
import com.xtn.demo.service.*;

/**
 * @RestController 相当于 @Controller 和 @ResponseBody两个的注解。@ResponseBody这个加到方法上。
 * @author admin
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
	
	// @Resource
	private CatService cService = new CatService();
	@Resource
	private UserInfoService uiService;// = new UserInfoService();
	
	@RequestMapping("/hello")
	public String hello() {
		return "哈哈";
		
	}
	
	@RequestMapping("/getCatInfo")
	public CatModel getCatInfo() {
		return cService.getCatInfo();
	}
	
	//
	@RequestMapping("/getAllUserInfo")
	public ResultJSON<?> getAllUserInfo() {
		return uiService.getAll();
	}
	
	@RequestMapping("/addUserInfo")
	public ResultJSON<?> addUserInfo() {
		System.out.println("--进行添加操作");
		UserInfoModel model = new UserInfoModel();
		model.setCreateDate(new Date());
		model.setIsLock(false);
		model.setPassword("xiaotuni");
		model.setUsername("xiaotuni_" + String.valueOf(new Date().getTime()));
		model.setUpdateDate(new Date());
		System.out.println("--进行添加操作1");
		return uiService.save(model);
	}
	
	@RequestMapping("/deleteUserInfoById")
	public ResultJSON<?> deleteUserInfoById(int id) {
		return uiService.delete(id);
	}
}
