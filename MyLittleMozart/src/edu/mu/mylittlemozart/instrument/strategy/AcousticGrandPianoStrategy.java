package edu.mu.mylittlemozart.instrument.strategy;

//import javax.sound.midi.Instrument;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
//import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;
//import javax.sound.midi.Synthesizer;
import javax.sound.midi.Track;

public class AcousticGrandPianoStrategy implements InstrumentStrategy {
	int instrument = 0;
	
	
	@Override
	public void applyInstrument(Track track, int channel) throws MidiUnavailableException, InvalidMidiDataException {
//		Synthesizer synth = MidiSystem.getSynthesizer(); 	

		ShortMessage sm = new ShortMessage( );
		sm.setMessage(ShortMessage.PROGRAM_CHANGE, channel, instrument, 0); //9 ==> is the channel 10.
		track.add(new MidiEvent(sm, 0));
		
//		Instrument[] instr = synth.getDefaultSoundbank().getInstruments();
//		synth.loadInstrument(instr[instrument]);
		
	}

}
