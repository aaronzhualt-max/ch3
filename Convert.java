import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a temperature in celsius: ");
		double celsius = in.nextInt();
		final double CELSIUS_TO_FAHRENHEIT = celsius*9/5+32;
		System.out.println(celsius + "=" + CELSIUS_TO_FAHRENHEIT);
	}
}	
	
