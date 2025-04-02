package edu.mu.csv.parsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MidiCsvParcer{
	
	String file = "/Users/EthanBrandwein/Desktop/mystery_song.csv";
	
	List <MidiEventData> MidiEventDataList = new ArrayList<>();
	
    
	try {
	BufferedReader csvReader = new BufferedReader(new FileReader(file));
	String data; 
	
	while((data = csvReader.readLine()) != null) {
		System.out.println(data);
		String[] objects = data.split(",");
		System.out.println("start end trick" + objects[0] + "velocity" + objects[1] + "note" + objects[2] + "channel" + objects[3] + "instrument" + objects[4] + "note on off" + objects[5]);
		
	}
	
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	  catch(IOException error) {
		  error.printStackTrace();
    }
	return MidiEventDataList;
}


}