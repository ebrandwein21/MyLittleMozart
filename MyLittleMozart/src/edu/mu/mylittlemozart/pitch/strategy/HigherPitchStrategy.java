package edu.mu.mylittlemozart.pitch.strategy;

public class HigherPitchStrategy implements PitchStrategy{
	
	/*
	 * In the HigherPitchStrategy, the note integer input will be increased by two and returned.
	 */
	@Override
	public int modifyPitch(int note) {
		note = note + 2;
		return note;
	}
}
