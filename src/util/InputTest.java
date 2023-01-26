package util;

public class InputTest {
  public static void main(String[] args) {
    Input input = new Input();

    System.out.println("Enter a string: ");
    String userString = input.getString("");

    System.out.println("You entered: " + userString);

    System.out.println("Enter an integer between 1 and 10: ");
    int userInt = input.getInt("", 1, 10);

    System.out.println("You entered: " + userInt);

    System.out.println("Enter a decimal number between 0.5 and 1.5: ");
    double userDouble = input.getDouble("", 0.5, 1.5);

    System.out.println("You entered: " + userDouble);

    System.out.println("Enter 'y'/'yes or 'n'/'no': ");
    boolean userYesNo = input.yesNo("");

    System.out.println("You entered: " + userYesNo);

    System.out.println("Enter a binary number: ");
    int userBinary = input.getBinary("");

    System.out.println("You entered: " + userBinary);

    System.out.println("Enter a hexadecimal number: ");
    int userHex = input.getHex("");

    System.out.println("You entered: " + userHex);
  }
}
