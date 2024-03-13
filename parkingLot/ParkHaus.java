package de.gfn.kursProjekte.parkingLot;


public class ParkHaus {

    private Auto[] parkHaus;

    public ParkHaus(int parkHausSize) {

        this.parkHaus = new Auto[parkHausSize];
    }

    public Auto[] getParkHaus() {
        return parkHaus;
    }


    public void parkAuto(String mark, String type, String carNumber, int productionYear, int parkPlaceNumber) {

        Auto auto = new Auto(mark, type, carNumber, productionYear);
        if (parkPlaceNumber < 1 || parkPlaceNumber > 20) {
            System.out.println("geben Sie einen verfügbaren Parkplaznummer zwische 1 und 20 ein!");
        }else if(parkHaus[parkPlaceNumber-1] !=null){
            System.out.printf("Parkplaz %d ist besetzt! \n",parkPlaceNumber);
        }
        else {
            parkHaus[parkPlaceNumber-1] = auto;
            System.out.printf("Sie haben Ihr Auto auf dem Parkplaz '%d' geparkt! \n", parkPlaceNumber);
        }
    }

    public void ausParken(int parkPlatz){
        parkHaus[parkPlatz-1] = null;
        System.out.println();
        System.out.printf("Ausgeparkt! Der Parkplatz %d ist wieder frei! \n", parkPlatz);
    }

    public void showParkHaus() {
        System.out.println();
        System.out.println(" *** Zustand des Parkhauses: ***");
        for (int i = 0; i < parkHaus.length; i++) {
            if (parkHaus[i] == null) {
                System.out.printf("Parkplaz %d: noch frei \n", i+1 );
            } else {
                System.out.printf("Parkplaz %d:  %s, von Typ %s, Kennzeichen %s und Baujahr %d;\n",
                        i+1 , parkHaus[i].getMark(), parkHaus[i].getType(), parkHaus[i].getCarNumber(), parkHaus[i].getProductionYear());
            }
        }

    }
    public  void showParkHaeuser(ParkHaeuser parkhaus) {
        System.out.println();
        System.out.printf("Im Parkhaus %s :" ,parkhaus.getParkHausName() );

        Auto[] ph = parkhaus.getParkHaeuser().getParkHaus();
        parkhaus.getParkHaeuser().showParkHaus();
    }


}
