public class Cat extends Animal {
  private boolean play;

  public Cat(String name, int age, boolean vaccinated) {
    super(name,age,vaccinated);
    play = false;    
  }

  public void play() {
    System.out.println("I am playing with the cat!");
    play = true;
  }

  public boolean hasPlayed() {
    if (play == true) {
      return true;
    } else {
      return false;
    }
  }
  
}