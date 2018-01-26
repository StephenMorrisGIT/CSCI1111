import java.util.*;
import jm.util.*;
import jm.music.data.*;
import jm.JMC;

public class LoopMusic implements JMC
{
	public static void main(String[] args)
	{
	int userNumNotes = 0;
	System.out.println("How many notes do you want?");
	Scanner input = new Scanner(System.in);
	userNumNotes  = input.nextInt();
	
	Phrase phraseOne = makePentPhrase(userNumNotes);
	Play.midi(phraseOne);
	}
	
	public static Phrase makePentPhrase(int userNumNotes)
	{
	int numNotes = userNumNotes;
	Phrase phr = new Phrase(0.0);
	phr.setInstrument(PIANO);
		
	for(int i=0; numNotes>0; numNotes--)
		{
		Random number = new Random();
		int noteChoice = number.nextInt(5);
		
		if(noteChoice == 0)
			{
			Note n1 = new Note(C4, QN);
			phr.addNote(n1);
			}
		else if(noteChoice == 1)
			{
			Note n2 = new Note(D4, QN);
			phr.addNote(n2);
			}
		else if(noteChoice == 2)
			{
			Note n3 = new Note(E4, QN);
			phr.addNote(n3);
			}
		else if(noteChoice == 3)
			{
			Note n4 = new Note(G4, QN);
			phr.addNote(n4);
			}
		else if(noteChoice == 4)
			{
			Note n5 = new Note(A4, QN);
			phr.addNote(n5);
			}
		}
		return phr;

	}
}