import java.util.Scanner;

public class ConsoleExercises {
  public static void main(String[] args) {

    // Prompt a user to enter a integer and store that value in an int variable
    // using the nextInt method.

    Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter an integer: ");
    // int userInput = scanner.nextInt();
    // System.out.println("You entered: " + userInput);

    // What happens if you input something that is not an integer?

    // Prompt a user to enter 3 words, and store each of them in a separate
    // variable. Then, display them back in the console, each on a newline.

    // System.out.print("Enter 3 words: ");
    // String word1 = scanner.next();
    // String word2 = scanner.next();
    // String word3 = scanner.next();

    // System.out.println("you entered: ");
    // System.out.println(word1);
    // System.out.println(word2);
    // System.out.println(word3);

    // What happens if you enter less than 3 words?
    // What happens if you enter more than 3 words?

    // Prompt a user to enter a sentence, then store that sentence in a String
    // variable using the next method. Then, display that sentence back to the user.

    // System.out.print("Enter a sentence: ");
    // String sentence = scanner.next();
    // System.out.println("You entered: " + sentence);

    // do you capture all the words?
    // Rewrite the above example using the nextLine method.

    System.out.print("Enter a sentence: ");
    String sentence2 = scanner.nextLine();
    System.out.println("You entered: " + sentence2);

  }
}
