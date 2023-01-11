package shapes;

public class Rectangle extends Quadrilateral {
  public Rectangle(double length, double width) {
    super(length, width);
  }

  @Override
  public double getPerimeter() {
    return (length * 2) + (width * 2);
  }

  @Override
  public double getArea() {
    return length * width;
  }

  @Override
  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public void setWidth(double width) {
    this.width = width;
  }

  // protected int length;
  // protected int width;

  // public Rectangle(int length, int width) {
  // this.length = length;
  // this.width = width;
  // }

  // public int getArea() {
  // int x = this.length;
  // int y = this.width;
  // return x * y;
  // }

  // public int getPerimeter() {
  // int x = this.length;
  // int y = this.width;
  // return (x * 2 + y * 2);
  // }

}
