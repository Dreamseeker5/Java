package exercise_7_O;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exercise7 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Flip the coin?: ");
		try
		{
			while(!br.readLine().isEmpty())
			{
				boolean test = rand.nextBoolean();
				System.out.println(test);
				
				System.out.print("Flip the coin?: ");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
