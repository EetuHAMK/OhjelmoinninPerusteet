import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String answer;
		double num1;
		double num2;
		double sum = 0;

		System.out.println("Kirjoita 1. numero.");
		answer = in.nextLine();
		num1 = Integer.parseInt(answer); 

		System.out.println("Kirjoita 2. numero.");
		answer = in.nextLine();
		num2 = Integer.parseInt(answer); 

		// sum = (num1 + num2);
		// System.out.println("Tulos on " + sum + ".");

		// if (sum > 10)
		// {
		//	System.out.println("Tulos on yli 10, tulos on " + sum + ".");		
		// }
		// 	System.out.println("Haluatko laskea luvut yhteen vai vähentää. Kirjoita 'plus' tai 'miinus'.");
		// answer = in.nextLine();

		// if (answer.equals("plus"))
		//	{
		//	sum = num1 + num2;
		//	}
		//		if (answer.equals("miinus"))
		//	{
		//	sum = num1 - num2;
		//	}
		//	System.out.println("Tulos on " + sum);

		sum = (num1 / num2);
		System.out.println("Jakolaskun tulos on " + sum + ".");
	}	

}
