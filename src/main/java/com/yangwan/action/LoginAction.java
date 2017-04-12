package com.yangwan.action;

import com.yangwan.service.LoginService;
import javax.annotation.Resource;

public class LoginAction {
	@Resource(name = "loginservice")
	private LoginService loginService;
	private String name;
	private String password;
	public LoginAction(){
		
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void printLoginActionInformation(){
		System.out.println("name: "+name+"\npassword: "+password);
		System.out.println("loginservice:-------->");
		loginService.printLoginServiceInformation();
	}
}
