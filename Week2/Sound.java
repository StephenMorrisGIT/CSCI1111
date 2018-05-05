/*
** This program uses java music and creates and plays a single note.
** The program only has one method (main) and uses two statements in main.
**
** Created for CSCI1111
** Designer: Stephen Morris
** Date Created:						Last Modified: May 5th, 2018
** Email: smorris.winchester@gmail.com
*/

import jm.util.*;
import jm.music.data.*;

public class Sound
{
	// Only method
	public static void main (String[] args)
	{
		// Creates note n(pitch, duration, pan, loudness)
		Note n = new Note(60 , 8.0 , 127 , 0);
		// Plays notes
		Play.midi(n);
	}
}
