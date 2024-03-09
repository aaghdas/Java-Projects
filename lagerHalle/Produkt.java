package de.gfn.kursProjekte.lagerHalle;

import java.time.LocalDate;

public class Produkt {
    //Instanzvariablen
    private LocalDate datum;
    private String name;
    private String beschreibung;
    private int menge;
    private float preis;

    //Getter/Setter Methoden für Instanzvariablen
    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    //Klassenkonstruktor
    public Produkt(String name, String beschreibung, int menge, float preis) {
        LocalDate datum = LocalDate.now();
        this.datum = datum;
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.preis = preis;
    }
}
