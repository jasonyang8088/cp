package com.zxxk.zykinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ZykInitApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZykInitApplication.class, args);
	}


}
