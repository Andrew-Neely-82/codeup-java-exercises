package shapes;

public class circle {

  private double radius;

  public circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * (Math.pow(this.radius, 2));
  }

  public double getCircumference() {
    return 2 * Math.PI * this.radius;
  }

}
