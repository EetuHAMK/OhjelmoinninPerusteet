public class MethodsExample {

//      1. Metodin määrittely ja kutsu
//      Metodit ovat ohjelman toiminnallisia lohkoja, jotka suorittavat tiettyjä tehtäviä.

//      Metodin määrittely:
        public static void tulostaTervehdys() {
            System.out.println("Hei, maailma!");
        }

        public static void main() {
//      Metodin kutsu:
            tulostaTervehdys(); // Kutsutaan tulostaTervehdys-metodia.
        }

//      2. Metodin parametrit
//      Metodeille voidaan antaa parametreja, jotka ovat arvoja tai muuttujia, joita ne voivat käyttää.

        public static void tervehdiHenkilo(String nimi) {
            System.out.println("Hei, " + nimi + "!");
        }

        public static void mainII() {
//      Metodin kutsu parametrilla:
            tervehdiHenkilo("Anna"); // Tulostaa "Hei, Anna!".
        }

//      3. Metodin paluuarvo
//      Metodi voi myös palauttaa arvon, joka voi olla mikä tahansa datatyyppi.

        public static int laskeSumma(int a, int b) {
        int summa = a + b;
        return summa; // Palautetaan summa.
        }

        public static void mainIII() {
        // Metodin kutsu ja paluuarvon käyttö:
        int tulos = laskeSumma(5, 3);
        System.out.println("Summa: " + tulos); // Tulostaa "Summa: 8".
        }

//      4. Metodin ylikuormitus
//      Voit määrittää useita samannimisiä metodeita eri parametreilla.

        public static int laskeSumma(int a, int b, int c) {
        int summa = a + b + c;
        return summa;
        }

        public static void main(String[] args) {
//      Kutsu eri parametreilla:
        int tulos1 = laskeSumma(2, 3);
        int tulos2 = laskeSumma(2, 3, 4);

        System.out.println("Summa 1: " + tulos1); // Tulostaa "Summa 1: 5".
        System.out.println("Summa 2: " + tulos2); // Tulostaa "Summa 2: 9".
        }
}
