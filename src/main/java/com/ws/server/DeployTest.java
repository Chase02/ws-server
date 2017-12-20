package com.ws.server;

import javax.xml.ws.Endpoint;

public class DeployTest {
	
	public static void main(String[] args) {  
        //参数1：服务地址，weather为服务的名称  
        //参数2：服务实现类  
        Endpoint.publish("http://127.0.0.1:12345/ws", new Hellows());  
    }  

}
