package exercise_5_O;

public class Exercise5 
{
	public static void main(String[] args) 
	{
		Dog spot = new Dog("Spot", "Ruff!");
		Dog cruffy = new Dog("Cruffy", "Wurf!");
		Dog firulai = spot;
		
		spot.Display();
		cruffy.Display();
		
		System.out.println(spot == cruffy);
		System.out.println(spot.equals(cruffy));
		System.out.println(spot.equals(firulai));
		System.out.println(spot == firulai);

	}
}
