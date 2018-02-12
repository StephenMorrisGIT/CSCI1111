import java.util.*;

public class FirstArray
{
	public static void main(String[] args)
	{
		int [] pitches = new int [5];
		pitches [0] = 60;
		pitches [1] = 62;
		pitches [2] = 64;
		pitches [3] = 67;
		pitches [4] = 69;
		System.out.println(pitches[3]);
		pitches [3] = 68;
		System.out.println(pitches[3]);
		System.out.println("How many pitches " + pitches.length);
	}
}