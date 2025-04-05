package edu.mu.mylittlemozart.absfactory.midievent;

import javax.sound.midi.*;

//initializes createNoteOn and createNoteOff values for the specific event factories to implements
public interface MidiEventFactory {
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;
}
