package edu.mu.mylittlemozart.absfactory.midievent;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class StaccatoMidiEventFactory implements MidiEventFactory{
	
	/**
	 * @param: we include the tick, note, velocity and channel in the parameters of the createNoteOn method
	 * this is a create note on function that assigns the tick to the duration. The method initializes the message
	 * we then set the message with the noteONCreation from the shortMessage class, which takes the NOTE_ON method as a parameter, as well as the other attributes in the class
	 * @return: returns a new midi event with the message and the provided tick duration
	 */
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException 
	{
	int duration = tick;
	ShortMessage noteOnCreation = new ShortMessage();
	noteOnCreation.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
	return new MidiEvent(noteOnCreation, duration);
	}
	
	/**
	 * @param: we include the tick, note  and channel in the parameters of the createNoteOff method
	 * this is a create note off function that decreases the tick of the note by 120. The method initializes the message
	 * then sets the message with the noteOFFCreation from the shortMessage class, which takes the NOTE_ON attribute as a parameter, as well as the other attributes in the class
	 * @return: returns a new midi event with the message and the new tick duration
	 */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException
	{
		int duration = tick - 120;
		ShortMessage noteOffCreation = new ShortMessage();
		noteOffCreation.setMessage(ShortMessage.NOTE_ON, channel, note);
		return new MidiEvent(noteOffCreation, duration);
	}
}
