package com.zxxk.zyglpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.zxxk.zyglpt.util.ServerConfig;

@SpringBootApplication
@EnableConfigurationProperties({ServerConfig.class})
public class Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
