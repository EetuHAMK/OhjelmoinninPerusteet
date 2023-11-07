
// Harjoitus 1 -
// 	1. Tee yksiulotteinen taulukko, jossa on luoteltu huonekalujen nimiä (esim. tuoli, sohva, pöytä, kaappi).
// 	2. Tulosta koko taulukko, jokainen huonekalu omalle rivilleen.
// 	3. Muuta tulostusta siten, että tulostat vain kahden ensimmäisen indeksin arvot.
// 	4. Muuta tulostusta siten, että taulukosta etsitään esim. sohvaa ja jos sellainen löytyy, tulostetaan se.

// Harjoitus 2 -
// 	5. Tee yksiulotteinen taulukko, jossa on viisi solua. Nimeä taulukko: heitetytNoppaluvut
// 	6. Arvo 5 numeroa ja sijoita ne taulukkoon. Jos et tehnyt edellistä for-loopissa, tee nyt
// 	7. Tulosta koko taulukko konsoliin.
// 	8. Laske taulukon arvojen summa ja tulosta tulos konsoliin.
// 	9. Tulosta isoin silmäluku.

import java.util.Scanner;
import java.util.Random;

public class Taulukko {
	
	public static void main(String[] args) {

	// Harjoitus 1.
		String[] taulukko = new String[4];

		taulukko[0] = "Tuoli";
		taulukko[1] = "Sohva";
		taulukko[2] = "Sänky";
		taulukko[3] = "Kaappi";

	// 	2.
		for (int i = 0; i < taulukko.length; i++)
		{
			System.out.println(taulukko[i]);
		}

	// 	3.
		for (int i = 0; i < 2; i++)
		{
			System.out.println(taulukko[i]);
		}

	// 	4.
		for (String esine : taulukko)
		{
			if (esine.equals("Sohva"))
			{
				System.out.println("Sohva löytyi: " + esine);
			}
		}
		
	// Harjoitus 2.

	//	5.
		int[] heitetytNopat = new int[5];

	//	6.
		Random luku = new Random();

		for (int i = 0; i < 5 ; i++) {
			int satunnainenLuku = luku.nextInt(6) + 1;
			heitetytNopat[i] = satunnainenLuku;
		}
		
	//	7.
		System.out.print("Heitetyt noppaluvut: ");

		for (int i = 0; i < 5; i++) {
			System.out.print(heitetytNopat[i] + " ");
		}

	//	8.
		int summa = 0;
		for (int i = 0; i < 5; i++) {
			summa += heitetytNopat[i];
		}
		System.out.println("\nNoppalukujen yhteenlaskettu summa on: " + summa);

	//	9.
		int suurinLuku = heitetytNopat[0];
		for (int i = 0; i < 5; i++) {
			if (heitetytNopat[i] > suurinLuku) {
				suurinLuku = heitetytNopat[i];
			}
		}
		System.out.println("Suurin luku on: " + suurinLuku);
	}
}