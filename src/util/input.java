package util;

import java.util.Objects;
import java.util.Scanner;

public class input {

  private static Scanner scanner = new Scanner(System.in);

  public static String getString() {
    System.out.println("Enter a string: ");
    String string = scanner.nextLine();
    return string;
  }

  // The yesNo method should return true if the user enters y, yes, or variants
  // thereof, and false otherwise.
  public static boolean yesNo() {
    System.out.println(" Enter Y or N ");
    String answer = scanner.nextLine().toLowerCase();
    return Objects.equals(answer, "y") || Objects.equals(answer, "yes");

  }

  // int getInt(int min, int max)

  public static int getInt(int min, int max) {
    while (true) {
      System.out.println("Enter a number between " + min + " and " + max);
      try {
        String input = scanner.nextLine();
        int num = Integer.valueOf(input);
        if (num >= min && num <= max) {
          return num;
        } else {
          System.out.println("Invalid number, please enter a number between " + min + " and " + max);
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input, please enter a valid integer value.");
      }
    }
  }

  // int getInt()

  public static int getInt(int num) {
    System.out.println("Enter a number: ");
    return num;
  }

  // double getDouble(double min, double max)

  public static double getDouble(double min, double max) {
    while (true) {
      System.out.println("Enter a number between " + min + " and " + max);
      try {
        String input = scanner.nextLine();
        double num = Double.valueOf(input);
        if (num >= min && num <= max) {
          return num;
        } else {
          System.out.println("Invalid number, please enter a number between " + min + " and " + max);
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input, please enter a valid double value.");
      }
    }
  }

  // double getDouble()

  public static double getDouble(double num) {
    return num;
  }

  // The getInt(int min, int max) method should keep prompting the user for input
  // until they give an integer within the min and max. The getDouble method
  // should do the same thing, but with decimal numbers.

  // Create another class named InputTest that has a static main method that uses
  // all the methods from the Input class.

  public static void main(String[] args) {
    getString();
    System.out.println(yesNo());
    getInt(1, 10);
    getInt(1);
    getDouble(1.0, 10.0);
    getDouble(1.0);
  }

}
