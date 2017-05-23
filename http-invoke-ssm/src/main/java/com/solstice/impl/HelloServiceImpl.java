package com.solstice.impl;

import com.solstice.service.IHelloService;

public class HelloServiceImpl implements IHelloService {
   
	public String doHelloService(String name) {
    	
        return "Hello "+name + ",this is the result for your request";
    } 
} 
