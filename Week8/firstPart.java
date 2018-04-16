import jm.music.data.*;
import jm.util.*;
import jm.JMC;

public class firstPart implements JMC
{
	public static void main(String[]args)
	{
		Part bellPart = new Part(CRYSTAL, 1);
		Phrase newPhrase = new Phrase(0.0);
		Phrase phr = new Phrase();
		for(int i = 0; i <5; i++)
		{
			phr.addNote(C4,QN);
			newPhrase.addNote(G4,QN);
		}
		bellPart.addPhrase(newPhrase);
		bellPart.addPhrase(phr);
		Play.midi(bellPart);
	}
}
