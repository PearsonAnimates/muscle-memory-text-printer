package stupid.model;

import stupid.model.PlayDohFish;

public class PlayDohFish
{
	//Declaration Section
	//Data member Section
	private int size;
	
	public PlayDohFish()
	{
		this.size = 5;
	}
	
	public PlayDohFish(int size)
	{
		this.size = size;
	}
	
	public String toString()
	{
		String description = "I am a fish, I am " + size + "ft long.";
		return description;
	}

}
