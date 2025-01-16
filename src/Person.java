
public class Person {
  public String name;
  private final int age;
  
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String string() {
    return name + age;
  }

  public int birthyear(int currentyear) {
    return currentyear - age;
  }
  // Implement the below public instance method "birthYear"
  // There should NOT be any print statement in this method.
  /**
   * birthYear returns the year the person was born.
   * 
   * The birth year is calculated by subtracting the person's age from currentYear
   * that's passed in as an int. It assumes that the person's birthday has already
   * passed this year.
   * 
   * @param currentYear an int for the current year
   * @return The year the person was born
   */
  // (create the instance method here)


  public static void main(String[] args) {
    Person person1 = new Person("RJ",20);
    Person person2 = new Person("Yao",19);

    System.out.println(person1.string());
    System.out.println(person2.string());
    
    String person1name = person1.getName();
    System.out.println(person1name);
    
    int byear = person1.birthyear(2025);
    System.out.println(byear);

    /**
     * Terminology!
     * 
     * A class is the overall definition, like a blueprint.
     * An instance is a specific object made according to that definition.
     * We use "instance" and "object" to mean the same thing.
     * 
     * For example, if there is a Person class, we can make an instance of a specific person: Auberon.
     * 
     * There can be many instances for the same class. For example: Auberon, Xinting, Baya are all
     * different instances of the Person class.
     * 
     * Each instance has its own instance variables: Auberon's age can be different from Baya's age.
     */
  }
}
