package Week4th;

import java.util.ArrayList;

public class NoteDriver {

	// Adds notes starting value 1 ending value 15, by updating a variable by adding 2 to it   
	public static void main(String[] args) throws InterruptedException {
//		for (int i = 1; i < 15; i += 2) {
//			
//			Note note = new Note(i, 16);
//			note.jFuguePlayer(note.getLetterOfNote()); // expect to play given
//														// notes
//			System.out.println("Frequency of the note : " + note.frequencyOfTheNote()); // expects
//																						// frequency
//																						// of
//																						// notes
//			System.out.println(note); // expects Value and length of notes
//			System.out.println(" Given note is " + note.getLetterOfNote()); // expects
//																			// letter
//																			// of
//			// note
//			System.out.println("Note is " + note.sharpOrNatural()); // expects
//																	// sharp or
			
			// natural

			ArrayList<Note> list = new ArrayList<Note>(); 
			Note AAA ; 
			AAA= new Note(-34, 16); 
			list.add(AAA); 
			AAA = new Note(-40,8);
			list.add(AAA); 
			System.out.println(Note.frequencyOfAllTheNotes()); 
			
			System.out.println(list.get(0).getLetterOfNote());
			System.out.println(list.get(1).getLetterOfNote());
			System.out.println(list.get(1).frequencyOfTheNote());

		//	System.out.println(list.get(1).getLetterOfNote()); 
			
		
		}

	}

//}
