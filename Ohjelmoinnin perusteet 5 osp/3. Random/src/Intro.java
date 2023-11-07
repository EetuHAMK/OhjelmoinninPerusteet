//  1.  Random
//	    1.1 - Random Integer
//      1.2 - Random Selection
//      1.3 - Random Booleans

//  HUOM - kun käytät Random-moduulia, se pitää ensin tuoda:
import java.util.Random;

public class Intro {
    
    public static void main(String[] args) {

//  1.	Random | Satunnainen

//  	-   Satunnaisuus on tärkeä osa ohjelmointia, ja sitä tarvitaan monissa sovelluksissa.
//  	-   Java tarjoaa tavan luoda satunnaisia lukuja ja valintoja.
//  	-   Satunnaisia lukuja tarvitaan esimerkiksi pelissä, arpajaisissa tai muiden sattumanvaraisten toimintojen toteuttamisessa.

//      HUOM - kun käytät Random-moduulia, se pitää myös määrittää:
        Random satunnainenLuku = new Random();

//      1.1 | Random Integer, satunnainen kokonaisluku

//      -   Voimme käyttää satunnaisominaisuutta satunnaisen kokonaisluvun luomiseen.
//      -   Esimerkki:
        int luku = satunnainenLuku.nextInt(100); // Generoi satunnaisen luvun väliltä 0-99.
        System.out.println("Satunnainen luku: " + luku);

//      1.2 | Random Selection, satunnainen valinta

//      -   Satunnaisia valintoja tarvitaan esimerkiksi listojen tai taulukoiden satunnaisessa valinnassa.
//      -   Esimerkki:
        String[] hedelmät = {"omena", "banaani", "mansikka", "appelsiini", "kiivi"};

        int satunnaisenHedelmänIndeksiLuku = satunnainenLuku.nextInt(hedelmät.length);  // Generoi satunnaisen luvun, jota käytetään indeksilukuna. Luku on väliltä 0 | 4 (hedelmien kokonaislukumäärä)
        String satunnainenHedelmä = hedelmät[satunnaisenHedelmänIndeksiLuku]; // Määrittää muuttujan "satunnainenHedelmä" arvoksi yksittäisen hedelmän listasta - edellisellä rivillä arvottu indeksiluku määrittää sen, mikä hedelmä listasta valittiin.
        System.out.println("Satunnainen hedelmä: " + satunnainenHedelmä);

//      1.3 | Random Booleans, satunnainen totuusarvo

//      -   Voimme käyttää Math-luokkaa satunnaisen totuusarvon luomiseen.
//      -   Esimerkki:
        boolean satunnainenTotuusarvo = Math.random() < 0.5; // 50% todennäköisyydellä true tai false
        System.out.println("Satunnainen totuusarvo: " + satunnainenTotuusarvo);
    }
}

//  Yhteenveto:

//      Satunnaisuus on tärkeä osa ohjelmointia, ja sitä tarvitaan monissa sovelluksissa. Java tarjoaa välineitä satunnaisuuden luomiseen.
//      -   Satunnaisia lukuja voidaan käyttää monissa sovelluksissa, kuten peleissä, arpajaisissa tai muiden sattumanvaraisten toimintojen toteuttamisessa.     
//      -   Random-luokan avulla voimme generoida satunnaisia kokonaislukuja tietyllä alueella, esimerkiksi välillä 0-99, mikä antaa mahdollisuuden kontrolloida satunnaislukujen jakautumista.       
//      -   Satunnaisia valintoja tarvitaan esimerkiksi listojen tai taulukoiden satunnaisessa valinnassa. Tämä on hyödyllistä esimerkiksi silloin, kun halutaan tehdä pelissä satunnaisia valintoja.    
//      -   Satunnaisia totuusarvoja voidaan käyttää päätöksenteossa. Esimerkiksi voimme käyttää Math.random()-funktiota ja asettaa kynnyksen päätöksenteolle 50%, jolloin päätös voi olla satunnainen.     

//      Missä sitä hyödynnetään:

//      Satunnaisuutta tarvitaan useissa sovelluksissa, kuten:
//      -   Pelikehityksessä: Satunnaisuutta käytetään pelissä vihollisten liikkeiden määräämisessä, voittojen arpomisessa ja muiden sattumanvaraisten tapahtumien luomisessa.    
//      -   Arpajaisissa ja simulaatioissa: Satunnaislukuja käytetään arvontoihin ja tilastollisiin simulaatioihin, kuten sääennusteisiin tai osakemarkkinoiden mallintamiseen.   
//      -   Salauksessa: Kryptografiassa satunnaislukuja käytetään avainten ja salausmenetelmien generoimiseen.   
//      -   Testauksessa: Ohjelmien testauksessa voidaan käyttää satunnaisuutta luomaan erilaisia testitapauksia. 
//      -   Käyttöliittymissä: Satunnaisuutta voidaan käyttää elementtien sijoittelussa tai animaatioiden ajoituksessa.
//      -   Tietokonegrafiikassa: Satunnaisuutta voidaan hyödyntää esimerkiksi satunnaisen tekstuurin tai kuvion generoimisessa.

//      Yhteenvetona voidaan todeta, että satunnaislukujen ja -valintojen käyttö on monipuolista ja niitä hyödynnetään monissa ohjelmoinnin sovelluksissa,
//      jotka vaativat sattumanvaraista toimintaa tai monimuotoisuutta. Satunnaisuus on voimakas työkalu monipuolistamaan ohjelmien toimintaa ja luomaan mielenkiintoisia käyttäjäkokemuksia.
