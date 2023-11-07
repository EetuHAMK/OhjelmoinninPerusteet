import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main (String[] args) {
    //	1: TAULUKKO
    //     String[] taulukko = new String[3];
            
    //     taulukko[0] = "Green";
    //     taulukko[1] = "Blue";
    //     taulukko[2] = "Yellow";
            
    //     System.out.println(taulukko[1]);
            
    //     for (int items = 0; items < taulukko.length; items++) {
    //         System.out.println(taulukko[items]);
    //     }
	// //  2: LISTA
	// 	String[] lista = {
	// 		"Actions speak louder than words.",
	// 		"A barking dog never bites.",
	// 		"A penny saved is a penny earned.",
	// 		"All things come to those who wait."
    //     };
        
        Scanner in = new Scanner(System.in);
        
    //     System.out.println("Pick number from 1-4.");
    //     int userInput = in.nextInt();
        
    //     if (userInput >= 1 && userInput <= 4) {
    //         String userNumber = lista[userInput - 1];
	// 		System.out.println(userNumber);
    //     }
	// //  3.1: TAULUKKO
	// 	String[] taulukko2 = new String[3];
	// 		taulukko2[0] = "Green";
	// 		taulukko2[1] = "Blue";
	// 		taulukko2[2] = "Yellow";

	// 	System.out.println(taulukko2[1]);
    // //  3.2
    //     for (int i = 0; i < taulukko2.length; i++) {
    //         System.out.println((i + 1) + ". " + taulukko2[i]);
    //     }

    // //  4. LISTA:
	// 	String[] furniture = {"Table", "Sofa", "Shelf", "Painting"};
		
    //     for (String item : furniture) {
    //         if (item.equals("Sofa")) {
    //             System.out.println("Sofa found");
    //         }
    //     }

    // //  5.
    //     int[] numbers = {3, 6, 1};
    //     int sum = 0;

    //     for (int i = 0; i < numbers.length; i++) {
    //         sum += numbers[i];
    //     }
        
    //     System.out.println(sum);
    // //  6.
    //     int[] numbers1 = {16, 18, 5, 3, 10};
        
    //     int smallestValue = 0;
        
    //     for (int i = 0; i < numbers1.length; i++)
    //         if (numbers1[i] <= smallestValue) {
    //             smallestValue = numbers1[i];
    //         }
    //     System.out.println(smallestValue);

    //  7:
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Renault");
        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));

        System.out.println("MODIFIED LIST");
        cars.set(1, "Ford");
        cars.remove("Tesla");
        cars.set(2, "Audi");
        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));
	 
        System.out.println("SORTED LIST");
    
        Collections.sort(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
	}
}
