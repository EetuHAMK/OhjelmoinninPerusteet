import java.util.Scanner;

public class Login {

    // Method I | Main
    public static void main(String[] args) {

        Scanner skanneri = new Scanner(System.in);
       
        System.out.println("Etunimi: ");
        String etunimi = skanneri.nextLine();
       
        System.out.println("Sukunimi: ");
        String sukunimi = skanneri.nextLine();

        System.out.println("Yrityksen verkkotunnus: ");
        String verkkotunnus = skanneri.nextLine();

        if (etunimi.equals("") || sukunimi.equals("") || verkkotunnus.equals("")) {
            System.out.println("Virhe! Jokin tiedoista puuttui.");
        } else {
            GenerateEmail(etunimi, sukunimi, verkkotunnus); // Method II
            GenerateUsername(etunimi, sukunimi); // Method III
            skanneri.close(); // suljetaan skanneri, kun sitä ei enää tarvita!
        }
    }

    // Method II | GenerateEmail
    public static String GenerateEmail(String etunimi, String sukunimi, String verkkotunnus) {
        String sahkopostiosoite =
            etunimi.toLowerCase() + "." +
            sukunimi.toLowerCase() + "@" +
            verkkotunnus.toLowerCase();

        System.out.println("\nSähköpostiosoite: " + sahkopostiosoite);
        return sahkopostiosoite;
    }

    // Method III | GenerateUsername
    public static String GenerateUsername(String etunimi, String sukunimi) {
        String kayttajatunnus =
        etunimi.toLowerCase().substring(0, 4) +
        sukunimi.toLowerCase().substring(sukunimi.length() - 4, sukunimi.length());

        System.out.println("Käyttäjätunnus: " + kayttajatunnus);
        return kayttajatunnus;
    }
}
