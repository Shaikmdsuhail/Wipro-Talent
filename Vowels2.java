//Program to accept a character and print it is a vowel or consonant.  ‘a’      ‘s’ 
public class Vowels2 {

    public static void main(String[] args) {
        char ch = 's'; // Example character
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for comparison
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}