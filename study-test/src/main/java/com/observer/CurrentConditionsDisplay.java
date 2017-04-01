package com.observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private float tmmperture;
	private float humidity;
	//private float pressure;
	private Subject subject;

	public CurrentConditionsDisplay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentConditionsDisplay(Subject subject) {
		this.subject=subject;
		subject.registerObserver(this);
	}
	
	public void display() {
		System.out.println("CurrentConditionsDisplay");
		System.out.println("temperature"+tmmperture);
		System.out.println("humidity"+humidity);
		//System.out.println("pressure"+pressure);
	}



	@Override
	public void update(float tmmperture, float humidity, float pressure) {
		this.tmmperture=tmmperture;
		this.humidity=humidity;
		//this.pressure=pressure;
		display();
		
	}
	
}
