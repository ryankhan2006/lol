public class ELA extends Subjects {
  private double elaGPA;

  public ELA (String name, int grade, double GPA) {
    super(name,grade,GPA);
    elaGPA = GPA;
  }

  public void elaInfo() {
    System.out.println("ELA Grade: " + elaGPA);
  }
}