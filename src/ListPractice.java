import java.util.*;

public class ListPractice {


  public static void main(String[] args) {
    
    ArrayList<String> poolEquipment = new ArrayList<String>();
    poolEquipment.add("Cue");
    poolEquipment.add("Pool Balls");
    poolEquipment.add("Chalk");
    System.err.println(poolEquipment);

    System.out.println(poolEquipment.get(1));
    poolEquipment.set(1,"Pool Table");
    System.err.println(poolEquipment);
    poolEquipment.add(0, "Glove");
    System.err.println(poolEquipment);

    for (int i=0;i<poolEquipment.size();i++) {
      System.out.println(poolEquipment.get(i));
    }

    poolEquipment.sort(null);
    System.out.println(poolEquipment);

    for (String equipment : poolEquipment) {
        System.out.println(equipment);
    }
  }
}