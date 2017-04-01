package com.observer;

import java.util.Observer;
import java.util.Observable;
public class ForecastDisplay implements Observer,DisplayElement{
	
	private float currentPressure=29.92f;
	private float lastPressure;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ForecastDisplay");
		System.out.println("this is pressure "+this.lastPressure);
	}

	public ForecastDisplay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ForecastDisplay(Observable obs) {
		super();
		obs.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Observable){
		NewWeatherData nwd=(NewWeatherData)o;
		this.lastPressure=this.currentPressure;
		this.currentPressure=nwd.getPressure();
		display();
		}
		
		
		
	}

}
