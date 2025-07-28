//Program to input a year and check whether it is leap year or not, also consider centuries.
// A year is a leap year if it is divisible by 4, except for end-of-century years.
// The end-of-century year must be divisible by 400 to be a leap year
public class Leapyear {

    public static void main(String[] args) {
        int year = 2020; // Example year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Century year must be divisible by 400
            }
            return true; // Non-century year divisible by 4 is a leap year
        }
        return false; // Not divisible by 4, hence not a leap year
    }
}