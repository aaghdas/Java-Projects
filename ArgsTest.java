package de.gfn.lessons.loopExamples;

import java.util.Arrays;

    public class ArgsTest {


        // VarArgs
        static void sayHallo(String... names) {
            for (String name : names) {

                System.out.printf("Hallo %s, ", name);
            }
        }

        static int getSum(int... values) { // VarArgs
            int sum = 0;
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return sum;
        }

        public static void main(String[] args) { // CLI-Parameter werden als Strings eingelesen

            // Aufruf auf der CMD
            // java de.lubowiecki.playground.ArgsTest Peter Carol Bruce Tony

            //System.out.println(Arrays.toString(args));


                sayHallo("ana" ,"armin" );
            System.out.println();
            System.out.println(getSum());
            System.out.println(getSum(1,2,3));
            System.out.println(getSum(1,2,3,5,6,7,10,22,19,100));
            System.out.println(getSum(new int[]{1,2,3}));
            System.out.println(getSum(new int[10]));
            }


        }




