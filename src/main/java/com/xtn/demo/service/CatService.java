package com.xtn.demo.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtn.demo.models.CatModel;

//@Service
public class CatService {

	@Resource
	private CatModel catModel;

	public CatModel getCatInfo() {
		catModel = new CatModel();
		catModel.setContent("这是内容信息111");
		catModel.setTitle("这是标题啦");
		catModel.setId(1);
		catModel.setName("名字啦");
		catModel.setCreateTime(new Date());
		return catModel;
	}
}
