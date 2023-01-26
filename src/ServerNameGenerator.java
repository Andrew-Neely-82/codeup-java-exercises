import java.util.Random;

public class ServerNameGenerator {

  public static void main(String[] args) {

    String[] adjectives = {"happy", "sad", "excited", "calm", "angry", "beautiful", "ugly", "big", "small", "fast", "slow"};
    String[] nouns = {"dog", "cat", "car", "book", "pen", "house", "computer", "tree", "flower", "phone", "table"};

    System.out.println("Your server name is: " + randomReturn(nouns) + "-" + randomReturn(adjectives));
  }

  public static String randomReturn(String[] array) {
    Random generator = new Random();
    int randomIndex = generator.nextInt(array.length);
    return array[randomIndex];
  }
}
