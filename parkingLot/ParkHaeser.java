package de.gfn.kursProjekte.parkingLot;
import  de.gfn.kursProjekte.parkingLot.ParkHaus;

public class ParkHaeser {
    private final ParkHaus parkHaeser;
    private String parkHausName;
   

    public ParkHaeser(String parkHausName, int parkHausSize) {
        this.parkHausName = parkHausName;
        this.parkHaeser = new ParkHaus(parkHausSize);
    }

    public String getParkHausName() {
        return parkHausName;
    }

    public ParkHaus getParkHaeuser() {
        return parkHaeser;
    }
}
