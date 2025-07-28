//Program to swap two numbers using temporary variable.
//Program to swap two numbers without using temporary variable.
//Program to swap two numbers using bitwise operators.

public class swap {

    public static void main(String[] args) {
        // Program to swap two numbers using temporary variable.
        int a = 5, b = 10;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (using temp): a = " + a + ", b = " + b);

        // Program to swap two numbers without using temporary variable.
        a = 5;
        b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without temp): a = " + a + ", b = " + b);

        // Program to swap two numbers using bitwise operators.
        a = 5;
        b = 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping (using bitwise): a = " + a + ", b = " + b);
    }   
}