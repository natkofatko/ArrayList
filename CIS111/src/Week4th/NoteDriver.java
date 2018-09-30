package Week4th;

import java.util.ArrayList;

public class NoteDriver {

	// Adds notes starting value 1 ending value 15, by updating a variable by adding 2 to it   
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i < 15; i += 2) {
			
			Note note = new Note(i, 16);
			note.jFuguePlayer(note.getLetterOfNote()); // expect to play given
														// notes
			System.out.println("Frequency of the note : " + note.frequencyOfTheNote()); // expects
																						// frequency
																						// of
																						// notes
			System.out.println(note); // expects Value and length of notes
			System.out.println(" Given note is " + note.getLetterOfNote()); // expects
																			// letter
																			// of
			// note
			System.out.println("Note is " + note.sharpOrNatural()); // expects
																	// sharp or
			
			// natural

			Note not = new Note(); 
			System.out.println(not);
			not.setLength(16);
			not.setValue(20);
			System.out.println(not);
			System.out.println(not.getNote());
			

			
		
		}

	}

//}
