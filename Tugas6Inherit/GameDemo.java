package Tugas6Inherit;
public class GameDemo {
    public static void main(String[] args) {
        Pc pc1 = new Pc("Dota 2", "MOBA", 35.5, "Steam", false);
        Pc pc2 = new Pc();
        pc1.nyalakanMouse();
        System.out.println("Mouse aktif: " + pc1.getMouse());
        pc1.play();
        pc1.klikKiri();
        pc1.klikKanan();
        pc1.scrollAtas();
        pc1.scrollBawah();
        System.out.println();
        pc2.info();
        System.out.println("Mouse aktif: " + pc2.getMouse());
        pc2.setJudul("Zuma");
        pc2.setGenre("Adventure");
        pc2.setSize(1);
        System.out.println();
        pc2.nyalakanMouse();
        System.out.println();
        pc2.info();
        System.out.println("Mouse aktif: " + pc2.getMouse());

        System.out.println();
        Mobile mobile1 = new Mobile("Subway Surfer", "Adventure", 0.2, "Nougat");
        mobile1.play();
        mobile1.touch();
        mobile1.slideAtas();
        mobile1.slideBawah();
        mobile1.slideKanan();
        mobile1.slideKiri();
        System.out.println();
        mobile1.info();
        System.out.println();
        pc1.info();
    }
}
