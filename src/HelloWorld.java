public class HelloWorld {
    public static void main(String[] args) {
      String hello = "Hello, ";
      String world = "World!";
      System.out.println(hello + world);
  
      // * TODOne 1
      // Create an int variable named myFavoriteNumber and assign your favorite number
      // to it, then print it out to the console.
      int myFavoriteNumber = 7;
      System.out.println(myFavoriteNumber);
  
      // * TODOne 2
      // Create a String variable named myString and assign a string value to it, then
      // print the variable out to the console.
      String myString = "This is a string.";
      System.out.println(myString);
  
      // * TODOne 3
      // Change your code to assign a character value to myString. What do you notice?
      // myString = 'c'; // does not work
  
      // * TODOne 4
      // Change your code to assign the value 3.14159 to myString. What happens?
      // myString = 3.14159; // does not work
  
      // * TODOne 5
      // Declare an long variable named myNumber, but do not assign anything to it.
      // Next try to print out myNumber to the console. What happens?
      // long myNumber;
      // System.out.println(myNumber); // does not work
  
      // * TODOne 6
      // Change your code to assign the value 3.14 to myNumber. What do you notice?
      // myNumber = 3.14; // does not work
      // System.out.println(myNumber);
  
      // * TODOne 7
      // Change your code to assign the value 123L (Note the 'L' at the end) to
      // myNumber.
      // myNumber = 123L;
      // System.out.println(myNumber);
  
      // * TODOne 8
      // Change your code to assign the value 123 to myNumber.
      // myNumber = 123;
      // System.out.println(myNumber);
  
      // * TODOne 9
      // Change your code to declare myNumber as a float. Assign the value 3.14 to it.
      // What happens? What are two ways we could fix this?
      // float myNumber; // does not work
      // myNumber = 3.14; // does not work
      // System.out.println(myNumber);
  
      // * TODOne 10
      // int x = 5;
      // System.out.println(x++); // 5
      // System.out.println(x); // 6
  
      // int x = 5;
      // System.out.println(++x); // 6
      // System.out.println(x); // 6
  
      // * TODOne 11
      // Try to create a variable named class. What happens?
      // String class = "This is a string."; // does not work
  
      // * TODOne 12
      // String theNumberThree = "three"; // does not work
      // Object o = theNumberThree; // does not work
      // int three = (int) o; // does not work
  
      // * TODOne 13
      // Rewrite the following expressions using the relevant shorthand assignment
      // operators:
  
      // int x = 4;
      // x = x + 5;
      // x += 5;
  
      // int x = 3;
      // int y = 4;
      // y = y * x;
      // y *= x;
  
      // int x = 10;
      // int y = 2;
      // x = x / y;
      // y = y - x;
      // x /= y;
  
      // * TODOne 14
      // What happens if you assign a value to a numerical variable that is larger (or
      // smaller)
      // than the type can hold? What happens if you increment a numeric variable past
      // the
      // type's capacity?
      int x = 2147483647; // max value for int
      // System.out.println(x); // 2147483647
      x++;
      System.out.println(x); // -2147483648
    }
  }