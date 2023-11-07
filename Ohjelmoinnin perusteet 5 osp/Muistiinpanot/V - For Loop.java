public class Intro {

    public static void main(String[] args) {

//  1.  For-loop | For-silmukka

//      For-silmukka on toistorakenne, joka mahdollistaa koodilohkon toistamisen tietyin ehdoin. Se koostuu kolmesta pääkomponentista:
//      - 1.1 | Initialization (Alustus)
//      Tässä vaiheessa alustetaan laskurimuuttuja (tai useampi), ja se suoritetaan vain kerran silmukan alussa.
//      - 1.2 | Condition (Ehto)
//      Ehto on looginen lauseke, joka tarkistetaan jokaisen iteraation alussa. Jos ehto on tosi, silmukka suoritetaan. Jos ehto on epätosi, silmukka päättyy.
//      - 1.3 | Increment/Decrement (Inkrementti)
//      Tässä vaiheessa muutetaan laskurimuuttujan arvoa. Inkrementti voi olla esimerkiksi laskurimuuttuja++, mikä kasvattaa laskurimuuttujan arvoa yhdellä jokaisen iteraation jälkeen.

//      For-silmukan toimintaperiaate:
//      1. Initialization (Alustusvaihe): Määritellään ja alustetaan laskurimuuttuja "i" arvoon 1.
        for (int i = 1; 
//      2. Condition (Ehto): Tarkistetaan ehto (i <= 5). Jos ehto on tosi, silmukka suoritetaan.
        i <= 5; 
//      3. Increment (Inkrementti): Suoritetaan inkrementtitoimenpide, joka kasvattaa laskurimuuttujan "i" arvoa yhdellä.
        i++) {
//      4. Koodilohko: Tässä kohdassa suoritetaan koodi, joka on määritelty for-silmukan sisällä.
        System.out.println(i); // Tulostetaan laskurimuuttujan "i" arvo.
//      5. Condition (Ehto): Kun laskurimuuttuja "i" arvo on suurempi kuin 5, ehto (i <= 5) ei ole enää tosi, ja silmukka päättyy.
        }

//      Esimerkki:
        int[] numerot = {1, 2, 3, 4, 5};
        for (int x = 0; x < numerot.length; x++) {
            System.out.println("Luku: " + numerot[x]);
        }
    }
}

//  Yhteenveto:

//      For-silmukkaa käytetään yleisesti, kun tiedetään tarkalleen kuinka monta kertaa halutaan toistaa tietty koodilohko.

//      Yleisiä käyttökohteita ovat:
//      -   Taulukon (array) läpikäynti
//      -   Toistotietueet
//      -   Laskennalliset toiminnot
//      -   Monimutkaiset algoritmit

//      For-silmukat ovat olennainen osa ohjelmointia, ja ne tarjoavat tehokkaan tavan toistaa tiettyjä toimintoja tarkalleen määrätyn määrän kertoja.
//      - Vältä äärettömiä silmukoita: Varmista, että ehto muuttuu jossain vaiheessa epätodeksi, jotta silmukka päättyy. Muutoin ohjelma saattaa jäädä loputtomaan toistoon.
//      - For-silmukkaa ei aina tarvita: Jos et tiedä toistojen määrää etukäteen tai toistojen määrä on dynaaminen, saattaa while- tai do-while-silmukka olla parempi vaihtoehto.
