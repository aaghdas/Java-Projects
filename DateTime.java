package de.gfn.lessons.loopExamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class DateTime {

    public static void main(String[] args) {

        // Alle Klasse aus dem Package java.lang sind automatisch verfügbar
        // Müssen nicht importiert werden
        String str = "Hi";

        // Ab Java 1.8 oder einfach Java 8
        LocalDate heute = LocalDate.now();
        System.out.println("LocalDate heute = LocalDate.now(); heute: "+heute);

        // fullyquallified Verwendung - Import nicht nötig
        java.time.LocalTime jetzt = java.time.LocalTime.now();
        System.out.println("LocalTime jetzt = LocalTime.now();jetzt: "+jetzt);

        // Vor Java 8
        Date date1 = new Date(2024, 2, 28);
        System.out.println("Vor Java 8// Date date1 = new Date(2024, 2, 28); date1: "+date1);
        java.sql.Date date2 = java.sql.Date.valueOf(heute);
        System.out.println("java.sql.Date.valueOf(heute): "+date2);

        Locale.setDefault(Locale.US);

        //final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("heute.format(DATE_FMT): "+heute.format(DATE_FMT));


    }
}