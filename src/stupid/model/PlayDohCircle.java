package stupid.model;

import stupid.model.PlayDohCircle;

public class PlayDohCircle
{
	//Declaration Section
	//Data member Section
	private int size;

	public PlayDohCircle()
	{
		this.size = 5;
		
	}
	public PlayDohCircle(int size)
	{
		this.size = size;
	}

	public String toString()
	{
		String description = "I am a circle, my size is" + size;
		return description;
	}

}
