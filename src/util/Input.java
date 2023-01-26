package util;

import java.util.*;

public class Input {
  private Scanner scanner;

  public Input() {
    this.scanner = new Scanner(System.in);
  }

  public String getString(String prompt) {
    if (prompt != null) {
      System.out.print(prompt);
    }
    return this.scanner.nextLine();
  }

  public boolean yesNo(String prompt) {
    String userInput = getString(prompt).toLowerCase();
    return userInput.equals("y") || userInput.equals("yes");
  }

  public int getInt(String prompt, int min, int max) {
    int userInt = 0;
    boolean isValid = false;
    while (!isValid) {
      try {
        userInt = Integer.valueOf(getString(prompt));
        if (userInt >= min && userInt <= max) {
          isValid = true;
        } else {
          System.out.println("Invalid input. Please enter an integer between " + min + " and " + max);
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter an integer.");
      }
    }
    return userInt;
  }

  public int getInt(String prompt) {
    int userInt = 0;
    boolean isValid = false;
    while (!isValid) {
      try {
        userInt = Integer.valueOf(getString(prompt));
        isValid = true;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter an integer.");
      }
    }
    return userInt;
  }

  public double getDouble(String prompt, double min, double max) {
    while (true) {
      try {
        System.out.println(prompt);
        double userDouble = Double.valueOf(scanner.nextLine());
        if (userDouble >= min && userDouble <= max) {
          return userDouble;
        } else {
          System.out.println("Number out of range. Please enter a number between " + min + " and " + max);
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid decimal number.");
      }
    }
  }

  public int getBinary(String prompt) {
    while (true) {
      try {
        String userInput = getString(prompt);
        if (!userInput.matches("[01]+")) {
          System.out.println("Invalid input. Please enter a valid binary number.");
          continue;
        }
        int value = Integer.parseInt(userInput, 2);
        return value;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid binary number.");
      }
    }
  }

  public int getHex(String prompt) {
    while (true) {
      try {
        String userInput = getString(prompt);
        if (!userInput.matches("[0-9A-Fa-f]+")) {
            System.out.println("Invalid input. Please enter a valid hexadecimal number.");
            continue;
        }
        int value = Integer.parseInt(userInput, 16);
        return value;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid hexadecimal number.");
      }
    }
  }
}
