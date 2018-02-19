import java.util.*; 
import jm.music.data.*;
import jm.JMC;

public class argsPhrase implements JMC
{
	public static Phrase makePhrase(int numNotes, double duration)
	{
		int[] pitches = {60, 62, 64, 67, 69};
		Phrase newPhrase = new Phrase (0.0);
		for int i = 0; i < numNotes -1; i++
		{
			int randNum = (int) (Math.random()*4);
			newPhrase.addNote(new Note(pitches[randNum], duration));
		}
		newPhrase.addNote(pitches[0], 8.0);
		newPhrase.setInstrument(CRYSTAL);
		return newPhrase;
	}
	
	public static void main(String[] args)
	{
		int numNotes = Integer.parseInt(args[0]);
		double duration = Double.parseDouble(args[1]);
		Play.midi(makePhrase(numNotes, duration));
	}
}