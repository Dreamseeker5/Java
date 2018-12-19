package exercise_4_CE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise4 
{
	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Put a number: ");
			try
			{
				int a = Integer.parseInt(br.readLine());
				for(int j = 2; j <= a; j++)
				{
					if(a % j == 0 && j != a)
					{
						System.out.println(a + " is a NOT prime number.");
						break;
					}
					
					if(j==a)
						System.out.println(a + " is a prime number.");
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}

	}

}
