import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        String nstr = "";
        String choice = "";


        do {
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            for (int i=0; i<input.length(); i++)
            {
                ch= input.charAt(i); //extracts each character
                nstr= ch+nstr; //adds each character in front of the existing string

            }
            System.out.println( nstr);
            System.out.println("\nAgain?");
            choice = scanner.nextLine();
            choice = choice.toLowerCase();

        } while (choice.equals("y") );


    }
}
