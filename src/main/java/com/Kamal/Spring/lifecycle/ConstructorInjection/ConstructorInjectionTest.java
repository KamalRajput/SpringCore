package com.Kamal.Spring.lifecycle.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/Spring/lifecycle/ConstructorInjection/config.xml");
		Employee e=(Employee)ctx.getBean("employee");
		System.out.println(e);


	}

}
