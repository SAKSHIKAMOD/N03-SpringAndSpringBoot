package org.tnsif.usingautowiredanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//program to demonstrate on autowired example using @Autowired annotation
public class Executer {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("web.xml");
		Remote r=c.getBean("remote",Remote.class);
		r.remote();
	}
}
