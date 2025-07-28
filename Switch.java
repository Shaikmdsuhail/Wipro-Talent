//Program to find largest of three numbers using a switch statement
public class Switch {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int largest;

        // Using switch statement to find the largest of three numbers
        switch ((a > b ? (a > c ? 1 : 3) : (b > c ? 2 : 3))) {
            case 1:
                largest = a;
                break;
            case 2:
                largest = b;
                break;
            default:
                largest = c;
                break;
        }

        System.out.println("Largest of " + a + ", " + b + ", and " + c + " is: " + largest);
    }
}