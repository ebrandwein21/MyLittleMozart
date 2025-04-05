package edu.mu.mylittlemozart.csv.parsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MidiCsvParser{
	
	
	static List<MidiEventData> midiEventDataList = new ArrayList<>(); 
	
    public static List<MidiEventData> midiEventListCreator(String filePath ) {
    	
	try(BufferedReader csvReader = new BufferedReader(new FileReader(filePath)))
	{

	String data=""; 
	
	while((data = csvReader.readLine()) != null) {
		String[] objects = data.split(",");
				
		int startEndTick = Integer.parseInt(objects[0]);
		
		int noteOnOff = -1;
		
		if(objects[1].contains("Note_off_c"))
		{
			 noteOnOff = 0;
		}
		if(objects[1].contains("Note_on_c"))
		{
			 noteOnOff = 1;
		}
		
        int velocity = Integer.parseInt(objects[2]) * 10;
        int note = Integer.parseInt(objects[4]);
        int channel = Integer.parseInt(objects[3]);
        int instrument = Integer.parseInt(objects[5]);
        
       
		MidiEventData midiEventData = new MidiEventData(startEndTick, velocity, note, channel, instrument, noteOnOff);
		
		//need to create instances where you would use the class and parse data from the constructor and add 
		midiEventDataList.add(midiEventData);
		
		
	}
	
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	  catch(IOException error) {
		  error.printStackTrace();
    }
	
	return midiEventDataList;
	//create a folder inside the folder with the csv 
}


}

