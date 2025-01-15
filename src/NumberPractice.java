
public class NumberPractice {
  public static void main(String args[]) {
    double numFloat = -1.2;
    int numInt = 4;

    System.out.println(numFloat);
    System.out.println(numInt);

    System.out.println(numInt%2);
    
    if (numInt%2==0) {
      System.out.println(numInt + " is even!");
    }
    else {
      System.out.println(numInt + " is negative!");
    }

    System.out.println(numFloat/4);
  }
}
