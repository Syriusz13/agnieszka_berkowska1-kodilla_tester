public class LeapYear {

    public static void main(String[] args) {

        int year =1234;
        LeapYear leapYear = new LeapYear();
        leapYear.isLeapYear(year);
        System.out.println(year + " is a leap year. " + leapYear.isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
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
