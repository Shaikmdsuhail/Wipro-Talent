 //Program to demonstrate working of bitwise operators in C
public class Bitwiseoperators {

    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Demonstrating bitwise AND operator
        System.out.println("Bitwise AND: " + (a & b)); // 0001 in binary, which is 1 in decimal

        // Demonstrating bitwise OR operator
        System.out.println("Bitwise OR: " + (a | b)); // 0111 in binary, which is 7 in decimal

        // Demonstrating bitwise XOR operator
        System.out.println("Bitwise XOR: " + (a ^ b)); // 0110 in binary, which is 6 in decimal

        // Demonstrating bitwise NOT operator
        System.out.println("Bitwise NOT of a: " + (~a)); // Inverts bits of a
    }
}