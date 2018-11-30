package com.OrangeHR.Application;

public class DataVariable {
	private String strname;
	private String pswd;
	public void SetName(String value){
		//System.out.println("Value of name"+ value);
		strname = value;
		System.out.println("-----value of name"+ strname);
	
	}
	public void SetPassword(String value1){
		//System.out.println("Value of password"+ value1);
		pswd = value1;
		System.out.println("-----value of password"+ pswd);
	
	}
	public String GetName(){
		System.out.println("value of ...name"+ strname);
		return strname;
	}
	public String GetPswd(){
		System.out.println("value of ...password"+ pswd);
		return pswd;
	}

}
