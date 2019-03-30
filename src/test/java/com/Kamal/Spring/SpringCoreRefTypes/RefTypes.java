package com.Kamal.Spring.SpringCoreRefTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTypes {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/Kamal/Spring/SpringCoreRefTypes/reftypesconfig.xml");
		Student std=(Student)ctx.getBean("student");
		System.out.println(std.getScores().toString());
	
	}

}
