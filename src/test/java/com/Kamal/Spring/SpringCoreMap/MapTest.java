package com.Kamal.Spring.SpringCoreMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MapTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext(" com/Kamal/Spring/SpringCoreMap/mapconfig.xml");
		Customer cust= (Customer)ctx.getBean("customer");
		System.out.println(cust.getId());
		System.out.println(cust.getProducts());
		System.out.println(cust.getProducts().getClass());
	}

	}


