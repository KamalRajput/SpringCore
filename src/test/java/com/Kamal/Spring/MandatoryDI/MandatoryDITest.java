package com.Kamal.Spring.MandatoryDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MandatoryDITest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/Spring/MandatoryDI/mandatoryLifecycleconfig.xml");
		Prescription pt=(Prescription)ctx.getBean("prescription");
		System.out.println(pt);

	}

}
