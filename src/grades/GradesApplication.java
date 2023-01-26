package grades;

import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

public class GradesApplication {
  public static final String WELCOME_MESSAGE = "Welcome!";
  public static final String GITHUB_USERNAMES_MESSAGE = "Here are the GitHub usernames of our students";
  public static final String INPUT_MESSAGE = "What student would you like to see more information on?";
  public static final String NOT_FOUND_MESSAGE = "Sorry, no student found with the GitHub username of \"%s\".";
  public static final String CONTINUE_MESSAGE = "Would you like to see another student?";
  public static final String YES_OPTION = "yes";
  public static final String[] OPTIONS = { "BillyLAMP", "BootstrapBob", "JqueryJack", "JavaJill" };
  public static final String GOODBYE = "Goodbye!";

  public static void main(String[] args) {

    UIManager.put("OptionPane.background", Color.BLACK);
    UIManager.put("Panel.background", Color.BLACK);
    UIManager.put("OptionPane.messageForeground", Color.WHITE);
    UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 16));

    HashMap<String, Student> students = new HashMap<>();
    Student student1 = new Student("Billy");
    students.put(OPTIONS[0], student1);
    student1.addGrade(94.6);
    student1.addGrade(81.2);
    student1.addGrade(93.8);
    Student student2 = new Student("Bob");
    students.put(OPTIONS[1], student2);
    student2.addGrade(73.7);
    student2.addGrade(94.6);
    student2.addGrade(87.3);
    Student student3 = new Student("Jack");
    students.put(OPTIONS[2], student3);
    student3.addGrade(71.1);
    student3.addGrade(67.5);
    student3.addGrade(74.9);
    Student student4 = new Student("Jill");
    students.put(OPTIONS[3], student4);
    student4.addGrade(90.9);
    student4.addGrade(80.6);
    student4.addGrade(70.3);

    JOptionPane.showMessageDialog(null, WELCOME_MESSAGE + "\n\n" + GITHUB_USERNAMES_MESSAGE, WELCOME_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
    while (true) {
      String userInput = (String) JOptionPane.showInputDialog(null, INPUT_MESSAGE, "Students", JOptionPane.QUESTION_MESSAGE, null, OPTIONS, OPTIONS[0]);
      if (students.containsKey(userInput)) {
        Student student = students.get(userInput);
        String studentInformation = String.format("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput + "\n\nCurrent Average: %.2f", students.get(userInput).getGradeAverage());
        JOptionPane.showMessageDialog(null, studentInformation, student.getName() + "'s Information", JOptionPane.INFORMATION_MESSAGE);
      } else {
        String notFoundMessage = String.format(NOT_FOUND_MESSAGE, userInput);
        JOptionPane.showMessageDialog(null, notFoundMessage);
      }
      String userContinue = JOptionPane.showInputDialog(null, CONTINUE_MESSAGE, "Continue?", JOptionPane.QUESTION_MESSAGE, null, new String[] { "Yes", "No" }, "Yes").toString();
      if (!YES_OPTION.equalsIgnoreCase(userContinue)) {
        JOptionPane.showMessageDialog(null, GOODBYE, "Goodbye!", JOptionPane.INFORMATION_MESSAGE);
        break;
      }
    }
  }
}