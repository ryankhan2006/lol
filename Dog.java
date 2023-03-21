public class Dog extends Animal {
  private boolean walk;

  public Dog(String name, int age, boolean vaccinated) {
    super(name,age,vaccinated);
    walk = false;    
  }

  public void walk() {
    System.out.println("I am walking with the dog!");
    walk = true;
  }

  public boolean hasBeenWalked() {
    if (walk == true) {
      return true;
    } else {
      return false;
    }
  }
  
}