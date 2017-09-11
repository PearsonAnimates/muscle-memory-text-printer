package stupid.controller;

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
		
		PlayDohCircle thirdCircle = new PlayDohCircle(10);
		System.out.println(thirdCircle);
		
		PlayDohFish firstFish = new PlayDohFish();
		PlayDohFish secondFish;
		secondFish = new PlayDohFish();
		
		System.out.println("Omg I mad a fish!");
		System.out.println(firstFish);		
		System.out.println(secondFish);
		
		PlayDohFish thirdFish = new PlayDohFish(10);
		System.out.println(thirdFish);
		
	}
	
}
