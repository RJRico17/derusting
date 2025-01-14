public class ArrayPractice {
  public static void main(String[] args) {
    String[] cueists = {"Efren","Francisco","Johann","AJ"};
    System.out.println(cueists[2]);
    System.out.println(cueists.length);
    for (int i=0; i < cueists.length; i++) {
      System.out.println(cueists[i]);
    }
    for (String cueist : cueists) {
      System.out.println(cueist);
    }
  }
}
