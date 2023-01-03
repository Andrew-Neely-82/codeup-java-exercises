public class ControlFlowExercises {
  public static void main(String[] args) {

    // Loop Basics

    // While

    // Create an integer variable i with a value of 5.
    // Create a while loop that runs so long as i is less than or equal to 15
    // Each loop iteration, output the current value of i, then increment i by one.
    // Your output should look like this:

    // 5 6 7 8 9 10 11 12 13 14 15

    int i = 5;
    while (i <= 15) {
      System.out.print(i + " ");
      i++;
    }
    System.out.println();

    // Do While

    // Create a do-while loop that will count by 2's starting with 0 and ending at
    // 100. Follow each number with a new line.

    // Alter your loop to count backwards by 5's from 100 to -10.

    // Create a do-while loop that starts at 2, and displays the number squared on
    // each line while the number is less than 1,000,000. Output should equal:

    // 2
    // 4
    // 16
    // 256
    // 65536

    // int j = 0;
    // do {
    // System.out.println(j);
    // j += 2;
    // } while (j <= 100);
    // System.out.println();

    // int j = 100;
    // do {
    // System.out.println(j);
    // j -= 5;
    // } while (j >= -10);

    // Create a do-while loop that starts at 2, and displays the number squared on
    // each line while the number is less than 1,000,000. Output should equal:

    // 2
    // 4
    // 16
    // 256
    // 65536

    // long j = 2;
    // do {
    // System.out.println(j);
    // j *= j;
    // } while (j < 1000000);

    // Refactor the previous two exercises to use a for loop instead.

    // for (int j = 0; j <= 100; j += 2) {
    // System.out.println(j);
    // }

    // for (int j = 100; j >= -10; j -= 5) {
    // System.out.println(j);
    // }

    // for (long j = 2; j < 1000000; j *= j) {
    // System.out.println(j);
    // }

    // Fizzbuzz

    // Write a program that prints the numbers from 1 to 100.
    // For multiples of three: print “Fizz” instead of the number.
    // For the multiples of five: print “Buzz”.
    // For numbers which are multiples of both three and five: print “FizzBuzz”.

    for (int j = 1; j <= 100; j++) {
      if (j % 3 == 0 && j % 5 == 0) {
        System.out.println("FizzBuzz " + j);
      } else if (j % 3 == 0) {
        System.out.println("Fizz " + j);
      } else if (j % 5 == 0) {
        System.out.println("Buzz " + j);
      }
    }

    // Display a table of powers.

    // Prompt the user to enter an integer.
    // Display a table of squares and cubes from 1 to the value entered.
    // Ask if the user wants to continue.
    // Assume that the user will enter valid data.
    // Only continue if the user agrees to.

    // Example Output

    // What number would you like to go up to? 5

    // Here is your table!

    // number | squared | cubed
    // ------ | ------- | -----
    // 1 | 1 | 1
    // 2 | 4 | 8
    // 3 | 9 | 27
    // 4 | 16 | 64
    // 5 | 25 | 125

    // System.out.println("What number would you like to go up to? ");
    // int userNumber = Integer.parseInt(System.console().readLine());
    // System.out.println("Here is your table!");
    // System.out.println("number | squared | cubed");
    // System.out.println("------ | ------- | -----");
    // for (int j = 1; j <= userNumber; j++) {
    //   System.out.printf("%-6d | %-7d | %-5d%n", j, j * j, j * j * j);
    // }
    // System.out.println();
    // System.out.println("Would you like to continue? (y/n) ");
    // String userContinue = System.console().readLine();
    // if (userContinue.equals("y")) {
    //   System.out.println("What number would you like to go up to? ");
    //   userNumber = Integer.parseInt(System.console().readLine());
    //   System.out.println("Here is your table!");
    //   System.out.println("number | squared | cubed");
    //   System.out.println("------ | ------- | -----");
    //   for (int j = 1; j <= userNumber; j++) {
    //     System.out.printf("%-6d | %-7d | %-5d%n", j, j * j, j * j * j);
    //   }
    // }

    // Prompt the user for a numerical grade from 0 to 100.
    // Display the corresponding letter grade.
    // Prompt the user to continue.
    // Assume that the user will enter valid integers for the grades.
    // The application should only continue if the user agrees to.
    // Grade Ranges:

    // A : 100 - 88
    // B : 87 - 80
    // C : 79 - 67
    // D : 66 - 60
    // F : 59 - 0

    System.out.println("What is your numerical grade from 0 to 100? ");
    int userGrade = Integer.parseInt(System.console().readLine());
    if (userGrade >= 88) {
      System.out.println("Your letter grade is an A.");
    } else if (userGrade >= 80) {
      System.out.println("Your letter grade is a B.");
    } else if (userGrade >= 67) {
      System.out.println("Your letter grade is a C.");
    } else if (userGrade >= 60) {
      System.out.println("Your letter grade is a D.");
    } else {
      System.out.println("Your letter grade is an F.");
    }

  }
}
