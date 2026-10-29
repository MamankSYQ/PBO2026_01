package Jobsheet11;
public class SmartphoneMain {
    public static void main(String[] args) {
        // Percobaan Polimorfismem (Overriding dan Overloading)
        System.out.println();
        Phone[] daftarHp = { new Xiaomi(), new Iphone(), new Samsung(), new Oppo() };
        for (Phone hp : daftarHp){
            hp.powerOn();
            hp.volumeUp(); 
            System.out.println("Volume sekarang : " + ((Smartphone) hp).getVolume());
            System.out.println();
        }
 
        // Percobaan volume dengan HP merek Xiaomi (volumeStep = 5)
        System.out.println();
        Phone hpX = new Xiaomi();
        hpX.powerOn();
        for (int i = 0; i < 16; i++){      
            hpX.volumeUp();
        }
        for (int i = 0; i < 22; i++){     
            hpX.volumeDown();
        }
 
        // Percobaan pengguna berinteraksi dengan HP untuk beberapa merek HP
        System.out.println();
        System.out.println("Merek Samsung : ");
        PenggunaTelepon pengguna1 = new PenggunaTelepon(new Samsung());
        pengguna1.makePhoneLouder(); 
        pengguna1.turnOnThePhone();
        pengguna1.makePhoneLouder();
        pengguna1.makePhoneSilent();
        pengguna1.turnOffThePhone();
        
        System.out.println();
        System.out.println("Merek Xiaomi : ");
        PenggunaTelepon pengguna2 = new PenggunaTelepon(new Xiaomi());
        pengguna2.turnOnThePhone();
        pengguna2.makePhoneLouder();
        pengguna2.makePhoneSilent();
        pengguna2.turnOffThePhone();
 
        // Percobaan menggunakan fitur untuk semua merek HP
        System.out.println();
        Smartphone[] semuaHp = { new Xiaomi(), new Iphone(), new Samsung(), new Oppo() };
        for (Smartphone s : semuaHp){
            System.out.println("Merek " + s.getClass().getSimpleName() + " : ");
            s.useFeature();
            s.powerOn();
            s.useFeature();
            System.out.println();
        }
    }
}

