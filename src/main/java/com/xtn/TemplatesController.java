package com.xtn;

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
	public String hello() {
		return "helloIndex";
	}
}
