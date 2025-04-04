package edu.mu.mylittlemozart.absfactory.midievent;
import javax.sound.midi.*;

public class StandardMidiEventFactory implements MidiEventFactory{
	
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		
		ShortMessage noteOnCreation = new ShortMessage();
		noteOnCreation.setMessage(ShortMessage.NOTE_ON, channel, note, velocity); 
	
		return new MidiEvent(noteOnCreation, tick);
	}	
	
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage noteOffCreation = new ShortMessage();
		noteOffCreation.setMessage(ShortMessage.NOTE_OFF, channel, note);
		
		return new MidiEvent(noteOffCreation, tick);
	}
}
