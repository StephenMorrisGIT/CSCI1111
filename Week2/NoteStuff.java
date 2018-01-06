import jm.util.*;
import jm.music.data.*;
import jm.JMC;

public class NoteStuff implements JMC
{
	public static void PlayGuitar()
	{
		Note n = new Note(A6,HN);
		Note shutUp = new Note(REST,HN); 
		Note n2 = new Note(A6,HN);
		Note n3 = new Note(E6,HN);		
		Note n4 = new Note(D6,HN);
		Note n5 = new Note(E6,HN);
		Note n6 = new Note(A6,HN);
		Note n7 = new Note(D6,HN);
		Note n8 = new Note(E6,HN);
		Phrase phr = new Phrase(0.0);
		phr.addNote(n);
		phr.addNote(n2);
		phr.addNote(n3);
		phr.addNote(n4);
		phr.addNote(n5);
		phr.addNote(n6);
		phr.addNote(n7);
		phr.addNote(n8);
		phr.addNote(shutUp);
		phr.setInstrument(GUITAR);
		phr.setTempo(120);
		Play.midi(phr);
	}
	public static void PlayPiano()
	{
		Note n = new Note(C7,HN);
		Note n2 = new Note(F7,HN);
		Note n3 = new Note(C7,QN);		
		Note n4 = new Note(F7,QN);
		Note n5 = new Note(C7,WN);
		Note n6 = new Note(G7,QN);
		Note n7 = new Note(C7,QN);
		Note n8 = new Note(F7,QN);
		Note n9 = new Note(C7,QN);
		Note n10 = new Note(G7,WN);
		Phrase phr = new Phrase(0.0);
		phr.addNote(n);
		phr.addNote(n2);
		phr.addNote(n3);
		phr.addNote(n4);
		phr.addNote(n5);
		phr.addNote(n6);
		phr.addNote(n7);
		phr.addNote(n8);
		phr.addNote(n9);
		phr.addNote(n10);
		phr.setInstrument(PIANO);
		phr.setTempo(100);
		Play.midi(phr);
	}
	public static void main (String[] args)
	{
		PlayGuitar();
		PlayPiano();

	}
}