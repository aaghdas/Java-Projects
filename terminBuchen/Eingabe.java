package de.gfn.kursProjekte.terminBuchen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Eingabe {

    private final Scanner scanner = new Scanner(System.in);
    AlleTermine termine = AlleTermine.getInstance();


    public void start() {

        programm: while (true) {
            System.out.println("Eine Option auswählen:");
            System.out.println("1. Termin hinzufügen");
            System.out.println("2. Alle Termine sehen");
            System.out.println("3. Termine für ein beschtimmtes Datum sehen");
            System.out.println("4. Exit");

            //Eingabevalidierung für Auswahlmenü.
           int option;
            while (true) {
                try {
                    option = scanner.nextInt();  //akzeptiert Int als Eingabe, für andere Datentypen tritt in  InputMismatchException ein.
                    scanner.nextLine(); // Clear input buffer

                    if (option >= 1 && option <= 4) {  //nächste Validierung nach Int Prüfung. Int muss zwischen 1 und 4 sein.
                        break; // Break aus der schleife, falls input valid
                    } else {   //falls nicht zwischen 1 und 4 gibt Meldung aus und wiederholt die schleife, weil kein break in else block vorhanden ist
                        System.out.println("Ungültige Eingabe! Bitte 1, 2, 3 oder 4 eingeben.");
                    }

                } catch (InputMismatchException e) {  // nur ganzzahlen sind valid
                    System.out.println("Ungültige Eingabe! Bitte eine Ganzzahl eingeben.");
                    scanner.nextLine(); // Clear input buffer
                }
            }


            /*
            int option = scanner.nextInt();  //akzeptiert Int als Eingabe, für andere Datentypen tritt in  InputMismatchException ein.
            scanner.nextLine();
            warum funktioniert mit case default? */

            switch (option) {
                    case 1:

                        Date datum;
                        System.out.println("Datum eingeben (dd.MM.yyyy):");
                        while(true){
                            try{
                                String datumStr = scanner.nextLine();

                                if(datumStr.matches("^\\d{2}.\\d{2}.\\d{4}$")){
                                    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                                    datum = dateFormat.parse(datumStr);
                                    break;

                                }else{
                                    System.out.println("Datum in Format dd.MM.yyyy  eingeben! z.B. 12.02.2024 für 12 Feb 2024");
                                }

                            } catch(ParseException e){

                                System.out.println("Datum in Format dd.MM.yyyy  eingeben! z.B. 12.02.2024 für 12 Feb 2024");
                            }
                        }


                        System.out.println("Zeit eingeben (HH:MM):");
                        String zeit;
                        while(true){
                            try{
                               zeit = scanner.nextLine();
                               break;
                               /*
                               if(zeit.matches("^(0[1-9]| 1[0-9]| 2[0-3]):[0-5][0-9]$")){
                                    break;
                               }else{
                                    System.out.println("Zeit in Format HH:MM eingeben! z.B. 12:15 für 12 Uhr 15 oder 01:05 für 1 Uhr 5");
                                } */

                            } catch(Exception e){
                                System.out.println("Ungültige Eingabe!");
                            }
                        }


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

                        switch (sortTyp) {
                            case 1:
                                termine.sortAufsteigend();
                                break;

                            case 2:
                                termine.sortAbsteigend();
                                break;
                            default:
                                System.out.println("1 oder 2 eingeben!");
                        }

                        break;

                    case 3:
                        System.out.println("Ein Datum eingeben, um alle gebuchte Termine zeigen zu lassen (dd.MM.yyyy):");
                        String terminEingabe = scanner.nextLine();
                        System.out.println("Termine für " + terminEingabe + ":");
                        termine.ZeigBestimmteTermine(terminEingabe);


                        break;
                    case 4:
                        System.out.println("Exit Programm...");

                        break programm;

                    default:
                        System.out.println("Ungültige Eingabe! Bitte nochmal versuchen.");
                        break;
                }
            }
        }
    }





