package stupid.controller;

import java.util.Scanner;

import stupid.model.PlayDohCircle;

public class StupidController
{
	public StupidController()
	{
		
	}
	
	public void start()
	{
		System.out.println("I hate this command so much!!! :D");
		System.out.println("FRACK THIS COMMAND!!! I'm done, goodbye. :D");
		
		testScanner();
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		
	}
	
	@SuppressWarnings("resource")
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.next();
		System.out.println("Cool, you like " + answer + " then? Well then, I don't like you, goodbye");
	}

}
