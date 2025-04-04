package edu.mu.mylittlemozart.absfactory.midievent;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new LegatoMidiEventFactory();
	}

	 
}