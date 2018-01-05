import jm.util.*;
import jm.music.data.*;

public class Sound
{
	public static void main (String[] args)
	{
		Note n = new Note(60, 8.0 , 127 , 0);
		Play.midi(n);
	}
}
