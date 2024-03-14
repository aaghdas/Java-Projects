package de.gfn.kursProjekte.patternDesign.composite.tierGehege;

public class Vogel implements Sozialisiert {
    @Override
    public void starteFuetterung() {
        System.out.println("Der Vogel wird gefüttert.");
    }

    @Override
    public void starteNachtruhe() {
        System.out.println("Der Vogel schläft um 19 Uhr");
    }
}
