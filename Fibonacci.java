//write a program to print Fibonacci series with recursion and without recursion
public class Fibonacci {
    public static void main(String[] args) {
        int n = 1000000; // Example: first 10 Fibonacci numbers
        System.out.println("Fibonacci series up to " + n + " terms (without recursion):");
        printFibonacciWithoutRecursion(n);
        
        System.out.println("\nFibonacci series up to " + n + " terms (with recursion):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciWithRecursion(i) + " ");
        }
    }

    // Method to print Fibonacci series without recursion
    public static void printFibonacciWithoutRecursion(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    // Method to calculate Fibonacci number using recursion
    public static int fibonacciWithRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciWithRecursion(n - 1) + fibonacciWithRecursion(n - 2);
    }
}