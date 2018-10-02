package com.vmac.hibernate.persistancecore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.hibernate.Session;

import com.google.gson.Gson;
import com.vmac.hibernate.persistancecore.entities.AirQualityData;
import com.vmac.hibernate.persistancecore.entities.Book;
import com.vmac.hibernate.persistancecore.entities.Contact;
import com.vmac.hibernate.persistancecore.entities.Name;
import com.vmac.hibernate.persistancecore.entities.Phone;
import com.vmac.hibernate.persistancecore.entities.Phone.PhoneType;
import com.vmac.hibernate.persistancecore.entities.airquality.AirQuality;
import com.vmac.hibernate.persistancecore.entities.Product;

public class EntityPersister {

	Session session;
	
	public EntityPersister() {
		
	}

	public EntityPersister(Session session) {
		this.session = session;
	}

	public void saveContact(String notes, boolean starred, String url, String first, String last, String middle) {
		Contact contact = new Contact();
		contact.setId(contact.getId());
		contact.setNotes(notes);
		contact.setStarred(starred);
		try {
			contact.setWebsite(new URL(url));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Name name = new Name();
		name.setFirst(first);
		name.setLast(last);
		name.setMiddle(middle);
		contact.setName(name);
		session.save(contact);
		
		Gson gson = new Gson();
		String json = gson.toJson(contact);
		System.out.println(json);

	}

	public void saveProduct(String name, String sku, String description) {
		Product product = new Product();
		product.setId(product.getId());
		product.setName(name);
		product.setSku(sku);
		product.setDescription(description);
		session.save(product);
	}

	public void savePhone(String number, PhoneType phoneType) {
		Phone phone = new Phone();
		phone.setId(phone.getId());
		phone.setNumber(number);
		phone.setType(phoneType);
		session.save(phone);

	}

	public void saveBook(String title, String author) {

		Book book = new Book();
		book.setId(book.getId());
		book.setAuthor(author);
		book.setTitle(title);
		session.save(book);

	}
	
	public void saveAirQualityData() throws Exception {
		
		Gson gson = new Gson();
		
		//FileReader reader = new FileReader(new File("/Users/vmac/Documents/atomfiles/airquality.json"));
		//AirQuality airQuality = gson.fromJson(reader, AirQuality.class);
		AirQuality airQuality = gson.fromJson(getJsonFromUrl("https://data.cdc.gov/api/views/cjae-szjv/rows.json?accessType=DOWNLOAD"), AirQuality.class);
		
		for(List<Object> obj : airQuality.getData()) {
			AirQualityData airQualityData = new AirQualityData();
			
			airQualityData.setCol_1((Double) obj.get(0));
			airQualityData.setCol_2((String) obj.get(1));
			airQualityData.setCol_3((Double) obj.get(2));
			airQualityData.setCol_4((Double) obj.get(3));
			airQualityData.setCol_5((String) obj.get(4));
			airQualityData.setCol_6((Double) obj.get(5));
			airQualityData.setCol_7((String) obj.get(6));
			airQualityData.setCol_8((String) obj.get(7));
			airQualityData.setCol_9((String) obj.get(8));
			airQualityData.setCol_10((String) obj.get(9));
			airQualityData.setCol_11((String) obj.get(10));
			airQualityData.setCol_12((String) obj.get(11));
			airQualityData.setCol_13((String) obj.get(12));
			airQualityData.setCol_14((String) obj.get(13));
			airQualityData.setCol_15((String) obj.get(14));
			airQualityData.setCol_16((String) obj.get(15));
			airQualityData.setCol_17((String) obj.get(16));
			airQualityData.setCol_18((String) obj.get(17));
			airQualityData.setCol_19((String) obj.get(18));
			airQualityData.setCol_20((String) obj.get(19));
			airQualityData.setCol_21((String) obj.get(20));
			
			session.save(airQualityData);
		}
	}
	
	public String getJsonFromUrl(String jsonurl) {
		try {
			URL url = new URL(jsonurl);
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestMethod("GET");
		     //add request header
			connection.setRequestProperty("User-Agent", "Mozilla/5.0");
		     int responseCode = connection.getResponseCode();
		     System.out.println("\nSending 'GET' request to URL : " + url);
		     System.out.println("Response Code : " + responseCode);
		     BufferedReader in = new BufferedReader(
		             new InputStreamReader(connection.getInputStream()));
		     String inputLine;
		     StringBuffer response = new StringBuffer();
		     while ((inputLine = in.readLine()) != null) {
		     	response.append(inputLine);
		     }
		     in.close();

		     return response.toString();
		     
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return "";
	}

}
