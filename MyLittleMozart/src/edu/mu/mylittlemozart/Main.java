package edu.mu.mylittlemozart;
import edu.mu.mylittlemozart.*;
import edu.mu.mylittlemozart.csv.*;
import edu.mu.mylittlemozart.csv.parsing.*;
import edu.mu.mylittlemozart.absfactory.*;
import edu.mu.mylittlemozart.absfactory.midievent.*;
import edu.mu.mylittlemozart.instrument.*;
import edu.mu.mylittlemozart.instrument.strategy.*;
import java.util.List;
import javax.sound.midi.*;

public class Main {
	
	public static void main(String[] args)
	{
				try {
					        List<MidiEventData> midiEvent = MidiCsvParser.midiEventListCreator("/Users/ethanbrandwien/git/MyLittleMozart/MyLittleMozart/src/edu/mu/mylittlemozart/mystery_song.csv");
							Sequence sequence = new Sequence(Sequence.PPQ, 384);
					        Track track = sequence.createTrack();
					        System.out.println(midiEvent.get(4).getNote());
				
					        MidiEventFactoryAbstract factoryAbstract = 
					        
					        
					        
					}catch(Exception e)
				{
					e.printStackTrace();
				}
		
			
	}
	
	
}
