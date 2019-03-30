package com.Kamal.Spring.SpringCoreList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Kamal.Spring.SpringCoreList.Hospital;

public class SpringListTest {
	
	/*
	 * We can pass an empty list from config.cml by declaring the <list> tags and not having any value in between.
	 * Second : if only one element is placed in a list , then there is no need to place it in <list> tags.
	 * Spring is intelligent enough to render the single element as a String.
	 * By Default , List that is passed is taken as an arrayList.
	 * 
	 */

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext(" com/Kamal/Spring/SpringCoreList/listconfig.xml");
		Hospital hsptl= (Hospital)ctx.getBean("hospital");
		System.out.println(hsptl.getName());
		System.out.println(hsptl.getDepartments());
		System.out.println(hsptl.getDepartments().getClass());
	}

}
