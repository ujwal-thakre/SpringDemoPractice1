package com.demo.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.factory.PrintableFactory;

public class Test {

	public static void main(String[] args) {
		/*
		 * Resource resource = new ClassPathResource("applicationContext.xml");
		 * BeanFactory beanFactory = new XmlBeanFactory(resource); Student s =
		 * (Student) beanFactory.getBean("studentbean");
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PrintableFactory p = (PrintableFactory) context.getBean("p");
		System.out.println("Details :");
		
	
		/*
		 * Resource resource=new ClassPathResource("applicationContext.xml");
		 * BeanFactory factory=new XmlBeanFactory(resource); Student s =
		 * (Student) factory.getBean("studentbean");
		 * System.out.println("Details :"+s);
		 */ }

}
