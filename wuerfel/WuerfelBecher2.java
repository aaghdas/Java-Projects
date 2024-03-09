package de.gfn.kursProjekte.wuerfel;

import java.util.Arrays;
import java.util.Random;
    public class WuerfelBecher2
    {
        Random rand = new Random();
        int wuerfeln(int augen)
        {
            return rand.nextInt(augen)+1;
        }

        int[] wuerfeln(int augen, int wuerfe)
        {
            int[] arr = new int[wuerfe];
            for (int j = 0; j < wuerfe; j++)
            {
                arr[j] = rand.nextInt(augen)+1;
            }
            return arr;
        }

        void ausgabe(int[] arr)
        {
            for (int i : arr)
            {
                System.out.println(i);
            }
        }

        void ausgabe1(int[] arr)
        {
            System.out.println(Arrays.toString(arr));
        }

        void auswertung(int[] arr)
        {
            Arrays.sort(arr);
            StringBuilder ausgabe = new StringBuilder();
            int max = arr[arr.length-1];
            for (int i = 1; i < max; i++)
            {
                ausgabe.append(returnAnzahl(i, arr)).append(" mal ").append(i).append(", ");
            }
            ausgabe.append(returnAnzahl(max, arr)).append(" mal ").append(max).append(".");
            System.out.println(ausgabe);
        }

        int returnAnzahl(int i, int[] arr)
        {
            int anzahl = 0;
            for (int number : arr)
            {
                if (number == i)
                {
                    anzahl++;
                }

            }
            return anzahl;
        }
    }

