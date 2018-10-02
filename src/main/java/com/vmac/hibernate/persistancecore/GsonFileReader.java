package com.vmac.hibernate.persistancecore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.vmac.hibernate.persistancecore.entities.airquality.AirQuality;

public class GsonFileReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		
		FileReader reader = new FileReader(new File("/Users/vmac/Documents/atomfiles/airquality.json"));
		AirQuality airQuality = gson.fromJson(reader, AirQuality.class);
		System.out.println(airQuality.getData().size());

	}

}
