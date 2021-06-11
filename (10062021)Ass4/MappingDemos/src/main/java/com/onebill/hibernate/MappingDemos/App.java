package com.onebill.hibernate.MappingDemos;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("\n1.One to One\n2.One to Many\n3.Many to One\n4.Many to Many\nEnter you Choice : ");
    	int choice = scan.nextInt();
    	
    	switch(choice) {
    	case 1:{
    		OneToOne.main(args);
    	}
    		break;
    	case 2:{
    		OneToMany.main(args);
    	}
    		break;
    	case 3:{
    		ManyToOne.main(args);
    	}
    		break;
    	case 4:{
    		ManyToMany.main(args);
    	}
    		break;
    	default:{
    		System.out.println("Invalid .. Plz Try Again");
    	}
    	}
    	
    	scan.close();
    }
}
