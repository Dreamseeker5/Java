package exercise_2_O;

public class Exercise2 
{
	public static void main(String[] args) 
	{
		TestClass testObj1 = new TestClass(1.5f);
		TestClass testObj2 = new TestClass(2.5f);
		
		System.out.println(testObj1.a);
		System.out.println(testObj2.a);
		
		testObj1 = testObj2;
		
		System.out.println(testObj1.a);
		System.out.println(testObj2.a);
	}

}
