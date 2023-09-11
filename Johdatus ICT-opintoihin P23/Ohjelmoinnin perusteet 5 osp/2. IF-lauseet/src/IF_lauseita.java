
public class IF_lauseita {

	public static void main(String[] args) {
		
		boolean Kannykkapaalla = false;

		// Ehtolause - Onko kännykkä päällä?
		if (Kannykkapaalla == false)
		{
			System.out.println("Starting");
		}
		else
		{
			System.out.println("Shutdown");
		}
		
		int luku1 = 5;
		int luku2 = 4;
		
		// Tutki, onko luku 1 == 2:
		if (luku1 == luku2)
		{
			System.out.println("Luvut 1 & 2 ovat yhtä suuria!");
		}
		else
		{
			System.out.println("Luvut 1 & 2 ovat eri suuruisia!");
		}
		
		// Tutki, onko luku 1 > 2:
		if (luku1 > luku2)
		{
			System.out.println("Luku 1 on suurempi kuin Luku 2!");
		}
		else
		{
			System.out.println("Luku 1 on pienempi kuin Luku 2!");
		}
		
		// Merkkijonojen vertailu (String)
		String nimi = "Eetu";
		
		if (nimi.equals("Eetu"))
		{
			System.out.println("Nimi on Eetu");
		}
		else
		{
			System.out.println("Nimi ei ole Eetu");
		}
			
	}

}
