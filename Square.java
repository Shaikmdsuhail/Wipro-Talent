//Program to check whether an entered integer is a perfect square or not.
public class Square {

    public static void main(String[] args) {
        int number = 16; // Example number
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }

    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false; // Negative numbers cannot be perfect squares
        }
        int sqrt = (int) Math.sqrt(number);
        return (sqrt * sqrt == number); // Check if the square of the integer square root equals the original number
    }
}