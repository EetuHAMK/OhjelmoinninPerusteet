//	1. 	Variable
//		1.1 - String
//		1.2 - Integer
//		1.3 - double
//		1.4 - boolean
//		1.5 - char
//	2.	Printing
//		2.1 - System.out.println();
//		2.2 - System.out.print();
//		2.3 - System.out.printf();
//		2.4 - System.console().writer().println()
//		2.5 - System.err.println()

public class Intro {
	
	public static void main(String[] args) {

//	1.	Variable | Muuttuja

//		-	Muuttujalla viitataan tietyn tyyppiseen arvoon tai objektiin, ja se voi muuttua ohjelman suorituksen aikana.
//		-	Muuttujan tarkoitus on varastoida ja käsitellä dataa ohjelmassa.
//		-	Muuttujia käytetään monissa eri tarkoituksissa, kuten tallentamaan lukuja, merkkijonoja, totuusarvoja ja monenlaisia muita tietotyyppejä.

//		Muuttujan tyyppi määrittää, millaista tietoa siihen voidaan tallentaa, ja millaisia operaatioita sille voidaan suorittaa - esimerkiksi:
//		-	1.1 | String: Merkkijonoja varten.
//		-	1.2 | int: Kokonaislukuja varten.
//		-	1.3 | double: Liukulukuja varten, jotka sisältävät desimaalipilkun.
//		-	1.4 | boolean: Totuusarvoja varten (True/False).
//		-	1.5 | char: Merkkejä varten.

//		1.1 | String (str, merkkijono)

//		-	String on tietotyyppi (data type) Java-ohjelmointikielessä, ja se edustaa merkkijonoja eli tekstiä.
//		-	Merkkijono voi sisältää yhden tai useampia merkkejä, koska tekstiä tarvitaan usein tiedon tallentamiseen ja käsittelyyn.

//      HUOM - Muuttujan nimen valinnassa on hyvä käyttää kuvaavia nimiä. Esimerkiksi "nimi" ja "pisteet" ovat hyviä nimiä, koska ne kuvaavat selkeästi, mitä tietoa muuttuja sisältää.
//      Tämä tekee koodin lukemisesta ja ymmärtämisestä helpompaa.

//		String -muuttujan nimi on "nimi", jonka arvoksi on asetettu "Såna":
	    String nimi = "Såna";
	      
//		1.2 | Integer (int, kokonaisluku)

//		-	Integer (kokonaisluku) on tietotyyppi Java-ohjelmointikielessä, joka edustaa kokonaislukuja ilman desimaalipilkkua.
//		-	Kokonaisluvut ovat tietotyyppi, joka mahdollistaa ohjelmien käsittelemisen ja suorittamisen kokonaislukuarvoilla, kuten positiivisilla ja negatiivisilla kokonaisluvuilla sekä nollalla.

//		Integer -muuttujan nimi on "pisteet", jonka arvoksi on asetettu 10:
	    int pisteet = 10;

//      1.3 | Double (double, liukuluku)

//      - Double on tietotyyppi Java-ohjelmointikielessä, joka edustaa liukulukuja desimaalipilkuilla.
//      - Liukuluvut voivat sisältää desimaaleja ja ovat hyödyllisiä tarkempien numeeristen arvojen tallentamiseen.

//      Double -muuttujan nimi on "paino", jonka arvoksi on asetettu 75.5 (kilogrammoina):
        double paino = 75.5;

//      1.4 | Boolean (boolean, totuusarvo)

//      - Boolean on tietotyyppi Java-ohjelmointikielessä, joka edustaa totuusarvoja, jotka voivat olla joko True (tosi) tai False (epätosi).
//      - Totuusarvot ovat tärkeitä ehtolauseiden ja loogisen päätöksenteon yhteydessä.

//      Boolean -muuttujan nimi on "onkoOpiskelija", ja se on asetettu todeksi:
        boolean onkoOpiskelija = true;

//      1.5 | Character (char, merkki)

//      - Character on tietotyyppi Java-ohjelmointikielessä, joka edustaa yhtä merkkiä.
//      - Merkit voivat olla kirjaimia, numeroita tai erikoismerkkejä, ja niitä käytetään yksittäisten merkkien tallentamiseen.

//      Character -muuttujan nimi on "ensimmainenKirjain", ja siihen on tallennettu merkki 'A':
        char ensimmainenKirjain = 'A';

//	2.	Printing | Tulostus

//		-	Javassa on useita erilaisia ​​tapoja tulostaa tietoa konsoliin.
//		-	Tässä on joitain yleisimpiä tulostusmenetelmiä:

//		2.1:
		System.out.println();
// 		-	System.out on vakio-objekti, joka edustaa konsolia. Tämä on yksi yleisimmistä tavoista tulostaa tietoa Java-ohjelmassa.
// 		-	println() tulostaa annetun merkkijonon konsoliin ja siirtyy automaattisesti seuraavalle riville.

//		2.2:
		System.out.print();
//		-	Toimii samalla tavalla kuin println(), mutta ei siirry automaattisesti seuraavalle riville.

//		2.3:
 		System.out.printf();
// 		-	Tämä mahdollistaa tarkan muotoillun tulostuksen.
//		-	Voit määrittää merkkijonon, joka sisältää muotoilumerkkejä (esim. %s merkitsee merkkijonoa, %d kokonaislukua jne.), ja sitten antaa vastaavat arvot näille merkkeille.
// 		-	Esimerkki:
		String nimi2 = "Såna";
		int ika = 23;
		System.out.printf("Nimi: %s, Ikä: %d vuotta", nimi2, ika);

//		2.4:
		System.console().writer().println();
//		-	Tätä käytetään, kun haluat lukea ja kirjoittaa konsoliin salasanoja tai muita herkkiä tietoja.
//		-	Esimerkki:
		char[] salasana = System.console().readPassword("Syötä salasana: ");
		System.console().writer().println("Salasana on vastaanotettu.");

//		2.5:
		System.err.println();
//		-	Käytetään virheviestien tulostamiseen.
//		-	Erottuu tavallisista tulosteista ja usein näytetään punaisena.
//		-	Esimerkki:
		System.err.println("Tapahtui virhe!");
	}
}

