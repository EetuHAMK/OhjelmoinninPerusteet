// Ohje:
    // Tavoite:
    //  -   Oppia tekemään toistorakenteen ja lukemaan käyttäjän konsoliin kirjoittaman syötteen.

    // Tehtävänanto:
    //  -   Tee arvauspeli, joka pyytää arvaamaan nimen. Jos käyttäjä arvaa oikein, onnitellaan ja peli loppuu. Jos käyttäjä arvaa väärin, pyydetään arvaamaan uudestaan.
    //  Vinkki! Kannattaa ensin tehdä peli sellaiseksi, että se ei toista kysymyksiä väärin vastatessa, eli peli on ohi kertayrittämällä. Lisää lopuksi toistorakenne.
    //  -   Mitä toistorakennetta kannattaisi käyttää (while, for, do - while...
    // Jos arvauspeli toimii yllä kuvatulla tavalla, kokeile halutessasi lopuksi:
    //  -   Kerro, monta kertaa käyttäjä arvasi.
    //  -   Anna mahdollisuus, että jos kirjoittaa vaikka "loppu", peli loppuu, vaikka nimeä ei olisi arvannut.

    // Extra (Ei tarvita ohjelmoinnin perusteissa)
    //  -   Jos käyttäjä vastaa väärin, tulosta oikean vastauksen ensimmäinen kirjain. Jos käyttäjä vastaa toisen kerran väärin, tulosta käyttäjälle oikean vastauksen toinen kirjain (tai kaksi ensimmäistä) jne. Vinkki käytä metodeja substring tai charAt

import java.util.Scanner;

public class Arvauspeli {
    
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

// Arvauspeli //

    // 1: Intro:
        System.out.println("\n" +
        "Tervetuloa Arvauspeliin!" +
        "\n" +
            "  - pelin ideana on arvata nimi oikein..." +
        "\n" +
            "  - nimi voi olla mikä tahansa..." +
        "\n" +
            "  - onnea yritykseen - aloitetaan!" +
        "\n" +
            "  ...psst, jos tahdot poistua pelistä kirjoita 'loppu'.");
        

    // 2: Arvot:
        String name = "Martta";
        String guess;
        int guesses = 0;
        boolean gameOn = true;

    // 3: Toistorakenne:
        while (gameOn)
        {
            System.out.println("\n" +
            "Arvaa nimi: ");
            guess = in.nextLine();
            guesses += 1;

            if (guess.equalsIgnoreCase(name))
            {
                System.out.println("\n" +
                "Onnittelut - arvasit oikein!" +
                "\n" +
                "Arvasit yhteensä " + guesses + " kertaa.");
                gameOn = false;
            }
            else if (guess.equalsIgnoreCase("loppu"))
            {
                System.out.println("\n" +
                "Lopetit pelin kesken - onnea ensi kerralla!" +
                "\n");
                gameOn = false;
            }
        // Vihjeet:
            else if (guesses == 3)
            {
                System.out.println("\n" +
                "Psst... ensimmäinen kirjain on " + name.charAt(0) + "...");
            }
            else if (guesses == 6)
            {
                System.out.println("\n" +
                "Psst... toinen kirjain on " + name.charAt(1) + "...");
            }
            else if (guesses == 9)
            {
                System.out.println("\n" +
                "Psst... kolmas kirjain on " + name.charAt(2) + " | " + name.charAt(0) + name.charAt(1) + name.charAt(2) + "...");
            }
        }
    }
}
