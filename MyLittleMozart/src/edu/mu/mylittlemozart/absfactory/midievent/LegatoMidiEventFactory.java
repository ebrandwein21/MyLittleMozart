package edu.mu.mylittlemozart.absfactory.midievent;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class LegatoMidiEventFactory implements MidiEventFactory {
	
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		int duration = tick + 80;
		ShortMessage noteOnCreation = new ShortMessage();
		noteOnCreation.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		return new MidiEvent(noteOnCreation, duration);
	}
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		int duration = tick + 80;
		ShortMessage noteOffreation = new ShortMessage();
		noteOffreation.setMessage(ShortMessage.NOTE_ON, channel, note);
		return new MidiEvent(noteOffreation, duration);
	}
}
