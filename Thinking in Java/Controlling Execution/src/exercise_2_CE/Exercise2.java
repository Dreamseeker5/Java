package exercise_2_CE;

import java.util.*;

public class Exercise2 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		for(int i = 0; i < 25; i++)
		{
			int a = rand.nextInt(21);
			int b = rand.nextInt(21);
			if(a > b)
				System.out.println(a + " is greater than " + b);
			else if(a < b)
				System.out.println(a + " is lesser than " + b);
			else
				System.out.println(a + " is equal to " + b);
		}
	}

}
