package com.Kamal.Spring.lifecycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Kamal.Spring.lifecycle.xml.Patient;

public class XmlLifecycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/Spring/lifecycle/xml/xmlLifecycleconfig.xml");
		Patient pt=(Patient)ctx.getBean("patient");
		System.out.println(pt);
		ctx.registerShutdownHook();

	}

}
