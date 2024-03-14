package de.gfn.kursProjekte.patternDesign.composite.tierGehege;

import java.util.ArrayList;
import java.util.List;

public class FreiGehege {

    private List<Sozialisiert> freiGehe = new ArrayList<>();

    public void addTier(Sozialisiert tier) {
        freiGehe.add(tier);
    }

    public void starteFuetterung() {
        System.out.println("Fütterung im Freigehege wird gestartet...");
        for (Sozialisiert tier : freiGehe ) {
            tier.starteFuetterung();
        }
        System.out.println("Alle Tiere im Freigehege wurden gefüttert \n");
    }

    public void starteNachtruhe() {
        System.out.println("Nachtruhe im Freigehege wird gestartet...");
        for (Sozialisiert tier : freiGehe ) {
            tier.starteNachtruhe();
        }
        System.out.println("Alle Tiere im Freigehe schlafen...\n");
    }
}
