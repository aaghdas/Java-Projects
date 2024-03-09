package de.gfn.kursProjekte.wuerfel;
import java.util.*;
public class WuerfelBecherDivers {
    private int numberOfSides;

    public WuerfelBecherDivers(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }
    public int getNumberOfSides() {
        return numberOfSides;
    }
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int oneDiceDivers(int sides){
        //generiert eine Zufallszahl als integer zwischen 1 und Seitenanzahl
        int i = (int)(Math.random() * sides) + 1;
        return i;  //gibt die Zufallszahl zurück
    }

    public  int[] multiDiceDivers(int numberOfDices, int sides){
        //ein leehres Array deklarieren, das die zufallszahlen beinhalten wird.Die Länge des Arrays ist die Anzahl der Würfeln.
        int results[] = new int[numberOfDices];
        for (int i=0; i<numberOfDices; i++){
            results[i] = oneDiceDivers(sides);
        }
        return results;
    }

    public void ergebnisseDivers(int numberOfDices, int sides){
        // Im Fall von einem einzigen würfel
        if(numberOfDices == 1){
            int ergOneDice = oneDiceDivers(sides);
            System.out.printf("Das Ergebnis aus dem Würfel-Wurf für %d-seitege Wurfel ist: %d \n" , sides, ergOneDice);
        }

        else if(numberOfDices <= 0 ){
            System.out.println("Bitte geben Sie eine positive Zahl ein");
        }
        //Im Fall von mehreren Würfeln
        else {
            int[] ergMultiDice = multiDiceDivers(numberOfDices, sides);
            String ergMultiDiceStr = Arrays.toString(ergMultiDice);
            System.out.printf("Die Ergebnisse der %d Würfen für %d-seitige Würfel sind: %s \n",numberOfDices,sides, ergMultiDiceStr);
        }

    }

}
