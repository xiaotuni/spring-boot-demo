package com.xtn.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtn.demo.models.ResultJSON;

/*************
 * 1、新建一个class 2、这里 在class 上添加注释,@ControllerAdvice 3、在class中添加一个方法
 * 4、在方法上添加ExceptionHandler拦截相应的异常信息 5、如果返回的是View，方法的返回信息值是ModelAndView 6、如果返回的是
 * String或Json数据，那么需求在方法上加@ResponseBody注解
 *
 * @author admin
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResultJSON<Exception> DefaultExceptionHandler(HttpServletRequest request, Exception ex) {
		return new ResultJSON<Exception>(500, ex.getMessage(), ex);
	}
}
