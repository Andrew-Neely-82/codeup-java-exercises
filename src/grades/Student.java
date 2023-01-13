package grades;

import java.util.ArrayList;

public class Student {
  private String name;
  private ArrayList<Double> grades;

  public Student(String name) {
    this.name = name;
    this.grades = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public void addGrade(double grade) {
    grades.add(grade);
  }

  public double getGradeAverage() {
    double sum = 0;
    for (double grade : grades) {
      sum += grade;
    }
    double average = sum / grades.size();
    if (Double.isNaN(average)) {
      return 0;
    }
    return average;
  }
}
