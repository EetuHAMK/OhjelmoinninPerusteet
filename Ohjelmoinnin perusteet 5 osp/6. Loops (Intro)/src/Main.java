import java.util.Scanner;
import java.util.Random;

public class Loops_Basics {

	public static void main(String[] args) {
		
		// Scanner in = new Scanner(System.in);
	
		// int counter = 0;

		// while (counter < 5)
		// {
		// 	System.out.println(counter + 1);
		// }
		
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		String playAgain;
		
		do
		{
			System.out.println("Throwing the dice.");
			System.out.println(r.nextInt(7)+1);
			System.out.println("Play again (Y/N): ");
			playAgain = in.nextLine();

		} while (playAgain.equals("y"));

		System.out.println("Thanks for playing.");
	}

}
