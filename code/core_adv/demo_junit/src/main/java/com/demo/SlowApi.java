package com.demo;

import java.util.concurrent.TimeUnit;

public class SlowApi {

	public String getCityName(int id) {
		
		//network
		try {
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e) {
			
		}
		
		return "delhi";
	}
}
