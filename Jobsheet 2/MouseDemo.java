public class MouseDemo {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse();
        Mouse mouse2 = new Mouse(); 
        mouse1.merk = "Logitech";
        mouse1.tipe = "G Pro";
        mouse1.ukuran = 20;
        mouse1.bobot = 100;
        mouse1.jenis = "Wireless";
        mouse1.dpi = 25000;

        mouse2.merk = "Votre";
        mouse2.tipe = "KM-309";
        mouse2.ukuran = 17;
        mouse2.bobot = 80;
        mouse2.jenis = "Wired";
        mouse2.dpi = 1000;
        
        mouse1.info();
        mouse1.klikKanan();
        mouse1.klikKiri();
        mouse1.scrollAtas();
        mouse1.scrollBawah();

        mouse2.info();
        mouse2.klikKanan();
        mouse2.klikKiri();
        mouse2.scrollAtas();
        mouse2.scrollBawah();
    }
}
