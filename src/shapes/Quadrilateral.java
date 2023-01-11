package shapes;

public abstract class Quadrilateral extends shape implements Measurable {
  protected double length;
  protected double width;

  public Quadrilateral(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return this.length;
  }

  public double getWidth() {
    return this.width;
}

  public abstract void setLength(double n);

  public abstract void setWidth(double n);

}