package de.gfn.kursProjekte.wuerfel;
import java.util.*;

public class WuerfelBecher {


    //simuliert einen Würfel-Wurf für einen einzelnen Würfel und gibt das Ergebnis des Wurfes zurück
    public static int oneDice(){
        //generiert eine Zufallszahl als integer zwischen 1 und 6
        int i = (int)(Math.random() * 6) + 1;
        return i;  //gibt die Zufallszahl zurück
    }

    //simuliert einen Würfel-Wurf für mehrere Würfel und gibt ein Array von der Wurf-Ergebnisse zurück
    public static int[] multiDice(int numberOfDices){
        //ein leehres Array deklarieren, das die zufallszahlen beinhalten wird.Die Länge des Arrays ist die Anzahl der Würfeln.
        int results[] = new int[numberOfDices];
        for (int i=0; i<numberOfDices; i++){
            int result = (int)(Math.random() * 6) + 1;
            results[i] = result;
        }
        return results;
    }


    /* Ruft die Methoden multiDice oder oneDice auf und speichert den Rückgabewert
     in entsprechende Variable und gibt die Ergebnisse aus den Würfel aus. */
    public static void ergebniss(int numberOfDices){
        // Im Fall von einem einzigen würfel
        if(numberOfDices == 1){
           int ergOneDice = oneDice();
            System.out.println("Das Ergebnis aus dem Würfel-Wurf ist: " + ergOneDice);
        }

        else if(numberOfDices <= 0 ){
            System.out.println("Bitte geben Sie eine positive Zahl ein");
        }
        //Im Fall von mehreren Würfeln
        else {
            int[] ergMultiDice = multiDice(numberOfDices);
            String ergMultiDiceStr = Arrays.toString(ergMultiDice);
            System.out.printf("Die Ergebnisse der %d Würfen sind: %s \n",numberOfDices, ergMultiDiceStr);
        }

    }
}
