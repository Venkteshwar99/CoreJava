package com.springcore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String [] args)
	{
		context = new ClassPathXmlApplicationContext("com/springcore/Collections/collectioncofig.xml");
	Employee emp1=(Employee)context.getBean("emp1");
	
	System.out.println(emp1.getName());
	System.out.println(emp1.getPhones());
	System.out.println(emp1.getAddresses());
	System.out.println(emp1.getCourses());
	}
}
