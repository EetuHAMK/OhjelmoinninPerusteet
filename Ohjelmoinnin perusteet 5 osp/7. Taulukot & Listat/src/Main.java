import java.util.Arrays;

public class Taulukot_Listat {

	public static void main(String[] args) {
		
		int lampotila;
		lampotila = 16;
		System.out.println(lampotila);
		
		int[] lampotilat = new int[7];
		
		lampotilat[0] = 18; // Ma
		lampotilat[1] = 14; // Ti
		lampotilat[2] = 12; // Ke
		lampotilat[3] = 16; // To
		lampotilat[4] = 21; // Pe
		lampotilat[5] = 23; // La
		lampotilat[6] = 19; // Su
		
	// Yksittäisen itemin tulostus:
		System.out.println(lampotilat[2]);
	
	// Monen itemin tulostus:
		
		int summa = 0;
		
		for (int i = 0 ; i < lampotilat.length ; i++)
		{
			System.out.println((i+1) + ". solun arvo on " + lampotilat[i]);
			summa = summa + lampotilat[i];
		}
		
		System.out.println(summa);
		
		Arrays.sort(lampotilat);
		
		for (int i = 0 ; i < lampotilat.length ; i++)
		{
			System.out.println(lampotilat[i]);
		}
		
		System.out.println("Kylmin lämpotila on " + lampotilat[0]);
		System.out.println("Kylmin lämpotila on " + lampotilat[lampotilat.length-1]);
	}

}
