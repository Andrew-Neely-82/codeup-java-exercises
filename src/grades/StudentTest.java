package grades;

public class StudentTest {

  public static void main(String[] args) {
    Student student = new Student("John");
    student.addGrade(90.5);
    student.addGrade(80.7);
    student.addGrade(75.9);
    System.out.println(student.getName() + "'s average grade is " + student.getGradeAverage());
  }
}