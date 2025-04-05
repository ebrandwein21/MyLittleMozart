package edu.mu.mylittlemozart;
//import edu.mu.mylittlemozart.*;
//import edu.mu.mylittlemozart.csv.*;
import edu.mu.mylittlemozart.csv.parsing.*;
//import edu.mu.mylittlemozart.instrument.strategy.AcousticGrandPianoStrategy;
//import edu.mu.mylittlemozart.absfactory.*;
import edu.mu.mylittlemozart.absfactory.midievent.*;
import edu.mu.mylittlemozart.instrument.strategy.*;
import edu.mu.mylittlemozart.pitch.strategy.HigherPitchStrategy;
//import edu.mu.mylittlemozart.pitch.strategy.HigherPitchStrategy;
//import edu.mu.mylittlemozart.pitch.strategy.PitchStrategy;
import edu.mu.mylittlemozart.pitch.strategy.PitchStrategy;

import java.io.File;
import java.util.List;
import javax.sound.midi.*;

public class Main {
	
	public static void main(String[] args)
	{
		try {
			String directory = System.getProperty("user.dir");
			String filePath =  directory  + File.separator + "MyLittleMozart" + File.separator + "src" + File.separator + "edu"
					+ File.separator + "mu" + File.separator + "mylittlemozart" + File.separator
					+ "mystery_song.csv";
			
			List<MidiEventData> midiEvent = MidiCsvParser.midiEventListCreator(filePath);
		    Sequence sequence = new Sequence(Sequence.PPQ, 384);
		    Track track = sequence.createTrack();
		
			MidiEventFactoryAbstract factoryAbstract = new StandardMidiEventFactoryAbstract();
	       //MidiEventFactoryAbstract factoryAbstractTwo = new StaccatoMidiEventFactoryAbstract();
	      // MidiEventFactoryAbstract factoryAbstractThree = new LegatoMidiEventFactoryAbstract();
			    
		    MidiEventFactory factory = factoryAbstract.createFactory();
		    
		    InstrumentStrategy instrumentStrategy = new ElectricBassGuitarStrategy();
			instrumentStrategy.applyInstrument(track, 0);
		    instrumentStrategy = new AcousticGrandPianoStrategy();
		    instrumentStrategy.applyInstrument(track, 1);
  
		    PitchStrategy pitchStrategy = new HigherPitchStrategy();
		    
		    for(MidiEventData event : midiEvent)
		    {
		    	int modifiedNote = pitchStrategy.modifyPitch(event.getNote());
		    	modifiedNote = pitchStrategy.modifyPitch(modifiedNote);
		    
		    	if(event.getNoteOnOff() == ShortMessage.NOTE_ON)
		    	{
		    		track.add(factory.createNoteOn(event.getStartEndTick(), modifiedNote, event.getVelocity(), event.getChannel())); 
		    	} 
		    	else
		    	{
		    		track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel())); 
		    	}
		    }
		    
		    Sequencer sequencer = MidiSystem.getSequencer();
		    sequencer.open();
		    sequencer.setSequence(sequence);
		    sequencer.start();
		    
		    while(sequencer.isRunning() | sequencer.isOpen())
		    {
		    	Thread.sleep(100);
		    }
		    	Thread.sleep(500);
		    	sequencer.close();

		    }catch(Exception e)
		  {
			 e.printStackTrace();
		  }
	  }
	}
