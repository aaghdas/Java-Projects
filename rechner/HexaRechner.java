package de.gfn.kursProjekte.rechner;

public class HexaRechner {
    public static void addHexa(int a, int b){


        int sum = a + b;

        System.out.println(Integer.toHexString(sum).toUpperCase());   //converting binary into String
    }
}
