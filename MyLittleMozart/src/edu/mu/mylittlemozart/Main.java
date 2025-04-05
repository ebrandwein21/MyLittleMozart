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
			//Esther: do not push again until you get rid of the second mylittlemozart
			String directory = System.getProperty("user.dir");
			String filePath =  directory  + File.separator + "MyLittleMozart" + File.separator + "src" + File.separator + "edu"
					+ File.separator + "mu" + File.separator + "mylittlemozart" + File.separator
					+ "mystery_song.csv";
			
			List<MidiEventData> midiEvent = MidiCsvParser.midiEventListCreator(filePath);
		    Sequence sequence = new Sequence(Sequence.PPQ, 384);
		    Track track = sequence.createTrack();
		    //System.out.println(midiEvent.get(4).getNote());
		
		//MidiEventFactoryAbstract factoryAbstract = new StandardMidiEventFactoryAbstract();
       MidiEventFactoryAbstract factoryAbstractTwo = new StaccatoMidiEventFactoryAbstract();
       //MidiEventFactoryAbstract factoryAbstractThree = new LegatoMidiEventFactoryAbstract();
		    
		    MidiEventFactory factory = factoryAbstractTwo.createFactory();
		    
		    
		    InstrumentStrategy instrumentStrategy = new ElectricBassGuitarStrategy();
			instrumentStrategy.applyInstrument(track, 1);
		    instrumentStrategy = new TrumpetStrategy();
		    instrumentStrategy.applyInstrument(track, 0);
  
		    PitchStrategy pitchStrategy = new HigherPitchStrategy();
		    
		    for(MidiEventData event : midiEvent)
		    {
		    	int modifiedNote = pitchStrategy.modifyPitch(event.getNote());
		    	modifiedNote = pitchStrategy.modifyPitch(modifiedNote);
		    
		    	if(event.getNoteOnOff() == ShortMessage.NOTE_ON)
		    	{
		    		track.add(factory.createNoteOn(event.getStartEndTick(), modifiedNote, event.getVelocity(), event.getChannel())); 
		            System.out.println("Created Note On: Note = " + modifiedNote + ", Velocity = " + event.getVelocity() + ", Tick = " + event.getStartEndTick() + event.getChannel());
		    	} 
		    	else
		    	{
		    		track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel())); 
		    	System.out.println("Created note-off: Note = " + modifiedNote + ", Tick = " + event.getStartEndTick() + ", Channel = " + event.getChannel());
		    	}
		    }
		    
		    Sequencer sequencer = MidiSystem.getSequencer();
		    sequencer.open();
		    sequencer.setSequence(sequence);
		    sequencer.start();
		    System.out.println("sequencer has started");
		    
		    while(sequencer.isRunning() | sequencer.isOpen())
		    {
		    	Thread.sleep(100);
		    }
		    	Thread.sleep(500);
		    	sequencer.close();
			    System.out.println("sequencer has closed"); //not printing

		    }catch(Exception e)
		  {
			 e.printStackTrace();
		  }
	  }
	}
