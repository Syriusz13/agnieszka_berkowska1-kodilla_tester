public class SimpleArray {

    public static void main(String[] args){

        String[] batSpecies = new String[] {"Nocek duży", "Gacek szary", "Karlik malutki", "Mopek", "Mroczek pozłocisty"};
        String bat = batSpecies[3];
        System.out.println(bat);
        int numberOfElements = batSpecies.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");

        for (int i = 0; i < batSpecies.length; i++) {
            System.out.println(batSpecies[i]);
        }

    }
}
