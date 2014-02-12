package com.shan.rest.controller;

import com.shan.service.MyServiceImpl;

public class MyController {
	
	public String getValue()
	{
		MyServiceImpl myServiceImpl = new MyServiceImpl();
		return myServiceImpl.getValue();
	}

}
