package de.gfn.kursProjekte.terminBuchen;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Termin implements Comparable<Termin>{

    private Date datum;
    private String zeit;
    private String titel;
    private String beschreibung;

    public Termin(Date datum, String zeit, String titel, String beschreibung) {
        this.datum = datum;
        this.zeit = zeit;
        this.titel = titel;
        this.beschreibung = beschreibung;
    }


    public Date getDatum() {
        return datum;
    }


    @Override
    public int compareTo(Termin o) {

        return this.datum.compareTo(o.getDatum());
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateFormatStr = dateFormat.format(datum);

        return "Datum: " + dateFormatStr + ", Zeit: " + zeit + ", Titel: " + titel + ", Beschreibung: " + beschreibung;
    }



}
