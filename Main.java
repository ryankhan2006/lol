class Main {
  public static void main(String[] args) {
    
    Subjects random = new Subjects("Ryan",11,100.00);
    random.info();
    Math random2 = new Math("Shams",11,100.00);
    random2.info();
    random2.mathInfo();
    ELA random3 = new ELA("Koushik",11,100.00);
    random3.info();
    random3.elaInfo();
    
  }
}