public class LeapYear {

    public static void main(String[] args) {

        int year =1734;
        LeapYear leapYear = new LeapYear(); // tworzymy obiekt
        leapYear.isLeapYear(year); // wywołujemy na obiekcie metodę ?? czy to jest potrzebne skoro poniżej robimy to samo
        System.out.println(year + " is a leap year. " + leapYear.isLeapYear(year));
    }

    public static boolean isLeapYear(int year) { //metoda sprawdzająca czy rok jest przestepny

        if (year <-45) {           //w 238 pne po raz pierwzy wprowadzono rok przestępny, w Rzymie wg kalendarza juliańskiego był to 45 pne :)
            return false;
        } else if (year < 1582 && year % 4 == 0) { // do 1582 obowiązywał kalendarz juliański (rok przestępny co 4 lata)
            return true;}                          // w 1582 został wprowadzony kalendarz gregoriański który uwzględniał poprawki
        else if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
