package exercise_6_CE;

public class Exercise6 
{
	public static void main(String[] args) 
	{
		test(5,3,1,10);
		test(5,3,6,10);
	}
	
	static int test(int testval, int target, int begin, int end) 
	{
		if(testval >= begin && testval <= end)
			System.out.println("Within range");
		else
			System.out.println("Out of range");
		
		if(testval > target)
			return +1;
		else if(testval < target)
			return -1;
		else
			return 0; // Match
	}

}
