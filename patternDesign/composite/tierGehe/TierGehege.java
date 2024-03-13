package de.gfn.kursProjekte.patternDesign.composite.tierGehe;

import java.util.ArrayList;
import java.util.List;

public class TierGehege {

    private List<Sozialisiert> tierGehe = new ArrayList<>();

    public void addTier(Sozialisiert tier) {
        tierGehe.add(tier);
    }

    public void starteFuetterung() {
        System.out.println("Fütterung im Tiergehege wird gestartet...");
        for (Sozialisiert tier : tierGehe) {
            tier.starteFuetterung();
        }
        System.out.println("Alle Tiere im Tiergehe wurden gefüttert \n");
    }

    public void starteNachtruhe() {
        System.out.println("Nachtruhe im Tiergehege wird gestartet...");
        for (Sozialisiert tier : tierGehe) {
            tier.starteNachtruhe();
        }
        System.out.println("Alle Tiere im TierGehe schlafen...\n");
    }
}
