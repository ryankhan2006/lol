public class Subjects {
  private String name;
  private int grade;
  private double GPA;


  public Subjects(String name, int grade, double GPA) {
    this.name = name;
    this.grade = grade;
    this.GPA = GPA;
  }

  public void info() {
    System.out.println(name + " Info: ");
    System.out.println("Grade: " + grade);
    System.out.println("GPA: " + GPA);
  }
}