public class Math extends Subjects {
  private double mathGPA;

  public Math (String name, int grade, double GPA) {
    super(name,grade,GPA);
    mathGPA = GPA;
  }

  public void mathInfo() {
    
    System.out.println("Math Grade: " + mathGPA);
  }
}