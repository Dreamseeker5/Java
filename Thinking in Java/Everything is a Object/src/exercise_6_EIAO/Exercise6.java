package exercise_6_EIAO;

public class Exercise6 
{
	public static void main(String[] args) 
	{
		String s = "Calling all my lovelies";
		int out = new Exercise6().storage(s);
		System.out.print(out);
	}
	
	int storage(String s) 
	{
		return s.length() * 2;
	}
}
