package com.yangwan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QualifierTestBean {
	private QualifierBean twoqb;
	private QualifierBean threeqb;
	public QualifierTestBean(){
		
	}
	
	//利用两个参数的构造器自动创建QualifierBean实例
	 @Autowired
	public QualifierTestBean(@Qualifier("twoparaqualifierbean")QualifierBean twoqb){
		this.twoqb = twoqb;
	}
	 @Autowired
	public void setThreeParamQbFunction(@Qualifier("threeparaqualifierbean")QualifierBean threeqb){
		this.threeqb = threeqb;
	}
	public void printQualifierTestBeanInformation(){
		this.twoqb.printQualifierBeanInformation();
		this.threeqb.printQualifierBeanInformation();
	}
}
