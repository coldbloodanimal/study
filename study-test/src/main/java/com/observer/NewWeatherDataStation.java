package com.observer;

public class NewWeatherDataStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewWeatherData weather=new NewWeatherData();
		NewCurrentConditionsDisplay condition=new NewCurrentConditionsDisplay(weather);
		ForecastDisplay fd=new ForecastDisplay(weather);
		//HotConditionDisplay hot=new HotConditionDisplay(weather);
		//weather.registerObserver(condition);
		weather.setMeasurements(12, 23, 45);
		weather.setMeasurements(21, 34, 67);
	}

}
