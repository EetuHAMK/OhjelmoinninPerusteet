import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String answer;
		double numericAnswer;
		double sum;
		
		// answer= "Hello";
		
//		System.out.println("Please, write something: ");
//		answer = in.nextLine();
		
//		System.out.println(answer);
		
//		System.out.println("Give me a number: ");
//		answer = in.nextLine();
//		
//		sum = Integer.parseInt(answer) + 10;
		
//		System.out.println(sum);
		
		System.out.println("Give me a number: ");
		numericAnswer = in.nextDouble();
		
		sum = numericAnswer + 10;
		
		System.out.println(sum);
	}

}
