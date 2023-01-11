package shapes;

public class ShapesTest {
  public static void main(String[] args) {

    Measurable rectangle = new Rectangle(5,4);
    System.out.println("Perimeter for rectangle: " + rectangle.getPerimeter());
    System.out.println("Area for rectangle: " + rectangle.getArea());

    Measurable square = new Square(5);
    System.out.println("Perimeter for square: " + square.getPerimeter());
    System.out.println("Area for square: " + square.getArea());
  }
}
