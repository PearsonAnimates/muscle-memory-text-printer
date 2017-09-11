package stupid.controller;

import java.util.Scanner;

import stupid.model.PlayDohCircle;
import stupid.model.PlayDohFish;

public class StupidController
{
	public StupidController()
	{
		
	}
	
	public void start()
	{
		System.out.println("I hate this command so much!!! :D");
		System.out.println("FRACK THIS COMMAND!!! I'm done, goodbye. :D");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How big of a circle do you want?");
		int circleSize = myScanner.nextInt();
		
		PlayDohCircle thirdCircle = new PlayDohCircle(circleSize);
		System.out.println(thirdCircle);
		
		PlayDohFish firstFish = new PlayDohFish();
		PlayDohFish secondFish;
		secondFish = new PlayDohFish();
		
		System.out.println("Omg I made a fish!");
		System.out.println(firstFish);		
		System.out.println(secondFish);
		
		PlayDohFish thirdFish = new PlayDohFish(10);
		System.out.println(thirdFish);
		
		testScanner();
	}
			
	@SuppressWarnings("resource")
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.next();
		System.out.println("Cool, you like eating " + answer + ". Sounds delicious, I might try a piece, my time is up now though, goodbye.");
	}
	
}
