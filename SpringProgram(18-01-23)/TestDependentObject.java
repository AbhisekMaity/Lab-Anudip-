package com.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.entity.Dependent;

public class TestDependentObject {
   public static void main(String[] args) {
	   //Create a new resource object that loads a file from the classpath

		Resource resource = new ClassPathResource("ApplicationContext.xml");
	    //Create a new BeanFactory object that loads the configuration from the specified resource

		BeanFactory bf = new XmlBeanFactory(resource);
	    //Retrieve a bean named "d" from the BeanFactory

		Dependent dv = (Dependent) bf.getBean("dpd");
		dv.display();
}
}
