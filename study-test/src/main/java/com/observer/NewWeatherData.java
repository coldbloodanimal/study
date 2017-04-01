package com.observer;

import java.util.Observable;
import java.util.Observer;
public class NewWeatherData extends Observable{
	private float tmmperture;
	private float humidity;
	private float pressure;
	public NewWeatherData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
		
	}
	public void setMeasurements(float tmmperture,float humidity,float pressure){
		this.tmmperture=tmmperture;
		this.humidity=humidity;
		this.pressure=pressure;
		this.measurementsChanged();
	}
	public float getTmmperture() {
		return tmmperture;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	
}
