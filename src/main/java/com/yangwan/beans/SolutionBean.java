package com.yangwan.beans;

public class SolutionBean {
	private String name;
	private int id;
	public SolutionBean(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void printSolutionInformation(){
		System.out.println("name :"+name+" id: "+id);
	}
}
