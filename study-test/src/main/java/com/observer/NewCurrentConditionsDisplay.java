package com.observer;

import java.util.Observable;
import java.util.Observer;
public class NewCurrentConditionsDisplay implements Observer,DisplayElement{

	private Observable obs;
	private float temperature;
	private float humidity;
	
	
	public NewCurrentConditionsDisplay() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NewCurrentConditionsDisplay(Observable obs) {
		super();
		//this.obs=obs;
		obs.addObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("NewCurrentConditionsDisplay");
		System.out.println("this is humidity"+this.humidity);
		System.out.println("this is temperature"+this.temperature);
	}





	public Observable getObs() {
		return obs;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		NewWeatherData wd=(NewWeatherData)o;
		this.temperature=wd.getTmmperture();
		this.humidity=wd.getHumidity();
		display();
		
	}

}
