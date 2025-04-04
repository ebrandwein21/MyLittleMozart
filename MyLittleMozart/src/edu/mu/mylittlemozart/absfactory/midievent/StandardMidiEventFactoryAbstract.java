package edu.mu.mylittlemozart.absfactory.midievent;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	/**
	 * 
	 */
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new StandardMidiEventFactory();
	}

	 
}
