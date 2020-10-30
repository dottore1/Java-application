package com.BrewMES.demo;

import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Batch {
	private int id;
	private int machineId;
	private String productType;
	private int totalProducts;
	private int acceptableProducts;
	private int defectProducts;
	private List<int> timeInStates;
	private Map<LocalDateTime,double> temperature;
	private Map<LocalDateTime,double> vibration;
	private Map<LocalDateTime,double> humidity;
	private double minTemp;
	private double maxTemp;
	private double avgTemp;

	public void addTemperature(LocalDateTime time, double temp) {

	}

	public void addVibration(LocalDateTime time, double vibration) {

	}

	public void addHumidity(LocalDateTime time, double humidity) {

	}

	public void setTimeInState(int index, int seconds) {

	}

}