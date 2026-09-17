package Jobsheet03;
public class MouseDemo {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Logitech", "Pro X", 100, 80, "Wireless", 20000);
        mouse1.info();
        mouse1.klikKanan();
        mouse1.klikKiri();
        mouse1.scrollAtas();
        mouse1.scrollBawah();
        mouse1.ubahDpi(20000);
        mouse1.info();
    }

}
