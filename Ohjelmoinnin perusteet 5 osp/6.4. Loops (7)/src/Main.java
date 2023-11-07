import java.util.Scanner;
import java.util.Random;

public class LuckySeven {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		Boolean game_on = false;
		int coins = 0;

		System.out.println("Welcome to 'Lucky 7' - insert coin(s) to begin!");
		coins = Integer.parseInt(in.nextLine());
		
		System.out.println("Current credit is " + coins + "$ - press 'enter' when ready!");
		String begin = in.nextLine();
		
		if (begin.equals(""))
		{
			game_on = true;
		}

		while (game_on && coins >= 1)
		{
			coins -= 1;

			int num1;
			num1 = random.nextInt(10);
			System.out.println("");
			System.out.println("First number: " + num1);

			int num2;
			num2 = random.nextInt(10);
			System.out.println("Second number: " + num2);

			int num3;
			num3 = random.nextInt(10);
			System.out.println("Third number: " + num3);
				
			if (num1 == 7 || num2 == 7 || num3 == 7)
			{
				System.out.println("You rolled 7 - you won!");
				coins += 3;
				System.out.println("");
				System.out.println(" Your current credit is " + coins + "$.");
			}
			else
			{
				System.out.println("You didn't roll 7 - you lost!");
				System.out.println("");
				System.out.println(" Your current credit is " + coins + "$.");
			}
			
			System.out.println("");
            System.out.println("Wanna play again? - press 'enter' to play again!");
            String playAgain = in.nextLine();

			if (!playAgain.equals(""))
			{
				game_on = false;
			}
		}
	}
}
