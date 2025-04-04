package edu.mu.mylittlemozart.instrument.strategy;
import javax.sound.midi.*;

public interface InstrumentStrategy {
	void applyInstrument(Track track, int channel) throws MidiUnavailableException, InvalidMidiDataException;
}


