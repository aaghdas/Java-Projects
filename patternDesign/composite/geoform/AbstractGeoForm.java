package de.gfn.kursProjekte.patternDesign.composite.geoform;


    // abstract bedeutet, dass die Klasse noch nicht fertig ist
// Abstrakte Klassen müssen Interfaces nicht vollständig erfüllen, die Methoden die nicht hier überschrieben werden, müssen spätestens in Kinderklassen implementiert werden.
// Abstrakte Klassen können nicht instanziert werden

//Ziel: die gemeinsame Eigenschaften wie, positionkoordinaten x, y sowie gemeinsame methode moveTo wird hier deklariert.
/* Abstrakte Klassen sind Klassen, die als Oberklassen dienen und selbst nicht zur Bildung von Objekten herangezogen werden können.
Sie werden oft verwendet, um Eigenschaften und Fähigkeiten einer allgemeinen Typgruppe zu definieren, deren abgeleitete Unterklassen
diese dann weiter spezifizieren.
 */
public abstract class AbstractGeoForm implements GeoForm {

        private int x;

        private int y;

        //Konstruktur, die vererbt werden kann und für gemeinsame Eigenschaften verwendet werden kann.
        public AbstractGeoForm(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //getter/setter Methoden für den Zugriff auf private Egenschaften( Kapselung)
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        //implementierung der interface Methode
        @Override
        public void moveTo(int a, int b) {

            this.x = a;
            this.y = b;
        }
    }

