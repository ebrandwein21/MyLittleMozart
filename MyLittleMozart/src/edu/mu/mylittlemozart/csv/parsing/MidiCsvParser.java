package edu.mu.mylittlemozart.csv.parsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MidiCsvParser{
	
	//initializes a list of the midieventdata columns into an array list
	static List<MidiEventData> midiEventDataList = new ArrayList<>(); 
	
	/**
	 * 
	 * @param a string that represents the filePath of the csv file
	 * reads and parses the csv file to be used throughout the program by using a BufferedReader to read the csv, then splits the columns of the csv file into different elements in the arrayList, 
	 * adds a conditional statement to determine if noteOnOff is noteOn or noteOff
	 * multiplies velocity by 10 so that the track can be louder
	 * then creates a new instance of the midiEventData class  and adds the class to the list and catches any errors file related errors that may occur
	 * @return returns the midieventdata list to be used in the main method 
	 */
	
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
			
			midiEventDataList.add(midiEventData);	
		}
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		  catch(IOException error) {
			  error.printStackTrace();
	    }
		return midiEventDataList;
	}
}

