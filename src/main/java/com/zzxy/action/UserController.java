package com.zzxy.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zzxy.po.User;

@Controller
@RequestMapping("/user")
public class UserController {
	/**
	 * 保存用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("")
	public String addUser(ModelMap model) {
		return "addUser";
	}
	/**
	 * 保存用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/save")
	public String saveUser(ModelMap model, @ModelAttribute("form") User user) {
		model.addAttribute("user", user);
		return "showUser";
	}
}