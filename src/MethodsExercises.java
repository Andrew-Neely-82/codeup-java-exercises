import java.util.Scanner;

public class MethodsExercises {

  public static int addition(int num1, int num2) {
    return num1 + num2;
  }

  public static int subtraction(int num1, int num2) {
    return num1 - num2;
  }

  public static int multiplication(int num1, int num2) {
    return num1 * num2;
  }

  public static int division(int num1, int num2) {
    return num1 / num2;
  }

  public static int modulus(int num1, int num2) {
    return num1 % num2;
  }

  public static int getInteger(int min, int max) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 10: ");
    int userInput = scanner.nextInt();
    if (userInput < min || userInput > max) {
      System.out.println("Invalid input. Enter a number between 1 and 10");
      return getInteger(min, max);
    }
    return userInput;
  }

  // Calculate the factorial of a number.

  // Prompt the user to enter an integer from 1 to 10.
  // Display the factorial of the number entered by the user.
  // Ask if the user wants to continue.
  // Use a for loop to calculate the factorial.
  // Assume that the user will enter an integer, but verify it’s between 1 and 10.
  // Use the long type to store the factorial.
  // Continue only if the user agrees to.
  // A factorial is a number multiplied by each of the numbers before it.
  // Factorials are denoted by the exclamation point (n!). Ex:

  // 1! = 1 = 1
  // 2! = 1 x 2 = 2
  // 3! = 1 x 2 x 3 = 6
  // 4! = 1 x 2 x 3 x 4 = 24

  public static long factorial() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 10: ");
    int userInput = scanner.nextInt();
    long factorial = 1;
    if (userInput < 1 || userInput > 10) {
      System.out.println("Invalid input. Enter a number between 1 and 10");
      return factorial();
    }
    for (int i = 1; i <= userInput; i++) {
      factorial *= i;
    }
    System.out.println("The factorial of " + userInput + " is " + factorial);
    System.out.print("Do you want to continue? [y/n] ");
    String userContinue = scanner.next();
    if (userContinue.equalsIgnoreCase("y")) {
      return factorial();
    }
    return factorial;
  }

  // Create an application that simulates dice rolling.

  // Ask the user to enter the number of sides for a pair of dice.
  // Prompt the user to roll the dice.
  // "Roll" two n-sided dice, display the results of each, and then ask the user
  // if he/she wants to roll the dice again.
  // Use static methods to implement the method(s) that generate the random
  // numbers.
  // Use the .random method of the java.lang.Math class to generate random
  // numbers.

  public static int rollDice() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of sides for a pair of dice: ");
    int userInput = scanner.nextInt();
    int dice1 = (int) (Math.random() * userInput) + 1;
    int dice2 = (int) (Math.random() * userInput) + 1;
    System.out.println("Dice 1: " + dice1);
    System.out.println("Dice 2: " + dice2);
    System.out.print("Do you want to roll the dice again? [y/n] ");
    String userContinue = scanner.next();
    if (userContinue.equalsIgnoreCase("y")) {
      return rollDice();
    }
    return dice1 + dice2;
  }

  // Game Development 101

  // Welcome to the world of game development!

  // You are going to build a high-low guessing game. Create a class named HighLow
  // inside of src.

  // The specs for the game are:

  // Game picks a random number between 1 and 100.
  // Prompts user to guess the number.
  // All user inputs are validated.
  // If user's guess is less than the number, it outputs "HIGHER".
  // If user's guess is more than the number, it outputs "LOWER".
  // If a user guesses the number, the game should declare "GOOD GUESS!"

  public static void highLow() {
    Scanner scanner = new Scanner(System.in);
    int randomNumber = (int) (Math.random() * 100) + 1;
    System.out.print("Guess a number between 1 and 100: ");
    int userInput = scanner.nextInt();
    if (userInput < 1 || userInput > 100) {
      System.out.println("Invalid input. Enter a number between 1 and 100");
      highLow();
    }
    if (userInput < randomNumber) {
      System.out.println("HIGHER");
      highLow();
    }
    if (userInput > randomNumber) {
      System.out.println("LOWER");
      highLow();
    }
    if (userInput == randomNumber) {
      System.out.println("GOOD GUESS!");
    }
  }

  public static void main(String[] args) {
    System.out.println(addition(1, 2));
    System.out.println(subtraction(1, 2));
    System.out.println(multiplication(1, 2));
    System.out.println(division(1, 2));
    System.out.println(modulus(1, 2));
    System.out.println(getInteger(1, 10));
    factorial();
    rollDice();
    highLow();
  }

}