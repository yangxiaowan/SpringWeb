package com.yangwan.beans;

public class QualifierBean {
	private String idstr;
	private int value;
	private String defaultFlag = "默认标识";
	public QualifierBean(){
		
	}
	public QualifierBean(String idstr, int value){
		this.idstr = idstr;
		this.value = value;
	}
	public QualifierBean(String idstr,int value,String defaultFlag){
		this.idstr = idstr;
		this.value = value;
		this.defaultFlag = defaultFlag;
	}
	public String getIdstr() {
		return idstr;
	}

	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void printQualifierBeanInformation(){
		System.out.println(this);
		System.out.println("idstr: "+this.idstr+"\nvalue: "+
					this.value+"\ndefaultFlag: "+this.defaultFlag);
	}
}
