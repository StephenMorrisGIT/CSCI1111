import java.util.*;

public class SecondArray
{
	public static void main(String[] args)
	{
		//User inputs the size of the array with a scanner
		Scanner arraySize = new Scanner(System.in);
		in numOfSpaces = arraySize.nextInt();
		int [] arr = new int[numOfSpaces];
		
		printArray(arr);
	}
	public static void printArray(int[] arr)
	{
		//Prints out all the elements except the last so there won't be an extra comma
		for(int i=0; i<list.length-1; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		//Prints out the last element that was skipped by the for loop
		System.out.println(arr[arr.length-1);
	}
}