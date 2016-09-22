package com.zxxk.zyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@RibbonClient("apis")
public class ZykApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZykApplication.class, args);
	}


}
