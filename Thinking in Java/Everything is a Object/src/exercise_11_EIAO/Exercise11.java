package exercise_11_EIAO;

public class Exercise11 
{
	public static void main(String[] args) 
	{
		AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
		System.out.print(rainbow.anIntegerRepresentingColors + "\n");
		rainbow.changeTheHueOfTheColor(10);
		System.out.print(rainbow.anIntegerRepresentingColors + "\n");

	}

}
