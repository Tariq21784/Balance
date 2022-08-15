//Write an application that prompts the user for a checking account balance and a savings account balance 
//(The balance of these two account should be generated automatically by the program 
//within this range 1 to 100 rand  and stored into an array ). 
//Display the message “Checking account balance is low” if the checking account balance is less than R10. 
//Display the message “Savings account balance is low” if the savings account balance is less than R100. 
//Save the file as Balance.java.
//1. Use of a random function- 5
//2. use of an array to store the generated balance -5
//3. use of an if statement -5
//4. Display of correct output -10

// Took me a while to realise i have to import the random function
// Scanner seems to be a mainstay if you expect user input
import java.util.Random;
import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int generatedBalances[] = new int[2];
		
		// This is a random number generator
		Random r = new Random();
		generatedBalances[0] = r.nextInt(100) + 1;
		generatedBalances[1] = r.nextInt(100) + 1;
		System.out.println("1. Display checking account balance");
		System.out.println("2. Display savings account balance");
		System.out.print("Your choice: ");
		int choice = keyboard.nextInt();

		// by not adding a choice == 2 you reduce the minimum code lines needed
		// working on error handling, to catch unexpected input 
		if (choice == 1) {
			if (generatedBalances[0] < 10) {
				System.out.println("Checking account balance is low");
			} 
			else {
				System.out.println("Checking account balance is " + generatedBalances[0]);
			}
		} 
		
		if (choice == 2) {
			if (generatedBalances[1] < 100) {
				System.out.println("Savings account balance is low");
			} 
			else {
				System.out.println("Savings account balance is " + generatedBalances[1]);
			}
		}

		else {
			System.out.println("You did not enter one of the two options");
		}

		// effectively ends the program, shortest method i know so far
		keyboard.close();
	}
}