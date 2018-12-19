package exercise_16_EIAO;

/**A class that represents a tree
 * 
 * @author Edgar Hernández
 *
 */
public class Tree 
{
	int height;
	
	/**
	 * Constructs a tree of zero height
	 * 
	 */
	public Tree() 
	{
		System.out.print("Planting a seedling");
		height = 0;
	}
	
	/**Constructs a tree with the specified height
	 * 
	 * @param initialHeight The tree's height 
	 */
	public Tree(int initialHeight) 
	{
		height = initialHeight;
		System.out.print("Creating new Tree that is " + height + " feet tall");
	}
	
	/**Describes the tree
	 * 
	 */
	public void info() 
	{
		System.out.print("Tree is " + height + " feet tall");
	}
	
	/**Describes the tree
	 * 
	 * @param s A string to append at the beginning of the description
	 */
	public void info(String s) 
	{
		System.out.print(s + ": Tree is " + height + " feet tall");
	}
}
