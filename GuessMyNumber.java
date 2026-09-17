import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
	System.out.print("Type a number: ");
	int seconds = in.nextInt();
	System.out.println("Your guess is: " + seconds);
	Random random = new Random();
	int number = random.nextInt(100) + 1;
	System.out.println("The number I was thinking of is: " + number);
	int difference = Math.abs(seconds - number);
	System.out.println("You were off by: " + difference);
	}
}
