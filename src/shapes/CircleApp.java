package shapes;

import java.util.Scanner;

public class CircleApp {

  public static void main(String[] args) {
<<<<<<< HEAD:src/shapes/CircleApp.java
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    double radius = scanner.nextDouble();
    Circle circle = new Circle(radius);
    System.out.println("The area of the circle is: " + circle.getArea());
    System.out.println("The circumference of the circle is: " + circle.getCircumference());
=======
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the radius of the circle: ");
      double radius = scanner.nextDouble();
      circle circle = new circle(radius);
      System.out.println("The area of the circle is: " + circle.getArea());
      System.out.println("The circumference of the circle is: " + circle.getCircumference());
    }
>>>>>>> 6f4c5bf3d7be58fedb3a46f690e859c0b3d55980:src/shapes/circleApp.java
  }

}
