import jm.util.*;
import jm.music.data.*;
import jm.JMC;

public class ParameterTest
{
	public static Note makeNote(int pitch, double duration)
	{
		Note n1 = new Note(pitch, duration);
		return n1;
	}
	public static void main(String[] args)
	{
		Note noteOne = makeNote(60,4.0);
		Play.midi(noteOne);
	}
}
