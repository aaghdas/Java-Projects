package de.gfn.kursProjekte.parkingLot;

import de.gfn.kursProjekte.parkingLot.ParkHaeser;
import de.gfn.kursProjekte.parkingLot.ParkHaus;
import de.gfn.kursProjekte.parkingLot.Auto;

public class Main {

    static int getSum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        ParkHaus parkHaus = new ParkHaus(20);
        Auto[] ph = parkHaus.getParkHaus();
        System.out.println();
        parkHaus.parkAuto("BMW", "SUV", "L102030", 2023, 1);
        parkHaus.parkAuto("mercedes benz", " ' Limousine' ", " 'H562030' ", 2024, 1);
        parkHaus.parkAuto("rolls royce", " 'Phantom' ", " 'A8562030' ", 2024, 5);
        parkHaus.parkAuto("Audi", " ' e-tron GT' ", " 'B562030' ", 2024, 1);
        parkHaus.parkAuto("Audi", " ' e-tron GT' ", " 'B562030' ", 2024, 21);
        parkHaus.parkAuto("Audi", " ' e-tron GT' ", " 'B562030' ", 2024, 7);
        parkHaus.showParkHaus();
        parkHaus.ausParken(7);
        parkHaus.showParkHaus();

        ParkHaeser parkhaus1 = new ParkHaeser("Augustusplatz", 5);
        ParkHaeser parkhaus2 = new ParkHaeser("Marktplatz", 10);

        Auto[] ph1 = parkhaus1.getParkHaeuser().getParkHaus();
        Auto[] ph2 = parkhaus2.getParkHaeuser().getParkHaus();

        parkhaus1.getParkHaeuser().parkAuto("BMW", "SUV", "L102030", 2023, 1);
        parkhaus1.getParkHaeuser().parkAuto("mercedes benz", " ' Limousine' ", " 'H562030' ", 2024, 3);
        parkhaus2.getParkHaeuser().parkAuto( "Audi", " ' e-tron GT' ", " 'B562030' ", 2024, 1);
        parkhaus2.getParkHaeuser().parkAuto("Renault ", " 'Twingo ' ", " 'C62030' ", 2014, 8);

        parkhaus1.getParkHaeuser().showParkHaeuser(parkhaus1);
        parkhaus2.getParkHaeuser().showParkHaeuser(parkhaus2);

        // VarArgs

        System.out.println(getSum());
        System.out.println(getSum(new int[]{1,2,3}));
        System.out.println(getSum(new int[10]));
        System.out.println(getSum(1,2,3,5,6,7,10,22,19,100));


    }

}


