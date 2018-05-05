/*
** This program implements java music and creates and plays a single note.
** The program only has one method (main) and only one statement in main.
**
** Created for CSCI1111
** Designer: Stephen Morris
** Date Created:						Last Modified: May 4th, 2018
** Email: smorris.winchester@gmail.com
*/

import jm.JMC;
import jm.music.data.*;
import jm.util.Play;

// Final declaration so JMC implementation cannot be changed
public final class Bing implements JMC
{
	// Only method in Bing class
	public static void main(String[] args)
	{
		// Note is created and played in the same statement
		Play.midi(new Note(45, QN));	//C4 can be any number between 0-128
	}
}
