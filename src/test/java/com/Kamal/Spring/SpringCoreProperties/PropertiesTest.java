package com.Kamal.Spring.SpringCoreProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext(" com/Kamal/Spring/SpringCoreProperties/propconfig.xml");
		CountriesandLanguages cnl= (CountriesandLanguages)ctx.getBean("Langcountry");
		System.out.println(cnl.getCountryAndLangs());
		System.out.println(cnl.getCountryAndLangs().getClass());


	}

}
