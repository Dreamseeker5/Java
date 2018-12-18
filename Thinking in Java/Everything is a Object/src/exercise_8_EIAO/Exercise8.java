package exercise_8_EIAO;

public class Exercise8 
{
	public static void main(String[] args) 
	{
		StaticTestClass Obj1 = new StaticTestClass();
		StaticTestClass Obj2 = new StaticTestClass();
		
		System.out.print(Obj1.number + "\n");
		Obj2.number = 10;
		System.out.print(Obj1.number + "\n");
	}
}
