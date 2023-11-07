public class Main {

	public static void main(String[] args) {
	    System.out.println("Hei olen Tulostin-ohjelma");
	    System.out.println("Ohjelman tekijä: ");
	    
	    double luku_1 = 2;
	    double luku_2 = 1;
	    
	    double tulo = 0;
	    double erotus = 0;
	    double summa = 0;
	    double jako = 0;
	    
	    String tekija = "Eetu";
	    System.out.println("Ohjelman tekijä: " + tekija);
	    
	    System.out.println(luku_1);
	    System.out.println("Luku1-muuttujan arvo on " + luku_1);
	    System.out.println("Luku2-muuttujan arvo on " + luku_2);
	    
	    tulo = luku_1 * luku_2;
	    erotus = luku_1 - luku_2;
	    summa = luku_1 + luku_2;
	    jako = luku_1 / luku_2;
	    
	    System.out.println(luku_1 + " * " + luku_2 + " = " + tulo);
	    System.out.println(luku_1 + " - " + luku_2 + " = " + erotus);
	    System.out.println(luku_1 + " + " + luku_2 + " = " + summa);
	    System.out.println(luku_1 + " / " + luku_2 + " = " + jako);

	}
}
