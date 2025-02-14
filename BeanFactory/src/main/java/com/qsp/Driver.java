package com.qsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rs = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		Student st = factory.getBean("MyStudent", Student.class);
		st.study();
	}

}
