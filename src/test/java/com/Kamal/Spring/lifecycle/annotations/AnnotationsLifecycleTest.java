package com.Kamal.Spring.lifecycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* Java annotations are disable by default, and it can be enabled using couple of ways. 
 * In this section i have enabled only @PostConstruct and @PreDestroy annotations using
 * Class CommonAnnotationBeanPostProcessor in config.xml.
 * 
 * Most recommended way is to use <context:annotation-config/> to enable all spring annotations.
 */

public class AnnotationsLifecycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/Spring/lifecycle/annotations/annotationLifecycleconfig.xml");
		Patient pt=(Patient)ctx.getBean("patient");
		System.out.println(pt);
		ctx.registerShutdownHook();
		
	}

}
