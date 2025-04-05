package edu.mu.mylittlemozart.absfactory.midievent;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {
	/**
	 * creates a new Legato event factory
	 * @return: returns a new Legato event factory 
	 */
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new LegatoMidiEventFactory();
	} 
}