// 	Yhteenveto:

// 	    Muuttujat ja tulostaminen ovat keskeisiä osia ohjelmoinnissa, jotka mahdollistavat tiedon tallentamisen ja näyttämisen tietokoneohjelmissa.
// 		-	Muuttujat: Muuttujat ovat nimettyjä säilytyspaikkoja, joissa voidaan tallentaa erilaisia tietoja, kuten lukuja, tekstiä tai muita arvoja.
//			Muuttujia käytetään tiedon säilyttämiseen ja käsittelemiseen ohjelman suorituksen aikana.
// 		-	Tulostaminen: Tulostaminen tarkoittaa ohjelman antaman tiedon näyttämistä käyttäjälle. Tämä voi tapahtua tekstikonsolilla, graafisessa käyttöliittymässä tai muissa tulostuskanavissa.
//			Tulostaminen on olennainen tapa kommunikoida ohjelman tulokset ja viestit käyttäjälle.

// 		Missä sitä hyödynnetään:

// 		Muuttujia ja tulostamista käytetään laajasti ohjelmoinnissa monissa eri sovellusalueissa:
// 		-	Web-kehityksessä: Muuttujat säilyttävät tietoa käyttäjän syötteistä ja verkkosivuston tilasta. Tulostaminen näyttää verkkosivuston sisällön ja viestit käyttäjälle.
// 		-	Pelikehityksessä: Muuttujat pitävät kirjaa pelin tilasta, kuten pelaajan pisteistä tai pelimaailman tilasta. Tulostaminen esittää pelin grafiikan ja käyttöliittymän.
// 		-	Liiketoimintaohjelmoinnissa: Muuttujia käytetään kirjanpidon, varastonhallinnan ja asiakastietojen hallinnassa. Tulostaminen tuottaa raportteja ja laskuja.
// 		-	Tietokantaohjelmoinnissa: Muuttujat tallentavat tietokannan tietueiden tiedot, ja tulostaminen näyttää käyttäjille haetun tiedon.
// 		-	Tietoturvaohjelmoinnissa: Muuttujat voivat pitää kirjaa käyttäjäoikeuksista ja salauksessa käytettävistä avaimista. Tulostaminen voi varoittaa turvallisuusongelmista.
// 		-	Tiedon analysoinnissa: Muuttujat tallentavat analyysissä käytettävän datan, ja tulostaminen tuottaa tuloksia ja visualisointeja.

// 		Muuttujat ja tulostaminen ovat perustavanlaatuisia ohjelmoinnin käsitteitä, jotka ovat olennaisia kaikissa ohjelmoinnin sovellusalueissa.
//		Ne mahdollistavat tietojen käsittelyn ja näyttämisen, mikä on keskeistä ohjelmien toiminnassa ja vuorovaikutuksessa käyttäjien kanssa.
