import java.util.*;

public class Lab9Excercise3
{
	public static void main(String[] args)
	{
		char [][] gameboard = new char [3][3];
		
		System.out.println("Player 1 you are X's");
		System.out.println("Player 2 you are O's");
		System.out.println("");
		
		//Changes all that values of gameboard from NULL to spaces
		for(int i = 0; i<=2; i++)
		{
			gameboard[i][0] = ' ';
			gameboard[i][1] = ' ';
			gameboard[i][2] = ' ';
		}
		
		do
		{
			playerOneTurn(gameboard);
			checkWin(gameboard); 
			playerTwoTurn(gameboard);
			checkWin(gameboard);
			printBoard(gameboard);
		}
		while(checkWin(gameboard) == false);
		
		if(checkWin(gameboard) == false)
		{
		printBoard(gameboard);
		}
		
	}
	
	public static void playerOneTurn(char [][] gameboard)
	{
		//Picking the X-Coordinare for player 1, between 0-2
		if(checkWin(gameboard) == false)
		{
			System.out.println("Player 1 pick your x coordinate 0-2 .");
		}
		Scanner input = new Scanner(System.in);
		int playerOneXCoord = input.nextInt();
		//Making sure the X-Coordinate will be in bounds
		while(playerOneXCoord > 2 && playerOneXCoord < 0)
		{
			System.out.println("Please pick a number between 0 and 2.");
			new Scanner(System.in);
			playerOneXCoord = input.nextInt();
		}
		
		//Picking the Y-Coordinate for player 1, between 0-2
		System.out.println("Player 1 pick your y coordinate 0-2 .");
		new Scanner(System.in);
		int playerOneYCoord = input.nextInt();
		//Making sure the Y-Coordinate will be in bounds
		while(playerOneYCoord > 2 && playerOneYCoord < 0)
		{
			System.out.println("Please pick a number between 0 and 2.");
			new Scanner(System.in);
			playerOneYCoord = input.nextInt();
		}
		
		if(checkFree(gameboard, playerOneXCoord, playerOneYCoord) == true)
		{
			System.out.println("Thank you.");
			gameboard[playerOneXCoord][playerOneYCoord] = 'X';
		}
		else
		{
			System.out.println("This spot is taken. Please pick again.");
			System.out.println("Player 1 pick your x coordinate 0-2 .");
			new Scanner(System.in);
			playerOneXCoord = input.nextInt();
			System.out.println("Player 1 pick your y coordinate 0-2 .");
			new Scanner(System.in);
			playerOneYCoord = input.nextInt();
			gameboard[playerOneXCoord][playerOneYCoord] = 'X';	
		}
		
		
	}
	
	public static void playerTwoTurn(char [][] gameboard)
	{
		//Picking the X-Coordinare for player 2, between 0-2
		if(checkWin(gameboard) == false)
		{
			System.out.println("Player 2 pick your x coordinate 0-2 .");
		}
		Scanner input = new Scanner(System.in);
		int playerTwoXCoord = input.nextInt();
		//Making sure the X-Coordinate will be in bounds
		while(playerTwoXCoord > 2 && playerTwoXCoord < 0)
		{
			System.out.println("Please pick a number between 0 and 2.");
			new Scanner(System.in);
			playerTwoXCoord = input.nextInt();
		}
		
		//Picking the Y-Coordinate for player 2, between 0-2
		System.out.println("Player 2 pick your y coordinate 0-2 .");
		new Scanner(System.in);
		int playerTwoYCoord = input.nextInt();
		//Making sure the Y-Coordinate will be in bounds
		while(playerTwoYCoord > 2 && playerTwoYCoord < 0 )
		{
			System.out.println("Please pick a number between 0 and 2.");
			new Scanner(System.in);
			playerTwoYCoord = input.nextInt();
		}
		
		// TODO, pass in gameboard to checkFree
		if(checkFree(gameboard, playerTwoXCoord, playerTwoYCoord) == true)
		{
			System.out.println("Thank you.");
			gameboard[playerTwoXCoord][playerTwoYCoord] = 'O';
		}
		else
		{
			System.out.println("This spot is taken. Please pick again.");
			System.out.println("Player 2 pick your x coordinate 0-2 .");
			new Scanner(System.in);
			playerTwoXCoord = input.nextInt();
			System.out.println("Player 2 pick your y coordinate 0-2 .");
			new Scanner(System.in);
			playerTwoYCoord = input.nextInt();
			gameboard[playerTwoXCoord][playerTwoYCoord] = 'O';
		}
		
		
	}
	
	public static boolean checkWin(char [][] gameboard)
	{
		if((((gameboard[0][0] == 'X' && gameboard[0][1] == 'X' && gameboard[0][2] == 'X') ||
		(gameboard[0][0] == 'O' && gameboard[0][1] == 'O' && gameboard[0][2] == 'O')) ||

		((gameboard[1][0] == 'X' && gameboard[1][1] == 'X' && gameboard[1][2] == 'X') || 
		(gameboard[1][0] == 'O' && gameboard[1][1] == 'O' && gameboard[1][2] == 'O')) ||

		((gameboard[2][0] == 'X' && gameboard[2][1] == 'X' && gameboard[2][2] == 'X') ||
		(gameboard[2][0] == 'O' && gameboard[2][1] == 'O' && gameboard[2][2] == 'O'))) ||

		((gameboard[0][0] == 'X' && gameboard[1][0] == 'X' && gameboard[2][0] == 'X') ||
		(gameboard[0][0] == 'O' && gameboard[1][0] == 'O' && gameboard[2][0] == 'O')) ||

		((gameboard[0][1] == 'X' && gameboard[1][1] == 'X' && gameboard[2][1] == 'X') ||
		(gameboard[0][1] == 'O' && gameboard[1][1] == 'O' && gameboard[2][1] == 'O')) ||

		(((gameboard[0][2] == 'X' && gameboard[1][2] == 'X' && gameboard[2][2] == 'X') ||
		(gameboard[0][2] == 'O' && gameboard[1][2] == 'O' && gameboard[2][2] == 'O'))))
		{
			System.out.println("YOU WIN!!!");
			printBoard(gameboard);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// TODO, add gameboard parameter
	public static boolean checkFree(char [][] gameboard, int xCoord, int yCoord)
	{
		if(gameboard[xCoord][yCoord] == ' ')
		{
		//TODO, compare gameboard[x][y], if it is open, return true, if it is 'X' || 'Y' return false
		return true;
		}
		else
		{
		return false;
		}
	}
	
	
	// TODO pass gameboard in here, don't hardcode values
	// reaplce each X and O with a gameboard[][]
	public static void printBoard(char [][] gameboard)
	{
		System.out.println(gameboard[0][0] + " | " + gameboard[0][1] + " | " + gameboard[0][2]);
		System.out.println("-----------");
		System.out.println(gameboard[1][0] + " | " + gameboard[1][1] + " | " + gameboard[1][2]);
		System.out.println("-----------");
		System.out.println(gameboard[2][0] + " | " + gameboard[2][1] + " | " + gameboard[2][2]);
	}
}