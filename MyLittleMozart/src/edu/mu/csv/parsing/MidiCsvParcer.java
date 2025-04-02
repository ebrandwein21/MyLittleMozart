package edu.mu.csv.parsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MidiCsvParcer{
	
	
	List<MidiEventData> midiEventDataList = new ArrayList<>(); //what is this syntax error 
	
    public void test( ) {
	try(BufferedReader csvReader = new BufferedReader(new FileReader("/Users/EthanBrandwein/Desktop/mystery_song.csv"))) 
	{
	String data=""; 
	
	while((data = csvReader.readLine()) != null) {
		String[] objects = data.split(",");
				
		int startEndTick = Integer.parseInt(objects[0]);
        int velocity = Integer.parseInt(objects[1]);
        int note = Integer.parseInt(objects[2]);
        int channel = Integer.parseInt(objects[3]);
        int instrument = Integer.parseInt(objects[4]);
        int noteOnOff = Integer.parseInt(objects[5]);

		
		MidiEventData midiEventData = new MidiEventData(startEndTick, velocity, note, channel, instrument, noteOnOff);
		
		//need to create instances where you would use the class and parse data from the constructor and add 
		midiEventDataList.add(midiEventData);
		
		//test but get rid of after
		System.out.println("start end trick" + objects[0] + "velocity" + objects[1] + "note" + objects[2] + "channel" + objects[3] + "instrument" + objects[4] + "note on off" + objects[5]);
	    
	
	}
	
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	  catch(IOException error) {
		  error.printStackTrace();
    }
	//return MidiEventDataList;
	//create a folder inside the folder with the csv 
}


}

