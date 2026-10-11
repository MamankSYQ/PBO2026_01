package Jobsheet07;
public class ManusiaMain {
    public static void main(String[] args) {
        Manusia m;

        m = new Manusia();
        m.bernafas();
        m.makan();      

        System.out.println();

        m = new Dosen();
        m.bernafas();   
        m.makan();     

        System.out.println();

        m = new Mahasiswa();
        m.bernafas();   
        m.makan();      

        System.out.println();

        Dosen d = new Dosen();
        d.lembur();

        Mahasiswa mhs = new Mahasiswa();
        mhs.tidur();
    }
}
