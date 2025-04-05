package edu.mu.mylittlemozart.absfactory.midievent;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	/**
	 * @return returns a new instance of the standard midi event factory
	 */
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new StandardMidiEventFactory();
	} 
}
