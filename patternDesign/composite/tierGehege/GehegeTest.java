package de.gfn.kursProjekte.patternDesign.composite.tierGehege;

public class GehegeTest {

    public static void main(String[] args) {
        TierGehege tiergehege = new TierGehege();

        Sozialisiert l1 = new Loewe();
        Sozialisiert v1 = new Vogel();

        tiergehege.addTier(l1);
        tiergehege.addTier(v1);

        tiergehege.starteFuetterung();
        tiergehege.starteNachtruhe();

        FreiGehege freigehege = new FreiGehege();

        freigehege.addTier(l1);
        freigehege.addTier(v1);

        freigehege.starteFuetterung();
        freigehege.starteNachtruhe();
    }
}
