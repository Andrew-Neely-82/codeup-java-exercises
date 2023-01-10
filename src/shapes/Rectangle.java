package shapes;

public class Rectangle {
  
  protected int length;
  protected int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public int getArea() {
    int x = this.length;
    int y = this.width;
    return x * y;
  }

  public int getPerimeter() {
    int x = this.length;
    int y = this.width;
    return (x * 2 + y * 2);
  }
}
