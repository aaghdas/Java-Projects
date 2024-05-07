package de.gfn.lessons.loopExamples;

public class Destructor {
    public static void main(String[] args) throws InterruptedException {

        Destructor dt = new Destructor();
        System.out.println(dt.hashCode()); // hashCode ist eine Methode, die von Objekt geerbt wurde

        dt = null; // Ab hier ist das Objekt auf dem Heap für GC verfügbar

        //System.out.println(dt.hashCode()); //Method invocation 'hashCode' will produce 'NullPointerException'
        System.gc(); // GC wird aufgefordert den Müll zu entsorgen

        Thread.sleep(2000); // Der aktuell laufende Prozess wartet 2 Sekunden
    }


    // Wird von GC verwendet, wenn das Objekt vom Speicher entfernt wird
    @Override
    protected void finalize() {
        System.out.println("GC hat entsorgt!!!!");
    }
}
/*System.gc() ist eine Methode in Java, die einen Garbage-Collector auslöst.
Die Garbage Collection in Java ist für das Aufräumen und Freigeben von nicht mehr referenzierten Objekten
 im Speicher verantwortlich. Obwohl Sie System.gc() aufrufen können, um eine Garbage Collection zu initiieren,
 gibt es keine Garantie dafür, dass die Garbage Collection sofort ausgeführt wird. Die JVM entscheidet, wann und
 wie oft die Garbage Collection durchgeführt wird.
 Das Hinzufügen von Thread.sleep(millis) nach System.gc() gibt der JVM eine Pause und ermöglicht es ihr,
 die Garbage Collection durchzuführen, bevor der Code fortgesetzt wird. Durch das Hinzufügen dieser Pause kann
  die Garbage Collection eine bessere Chance haben, nicht mehr benötigten Speicher freizugeben, bevor der Code weiterläuft.

Es ist wichtig zu beachten, dass das Hinzufügen von Thread.sleep() nicht die Garantie dafür bietet, dass die
 Garbage Collection erfolgreich abgeschlossen wird oder dass alle nicht mehr benötigten Objekte im Speicher
 freigegeben werden. Die Garbage Collection in Java ist ein komplexer Vorgang, der von der JVM verwaltet wird,
  und es gibt viele Faktoren, die beeinflussen, wann und wie sie durchgeführt wird.

In vielen Fällen ist es nicht notwendig oder empfohlen, System.gc() oder Thread.sleep() zur Steuerung
der Garbage Collection zu verwenden. Es ist oft besser, der JVM zu vertrauen, die Garbage Collection
automatisch zu verwalten. Wenn Sie jedoch spezielle Anforderungen haben oder bestimmte Optimierungen vornehmen
 müssen, können Sie System.gc() und Thread.sleep() in Betracht ziehen.

 */

