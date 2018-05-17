package com.zzxy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
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
	public String addUser(ModelMap model, @ModelAttribute("form") User user, HttpServletRequest request, HttpServletResponse respone) {
//		测试配置文件后台获取
//		String errorMessage = MessageSourceHelper.getMessage("welcome", new Object[] { "sucess" },
//				"不能找到配置!", request.getLocale());
//		System.out.println(errorMessage);
		return "addUser";
	}

	/**
	 * 保存用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/save")
	public String saveUser(ModelMap model, @ModelAttribute("form") @Valid User user, Errors errors) {
		if (errors.hasErrors()) {
			return "addUser";
		}
		model.addAttribute("user", user);
		return "showUser";
	}
}