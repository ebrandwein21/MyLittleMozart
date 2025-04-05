
package edu.mu.mylittlemozart.csv.parsing;

public class MidiEventData {
	
	private int startEndTick, velocity, note, channel, noteOnOff;
	private int instrument; 
	
	/**
	 * @param: param: initializes the 6 csv columns as integers
	 * this is a constructor for a new instance of the MidiEventData class that assigns the attributes to the current instances of themselves
	 * 
	 */
	public MidiEventData(int startEndTick, int velocity, int note, int channel, int instrument, int noteOnOff) {
		this.startEndTick = startEndTick;
		this.velocity = velocity; 
		this.note = note;
		this.channel = channel;
		this.instrument = instrument;
		this.noteOnOff = noteOnOff;
	}
	
	/**
	 * gets the startEndTick 
	 * @return: returns the value of startEndTrick
	 */
	public int getStartEndTick() {
		return startEndTick;
	}
	
	/**
	 * @param: the start and end tick of each part of the song
	 * sets the startEndTick and sets the current instance of setEndTick to itself
	 */
	
	public void setStartEndTick(int StartEndTick)
	{
		this.startEndTick = StartEndTick;
	}
	/**
	 * gets the startEndTick 
	 * @return: returns the value of velocity
	 */
	
	public int getVelocity() {
		return velocity;
	}
	
	/**
	 * @param: the velocity of each part of the song
	 * sets the velocity and sets the current instance of velocity to itself
	 */
	
	public void setVelocity(int velocity)
	{
		this.velocity = velocity;
	}
	
	/**
	 * gets the note 
	 * @return: returns the value of note
	 */
	public int getNote() {
		return note;
	}
	
	/**
	 * @param: the note of each part of the song 
	 * sets the note and sets the current instance of note to itself
	 */
	
	public void setNote(int note)
	{
		this.note = note;
	}
	/**
	 * gets the channel 
	 * @return: returns the value of channel
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * @param: the channel of each part of the song
	 * sets the channel and sets the current instance of channel to itself
	 */
	
	public void setChannel(int channel)
	{
		this.channel = channel;
	}
	
	/**
	 * gets the instrument 
	 * @return: returns the value of instrument
	 */
	
	public int getInstrument() {
		return instrument;
	}
	
	/**
	 * @param: the instrument being used for the song 
	 * sets the instrument and sets the current instance of instrument to itself
	 */
	
	public void setInstrument(int instrument)
	{
		this.instrument = instrument;
	}
	
	/**
	 * gets the noteOn/noteOff 
	 * @return: returns the value of the note on or note off
	 * 	 
	 */
	
	public int getNoteOnOff() {
		return noteOnOff;
	}
	
	/**
	 * @param: the noteOn or noteOff message for the song  
	 * sets the noteOnOff and sets the current instance of noteOnOff to itself
	 */
	
	public void setNoteOnOff(int noteOnOff)
	{
		this.noteOnOff = noteOnOff;
	}
}