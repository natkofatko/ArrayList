package Week4th;
/*


import org.jfugue.player.Player;

public class Driver {

	// main mehod. It will add notes started at position 0 and ends 12 with
	// length of 8 and 16
	public static void main(String[] args) {
		for (int i = 0; i < 12; i++)
			for (int j = 8; j <= 16; j += 8) {
				Note note = new Note(i, j);
				System.out.println(note.frequencyOfTheNote()); // expects
																// frequency of
																// notes
				System.out.println(note); // expects Value and length of notes
				System.out.println(note.getLetterOfNote()); // expects letter of
															// note
				System.out.println(note.sharpOrNatural()); // expects sharp or
															// natural
				note.jFuguePlayer(note.getLetterOfNote()); // expect to play
															// given note

			}

	}

}

*/

import org.jfugue.player.Player;

/**
 * 
 * @author Natalia Note class provides methods to get length, value and
 *         frequency of particular note
 */
public class Note {

	/**
	 * private variables
	 */
	private static int value;
	private static double length;

	/**
	 * default constructor
	 * 
	 * @param value
	 *            the note's value. The note's value is an integer. it is
	 *            specified by counting how far the note lies above or below the
	 *            A note that orchestras use in tuning
	 * @param length
	 *            the note's length. The length of a note may be a sixteenth
	 *            note, eight note, quarter note, half note, or a whole note.
	 */
	public Note(int value, double length) {
		this.value = value;
		this.length = length;
	}

	/**
	 * 
	 * @param value.
	 *            Assign this.value to the variable value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * 
	 * @param length.
	 *            Assign this.length to the variable length
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * The getValue() returns the value of the note
	 * 
	 * @return value
	 */
	public static int getValue() {
		return value;
	}

	/**
	 * The getLength() returns the length of the note
	 * 
	 * @return length
	 */
	public static double getLength() {
		return length;
	}

	/**
	 * toString() method returns the string representation of the object
	 */
	public String toString() {
		return "Note [value=" + value + ", length=" + length + " .";

	}

	/**
	 * @return the frequency of the note
	 * 
	 */
	static double frequency = 0.0;
	static double num = 0;

	// Gets the frequency of the note, based on notes' index
	public static double frequencyOfTheNote() {

		frequency = (Math.pow(2, ((double) value) / 12)) * 440;
		// Rounds frequency of the note to the 3 decimal places
		double num = Math.round(frequency * 1000.0) / 1000.0;
		return num;

	}

	/**
	 * @return frequency of all the notes
	 */
	// Gets the frequency of all notes and rounds the frequency to 3 decimal
	// places
	public static double frequencyOfAllTheNotes() {
		for (int i = -48; i <= 39; i++) {
			frequency = (Math.pow(2, (double) (i) / 12)) * 440;
			double num = Math.round(frequency * 1000.0) / 1000.0;

		}
		return num;
	}

	/**
	 * Notes indices varied from -48 till 39. There are 12 different notes.
	 * Every note repeats every 12 positions Note A will be on
	 * -48,-36,-24,-12,0,12,24
	 * 
	 * @return a letter note based on the note position using for loop
	 */
	public static String getLetterOfNote() {
		String note = "";
		for (int i = -48; i <= 36; i += 12)
			if (value == i)
				return "A";
		for (int i = -47; i <= 37; i += 12)
			if (value == i)
				return "A#";
		for (int i = -46; i <= 38; i += 12)
			if (value == i)
				return "B";
		for (int i = -45; i <= 39; i += 12)
			if (value == i)
				return "C";
		for (int i = -44; i <= 28; i += 12)
			if (value == i)
				return "C#";
		for (int i = -43; i <= 29; i += 12)
			if (value == i)
				return "D";
		for (int i = -42; i <= 30; i += 12)
			if (value == i)
				return "D#";
		for (int i = -41; i <= 31; i += 12)
			if (value == i)
				return "E";
		for (int i = -40; i <= 32; i += 12)
			if (value == i)
				return "F";
		for (int i = -39; i <= 32; i += 12)
			if (value == i)
				return "F#";
		for (int i = -38; i <= 34; i += 12)
			if (value == i)
				return "G";
		for (int i = -37; i <= 35; i += 12)
			if (value == i)
				return "G#";

		return "invalid";

	}

