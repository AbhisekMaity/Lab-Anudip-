package com.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.entity.CollectionEg;
import com.spring.entity.Mcq;

public class TestCollectionEg {
   public static void main(String[] args) {
	   Resource resource= new    // resource -- object of Resource Interface, represent the info  of xml file 
				ClassPathResource("ApplicationContext.xml");
		// ClassPathResource -- it is an implementation of class of Resource Interface
		BeanFactory bf = new XmlBeanFactory(resource);
		// BeanFactory -- it is an interface which return the bean 
		// XmlBeanFactory -- it is the implementation class of the beanfactory  
		CollectionEg m = (CollectionEg) bf.getBean("ceg");
		
		m.display();
}
}
