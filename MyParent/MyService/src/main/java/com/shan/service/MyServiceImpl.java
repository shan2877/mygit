package com.shan.service;

/**
 * Author Shanmuga Sundaram Added hello
 */

import com.shan.common.util.*;
public class MyServiceImpl {
	
	public String getValue()
	{
		MyUtil myUtil= new MyUtil();
		return myUtil.getValue();
	}

}

