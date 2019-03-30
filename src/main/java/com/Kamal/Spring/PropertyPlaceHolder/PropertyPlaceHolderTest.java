package com.Kamal.Spring.PropertyPlaceHolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PropertyPlaceHolderTest {
/* using this class, we are trying to read a property from properties file.
 * for this we need to use context:property-placeholder in config file and give the
 * location to read properties file.
 * Also ,here we are reading only one value.SO we need to give the placeholder of the 
 * property that we want in constructor-arg.
 * if value is not found in props file, a beanDefinitionException will be thrown.
 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/Spring/PropertyPlaceHolder/config.xml");
		MyDAO md=(MyDAO)ctx.getBean("dao");
		System.out.println(md);
	}

}
