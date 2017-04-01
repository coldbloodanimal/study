package com.observer;

import java.util.ArrayList;
import com.observer.Observer;
public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float tmmperture;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers=new ArrayList<Observer>();
	}
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		for(int i=0;i<observers.size();i++){
			Observer observer=observers.get(i);
			observer.update(tmmperture, humidity, pressure);
		}
		
	}
	public void setTmmperture(float tmmperture) {
		this.tmmperture = tmmperture;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	public void measurementsChanged(){
		this.notifyObserver();
	}
	public void setMeasurements(float tmmperture,float humidity,float pressure){
		this.tmmperture=tmmperture;
		this.humidity=humidity;
		this.pressure=pressure;
		this.measurementsChanged();
	}

}
