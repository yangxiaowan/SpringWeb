package com.yangwan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yangwan.beans.Person;
import com.yangwan.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/temp")
	public String login(
			@RequestParam(value="name",required=false)String name,
			@RequestParam(value="password",required=false)String password){
		System.out.println(name);
		System.out.println(password);
		return "right";
	}
	
	
	//@ModelAtrribute用来封装表单中提交的数据并直接封装到应用程序的实体类中
	@RequestMapping("check")
	public String check(@ModelAttribute("loginService")LoginService loginService){
		loginService.printLoginServiceInformation();
		return "right";
	}
	@RequestMapping("check1")
	public String check(@ModelAttribute("person")Person person){
		person.printPersonInformation();
		return "right";
	}
	//@PathVariable可以方便的获得请求url中的动态参数
	@RequestMapping(value="/checkt/{checkId}/ok/{tempId}",method = RequestMethod.GET)
	public String testParaVar(@PathVariable("checkId") int checkId,@PathVariable("tempId") int tempId){
		System.out.println("checkId:"+checkId);
		System.out.println("tempId:"+tempId);
		return "right";
	}
	
}
