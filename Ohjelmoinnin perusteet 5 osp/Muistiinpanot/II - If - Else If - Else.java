//  1.  Conditional Statements
//      1.1 - If
//      1.2 - Else If
//      1.3 - Else
//      1.4 - Switch

//  Notes:
//  AND - &&
//  OR - || 

public class Intro {
    
    public static void main(String[] args) {

//  1.  Conditional Statements | Ehtorakenteet

//      Ehtorakenteet ovat ohjelmoinnin osa, joka mahdollistaa päätösten tekemisen ja ohjelman suorituksen ohjaamisen sen perusteella, ovatko tietyt ehdot totta tai epätotta:
//      -   1.1 | If-lause tarkistaa, onko annettu ehto totta. Jos ehto on totta, suoritetaan määritellyt koodilohkot.
//      -   1.2 | Else If-lause tarkastaa useita ehtoja peräkkäin, kunnes löytyy ensimmäinen tosi ehto tai kunnes kaikki ehdot on tarkistettu.
//      -   1.3 | Else-lause toimii yhdessä if/else if -lauseen kanssa. Jos if/else if -lauseen ehto ei ole totta, suoritetaan else-lauseen koodilohkot.
//      -   1.4 | Switch-lause on kätevä, kun halutaan vertailla yhtä muuttujan arvoa useisiin eri vaihtoehtoihin.

//      1.1 | If-statement/lause

//      -   If-lause tarkistaa, onko annettu ehto totta.
//      -   Jos ehto on totta, suoritetaan määritellyt koodilohkot.
//      -   Esimerkki:
        int ika = 18;
        if (ika >= 18) {
            System.out.println("Olet täysi-ikäinen.");
        }

//      1.2 | Else If-statement/lause

//      -   Else If-lause tarkastaa useita ehtoja peräkkäin, kunnes löytyy ensimmäinen tosi ehto tai kunnes kaikki ehdot on tarkistettu.
//      -   Esimerkki:
        int arvosana = 85;
        if (arvosana >= 90) {
            System.out.println("Erinomainen!");
        } else if (arvosana >= 70) {
            System.out.println("Hyvä!");
        } else if (arvosana >= 50) {
            System.out.println("Tyydyttävä.");
        } else {
            System.out.println("Hylätty.");
        }

//      1.3 | Else-statement/lause

//      -   Else-lause toimii yhdessä if-lauseen kanssa.
//      -   Jos if/else if -lauseen ehto ei ole totta, suoritetaan else-lauseen koodilohkot.
//      -   Esimerkki:
        int pistemaara = 75;
        if (pistemaara >= 50) {
            System.out.println("Hyvä suoritus!");
        } else {
            System.out.println("Yritä uudelleen.");
        }        

//      1.4 | Switch-statement/lause

//      -   Switch-lause on kätevä, kun halutaan vertailla yhtä muuttujan arvoa useisiin eri vaihtoehtoihin.
//      -   Esimerkki:
        char luokka = 'A';
        switch (luokka) {
            case 'A':
                System.out.println("Erinomainen!");
                break;
            case 'B':
                System.out.println("Hyvä!");
                break;
            case 'C':
                System.out.println("Tyydyttävä.");
                break;
            default:
                System.out.println("Hylätty.");
        }
    }
}

//  Yhteenveto:

//      Ehtolauseet (IF - ELSE IF - ELSE) ovat ohjelmoinnin rakenteita, jotka mahdollistavat päätösten tekemisen ja ohjelman suorituksen ohjaamisen sen perusteella, ovatko tietyt ehdot totta tai epätotta.
//      Niitä käytetään ohjelmoinnissa erilaisten tilanteiden käsittelyyn ja päätöksenteon automatisointiin.
//      -   IF-LAUSE: If-lause tarkistaa yhden ehdollisen lauseen ja suorittaa siihen liittyvät koodilohkot, jos ehto on tosi. Tämä mahdollistaa yksinkertaiset päätökset ohjelman suorituksessa.
//      -   ELSE IF -LAUSE: Else if -lause tarkistaa useita ehtoja peräkkäin ja suorittaa ensimmäisen todeksi havaitun ehtolauseen liittyvät koodilohkot. Jos mikään ehto ei ole tosi, voidaan käyttää ELSE-lauseen koodilohkoja.
//      -   ELSE-LAUSE: Else-lause toimii yhdessä IF- ja ELSE IF -lauseiden kanssa ja suorittaa koodilohkot, jos mikään aiempi ehto ei ole tosi. Se tarjoaa oletusvaihtoehdon, jos mikään muu ehto ei täyty.

//      Missä sitä hyödynnetään:

//      Ehtolauseita käytetään laajasti ohjelmoinnissa monenlaisissa sovelluksissa:
//      -   Käyttöliittymäsuunnittelussa: Ehtolauseita voidaan hyödyntää ohjaamaan käyttöliittymän elementtien näkyvyyttä ja toimintaa käyttäjän toimintojen perusteella.
//      -   Pelikehityksessä: Ehtolauseita käytetään määrittelemään pelissä tapahtuvia toimintoja, kuten pelaajan hahmon liikkeet, vihollisten käyttäytyminen ja voittohavainnot.
//      -   Liiketoimintaohjelmoinnissa: Ehtolauseilla voidaan toteuttaa monimutkaisia liiketoimintalogiikoita, kuten tilauksen käsittely, asiakaspalvelujärjestelmät ja varastonhallinta.
//      -   Web-kehityksessä: Ehtolauseita käytetään usein verkkosivustojen ja web-sovellusten dynaamisessa sisällönhallinnassa ja käyttäjän vuorovaikutuksen ohjaamisessa.
//      -   Tietokantaohjelmoinnissa: Ehtolauseilla voidaan suodattaa ja valita tietokannasta tietoja eri kriteerien perusteella.
//      -   Tietoturvaohjelmoinnissa: Ehtolauseita käytetään turvallisuusratkaisujen toteuttamiseen, kuten pääsynvalvontaan ja varmistamaan, että käyttäjät ovat oikeutettuja tiettyihin toimintoihin.

//      Ehtolauseita hyödynnetään laajasti kaikissa ohjelmoinnin sovellusalueissa, missä päätöksiä ja kontrollia tarvitaan erilaisten skenaarioiden käsittelyyn.
//      Ne ovat olennainen osa ohjelmointia, ja niiden avulla voidaan tehdä monimutkaisia ohjelmia, jotka reagoivat ja sopeutuvat erilaisiin tilanteisiin.
