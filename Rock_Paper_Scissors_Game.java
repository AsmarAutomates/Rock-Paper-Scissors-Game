package day4;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors_Game {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

		System.out.println(" Welcome to !!! Rock, Paper, Scissors Game !!!");
		
		//User Input
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println(" Enter the User Choice ");
		System.out.println(" 0-Rock, 1-Paper, 2-Scissors");
		int UserChoice = Scanner.nextInt();
		System.out.println(UserChoice);
		
		
		
		//Validate Input - User Choice
		
		if (UserChoice<0 ||UserChoice>2)
		{ System.out.println("Invalid choice - Please run the program again and enter 0, 1 or 2");
		 return;
		}
		
		//Generate computer's random choice
		
		int ComputerChoice = new Random().nextInt(3);
		System.out.println(ComputerChoice);

		// Determine the winner
		
		if (UserChoice == ComputerChoice)
			
			System.out.println("its a tie, play again");
		
		else if 
		
		((UserChoice ==0 && ComputerChoice == 2) ||
		(UserChoice ==1 && ComputerChoice == 0) ||
		(UserChoice ==2 && ComputerChoice == 1))
		
		System.out.println("User Wins ! Congratulations!!!");
		
		else
		
			System.out.println("Computer Wins!");
		
		Scanner.close();
	}

}
