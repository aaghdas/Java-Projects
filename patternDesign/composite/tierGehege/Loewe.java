package de.gfn.kursProjekte.patternDesign.composite.tierGehege;

public class Loewe implements Sozialisiert{
    @Override
    public void starteFuetterung() {
        System.out.println("Der Löwe wird gefüttert.");
    }

    @Override
    public void starteNachtruhe() {
        System.out.println("Der Löwe geht um 22 Uhr schlafen.");
    }
}
