//Program to add two numbers without using binary addition (+) operator.
//Program to multiply an integer with 2 without using binary multiplication (*) operator.
//Program to divide an integer with 2 without using binary division (/) operator.
public class Binary {

    public static void main(String[] args) {
        // Program to add two numbers without using binary addition (+) operator
        int a = 5, b = 10;
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum++;
        }
        for (int j = 0; j < a; j++) {
            sum++;
        }
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // Program to multiply an integer with 2 without using binary multiplication (*) operator
        int number = 5;
        int doubleValue = number + number;
        System.out.println("Double of " + number + " is: " + doubleValue);

        // Program to divide an integer with 2 without using binary division (/) operator
        int halfValue = number >> 1; // Right shift by 1 bit to divide by 2
        System.out.println("Half of " + number + " is: " + halfValue);
    }
}