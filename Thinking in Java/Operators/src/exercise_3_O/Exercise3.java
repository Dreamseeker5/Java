package exercise_3_O;

public class Exercise3 
{
	public static void main(String[] args) 
	{
		TestClass testObj = new TestClass();
		testObj.value = 5;
		
		System.out.println(testObj.value);
		
		probeAliasingIsReal(testObj);
		
		System.out.println(testObj.value);
	}
	
	static void probeAliasingIsReal(TestClass reference)
	{
		reference.value = 10;
	}

}
