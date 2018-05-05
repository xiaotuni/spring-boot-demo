package com.xtn.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xtn.demo.models.CatModel;
import com.xtn.demo.models.ResultJSON;
import com.xtn.demo.models.UserInfoModel;
import com.xtn.demo.service.CatService;
import com.xtn.demo.service.UserInfoService;

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
	
	@RequestMapping("/getAddress")
	public List<String> getAddress() {
		// String[] ip24 =
		// "43.245.201|59.18.45|59.18.46|64.233.162|114.215.82|103.7.200|89.47.210|1.255.22|180.96.70|180.96.71|202.248.151|220.255.2|61.91.18|216.58.197"
		// .split("\\|");
		// List<String> items = new ArrayList<>();
		// for (String ip : ip24) {
		// for (int i = 1; i < 255; i++) {
		// items.add(ip + "." + i);
		// }
		// }
		// return items;
		String ipAddressitem = "59.18.45.20|59.18.45.59|59.18.46.39|59.18.45.54|59.18.45.44|59.18.45.29|59.18.46.49|59.18.46.44|202.248.151.59|59.18.45.45|202.248.151.34|59.18.45.24|59.18.46.34|59.18.45.35|202.248.151.29|59.18.46.20|59.18.45.34|59.18.45.55|59.18.46.45|59.18.46.35|59.18.45.49|59.18.45.40|59.18.46.29|202.248.151.49|202.248.151.45|59.18.45.39|59.18.46.40|59.18.45.25|103.7.200.79|59.18.46.50|220.255.2.153|59.18.45.34|59.18.46.25|59.18.46.44|59.18.45.59|59.18.46.49|59.18.45.25|59.18.45.45|59.18.46.39|59.18.46.24|59.18.45.29|59.18.45.44|59.18.46.30|59.18.46.50|59.18.46.55|59.18.46.34|59.18.45.30|59.18.46.45|59.18.46.54|59.18.45.40|59.18.45.54|59.18.45.49|59.18.46.29|59.18.46.40|59.18.45.39|59.18.45.20|59.18.45.55|59.18.46.35|220.255.2.153|202.248.151.30|202.248.151.34|202.248.151.44|202.248.151.29|202.248.151.59|202.248.151.49|31.13.65.9|31.13.66.4|31.13.66.14|31.13.66.40|31.13.67.3|31.13.67.6|31.13.67.7|31.13.67.8|31.13.67.11|31.13.67.15|31.13.67.40|31.13.69.202";
		String[] items = ipAddressitem.split("\\|");
		System.out.println(items);
		return Arrays.asList(items);
	}
	
	@RequestMapping("/address")
	public String address(String qz) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i < 255; i++) {
			// String ip = "62.201.216." + i;
			String ip = qz + i;
			list.add(ip);
		}
		String a = String.join("|", list);
		// list.add(0,a);
		return a;
	}
}
