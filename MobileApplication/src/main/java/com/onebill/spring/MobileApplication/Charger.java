package com.onebill.spring.MobileApplication;

public class Charger {
	
	private int percentage;
	public Charger() {

	}
	synchronized public void charging() {
		if(percentage<100) {
		while(percentage<100) {
			try {
				wait(100);
				percentage++;
				System.out.println(" Charging "+percentage + "%");
				if(percentage==100)
					System.out.println("Battery Full");
			} catch (InterruptedException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
		}else {
			System.out.println("Battery Full");
		}
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}

