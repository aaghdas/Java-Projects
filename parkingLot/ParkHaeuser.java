package de.gfn.kursProjekte.parkingLot;

public class ParkHaeuser {
    private final ParkHaus parkHaeuser;
    private String parkHausName;
   

    public ParkHaeuser(String parkHausName, int parkHausSize) {
        this.parkHausName = parkHausName;
        this.parkHaeuser = new ParkHaus(parkHausSize);
    }

    public String getParkHausName() {
        return parkHausName;
    }

    public ParkHaus getParkHaeuser() {
        return parkHaeuser;
    }
}
