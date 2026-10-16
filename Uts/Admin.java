package Uts;
public class Admin extends User{

    public Admin(int userId, String password, String name, int age, String emailId, String doc){
        super(userId, password, name, age, emailId, doc);
    }

    public void updateVehicleDetails(int vehicleId){
        System.out.println("Detail kendaraan dengan ID " + vehicleId + " diperbarui");
    }

    public Vehicle addVehicle(){
        Vehicle v = new Vehicle(101, "Avanza");
        System.out.println("Kendaraan ditambahkan : " + v.getNama());
        return v;
    }

    public void retrieveComplain(){
        System.out.println("Mengambil daftar komplain dari customer");
    }

    public void verifyUser(){
        System.out.println("Admin memverifikasi user");
    }
}
