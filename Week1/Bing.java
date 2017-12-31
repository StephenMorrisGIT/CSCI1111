import jm.JMC;
import jm.music.data.*;
import jm.util.Play;

public final class Bing implements JMC 
{

	public static void main(String[] args) 
	{
		Play.midi(new Note(45, QN));	//C4 can be any number between 0-128
	}
}