//Program to check whether a no is even or odd using switch
public class Switch2 {
    public static void main(String[] args) {
        int number = 10; // Example number
        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number.");
                break;
            case 1:
                System.out.println(number + " is an odd number.");
                break;
        }
    }
}