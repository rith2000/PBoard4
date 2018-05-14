package piano;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Recorder {

	private static int MEASURE_NUMBER = 1;
	private final int BEATS_PER_MEASURE;
	private ArrayList<Key> keysRecorded;
	private ArrayList<Point> measAndBeat;


	
	public Recorder(int beats) {
		BEATS_PER_MEASURE = beats;

	}
	
	public void record(Key k, int measNum, int beat) {
		measAndBeat.add(new Point(measNum, beat));
		keysRecorded.add(k);
		
	}
	
	public ArrayList<Point> getMeasures(){
		return measAndBeat;
	}
	
	public ArrayList<Key> getKeys(){
		return keysRecorded;
	}
	
	public Key findKey(Point measPlusBeat) {
		return null;
		// finds the key played after an elapsed amount of measures and beats 
	}
	
	public void createSheetMusic() {
		// makes pdf of notes on sheet music or prints out notes and measures between them
	}
	public void draw(Graphics g) {
		// I don't think recorder needs a draw because it's simply keeping track of our program.
		//g.paint
	}

}

