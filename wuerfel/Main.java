package de.gfn.kursProjekte.wuerfel;

public class Main {
    public static void main(String[] args) {

      //für einfache 6-Seitige Würfel und einmal Wurfen
     for(int i =0;i<3; i++){
         WuerfelBecher.ergebniss(1);
     }


     //für einfache 6-Seitige Würfel und mehrfach Wurfen

        WuerfelBecher.ergebniss(5);
        WuerfelBecher.ergebniss(12);
        WuerfelBecher.ergebniss(-1);

        //unterschiedliche Wurfelarten
        WuerfelBecherDivers w6 = new WuerfelBecherDivers(6);
        WuerfelBecherDivers w10 = new WuerfelBecherDivers(10);
        WuerfelBecherDivers w8 = new WuerfelBecherDivers(8);

        // ein einziger Würfel mit unterschiedlischen Seitenanzahl
        w6.ergebnisseDivers(1, w6.getNumberOfSides());
        w8.ergebnisseDivers(1, w8.getNumberOfSides());
        w10.ergebnisseDivers(1, w10.getNumberOfSides());

       //mehrere Würfel-Wurfe mit unterschiedliche Seitenanzahl
        w6.ergebnisseDivers(5, w6.getNumberOfSides());
        w8.ergebnisseDivers(9, w8.getNumberOfSides());
        w10.ergebnisseDivers(13, w10.getNumberOfSides());


    }
}

