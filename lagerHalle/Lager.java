package de.gfn.kursProjekte.lagerHalle;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lager {

    private static Lager instance;
    private final List<Produkt> lager ;
    private final Scanner scanner = new Scanner(System.in);

    //private Konstruktur, um sicherzustellen, dass nur ein einziges Lagerobjekt existiert.
    private Lager() {
        this.lager = new ArrayList<>();
    }

    public static Lager getInstance() {
        if(instance == null) {
            instance = new Lager();
        }
        return instance;
    }

    public void erstellen()  {
        Produkt p = new Produkt();
        System.out.println("Geben Sie den Produktnamen ein!");
        try {
            p.setName(this.scanner.next().trim());
        }catch (Exception e){
            System.out.println("Geben Sie Name des Produkts ein!");
        }

        System.out.println("Geben Sie die Menge ein!");

        while(true){
           try{
               p.setMenge(this.scanner.nextInt());
               scanner.nextLine();
               break ;  //try block hat break aber catch wird wiederholt, kein break
           }catch (Exception e){
               System.out.println("Geben Sie eine ganze Zahl ein!");
               scanner.nextLine();
           }

       }



        System.out.println("Geben Sie eine Beschreibung für das Produkt ein!");
        try {
            p.setBeschreibung(scanner.nextLine());

        }catch (Exception e){
            System.out.println("Geben Sie eine Beschreibung für das Produkt ein!");
        }

        System.out.println("Geben Sie den Preis ein!");
        try {
            p.setPreis(this.scanner.nextFloat());
        }catch (Exception e){
            System.out.println("geben Sie ein Zahl ein, z.B. 9,99!");
        }
        System.out.println(p);
        lager.add(p);
        System.out.println("Sie haben das Produkt erfolgreich hinzugefügt!");
        System.out.println();
    }
    public  void showWareHouse(List<Produkt> lager) {
        for (Produkt product : lager) {
            System.out.println("****************************");
            float preis = product.getPreis();
            String d = product.getDatum().toString();

            System.out.printf("Produk: %s \n Mege: %d Stuck \n Preis: %2f  € \n Beschreibung zum Produkt: %s \n  Aufnahmedatum: %s \n",
                    product.getName(), product.getMenge(), product.getPreis(), product.getBeschreibung(), d);

        }
    }

    public void start() throws IOException {

        app: while(true) {

            System.out.println("        Auswahl Menü");
            System.out.println("1: Erstellen eines Produkts");
            System.out.println("2: Anzeigen des Lagerbestandes");
            System.out.println("3:Programm beenden");

            int menuOption =0;
            try{
              menuOption = this.scanner.nextInt();
            }catch (Exception e){
                System.out.println("Geben Sie 1, 2 oder 3 ein!");
            }

            switch(menuOption) {
                case 1:
                    erstellen();
                        break  ;
                case 2:
                    showWareHouse(lager);
                        break ;

                case 3:
                    break app;

            }
        }
    }


}
