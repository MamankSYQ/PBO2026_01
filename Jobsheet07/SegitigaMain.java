package Jobsheet07;
public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Sudut ketiga (1 sudut diketahui = 60): "+segitiga.totalSudut(60));

        System.out.println("Sudut ketiga (jika ada sudut 60 dan 70): "+segitiga.totalSudut(60, 70));

        System.out.println("Keliling (sisi 3, 4, 5): "+segitiga.keliling(3, 4, 5));

        System.out.println("Keliling (sisi 3 dan 4): "+segitiga.keliling(3, 4));
    }
}
