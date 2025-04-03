package edu.mu.absfactory.midievent;

import javax.sound.midi.*;

public class StandardMidiEventFactory implements MidiEventFactory{

	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		
		ShortMessage noteOnCreation = new ShortMessage();
		noteOnCreation.setMessage(ShortMessage.NOTE_ON, 2, 2, 2); //dont know what to set values 
				
		return null;
	}

	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage noteOffCreation = new ShortMessage();
		noteOffCreation.setMessage(ShortMessage.NOTE_OFF, 2, 2, 2);
		
		return null;
	}
	
	

}
