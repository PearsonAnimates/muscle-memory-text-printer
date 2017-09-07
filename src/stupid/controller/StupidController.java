package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	public void start()
	{
		System.out.println("I hate this command so much!!! :D");
		System.out.println("FRACK THIS COMMAND!!! I'm done, goodbye. :D");
		
		testScanner();
	}
	
	@SuppressWarnings("resource")
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.next();
		System.out.println("Cool, you like " + answer);
	}

}
