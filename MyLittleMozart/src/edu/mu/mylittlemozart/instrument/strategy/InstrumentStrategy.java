package edu.mu.mylittlemozart.instrument.strategy;
import javax.sound.midi.*;

/*
 * The Instrument Strategy interface allows for a dynamic change in instruments being used.
 * It takes a Track and a channel integer as parameters and throws Midi Exceptions.
 */
public interface InstrumentStrategy {
	void applyInstrument(Track track, int channel) throws MidiUnavailableException, InvalidMidiDataException;
}


