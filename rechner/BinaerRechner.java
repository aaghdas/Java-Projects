package de.gfn.kursProjekte.rechner;

public class BinaerRechner {

    public static void addBinaer(int a, int b){
        /*convert int to string
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        //convert(parse) string into binary
        int first = Integer.parseInt(aStr,2);
        int second = Integer.parseInt(bStr,2);
        int sum = first + second;  // sum has type of binary
*/
        int sum = a +b;
        System.out.println(Integer.toBinaryString(sum));  //converting binary into String
    }

    public static void subtractBinaer(int a, int b){
        //convert int to string
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        //convert(parse) string into binary
        int first = Integer.parseInt(aStr,2);
        int second = Integer.parseInt(bStr,2);
        int dif = first - second;  // sum has type of binary

        System.out.println(Integer.toBinaryString(dif));   //converting binary into String
    }
    public static void productBinaer(int a, int b){
        //convert int to string
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        //convert(parse) string into binary
        int first = Integer.parseInt(aStr,2);
        int second = Integer.parseInt(bStr,2);
        int product = first * second;  // sum has type of binary

        System.out.println(Integer.toBinaryString(product));   //converting binary into String
    }
    public static void divideBinaer(int a, int b){
        //convert int to string
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        //convert(parse) string into binary
        int first = Integer.parseInt(aStr,2);
        int second = Integer.parseInt(bStr,2);
        int div = first / second;  // div has type of binary

        System.out.println(Integer.toBinaryString(div));   //converting binary into String
    }

}
