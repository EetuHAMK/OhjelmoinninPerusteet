public class Intro {

    public static void main(String[] args) {

//  .  While-loop | While-silmukka

//      While-silmukka on toistorakenne, joka mahdollistaa koodilohkon toistamisen tietyin ehdoin.
//      Toisin kuin for-silmukka, while-silmukka ei edellytä alustusvaihetta, ja sen ehto tarkistetaan ennen jokaista toistoa.

//      While-silmukan toimintaperiaate:
//       1. Initialization, alustusvaihe: Alustetaan laskurimuuttuja "i" arvoon 0, ja se suoritetaan vain kerran silmukan alussa.
        int i = 0;
//      2. Condition, ehtovaihe: Tarkistetaan ehto (i < 5). Jos ehto on tosi, silmukka suoritetaan. Jos ehto on epätosi, silmukka päättyy ja ohjaus siirtyy silmukan ulkopuolelle.
        while (i < 5) {
//      3. Koodilohko: Suoritetaan koodilohko, joka on määritelty while-silmukan sisällä.
        System.out.println("Iteraatio: " + i);
//       4. Increment, Inkrementti: Suoritetaan inkrementtitoimenpide, joka muuttaa laskurimuuttujan arvoa. Tässä tapauksessa kasvatetaan "i" arvoa yhdellä.
        i++;
//      5. Condition, ehtovaihe uudelleen: Tarkistetaan vaihe 2. uudelleen. Jos ehto (i < 5) on yhä tosi, silmukka suoritetaan uudelleen, ja prosessi toistetaan.
        }
//      6. Kun vaihe 2. ei ole enää tosi (i >= 5), silmukka päättyy, ja ohjaus siirtyy silmukan jälkeiseen koodiin.

//      Esimerkki:
        int x = 0;
        while (i < 5) {
            System.out.println("Iteraatio: " + i);
            i++;
        }
    }
}

//      Yhteenveto:

//      While-silmukkaa käytetään, kun toistojen määrä ei ole tiedossa etukäteen tai toistoja halutaan suorittaa niin kauan kuin tietty ehto on voimassa.

//      Yleisiä käyttökohteita ovat:
//      -   Syötteiden käsittely ja odottaminen
//      -   Toisto niin kauan kuin tietty ehto pätee
//      -   Luku- ja kirjoitusvirtojen lukeminen
//      -   Pysyvä toisto, kuten pelin silmukat

//      While-silmukka tarjoaa joustavan tavan suorittaa koodia niin kauan kuin ehto on voimassa.
//      Huomioi, että se tulee lopulta epätodeksi, jotta silmukka päättyy ja ohjelma ei jää äärettömään toistoon.
