package com.nobel.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel.spring.aop.service.AccountService;


public class App 
{
    public static void main( String[] args )
    {
    		
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    	
    	AccountService accountService=context.getBean("accountService",AccountService.class);
    	
    	
    	accountService.validateCart(1324);
    	
    	
    	
   
}
    }
