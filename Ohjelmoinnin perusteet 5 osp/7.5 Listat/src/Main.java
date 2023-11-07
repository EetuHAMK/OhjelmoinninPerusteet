import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // Luodaan Scanner-olio "skanneri" jota käytetään käyttäjän syötteiden lukemiseen:
        Scanner skanneri = new Scanner(System.in);
        
        // Luodaan lista "javelinThrows" joka tulee sisältämään keihäänheiton pituudet:
        ArrayList<Double> javelinThrows = new ArrayList<Double>();
        
        // Kysytään käyttäjältä kolme keihäänheiton pituutta, tallennetaan ne listaan ja tulostetaan ne näytölle:
        System.out.println("Throw length ");
        Double throw1 = skanneri.nextDouble();
        javelinThrows.add(throw1);
        
        System.out.println("Throw length ");
        Double throw2 = skanneri.nextDouble();
        javelinThrows.add(throw2);

        System.out.println("Throw length ");
        Double throw3 = skanneri.nextDouble();
        javelinThrows.add(throw3);
        
        // Käytetään for-silmukkaa tulostamaan tallennetut keihäänheitot listasta:
        for (int i = 0; i < javelinThrows.size(); i++)
            System.out.println("Throw " + (i + 1) + ": " + javelinThrows.get(i));
    
//      System.out.println("Throw " + (i + 1) + ": " + javelinThrows.get(i));

//          1: System.out.println(): Tämä komento tulostaa annetun tekstin (tai muun arvon) näytölle.
//          2: "Throw ": Tämä on merkkijono (string), joka sisältää sanan "Throw".
//          3: (i + 1): Tämä on lauseke, joka laskee keihäänheiton järjestysnumeron. Muuttuja i on silmukan laskuri, ja siihen lisätään 1. Koska tietokoneissa indeksointi (laskeminen) alkaa yleensä nollasta, lisäämällä 1 saadaan oikea järjestysnumero.
//          4: ": ": Tämä on merkkijono, joka sisältää kaksoispisteen ja välilyönnin. Se erottaa järjestysnumeron ja keihäänheiton pituuden toisistaan tulostuksessa.
//          5: .javelinThrows.get(i): Tämä osa koodista hakee keihäänheiton pituuden javelinThrows-listasta indeksillä i. javelinThrows on lista, joka sisältää keihäänheiton pituudet, ja get(i)-metodi hakee listasta arvon, joka sijaitsee indeksissä i.

        ArrayList<String> shoppingList = new ArrayList<>();

        while (true) {
            System.out.println("Add item (x = exit)");
            String input = skanneri.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            } else {
                shoppingList.add(input);
            }
        }

        for (String item : shoppingList) {
            System.out.println(item);
        }

        skanneri.close();
    }
}