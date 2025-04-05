package edu.mu.mylittlemozart.absfactory.midievent;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	/**
	 * creates a new staccato event factory
	 * @return: returns a new staccato event factory 
	 */
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new StaccatoMidiEventFactory();
	} 
}
