package com.demo;

import java.util.concurrent.TimeUnit;

public class SlowApi {
	
	public String cityName(int id) {
		
		try {
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e) {}
		return "delhi";
	}
}
