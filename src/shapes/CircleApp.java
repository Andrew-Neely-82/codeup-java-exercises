package shapes;

import java.util.Scanner;

public class CircleApp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    double radius = scanner.nextDouble();
    Circle circle = new Circle(radius);
    System.out.println("The area of the circle is: " + circle.getArea());
    System.out.println("The circumference of the circle is: " + circle.getCircumference());
  }

}
