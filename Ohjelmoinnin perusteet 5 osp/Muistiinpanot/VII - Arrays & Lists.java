public class Intro {

    public static void main(String[] args) {

//      Arrays & Lists | Taulukot ja Listat

//      Taulukot ja listat ovat tietorakenteita, jotka mahdollistavat useiden arvojen tallentamisen yhteen muuttujaan.

//      1. Taulukot (Arrays)
//      Taulukko on kiinteän koon tietorakenne, joka voi sisältää saman tyyppisiä arvoja.

//      Taulukon luominen:
        int[] taulukko1 = new int[5]; // Luo kokonaislukutaulukon kooltaan 5.

//      Taulukon alustaminen:
        taulukko1[0] = 1;
        taulukko1[1] = 2;
        taulukko1[2] = 3;
        taulukko1[3] = 4;
        taulukko1[4] = 5;

//      Taulukon arvojen lukeminen:
        int arvo1 = taulukko1[2]; // Hakee taulukon kolmannen arvon (indeksi 2).

//      2. Listat (Lists)
//      Lista on dynaaminen tietorakenne, joka voi kasvaa tai kutistua tarpeen mukaan.

//      Listan luominen ja alustaminen:
        List<Integer> lista1 = new ArrayList<>(); // Luo kokonaislukulistan.

        lista1.add(1); // Lisää arvon listaan.
        lista1.add(2);
        lista1.add(3);

        int arvo2 = lista1.get(1); // Hakee listan toisen arvon (indeksi 1).

//      Listan koko:
        int koko = lista1.size(); // Palauttaa listan koon.

//      Taulukoiden ja listojen käyttö

//      Taulukoita ja listoja voidaan käyttää erilaisissa tilanteissa:
//      - Taulukot sopivat kiinteän kokoisten tietojen tallentamiseen.
//      - Listat soveltuvat dynaamisten tietojen hallintaan ja laajentamiseen.

//      Esimerkki taulukon ja listan käytöstä:
        int[] taulukko2 = {1, 2, 3, 4, 5}; // Luo ja alustaa taulukon samalla rivillä.
        List<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i < taulukko2.length; i++) {
        lista2.add(taulukko2[i]); // Lisää taulukon arvon listaan.
        }

//      Listan tulostaminen:
        for (int arvo3 : lista2) {
        System.out.println("Arvo: " + arvo);
        }
    }
}

//      Muistiinpanot:
//      - Taulukot ja listat ovat hyödyllisiä tietorakenteita, mutta niiden käyttöä on harkittava tarpeen mukaan.
//      - Taulukot ovat kiinteän kokoisia ja vaativat etukäteen tiedon tarvittavasta koosta.
//      - Listat ovat joustavia ja soveltuvat tilanteisiin, joissa tarvitaan dynaamista tietojen hallintaa.
//      - Java tarjoaa monia valmiita taulukkoihin ja listoihin liittyviä toimintoja ja luokkia (esim. ArrayList).
