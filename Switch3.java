//Program to display examination result using switch statement.
public class Switch3 {
    public static void main(String[] args) {
        int marks = 85; // Example marks
        String result;

        // Using switch statement to determine the examination result
        switch (marks / 10) {
            case 10:
            case 9:
                result = "Excellent";
                break;
            case 8:
                result = "Very Good";
                break;
            case 7:
                result = "Good";
                break;
            case 6:
                result = "Satisfactory";
                break;
            case 5:
                result = "Pass";
                break;
            default:
                result = "Fail";
                break;
        }

        System.out.println("Result for marks " + marks + ": " + result);
    }
}