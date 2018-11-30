package com.OrangeHR.Application;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
	DataVariable obj_DV =new DataVariable();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("inside the success method");
//		obj_DV.SetName("Admin");
//		obj_DV.SetPassword("admin123");
//			obj_DV.GetName();
//			obj_DV.GetPswd();
			System.out.println(obj_DV.GetName());
			System.out.println(obj_DV.GetPswd());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("inside fail");
//		obj_DV.SetName("admin123");
//		obj_DV.SetPassword("admin");
//			obj_DV.GetName();
//			obj_DV.GetPswd();
			System.out.println(obj_DV.GetName());
			System.out.println(obj_DV.GetPswd());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
