package com.zzxy.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	/**
	 * 测试1，后台返回参数
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/1" ,method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "url1: Hello Spring MVC Framework!");
		return "hello";
	}
	/**
	 * 测试2，可选id参数
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/2")
	public ModelAndView printId2(@RequestParam(value = "id", required = false) String id) {
		ModelAndView model = new ModelAndView("hello");
		model.addObject("message", "输入的ID为：" + id);
		return model;
	}
	
	/**
	 * 测试3，可选id参数
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/3/{id}")
	// 多参数情况：@PathVariable(value = "id")
	public ModelAndView printId3(@PathVariable String id) {
		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("message", "输入的Path ID为：" + id);
		return model;
	}
}