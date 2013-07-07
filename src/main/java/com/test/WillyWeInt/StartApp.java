package com.test.WillyWeInt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.WillyWeInt.beans.ProcessBean;
import com.test.WillyWeInt.beans.UnzipBean;

public class StartApp
{
    public static void main( String[] args )
    {
     
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	
    	UnzipBean uzb = (UnzipBean) context.getBean("unzipBean");
    	
    	boolean fileCreated = uzb.unzipFile();

    	if(fileCreated){
    		ProcessBean prb = (ProcessBean) context.getBean("processBean");
    		prb.printColumn();
    	}else{
    		System.out.println("error in creating file");
    	}
    	
    	
    }
    
    
    
}
