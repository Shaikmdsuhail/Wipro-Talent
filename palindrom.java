// demonstarte the palindrome concept using while loop
import java.util.Scanner;
public class palindrom {
    // public static void main(String[] args) {
    //     // String str = "madam";
    //     Scanner sc = new Scanner(System.in);
    //     int str = sc.nextInt();
    //     if (isPalindrome(str)) {
    //         System.out.println(str + " is a palindrome.");
    //     } else {
    //         System.out.println(str + " is not a palindrome.");
    //     }
        
    // }

    // public static boolean isPalindrome(String str) {
    //     int left = 0;
    //     int right = str.length() - 1;

    //     while (left < right) {
    //         if (str.charAt(left) != str.charAt(right)) {
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
    //  public static boolean isPalindrome(int num) {
    //     if (num < 0) return false; // Negative numbers are not palindromes

    //     int original = num;
    //     int reversed = 0;

    //     while (num != 0) {
    //         int digit = num % 10;
    //         reversed = reversed * 10 + digit;
    //         System.out.println("Reversed number: " + reversed);
    //         num /= 10;
    //     }

    //     return original == reversed;
    // }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String num = sc.next();
        StringBuilder reversedStringBuilder = new StringBuilder(num).reverse();
        System.out.println(num.equals(reversedStringBuilder.toString()) ? "Palindrome" : "Not a palindrome");
    }
    
    
}
