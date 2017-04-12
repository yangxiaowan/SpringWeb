package com.yangwan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangwan.beans.SolutionBean;

@Service("login")
public class LoginService {
	private String name;
	private String password;
	@Autowired
	private SolutionBean temp;
	public LoginService(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
	}
	public LoginService(String name,String password){
		System.out.println("******************************");
		this.name = name;
		this.password = password;
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
	public void printLoginServiceInformation(){
		System.out.println("Controller --- > Service ");
		System.out.println("name :"+name+"\npassword: "+password);
		temp.printSolutionInformation();
	}
}
