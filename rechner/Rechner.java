package de.gfn.kursProjekte.rechner;
public class Rechner {
   public int add(int a,int b){
        return a + b;
    };
   public int subtract(int a,int b){
        return a - b;
    };
   public int mult(int a , int b){
       return a * b;
   };
  public double divide (double a , double b){
       return a / b;
   };
  // %s String, %d int, %f double. \n Zeilenbruch
  public void outPut(int a,int b) {
      System.out.println();
      System.out.println("*************************************");
      System.out.println("Wir sind in der 'Nicht-Static' Klasse");
      System.out.printf("%d + %d = %d\n", a, b, add(a,b));
      System.out.printf("%d - %d = %d\n", a, b, subtract(a,b));
      System.out.printf("%d * %d = %d\n", a, b, mult(a,b));
      System.out.printf("%d / %d = %f\n", a, b, divide(a,b));
      System.out.println("*************************************");
  };
}
