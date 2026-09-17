package GamesStore;
public class GameStoreDemo {
    public static void main(String[] args) {
        Game game1 = new Game("Elden Ring", "RPG", 800000, 60);
        Game game2 = new Game("Stardew Valley", "Simulation", 150000, 1);
 
        game1.info();
        System.out.println();
        game2.info();
        System.out.println();
 
        Pembeli pembeli1 = new Pembeli("budi123", "budi@email.com");
        Transaksi transaksi1 = new Transaksi("18-09-2026", "Kartu Kredit");
 
        pembeli1.beliGame(game1, transaksi1);
        pembeli1.beliGame(game2, transaksi1);
        System.out.println();

        transaksi1.detailTransaksi();
        transaksi1.hitungTotalBiaya();
 
        System.out.println();
        System.out.println("Jumlah koleksi game " + pembeli1.getUsername()+" : "+ pembeli1.getKoleksiGame().size());
        System.out.println("Jumlah riwayat transaksi : " + pembeli1.getRiwayatTransaksi().size());
    }
}
