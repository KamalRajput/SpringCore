package com.Kamal.Spring.lifecyclesinterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Kamal.Spring.lifecycle.interfaces.Patient;

public class interfaceLifecycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/Spring/lifecycle/interfaces/interfaceLifecycleconfig.xml");
		Patient pt=(Patient)ctx.getBean("patient");
		System.out.println(pt);
		ctx.registerShutdownHook();
	}

}
