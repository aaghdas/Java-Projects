package de.gfn.kursProjekte.terminBuchen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Eingabe {

    private final Scanner scanner = new Scanner(System.in);
    AlleTermine termine = AlleTermine.getInstance();

    public Date strToDate(String date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date datum = null;

        try {
            datum = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return datum;
    }


    public void start() {

        while (true) {
            System.out.println("Eine Option auswählen:");
            System.out.println("1. Termin hinzufügen");
            System.out.println("2. Alle Termine sehen");
            System.out.println("3. Termine für ein beschtimmtes Datum sehen");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    System.out.println("Datum eingeben (YYYY-MM-DD):");
                    String datumStr = scanner.nextLine();
                    Date datum = strToDate(datumStr);
                    System.out.println("Zeit eingeben (HH:MM):");
                    String zeit = scanner.nextLine();
                    System.out.println("Titel eingeben:");
                    String titel = scanner.nextLine();
                    System.out.println("Beschreibung eingeben:");
                    String beschreibung = scanner.nextLine();

                    Termin termin = new Termin(datum, zeit, titel, beschreibung);

                    termine.addTermin(termin);

                    System.out.println("Termin erfolgreich gebucht!");
                    break;

                case 2:
                    System.out.println("Alle Termine:");
                    System.out.println("1.Aufsteigend, 2.Absteigend sortieren ");
                    int sortTyp = scanner.nextInt();

                    switch (sortTyp){
                        case 1:
                            termine.sortAufsteigend();
                            break;

                        case 2:
                            termine.sortAbsteigend();
                            break;
                    }

                    break;

                case 3:
                    System.out.println("Ein Datum eingeben, um alle gebuchte Termine zeigen zu lassen (YYYY-MM-DD):");
                    String terminEingabe = scanner.nextLine();
                    System.out.println("Termine für " + terminEingabe + ":");
                    termine.ZeigBestimmteTermine(terminEingabe);


                    break;
                case 4:
                    System.out.println("Exit Programm...");
                    System.exit(0);

                default:
                    System.out.println("Ungültige Eingabe! Bitte nochmal versuchen.");
                    break;
            }
        }
    }
}





