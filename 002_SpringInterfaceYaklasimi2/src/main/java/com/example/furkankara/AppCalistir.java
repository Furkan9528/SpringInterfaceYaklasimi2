package com.example.furkankara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AppCalistir {

	public static void main(String[] args) {

		//Araba araba= new Araba();
		
		BeanFactory context=new XmlBeanFactory(new FileSystemResource("SpringBeansConfig.xml"));
		
		Araba araba= (Araba) context.getBean("araba");
		araba.hareketeGec();
		

	}

}
