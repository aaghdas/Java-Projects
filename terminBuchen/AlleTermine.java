package de.gfn.kursProjekte.terminBuchen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class AlleTermine {

    private static AlleTermine instance;
    private List<Termin> termine;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private AlleTermine(){
        termine = new ArrayList<>();
    }

    public static AlleTermine getInstance(){
        if(instance == null){
            instance = new AlleTermine();
        }
        return instance;
    }


    public void addTermin(Termin termin){
        termine.add(termin);
    }
    public void sortAufsteigend() {

        try {
            List<Termin> termineCopy = new ArrayList<>(termine);
            Comparator<Termin> aufsteigend = Comparator.naturalOrder();
            termineCopy.sort(aufsteigend);
            for (Termin t : termineCopy) {
                System.out.println(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sortAbsteigend() {

        try {
            List<Termin> termineCopy = new ArrayList<>(termine);

            Comparator<Termin> absteigend = Comparator.reverseOrder();
            termineCopy.sort(absteigend);
            for (Termin t : termineCopy) {
                System.out.println(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public void ZeigBestimmteTermine (String terminEingabe){


            for (Termin t : termine) {
                String dateStr = dateFormat.format(t.getDatum()); // Date-Objekt in String umwandeln
                if (dateStr.equals(terminEingabe)) {
                    System.out.println(t);
                }
            }
        }
    }





