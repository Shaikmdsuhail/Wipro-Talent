//Program to check whether a given no is positive
public class PositiveNO {

    public static void main(String[] args) {
        int number = 10; // Example number
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}