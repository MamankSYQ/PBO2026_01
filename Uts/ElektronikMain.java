package Uts;
public class ElektronikMain {
    public static void main(String[] args) {
        KipasMini kipas = new KipasMini(20, 15, 1, 80);
        kipas.colokKabel();
        kipas.naikkanKecepatan();
        kipas.naikkanKecepatan();
        kipas.turunkanKecepatan();
        System.out.println("Ukuran: " + kipas.getUkuran() + " cm");
        System.out.println("Baterai: " + kipas.getBaterai() + "%");

        System.out.println();

        KomporListrik kompor = new KomporListrik(600, false);
        kompor.colokKabel();
        kompor.nyalakanKompor();
        System.out.println("Knob menyala? " + kompor.getKnob());
        kompor.matikanKompor();
    }
}
