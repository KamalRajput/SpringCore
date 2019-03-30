package com.Kamal.Spring.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee)ctx.getBean("emp");
		System.out.println("Employee Id:"+ emp.getId()+ " , Employee Name :"+emp.getName());
		
	}

}
