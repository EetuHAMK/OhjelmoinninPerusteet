public class Main {

	public static void main(String[] args) {
		
	// Tehtävä 1 |

		int luku1 = 5;
		int luku2 = 10;
		
		if (luku1 == luku2) {
			System.out.println("Luku 1 on yhtä suuri kuin luku 2.");
		} else {
			System.out.println("Luku 1 ei ole yhtä suuri kuin luku 2.");
		}
		
		luku1 = 12;
		luku2 = 5;
		
		if (luku1 > luku2) {
			System.out.println("Luku 1 on suurempi kuin luku 2.");
		} else {
			System.out.println("Luku 1 ei ole suurempi kuin luku 2.");
		}
		
		luku1 = 2;
		luku2 = 20;
		
		if (luku1 >= luku2) {
			System.out.println("Luku 1 on suurempi TAI yhtä suuri kuin luku 2.");
		} else {
			System.out.println("Luku 1 ei ole suurempi TAI yhtä suuri kuin luku 2.");
		}
		
		luku1 = 2;
		luku2 = 2;
		
		if (luku1 != luku2) {
			System.out.println("Luku 1 on erisuuruinen kuin luku 2.");
		} else {
			System.out.println("Luku 1 ei ole erisuuruinen kuin luku 2.");
		}
		
	// 	Tehtävä 2 |
		
		int luku3 = 10;
		int luku4 = 20;
		int luku5 = 12;
		
		if (luku3 == luku4 || luku4 == luku5) {
			System.out.println("Luvut 3 & 4 TAI 4 & 5 ovat yhtä suuria.");
		} else {
			System.out.println("Luvut 3 & 4 TAI 4 & 5 eivät ole yhtä suuria.");
		}

		if (luku3 > luku4 && luku3 == luku5) {
			System.out.println("Luku 3 on suurempi kuin luku 4, JA luku 3 on yhtä suuri kuin luku 5.");
		} else {
			System.out.println("Luku 3 ei ole suurempi kuin luku 4, EIKÄ/TAI luku 3 ei ole yhtä suuri kuin luku 5.");
		}

		luku3 = 10;
		luku4 = 15;
		luku5 = 6;

		if (luku3 == luku4 && luku4 == luku5) {
			System.out.println("Luvut 3, 4 & 5 ovat yhtä suuria.");
		} else {
			System.out.println("Luvut 3, 4 & 5 eivät ole yhtä suuria.");
		}

		if (luku3 > luku4) {
			System.out.println("Luku 3 on suurempi kuin luku 4.");
			} else if (luku4 > luku5) {
				System.out.println("Luku 4 on suurempi kuin luku 5.");
		} else {
			System.out.println("Luku 4 ei ole suurempi kuin luku 5.");
		}
	
		if (luku3 == luku4) {
			System.out.println("Luku 3 on suurempi kuin luku 4.");
			} else if (luku3 == luku5) {
				System.out.println("Luvut 3 & 5 ovat yhtä suuria.");
		} else {
			System.out.println("Luku 3 ei ole suurempi kuin luku 4, EIVÄTKÄ luvut 3 & 5 ole yhtä suuria.");
		}
		
	// Tehtävä 3 |
				
		String nimi1 = "Matti";
		String nimi2 = "Olavi";
		String nimi3 = "Jorma";

		if (nimi1 == nimi2) {
			System.out.println("Nimet 1 & 2 ovat samoja.");
		} else {
			System.out.println("Nimet 1 & 2 eivät ole samoja.");
		}
	
		if (nimi1.length() != nimi2.length()) {
			System.out.println("Nimet 1 & 2 eivät ole samoja.");
		} else {
			System.out.println("Nimet 1 & 2 ovat samoja.");
		}
	
		if (nimi1 == nimi2) {
			System.out.println("Nimet 1 & 2 ovat samoja.");
			} else if (nimi1 == nimi3) {
				System.out.println("Nimet 1 & 3 ovat samoja.");
		} else {
			System.out.println("Nimet 1 & 2 TAI 1 & 3 eivät ole samoja.");
		}
	}
}
