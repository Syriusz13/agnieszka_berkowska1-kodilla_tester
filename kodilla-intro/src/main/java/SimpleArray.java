public class SimpleArray {

    public static void main(String[] args){

        String[] batSpecies = new String[] {"Nocek duży", "Gacek szary", "Karlik malutki", "Mopek", "Mroczek pozłocisty"};
                                                                //tworzę tablicę i przypisuje do niej elementy
        String bat = batSpecies[3];                             // do zmiennej bat przypisuję 3 element tablicy
        System.out.println(bat);                                // pokazuję zmienną (czyli 3 element tablicy)
        int numberOfElements = batSpecies.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");

        for (int i = 0; i < batSpecies.length; i++) {           //pętla pozwalająca wyświetlić wszystkie el. tablicy
            System.out.println(batSpecies[i]);
        }

    }
}
