package com.hex.spring.com.hex.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beam.xml");
        Product p1 =(Product)context.getBean("product1");
        Cart c1 =(Cart) context.getBean("cart1");
        System.out.println(p1.toString());
        System.out.println(c1.toString());
        
    }
}
