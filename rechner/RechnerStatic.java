package de.gfn.kursProjekte.rechner;
public class RechnerStatic {

        public static int add(int a,int b){

            return a + b;
        };

        public static int subtract(int a,int b){

            return a - b;
        };
    public static int mult(int a , int b){
            return a * b;
        };
    public static double divide (double a , double b){

            return a / b;
        };
    public static void outPut(int a,int b) {
        System.out.println();
        System.out.println("*************************************");
        System.out.println("Wir sind in der 'Static' Klasse");
        System.out.printf("%d + %d = %d\n", a, b, add(a,b));
        System.out.printf("%d - %d = %d\n", a, b, subtract(a,b));
        System.out.printf("%d * %d = %d\n", a, b, mult(a,b));
        System.out.printf("%d / %d = %f\n", a, b, divide(a,b));
        System.out.println("*************************************");
    };
}


