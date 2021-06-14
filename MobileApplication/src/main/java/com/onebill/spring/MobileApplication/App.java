package com.onebill.spring.MobileApplication;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("AllConfig.xml");
    	Mobile m = (Mobile) applicationContext.getBean("mobile");
    	boolean bool=true;
    	Scanner scan=new Scanner(System.in);
    	do{
    		System.out.println("\n1.Mobile Using Process\n2.Mobile charging\n3.Exit\nSelect Your option : ");
    		int opt=scan.nextInt();
    		switch(opt){
    			case 1:{
    				System.out.println(m.getCharger().getPercentage());
    		    	System.out.println("Using The Phone Until the phone dies");
    		    	m.mobileUsing();	
    			}break;
    			case 2:{
    				System.out.println("Charging the Phone ");
    		    	m.getCharger().charging();
    			}break;
    			case 3:{
    				System.out.println("Sleep ...");
    				System.exit(0);
    			}break;
    			default:{
    				System.out.println("Wrong option plz Try Again");
    			}
    		}
    	}while(bool);
    	
    	    
    }
}