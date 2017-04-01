package com.observer;

public class HotConditionDisplay implements Observer,DisplayElement{

	private float T;
	private float RH;
	private float heatindex;
	private WeatherData weather;
	public void display() {
		System.out.println("HotConditionDisplay ");
		System.out.println("heatindex is "+heatindex);
		
	}

	
	public HotConditionDisplay() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HotConditionDisplay(WeatherData weather) {
		super();
		this.weather = weather;
		weather.registerObserver(this);
	}


	public void update(float tmmperture, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.T=tmmperture;
		this.RH=humidity;
		this.heatindex=(float) ((-42.379+2.04901523*(T)+10.14333127*(RH)-0.22475541*(T)*(RH)-6.83783*10-3*(T*2)-5.481717*10-2*(RH*2)+1.22874*10-3*(T*2)*(RH)+8.5282*10-4*(T)*(RH*2)-1.99*10-6*(T*2)*(RH*2))-32)*5/9;
		display();
	}
	

}
