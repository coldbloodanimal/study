package com.observer;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weather=new WeatherData();
		CurrentConditionsDisplay condition=new CurrentConditionsDisplay(weather);
		HotConditionDisplay hot=new HotConditionDisplay(weather);
		//weather.registerObserver(condition);
		weather.setMeasurements(12, 23, 45);
		weather.setMeasurements(21, 34, 67);
	}

}
