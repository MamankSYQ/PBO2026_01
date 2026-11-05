package Jobsheet09;
public class AlatElektronikMain {
    public static void main(String[] args) {
        AlatElektronik alat = new AlatElektronik(500000, "Putih", "Generic");
        Kipas kipas = new Kipas("Berdiri", 350000, "Hitam", "Cosmos");
        Kulkas kulkas = new Kulkas(2, 3000000, "Silver", "Sharp");
        SmartFridge smartFridge = new SmartFridge(30, 2, 8000000, "Hitam", "Samsung");
        TV tv = new TV("LED", 20, 4500000, "Hitam", "LG");

        System.out.println(alat.getInfo());
        System.out.println(kipas.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(smartFridge.getInfo());
        System.out.println(tv.getInfo());
    }
}
