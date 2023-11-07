//  1.  User Input
//      1.1 Reading User Input
//      1.2 Parsing User Input as a Number

//  HUOM - kun käytät User Input -ominaisuutta, pitää ensin tuoda Scanner:
import java.util.Scanner;

public class Intro {
    
    public static void main(String[] args) {

//  1.	User Input | Käyttäjän Syöte

//  	- Käyttäjän syötteiden lukeminen on tärkeä osa monia ohjelmia, jotka vuorovaikuttavat käyttäjän kanssa.
//  	- Java tarjoaa Scanner-luokan, joka mahdollistaa käyttäjän syötteiden lukemisen.

//      HUOM - kun käytät Scanneria, se pitää myös määrittää:
        Scanner lukija = new Scanner(System.in);

//  	1.1 | Reading User Input, käyttäjän syötteen lukeminen

//  	- Voimme käyttää Scanner-luokkaa käyttäjän syötteen lukemiseen näppäimistöltä.
//	    - Esimerkki:
        System.out.print("Syötä nimesi: ");
        String nimi = lukija.nextLine(); // Lue käyttäjän syöte merkkijonona, joka varastoidaan muuttujaan "nimi"

        System.out.println("Hei, " + nimi + "!");

//  	1.2 | Parsing User Input (Number) | käyttäjän syötteen muuntaminen numeroksi

//  	- Jos tarvitsemme käyttäjän syötteestä numeron, voimme muuntaa sen asianmukaiseksi numerotyypiksi.
//  	- Esimerkki:
        System.out.print("Syötä ikäsi: ");
        int ika = lukija.nextInt(); // Lue käyttäjän syöte kokonaislukuna, joka varastoidaan muuttujaan "ika"

        int tulevaisuudenIka = ika + 10;
        System.out.println("10 vuoden päästä olet " + tulevaisuudenIka + " vuotta vanha.");

//  	1.3 Closing the Scanner, sulje Scanner

//  	- Muista sulkea Scanner, kun et enää tarvitse käyttäjän syötettä:
        lukija.close();
    }
}

// 	Yhteenveto:

// 	    Käyttäjän syötteen lukeminen on olennainen osa monia ohjelmia, jotka vuorovaikuttavat käyttäjän kanssa.
//      -   Käyttäjän syöte voidaan lukea erilaisina tietotyyppeinä, kuten merkkijonoina, kokonaislukuina tai desimaalilukuina, riippuen siitä, millaista tietoa tarvitaan.
// 	    -   Scanner-luokka mahdollistaa myös syötteen lukemisen muunnettuna eri tietotyypeiksi, jos käyttäjältä odotetaan tiettyä numeerista arvoa.
// 	    Muista aina sulkea Scanner sen käytön jälkeen vapaiden resurssien vapauttamiseksi!

// 	    Missä sitä hyödynnetään:

// 	    Käyttäjän syötteen käsittelyä tarvitaan useissa sovelluksissa, kuten:
// 	    -   Konsolisovelluksissa: Käyttäjän antamia komentoja ja tietoja voidaan lukea ja käsitellä.
// 	    -   Laskureissa: Käyttäjän syötettä voi tarvita laskemiseen ja tulosten näyttämiseen.
// 	    -   Lomakkeissa ja käyttöliittymissä: Käyttäjien antamia tietoja voidaan kerätä ja käyttää sovelluksissa, joissa käyttäjät täyttävät lomakkeita tai antavat tietoja käyttöliittymän kautta.
// 	    -   Peliohjelmissa: Käyttäjältä saatavia syötteitä voidaan käyttää pelaajien ohjaamiseen ja pelin tilan päivittämiseen.

// 	    Käyttäjän syötteen käsittely mahdollistaa ohjelmien vuorovaikutuksen käyttäjien kanssa ja mahdollistaa käyttäjien tarpeiden ja toiveiden huomioimisen sovellusten toiminnassa.
// 	    Käyttäjän syötteen käsittelyä voi myös hyödyntää virheiden käsittelyssä ja validoinnissa varmistaakseen, että käyttäjän antama tieto on kelvollista ja turvallista käyttää.

// 	    Yhteenvetona voidaan todeta, että käyttäjän syötteen käsittely on olennainen taito monissa ohjelmoinnin sovelluksissa,
// 	    joissa vuorovaikutetaan käyttäjien kanssa ja kerätään tietoa käyttäjiltä. Se tekee ohjelmista dynaamisia ja käyttäjäystävällisiä.
