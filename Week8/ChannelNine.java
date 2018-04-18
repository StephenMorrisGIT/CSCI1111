import jm.music.data.*;
import jm.util.*;
import jm.JMC;

public class ChannelNine implements JMC
{
	public static void main(String[]args)
	{
		addNoteList();
		/*
		Part drumPart = new Part(0,9);
		Phrase cymbalPhrase = new Phrase (0.0);
		Phrase handClapPhrase = new Phrase(0.0);
		for(int i = 0; i<8; i++)
		{
			cymbalPhrase.addNote(new Note(CLOSED_HI_HAT, EN));
			
			if(i==0 || i ==1)
			{
				handClapPhrase.addNote(REST, HN);
				handClapPhrase.addNote(HAND_CLAP, HN);
			}
		}
		drumPart.addPhrase(cymbalPhrase);
		drumPart.addPhrase(handClapPhrase);
		Play.midi(drumPart);
	*/
	}

	public static void addNoteList()
	{
		Part drumPart = new Part(0, 9);
		int[] pitches = {CLOSED_HI_HAT, CLOSED_HI_HAT, CLOSED_HI_HAT, CLOSED_HI_HAT};
		double[] rhythms = {QN, QN, QN, QN};
		Phrase cymbalPhrase = new Phrase(0.0);
		cymbalPhrase.addNoteList(pitches, rhythms);
		drumPart.addPhrase(cymbalPhrase);
		Play.midi(drumPart);
	}
}