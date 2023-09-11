import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	
	// Commit 2
	// While:
		int laskuri = 0;

		do
		{
			System.out.println(laskuri);
			laskuri++;
		} while(laskuri < 5);
	
	// For:
		// for (int laskuri = 0 ; laskuri < 5 ; laskuri ++);

	String pinkoodi;

	// 1:	

	do
	{
		System.out.println("Kirjoita Pin-koodi: ");
		pinkoodi = in.nextLine();
	}	while (!pinkoodi.equals("1234"));
		
	System.out.println("Koodi oikein.");

	// 2:
	
	do
	{
		System.out.println("Kirjoita Pin-koodi: ");
		pinkoodi = in.nextLine();
		if(pinkoodi.equals("1234"));
		{
			break;
		}
	}	while (1==1);
		
	System.out.println("Koodi oikein.");	
	}

}
