import java.util.Scanner;

public class Advanced {
    
    public static void main(String[] args) {
    
    // 1:

        Scanner in = new Scanner(System.in);
        
        String answer = "";
        String answer2 = "";
        
        System.out.println("First number? ");
        answer = in.nextLine();
        
        System.out.println("Last number? ");
        answer2 = in.nextLine();
        
        int num1 = Integer.parseInt(answer);
        int num2 = Integer.parseInt(answer2);
        
        for (int counter = num1 ; counter <= num2 ; counter++)
        {
            System.out.println(counter);
        }

    // 2:

    String answer3 = "";
    int guesses = 0;
    
    do
    {
        System.out.println("Guess my name (type stop to exit)");
        answer3 = in.nextLine();
        guesses++;
        
    } while (!answer3.equals("Emma") && !answer3.equals("stop"));

    if (answer.equals("Emma"))
    {
        System.out.println("Congratulations!");
        System.out.println("You guessed " + guesses + " times.");
    }
    
    else if (answer3.equals("stop"))
    {
        guesses--;
        System.out.println("You guessed " + guesses + " times.");
    }
    
    }
}