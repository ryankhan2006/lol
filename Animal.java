public class Animal {
  private String name;
  private int age;
  private boolean vaccinated;

  public Animal (String name, int age, boolean vaccinated) {
    this.name = name;
    this.age = age;
    this.vaccinated = vaccinated;
  }

  public void adopt() {
    System.out.print("Hello! You have adopted: " + "\n" + name + "\n" + age + "\n" + "Is he vaccinated: " + vaccinated);
  }

  public void feed() {
    System.out.print("Are you hungry? Here is some food.");
  }
}