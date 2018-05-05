package com.xtn;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templates")
public class TemplatesController {
	
	/**
	 * 映射地址是： /templates/hello
	 * 
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(Map<String, Object> map) {
		// 正常返回应该是一个ModelAndView model = new ModelAndView("HELLO");
		// return model;
		map.put("name", "xiaotuni");
		return "helloIndex";
	}
}
