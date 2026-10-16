package Uts;
public class Vehicle {
    private int vehicleId;
    private String nama;

    public Vehicle(int vehicleId, String nama){
        this.vehicleId = vehicleId;
        this.nama = nama;
    }

    public int getVehicleId(){
        return vehicleId;
    }

    public String getNama(){
        return nama;
    }
}
