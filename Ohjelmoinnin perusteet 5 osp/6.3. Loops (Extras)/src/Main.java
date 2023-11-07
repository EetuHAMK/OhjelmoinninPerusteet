import java.util.Scanner;

public class Extra {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String answer = "";
        String mark = "*";

        System.out.println("How many rows?");
        answer = in.nextLine();
        int rows = Integer.parseInt(answer);
        
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print(mark);
            }
            System.out.println();
        }
    } 
}
