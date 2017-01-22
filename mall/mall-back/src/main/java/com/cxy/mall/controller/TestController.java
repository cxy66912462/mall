package com.cxy.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cxy.mall.bean.User;
import com.cxy.mall.service.UserService;

@Controller
public class TestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("index")
	public String test(){
		return "success";
	}
	
	
	@RequestMapping("list")
	public String testSelect(){
		List<User> list = userService.selectUser();
		System.out.println(list);
		return "success";
	}
}
