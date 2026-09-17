import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an amount of seconds: ");
		int seconds = in.nextInt();
		int hours = seconds/3600;
		int placeHolder = seconds - (hours*3600);
		int minutes = placeHolder/60;
		int placeHolder2 = placeHolder - (minutes*60);
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds%n", seconds, hours, minutes, placeHolder2);
	}
}

