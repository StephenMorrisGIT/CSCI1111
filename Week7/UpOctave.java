import java.util.*;
import jm.util.*;
import jm.music.data.*;
import jm.JMC;

public class UpOctave implements JMC
{
	public static void main (String[] args)
	{
		Phrase phr = new Phrase(0.0);
		phr.setInstrument(PIANO);
		for(int i = 60; i < 127; i+=12)
		{
			for(int a = 0; a <=3 && i < 120; a++)
			{
				i += 2;
				Note n1 = new Note(i, QN);
				phr.addNote(n1);
			}
		}
	Play.midi(phr);
	}
}