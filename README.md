# MyLittleMozart
This project implements a MIDI composition program using Java, showcasing advanced object-oriented programming principles and design patterns. It integrates:  
  Abstract Factory Pattern for dynamic MIDI event creation (Standard, Legato, Staccato), Strategy Pattern for pitch modulation and instrument assignment, Custom MIDI generation based on CSV input and utilizes Java MIDI API (javax.sound.midi) for playback

Features:
**CSV Parsing**: Reads MIDI event data from a structured CSV file
**Abstract Factory Implementation**: Dynamically generates NoteOn and NoteOff events using selected styles
**Pitch Strategy**: Supports real-time pitch modification (raise/lower notes by semitones)
**Instrument Strategy**: Assigns instruments to MIDI channels dynamically
**Legato and Staccato Support**: Vary note duration and articulation style
**Java MIDI Playback**: Assembles and plays back MIDI tracks programmatically

Object Oriented Concepts:  
**Abstraction**: Interfaces and abstract factories define shared contracts for event creation and strategy logic
**Inheritance**: Different factories and strategies implement base interfaces to provide custom behavior
**Polymorphism**: MIDI event creation and playback leverages polymorphic method calls
**Strategy Pattern**: Instrument and pitch behavior are encapsulated and interchangeable
**Encapsulation & Modularity**: Organized codebase, clean class responsibilities, package-separated
**Abstract Factory Pattern**: Handles dynamic creation of different MIDI behaviors

Running the Code: There are no dependencies needed to run the code. To run the code simply type:

git clone https://github.com/ebrandwein21/MyLittleMozart.git	
ensure that eclipse has found the src folder (which should be done by default)
Hit the run button on eclipse. There should be output from main to demonstrate the code functions.

Created by Esther Brandwein and Samantha Friedman 
