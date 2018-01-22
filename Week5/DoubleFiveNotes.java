import java.util.*;
import jm.util.*;
import jm.music.data.*;
import jm.JMC;

public class DoubleFiveNotes implements JMC
{
	public static void main(String[] args)
	{
		int instrumentChoice = 0;
		int instrumentChoice2 = 0;
		System.out.println("Choose GUITAR or PIANO");
		Scanner input = new Scanner(System.in);
		String instrument  = input.nextLine();
		
		if (instrument.equals(“GUITAR”))
		{
			instrumentChoice = GUITAR;
			instrumentChoice2 = PIANO;
		}
		else()
		{
			instrumentChoice = PIANO;
			instrumentChoice2 = GUITAR;
		}
		
		Phrase phraseOne = makePhrase(instrumentChoice,0.0);
		Phrase phraseTwo = makePhrase(instrumentChoice2,5.0);
		Play.midi(phraseOne);
		Play.midi(phraseTwo);
	}
	
	public static Phrase makePhrase (int instrument, double startTime)
	{
		Note n1 = new Note(C4, QN);
		Note n2 = new Note(D4, QN);
		Note n3 = new Note(E4, QN);
		Note n4 = new Note(G4, QN);
		Note n5 = new Note(A4, QN);
		Phrase phr = new Phrase(0.0);
		phr.setInstrument(PIANO);
		phr.addNote(n1);
		phr.addNote(n2);
		phr.addNote(n3);
		phr.addNote(n4);
		phr.addNote(n5);
		return phr;
	}
}