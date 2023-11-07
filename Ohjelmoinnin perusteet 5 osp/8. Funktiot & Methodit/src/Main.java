import java.util.Scanner;

public class Main { // Class - alku
	// Ohjelma I - alku
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		int pituus, leveys;
		String vastaus;
		
		// Methodien kutsuminen:
		tulostaAlkutekstit();
		
		System.out.println("Anna pituus");
		vastaus = in.nextLine();
		pituus = Integer.parseInt(vastaus);
		
		System.out.println("Anna leveys");
		vastaus = in.nextLine();
		leveys = Integer.parseInt(vastaus);
		
		laskePintaAla(10, 5);
		tulostaLopputekstit();

	} // Ohjelma I - loppu
	
	// 1. Metodi, joka vain tekee jotain.
	// 2. Metodi, joka tarvitsee lisätietoa, jotta voi toimia.
	// 3. Metodi, joka palauttaa jotain.

	// Ohjelma II - alku
	public static void tulostaAlkutekstit()
	{
		System.out.println("Method");
	} // Ohjelma II - loppu

	// Ohjelma III - alku
	public static void tulostaLopputekstit()
	{
		System.out.println("Kiitos käytöstä.");
	} // Ohjelma III - Loppu

	public static void laskePintaAla(int pituus, int leveys)
	{
		int pintaAla;
		pintaAla = pituus * leveys;
		System.out.println("Pinta-ala on " + pintaAla);
	}

} // Class - loppu
