
import java.util.Arrays;

public class StringPractice {
  public static void main(String[] args) {
    String word = "Billiards";
    System.out.println("Length of word: " + word.length());

    String word2 = "Snooker";

    System.out.println(word.concat(word2));

    System.out.println(word.charAt(3));

    String subString = "abc";
    System.out.println("Does string contain: " + subString + "? " + word.contains(subString));

    char[] charArray = word.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      System.out.println(charArray[i]);
    }

    String[] wordList = {"Carom","Bank","Billiard","Kick","Masse"};
    String arrStr = Arrays.toString(wordList);
    System.out.println(arrStr);

    System.out.println("Strings equal? " + word.equals(word2));
  }
}
