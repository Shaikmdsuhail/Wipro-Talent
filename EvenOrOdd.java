//Program to determine whether an entered integer is even or odd.
public class EvenOrOdd {

    public static void main(String[] args) {
        int number = 10; // Example number
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0; // Returns true if the number is even
    }
}