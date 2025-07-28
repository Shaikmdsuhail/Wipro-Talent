//Write a program to find largest of three no’s using Ternary operator
class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int largest = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println("Largest of " + a + ", " + b + ", and " + c + " is: " + largest);
    }
} 