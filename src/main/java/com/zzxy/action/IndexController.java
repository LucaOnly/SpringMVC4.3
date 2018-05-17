package com.zzxy.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private static Logger log = Logger.getLogger(IndexController.class.getClass());
	/**
	 * 保存用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/")
	public String addUser(ModelMap model, HttpServletRequest request, HttpServletResponse respone) {
		log.info("首界面请求，ctx:" + request.getContextPath());
		return "index";
	}

}