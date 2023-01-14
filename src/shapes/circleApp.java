package shapes;

import java.util.Scanner;

public class circleApp {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the radius of the circle: ");
      double radius = scanner.nextDouble();
      circle circle = new circle(radius);
      System.out.println("The area of the circle is: " + circle.getArea());
      System.out.println("The circumference of the circle is: " + circle.getCircumference());
    }
  }

}
