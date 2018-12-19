package exercise_16_EIAO;

/**"Thinking in Java" book, "Everything is a Object" chapter, exercise number 16.
 * Documenting overloading example
 * @author Edgar Hernández
 *
 */
public class Exercise16 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 5; i++) 
		{
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
			// Overloaded constructor:
			new Tree();
	}

}
