package exercise_5_EIAO;

public class Exercise5 
{
	public static void main(String[] args) 
	{
		DataOnly testObject = new DataOnly();
		testObject.b = true;
		testObject.d = 5.5;
		testObject.i = 5;
		System.out.print(testObject.b + ", " + testObject.d + ", " + testObject.i);
	}

}
