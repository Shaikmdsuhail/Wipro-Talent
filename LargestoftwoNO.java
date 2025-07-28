//Program to find largest of two no’s
// using Ternary operator
//and
//using math.max()
public class LargestoftwoNO {

    public static void main(String[] args) {
        int a = 10, b = 20;

        // Using Ternary operator
        int largestTernary = (a > b) ? a : b;
        System.out.println("Largest of " + a + " and " + b + " using Ternary operator is: " + largestTernary);

        // Using Math.max
        int largestMathMax = Math.max(a, b);
        System.out.println("Largest of " + a + " and " + b + " using Math.max is: " + largestMathMax);
    }
}