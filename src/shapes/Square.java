package shapes;

public class Square {

  private int side;

  public Square(int side) {
    this.side = side;
  }

  public int getArea() {
    return side * side;
  }

  public int getPerimeter() {
    return 4 * side;
  }

}