import java.util.*;

public class Lab11Excercise1
{
	public static void main (String [] args)
	{
		char[][] gameBoard = initializeBoard();
		char[][] gameBoardPrint = printBoard(gameBoard);
		
		for(int x = 1; x >= 0; x++)
		{
			int[] Coordinates = getInput(gameBoard);
			// Game tells you that you lose and ends the game if you chose to guess a coordinate and picked a bomb
			if(Coordinates[2] == 1 && (gameBoard[(Coordinates[0])][(Coordinates[1])] == '@'))
			{
				System.out.println("BOOM! YOU LOSE.");
				break;
			}
			/* Runs checkWin and if it comes back true it prints a win statement and exits the game
			* Only does this after you have won and taken another turn
			*/
			else
			{
				revealSpace(gameBoard, Coordinates);
				guessBomb(gameBoard, Coordinates, gameBoardPrint);
				if(checkWin(gameBoard, Coordinates, gameBoardPrint) == true)
				{
					System.out.println("CONGRADULATIONS!!! YOU WIN!");
					break;
				}
				printBoard(gameBoard);
			}
		}
		printBoard(gameBoard);
	}
	
	public static char[][] printBoard(char[][] gameBoard)
	{
		int size = gameBoard.length;
		// Character array that will get its values changed so gameBoard won't be changed
		char[][] gameBoardPrint = new char[gameBoard.length][gameBoard.length];
		// Copies all of the values of gameBoard into gameBoardPrint
		/*
		for(int b = 0; size > b; b++)
		{
			for(int c = 0; size > c; c++)
			{
				if(gameBoardPrint[b][c] == 'X')
				{
					gameBoardPrint[b][c] = 'X';
				}
				else
				{
					gameBoardPrint[b][c] = gameBoard[b][c];
				}
			}
		}
		
		for(int b = 0; size > b; b++)
		{
			for(int c = 0; size > c; c++)
			{
				if(gameBoardPrint[b][c] == '@')
				{
					gameBoardPrint[b][c] = '#';
					System.out.print(gameBoardPrint[b][c]);
				}
				else if(gameBoardPrint[b][c] == 'X')
				{
					System.out.print('X');
				}
				else
				{
					System.out.print(gameBoardPrint[b][c]);
				}
				//System.out.print(gameBoardPrint[b][c]);
			}
			System.out.println("");
		}
		*/
		for(int b = 0; size > b; b++)
		{
			for(int c = 0; size > c; c++)
			{
				System.out.print(gameBoard[b][c]);
			}
			System.out.println("");
		}
		return gameBoardPrint;
	}
	
	public static int[] getInput(char[][] gameBoard)
	{
		// Gives the user a second choice, to check for bombs
		System.out.println("Do you want to enter a coordinate (1) or guess a bomb (2)");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		int XCoord = 0;
		int YCoord = 0;
		// First two int slots are for coordinates, the third is for choice 1 or choice 2
		int [] Coordinates = new int [3];
		
		// Make sure the user input is a valid choice
		while(choice < 1 || choice >2)
		{
			System.out.println("Please choose either 1 (Guess coordinates) or 2 (Guess bomb)");
			new Scanner(System.in);
			choice = input.nextInt();
		}
		
		// Gives you options to enter coordinates to guess open squares
		if(choice == 1)
		{
			System.out.println("Please enter your X-Coordinate.");
			new Scanner(System.in);
			XCoord = input.nextInt();
			System.out.println("Please enter your Y-Coordinate.");
			new Scanner(System.in);
			YCoord = input.nextInt();
			
			// Makes sure the coordinates entered are inbounds, asks you for new coordinates if out of bounds
			while(checkValidCoord(gameBoard , Coordinates) == false)
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
			Coordinates[2] = 1;
		}
		
		// Gives you the option to guess coordinates to guess a bomb
		if(choice == 2)
		{
			System.out.println("Enter X-Coordinate of Bomb.");
			new Scanner(System.in);
			XCoord = input.nextInt();
			System.out.println("Enter Y-Coordinate of Bomb.");
			new Scanner(System.in);
			YCoord = input.nextInt();
			
			// Makes sure the coordinates entered are inbounds, , asks you for new coordinates if out of bounds
			while(checkValidCoord(gameBoard , Coordinates) == false)
			{
				System.out.println("Invalid Coordinates");
				System.out.println("Please enter your new X-Coordinate. Between 0-" + gameBoard.length + ".");;
				new Scanner(System.in);
				XCoord = input.nextInt();
				System.out.println("Please enter your new Y-Coordinate. Between 0-" + gameBoard.length + ".");				
				new Scanner(System.in);
				YCoord = input.nextInt();
			}
			Coordinates[2] = 2;
			
		}
		Coordinates[0] = XCoord;
		Coordinates[1] = YCoord;
		return Coordinates;
	}
	
	// Every loop will check this but something only happens if you choose to check for a bomb
	public static void guessBomb(char[][] gameBoard , int[] Coordinates, char[][] gameBoardPrint)
	{
		if(Coordinates[2] == 2)
		{
			gameBoard[Coordinates[0]][Coordinates[1]] = 'X';
		}
	}
	
	public static char[][] initializeBoard()
	{
		// Asks the user for the desired size of the board
		System.out.println("What size board do you want (4 - 100)?");
		Scanner scan = new Scanner(System.in);
		int boardSize = scan.nextInt();
		/* 
		* Makes sure the board is between 4 and 100 characters
		* If the board is out of bounds then it asks for the user to pick a new size
		*/
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
		// Sets empty spaces ' ' to #'s
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
		// Makes sure that the entered coordinates are in bounds
		if((Coordinates[0] >= gameBoard.length || Coordinates[1] >= gameBoard.length) 
		||(Coordinates[0] < 0 || Coordinates[1] < 0))
		{
			return false;
		}
		/* Checks if the coordinates you guess contain a char '@' or '#'
		* If it containers neither then you must have already guessed so the coordinates is not valid
		*/
		else if(gameBoard[(Coordinates[0])][(Coordinates[1])] != '@' && gameBoard[(Coordinates[0])][(Coordinates[1])] != '#')
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static void revealSpace(char[][] gameBoard , int[] Coordinates)
	{
		int b = 0;
				
		if(Coordinates[2] == 1)
		{
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
	
	public static boolean checkWin(char[][] gameBoard , int[] Coordinates, char[][] gameBoardPrint)
	{
		boolean win = false;
		int bomb = 0;
		
		for(int a = 0; gameBoard.length > a; a++)
		{
			for(int b = 0; gameBoard.length > b; b++)
			{
				if(gameBoard[a][b] == '@')
				{
					bomb ++;
				}	
			}
		}
		
		if(bomb == 0)
		{
			win = true;
		}
		return win;
	}
}