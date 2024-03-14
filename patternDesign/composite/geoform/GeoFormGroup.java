package de.gfn.kursProjekte.patternDesign.composite.geoform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/* Ziel und Zweck: Die Aktionen print und moveTo auf eine ganze Gruppe von unterschiedlichen GeoFormen wie z.B. Circle oder Rectangke gleichzeitig anwenden.
Voraussetzung ist es, dass alle diese unterschiedlichen Formen eine gemeinsame Datentyp auf höhere Ebene haben, d.h. hier z.B. GeoForm für Instanzen
der Klassen Rectangle und Circle implementieren der interface GeoForm und deswegen können auch als Geoform-Objekte in einer Liste gruppiert werden.
Die Klasse GeoFormGroup hat auch die Methoden print und moveTo überschrieben(implements GeoForm) und kann diese auf ganze gruppe von Geoformen aufrufen.
 */

public class GeoFormGroup implements GeoForm {
// Instanzvariable geoFormGroup ist eine Liste von GeoForm-Objekten
    private List<GeoForm> geoFormGroup;

    //Klassenkonstruktur nimmt variable Anzahl von GeoForm-Objekten entgegen und fügt diese einer ArrayList hinzu.
    public GeoFormGroup(GeoForm... geoForms) {
        this.geoFormGroup = new ArrayList<>(Arrays.asList(geoForms));
    }

    // fügt ein GeoForm der GeoFormListe hinzu.
    public void add(GeoForm geoForm) {
        geoFormGroup.add(geoForm);
    }

    // überschreiben von interface Methoden, sodass mit dem Aufruf dieser Methode, die gleichnamige Methode auf jedes Element der GeoformListe aufgerufen wird.
    @Override
    public void print() {
        for (GeoForm g : geoFormGroup) {
            //die print-Methode aus der klasse, woher das Objekt kommt.wenn objekt instanz der klasse circle is, dann print aus der klasse circle wird aufgerufen usw.

            g.print();
        }
    }

    @Override
    public void moveTo(int x, int y) {
        for (GeoForm g : geoFormGroup) {
            /* Anders als print Methode, gibt es die moveTo Methode in den Klassen Circle und Rectangle nicht, stattdessen vererben die beiden Klassen diese Methode von ihrer Elternklasse AbstractGeoForm */
            g.moveTo(x, y);

        }
    }
}