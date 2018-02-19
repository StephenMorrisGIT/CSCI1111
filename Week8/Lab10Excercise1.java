import java.util.*;

public class Lab10Excercise1
{
	public static void main (String [] args)
	{
		char[][] gameBoard = initializeBoard();
		printBoard(gameBoard);
		
		for(int x = 1; x >= 0; x++)
		{
			int[] Coordinates = getInput(gameBoard);
			revealSpace(gameBoard, Coordinates);
			printBoard(gameBoard);
		}
		
		
	}
	
	public static void printBoard(char[][] gameBoard)
	{
		int size = gameBoard.length;
		char[][] gameBoardPrint = new char[gameBoard.length][gameBoard.length];
		for(int b = 0; size > b; b++)
		{
			for(int c = 0; size > c; c++)
			{
				/*
				if(gameBoard[b][c] == '@')
				{
					System.out.print('#');
				}
				else
				{
					System.out.print(gameBoard[b][c]);
				}
			*/
				System.out.print(gameBoard[b][c]);
			}
			System.out.println("");
		}
	}
	
	public static int[] getInput(char[][] gameBoard)
	{
		System.out.println("Please enter your X-Coordinate.");
		Scanner input = new Scanner(System.in);
		int XCoord = input.nextInt();
		System.out.println("Please enter your Y-Coordinate.");
		new Scanner(System.in);
		int YCoord = input.nextInt();
		
		int [] Coordinates = new int [2];
		Coordinates[0] = XCoord;
		Coordinates[1] = YCoord;
		
		if(checkValidCoord(gameBoard , Coordinates) == false)
		{
			System.out.println("Invalid Coordinates");
			System.out.println("Please enter your new X-Coordinate. Between 0-" + gameBoard.length + ".");
			new Scanner(System.in);
			XCoord = input.nextInt();
			Coordinates[0] = XCoord;
			System.out.println("Please enter your new Y-Coordinate. Between 0-" + gameBoard[0].length + ".");
			new Scanner(System.in);
			YCoord = input.nextInt();
			Coordinates[1] = YCoord;
		}
		
		return Coordinates;
	}
	
	public static char[][] initializeBoard()
	{
		System.out.println("What size board do you want (4 - 100)?");
		Scanner scan = new Scanner(System.in);
		int boardSize = scan.nextInt();
		if (boardSize < 4 || boardSize > 100)
		{
			System.out.println("Cannot produce board of that size. Please pick a number between 4 - 100");
			new Scanner(System.in);
			boardSize = scan.nextInt();
		}
		char[][]gameBoard = new char [boardSize][boardSize];
		
		int size = boardSize;
		for(int b = 0; size > b; b++)
		{
			for(int c = 0; size > c; c++)
			{
				gameBoard[b][c] = ' ';
			}
		}
		//Generates the number of bombs located within the board, (Between 0 and the number of locations (boardSize * boardSize)
		Random ran = new Random();
		int numBomb = ran.nextInt(boardSize * boardSize);
		//Creates the coordinates of the bombs randomly based on the number of bombs generated
		for(int a = 0; numBomb>=a; a++)
		{
			new Random();
			int bombXCoord = ran.nextInt(boardSize);
			new Random();
			int bombYCoord = ran.nextInt(boardSize);
			//Makes sure that there is not a bomb already in that location
			if(gameBoard [bombXCoord][bombYCoord] == '@')
			{
				new Random();
				bombXCoord = ran.nextInt(boardSize);
				new Random();
				bombYCoord = ran.nextInt(boardSize);
			}
			//Set the char at the random coordinates to @
			gameBoard [bombXCoord][bombYCoord] = '@';
		}
		
		for(int b = 0; size > b; b++)
		{
			for(int c = 0; size > c; c++)
			{
				if(gameBoard[b][c]==' ')
				{
				gameBoard[b][c] = '#';
				}
			}
		}
		
		return gameBoard;
		
	}
	
	public static boolean checkValidCoord(char[][] gameBoard , int[] Coordinates)
	{
		if((Coordinates[0] >= gameBoard.length || Coordinates[1] >= gameBoard.length) 
		||(Coordinates[0] < 0 || Coordinates[1] < 0))
		{
			return false;
		}
		else
		{
			if(gameBoard[Coordinates[0]][Coordinates[1]] == '#')
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	public static void revealSpace(char[][] gameBoard , int[] Coordinates)
	{
		int b = 0;
		
		if((Coordinates[0] - 1) >= 0)
		{
			if(gameBoard[(Coordinates[0]-1)][Coordinates[1]] == '@')
			{
				b ++;
			}
		}
		
		if((Coordinates[0] - 1) >= 0 && ((Coordinates[1]-1) >= 0))
		{
			if(gameBoard[(Coordinates[0]-1)][(Coordinates[1]-1)] == '@')
			{
				b ++;
			}
		}
		
		if(((Coordinates[1]-1) >= 0))
		{
			if(gameBoard[Coordinates[0]][(Coordinates[1]-1)] == '@')
			{
				b ++;
			}
		}
		
		if((Coordinates[0] + 1) < gameBoard.length && ((Coordinates[1]-1) >= 0))
		{
			if(gameBoard[(Coordinates[0]+1)][(Coordinates[1]-1)] == '@')
			{
				b ++;
			}
		}
		
		if((Coordinates[0] - 1) >= 0 && ((Coordinates[1] + 1) < gameBoard.length))
		{
			if(gameBoard[(Coordinates[0]-1)][(Coordinates[1]+1)] == '@')
			{
				b ++;
			}
		}
		
		if(((Coordinates[1] + 1) < gameBoard.length))
		{
			if(gameBoard[(Coordinates[0])][(Coordinates[1]+1)] == '@')
			{
				b ++;
			}
		}
		
		if((Coordinates[0] + 1) < gameBoard.length && ((Coordinates[1] + 1) < gameBoard.length))
		{
			if(gameBoard[(Coordinates[0]+1)][(Coordinates[1]+1)] == '@')
			{
				b ++;
			}
		}
		
		if((Coordinates[0] + 1) < gameBoard.length)
		{
			if(gameBoard[(Coordinates[0]+1)][(Coordinates[1])] == '@')
			{
				b ++;
			}
		}
		
		char num = (char)(b + '0');
		gameBoard[Coordinates[0]][Coordinates[1]] = num;
	}
}