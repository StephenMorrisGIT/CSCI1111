import java.util.*;
import jm.util.*;
import jm.music.data.*;
import jm.JMC;

public class FiveNotes implements JMC
{
	public static void main(String[] args)
	{
		int userInput = userInstrument();
		Phrase newPhrase = makePhrase();
		Phrase playPhrase = setPhraseInstrument(userInput, newPhrase);
		Play.midi(playPhrase);
	}
	
	public static Phrase makePhrase ()
	{
		Note n1 = new Note(A4, HN);
		Note n2 = new Note(B4, HN);
		Note n3 = new Note(C4, HN);
		Note n4 = new Note(D4, HN);
		Note n5 = new Note(E4, HN);
		Phrase phr = new Phrase(0.0);
		phr.setInstrument(PIANO);
		phr.addNote(n1);
		phr.addNote(n2);
		phr.addNote(n3);
		phr.addNote(n4);
		phr.addNote(n5);
		return phr;
		
	}
	
	public static int userInstrument()
	{
		System.out.println("What instrument do you want");
		Scanner input = new Scanner(System.in);
		int instrumentChoice  = input.nextInt();
		return instrumentChoice;
	}
	
	public static Phrase setPhraseInstrument(int userInput, Phrase newPhrase)
	{
		Phrase finalPhr = newPhrase;
		finalPhr.setInstrument(userInput);
		return finalPhr;
	}
}