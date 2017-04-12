package com.yangwan.beans;

import org.springframework.stereotype.Service;

@Service
public class Person {
	private String name;
	private String password;
	private SolutionBean sb;
	public Person(){
		
	}
	public SolutionBean getSb() {
		return sb;
	}
	public void setSb(SolutionBean sb) {
		this.sb = sb;
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
	public void printPersonInformation(){
		System.out.println("Hello Person Beas");
		System.out.println("username: "+name+"\npassword:"+password);
		System.out.println(sb.getName());
	}
}
