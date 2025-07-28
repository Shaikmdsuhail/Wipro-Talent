//Program to accept a character and print it is a vowel, consonant or a digit.      ‘a’   ‘z’   ‘9
public class Vowel3 {

    public static void main(String[] args) {
        char ch = '9'; // Example character
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is neither a vowel, consonant, nor a digit.");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for comparison
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}