	/**
	 * 
	 * @return letter of the given notes' value
	 */
	public static String getNote() {
		String note = "";
		if (value == -48 || value == -36 || value == -24 || value == -12 || value == 0 || value == 12 || value == 24
				|| value == 36) {
			note = "A";
		} else if (value == -11 || value == -23 || value == -35 || value == -47 || value == 1 || value == 13
				|| value == 25 || value == 37) {
			note = "A#";
		} else if (value == -10 || value == -22 || value == -34 || value == -46 || value == 2 || value == 14
				|| value == 26 || value == 38) {
			note = "B";
		} else if (value == -9 || value == -21 || value == -33 || value == -45 || value == 3 || value == 15
				|| value == 27 || value == 39) {
			note = "C";
		} else if (value == -20 || value == -32 || value == -44 || value == 4 || value == 16 || value == 28
				|| value == -8) {
			note = "C#";
		} else if (value == -7 || value == -19 || value == -31 || value == -43 || value == 5 || value == 17
				|| value == 29) {
			note = "D";
		} else if (value == -18 || value == -30 || value == -42 || value == 6 || value == 18 || value == 30
				|| value == -6) {
			note = "D#";
		} else if (value == -17 || value == -29 || value == -41 || value == 7 || value == 19 || value == 31
				|| value == -5) {
			note = "E";
		} else if (value == -16 || value == -28 || value == -40 || value == 8 || value == 20 || value == 32
				|| value == -4) {
			note = "F";
		} else if (value == -3 || value == -15 || value == -27 || value == -39 || value == 9 || value == 21
				|| value == 33) {
			note = "F#";
		} else if (value == -2 || value == -14 || value == -26 || value == -38 || value == 10 || value == 22
				|| value == 34) {
			note = "G";
		} else if (value == -1 || value == -13 || value == -25 || value == -36 || value == 11 || value == 23
				|| value == 35) {
			note = "G#";
		}

		else {
			note = "invalid";
		}
		return note;
	}

	/**
	 * 
	 * check if given note value is equal one of values from if statement, if
	 * yes note is sharp else note is natural
	 * 
	 * @return if Note is Sharp or Natural
	 */
	public static String sharpOrNatural() {
		String status = "";

		if (value == 1 || value == 13 || value == 25 || value == 37 || value == -11 || value == -23 || value == -35
				|| value == -47 || value == 4 || value == 16 || value == 28 || value == -8 || value == -20
				|| value == -32 || value == -44 || value == 6 || value == 18 || value == 30 || value == -6
				|| value == -18 || value == -30 || value == -42 || value == 9 || value == 21 || value == 33
				|| value == -3 || value == -15 || value == -27 || value == -39 || value == 11 || value == 23
				|| value == 35 || value == -1 || value == -13 || value == -25 || value == -36) {
			status = "Sharp";
		} else {
			status = "Natural";
		}
		return status;
	}

	/**
	 * 
	 * @return the length of the note
	 */
	// there are 4 kind of note: sixteen note, quarter note, half note, or a
	// whole note
	public static String getLengthNote() {
		String lengthW = "";
		if (length == 16) {
			lengthW = "Sixteen";
		} else if (length == 8) {
			lengthW = "eight";
		} else if (length == 0.25) {
			lengthW = "quarter";
		} else if (length == 0.5) {
			lengthW = "half";
		} else if (length == 1) {
			lengthW = "whole";
		} else {
			lengthW = "invalid length of note";
		}
		return lengthW;

	}

	/**
	 * 
	 * Plays the give note
	 */
	public static void jFuguePlayer(String stringOfNotes) {
		Player player = new Player();

		player.play(stringOfNotes);

	}

}