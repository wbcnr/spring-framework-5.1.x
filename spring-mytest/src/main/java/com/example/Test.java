package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("spring5.1.x测试类");
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		UserBean userBean = (UserBean)context.getBean("userBean");
		System.out.println(userBean);
	}
}
