//Program to accept a character, if the entered character is in upper case then convert it into lower case and vice versa.( Toggle)   a      A        A    a
public class Toggle {

    public static void main(String[] args) {
        char ch = 'A'; // Example character
        if (Character.isUpperCase(ch)) {
            ch = Character.toLowerCase(ch);
        } else if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
        }
        System.out.println("Toggled character: " + ch);
    }
}
