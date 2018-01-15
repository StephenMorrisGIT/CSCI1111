import java.util.*;
import jm.music.data.*;
import jm.util.*;
import jm.JMC;

public class instrumentScan implements JMC
{
	public static void main(String[]args)
	{
		System.out.println("What pitch would you like your note to have");
		Scanner input = new Scanner(System.in);
		int GUITAR  = input.nextInt();
		playPhrase(GUITAR);
	}
	public static void playPhrase (int GUITAR)
	{
		Note n1 = new Note(G4, HN);
		Note n2 = new Note(C1, HN);
		Note n3 = new Note(A6, HN);
		Phrase phr = new Phrase(0.0);
		phr.setInstrument(GUITAR);
		phr.addNote(n1);
		phr.addNote(n2);
		phr.addNote(n3);
		Play.midi(phr);
	}
}