package com.entity.cn;

public class UserExample {
	
	public String where = " 1=1 ";
	public String condition = " = ";
	
	public void whereID(String type,String value) {
		combime(" and "+type+this.condition+" '"+value+"'");
	}
	public void whereID(String type,String value,String condition) {
		combime(" and "+type+condition+" '"+value+"'");
	}
	public void whereID(String type,String value,String condition1,String condition2) {
		combime(" and "+type+condition1+" '"+value+"'");
		combime(" and "+type+condition2+" '"+value+"'");
	}
	
	public void combime(String str) {
		this.where += str;
	}
}
