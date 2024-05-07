package de.gfn.lessons.loopExamples;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i <5; ++i){
            System.out.println(i);
        }
        for(int i = 0; i <5; i++){
            System.out.println(i);
        }

        int summe1 = 0;
        for (int x = 1; x <= 5; ++x) {
            summe1 += x;
        }
        System.out.println("Summe mit ++x: " + summe1);



        int summe2 = 0;
        for (int x = 1; x <= 5; x++) {
            System.out.println("Summe mit x++ vor: " + summe2);
            summe2 = x++;
            System.out.println("Summe mit x++: nach" + summe2);
        }

        int summe3 = 0;
        for (int x = 1; x <= 5; x++) {
            System.out.println("Summe mit ++x vor: " + summe3);
            summe3 = ++x;
            System.out.println("Summe mit ++x: nach" + summe3);
        }


    }
}
