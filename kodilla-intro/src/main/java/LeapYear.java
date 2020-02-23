public class LeapYear {

    public static void main(String[] args) {

        int year =1234;
        LeapYear leapYear = new LeapYear(); // tworzymy obiekt
        leapYear.isLeapYear(year); // wywołujemy na obiekcie metodę ?? czy to jest potrzebne skoro poniżej robimy to samo
        System.out.println(year + " is a leap year. " + leapYear.isLeapYear(year));
    }

    public static boolean isLeapYear(int year) { //metoda sprawdzająca czy rok jest przestepny
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
