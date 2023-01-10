import java.util.Arrays;

public class ArraysExercises {

  static String[] names = { "John", "George", "Paul" };

  static void addPerson(String[] names, String name) {
    String[] newNames = new String[names.length + 1];
    for (int i = 0; i < names.length; i++) {
      newNames[i] = names[i];
    }
    newNames[names.length] = name;
    names = newNames;
  }

  public static Person[] addPerson(Person[] people, Person person) {
    Person[] newPeople = new Person[people.length + 1];
    for (int i = 0; i < people.length; i++) {
      newPeople[i] = people[i];
    }
    newPeople[people.length] = person;
    return newPeople;
  }

  public static void main(String[] args) {
    addPerson(names, "Ringo");
    System.out.println(Arrays.toString(names));

    Person[] people = new Person[3];
    people[0] = new Person("John");
    people[1] = new Person("George");
    people[2] = new Person("Paul");

    people = addPerson(people, new Person("Ringo"));
    System.out.println(Arrays.toString(people));
  }

}