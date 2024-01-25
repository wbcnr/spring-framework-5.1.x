package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * spring测试项目的配置类
 */
@Configuration
@ComponentScan
public class ApplicationConfig {

	@Bean
	public UserBean userBean(){
		return  new UserBean("001", "userName");
	}
}
