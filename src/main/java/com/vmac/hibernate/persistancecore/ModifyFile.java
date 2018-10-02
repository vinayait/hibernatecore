package com.vmac.hibernate.persistancecore;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/Users/vmac/Documents/atomfiles/contact.json")));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("/Users/vmac/Documents/atomfiles/contact_modified.json")));
			
			int i = 3;
			
			String line = "s";
			
			while((line = bufferedReader.readLine()) != null) {
				if(line.contains("contact2")) {
					String mod = line.replace("contact2", "contact"+i);
					bufferedWriter.write(mod);
					i++;
				}
				bufferedWriter.write(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
