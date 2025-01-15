import java.util.*;

public class MapPractice {
  public static void main(String[] args) {
    HashMap<String,Integer> contactID = new HashMap<>();

    contactID.put("Johann",00);
    contactID.put("Efren",01);
    contactID.put("Francisco",02);

    System.out.println(contactID.get("Efren"));

    System.out.println(contactID.size());
    
    contactID.put("Francisco",04);
    System.out.println(contactID.get("Francisco"));

    System.out.println("Does the HashMap Contain Efren? " + contactID.containsKey("Efren"));
    System.out.println("Does the HashMap Contain 05? " + contactID.containsValue(05));

    for (String i : contactID.keySet()) {
      System.out.println(i);
    }
    for (Integer k : contactID.values()) {
      System.out.println(k);
    }
    for (String j : contactID.keySet()) {
      System.out.println("Keys: " + j + " Values: " + contactID.get(j));
    }
  }
}
