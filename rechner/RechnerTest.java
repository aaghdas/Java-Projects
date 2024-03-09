package de.gfn.kursProjekte.rechner;

public class RechnerTest {
    public static void main(String[] args) {
        //ein Instanz der Klasse Rechner erzeugen
        Rechner rechner = new Rechner();

        // die Nicht-statische Methode outPut auf dem rechner-Objekt aufrufen
        rechner.outPut(2,3);
    }
}
