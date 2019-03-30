package com.Kamal.Spring.SpringCoreSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/Spring/SpringCoreSet/setconfig.xml");
	    CarDealer carDealer=(CarDealer)ctx.getBean("cd");
	    System.out.println(carDealer.getName());
	    System.out.println(carDealer.getModels());
	    System.out.println(carDealer.getModels().getClass());
	}

}
