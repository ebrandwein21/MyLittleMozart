package edu.mu.mylittlemozart.pitch.strategy;

/*
 * The Pitch Strategy interface allows for a dynamic change in pitch.
 * It takes a note as a parameter and strategies can be used to modify this note.
 */
public interface PitchStrategy {
	int modifyPitch(int note);
}
