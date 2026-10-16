package Uts;
public class UserMain {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "pass123", "Budi", 21, "budi@mail.com", "ktp.jpg");
        Admin admin = new Admin(99, "admin123", "Siti", 30, "siti@mail.com", "id.pdf");

        customer.logIn(1, "pass123");
        System.out.println("Terverifikasi? " + customer.getVerificationStatus());
        customer.applyVerification("ktp.jpg");
        customer.logOut();

        System.out.println();

        admin.logIn(99, "admin123");
        admin.addVehicle();
        admin.updateVehicleDetails(101);
        admin.retrieveComplain();
        admin.verifyUser();
        admin.logOut();
    }
}
