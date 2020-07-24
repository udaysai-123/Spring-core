package org.dxc.ioc.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ap=new ClassPathXmlApplicationContext("spring-ioc.xml");
    	Car car=(Car)ap.getBean("car");
    	System.out.println(car.getColorName());
    	System.out.println(car.getBrandName());
    	System.out.println(car.getModel());
    	System.out.println(car.getDriver().getDriverName());
    	car.setBrandName("Audi");
    	System.out.println(car.getBrandName());
    	Car car1=(Car)ap.getBean("car");
    	System.out.println(car1.getModel());
    	
    	
    	
    }
}
