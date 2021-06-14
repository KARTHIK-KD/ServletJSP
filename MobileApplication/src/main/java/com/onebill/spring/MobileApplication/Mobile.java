package com.onebill.spring.MobileApplication;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private String name;
	@Autowired
	private Charger charger;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	public Mobile() {
		
	}
	synchronized public void mobileUsing() {
		if(charger.getPercentage()==0)
			System.out.println("Zero Percentage Please Plug in");
		else {
			System.out.println("Using "+ name);	
			int flg=0;
			try {
				while(charger.getPercentage()>0) {
					wait(100);
					System.out.print("Battery Power : ");
					charger.setPercentage(charger.getPercentage()-1);
					System.out.println(charger.getPercentage()+"%");
					if(charger.getPercentage()==10 && flg==0){
						System.out.println("Mobile Charge is less than 10 plz plugin....");
						System.out.print("Are you continue mobile useage press 1 else 0 : ");
						Scanner scan=new Scanner(System.in);
						int opt=scan.nextInt();
						if(opt==0){
							break;
						}
						flg=1;
					}
				}
				if(charger.getPercentage()==0){
					System.out.println("Switch Off......");
				}
			} catch (InterruptedException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}

}