package org.tnsif.autowiredexample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//program to demonstrate on autowire concept
//driver class
public class Executer {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Board b=c.getBean("board",Board.class);
		b.accept();
    
	}
    
}
