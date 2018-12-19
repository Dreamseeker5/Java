package exercise_5_O;

public class Dog 
{
	String name, says;
	
	Dog(String name, String says)
	{
		this.name = name;
		this.says = says;
	}
	
	void Display()
	{
		System.out.println(name + "says: " + says);
	}
}
