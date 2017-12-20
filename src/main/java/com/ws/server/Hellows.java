package com.ws.server;

import javax.jws.WebService;


@WebService
public class Hellows {
	
	public String sms(String tel , String info){
		System.out.println("server:"+tel  + "--" + info);
		return "服务端返回：" + tel + ",ok";
	}

	
	
}
