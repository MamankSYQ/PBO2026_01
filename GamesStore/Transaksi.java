package GamesStore;
import java.util.ArrayList;
public class Transaksi {
    private String tanggalBeli;
    private String metodePembayaran;
    private ArrayList<Game> gameDibeli;
 
    public Transaksi(String tanggalBeli, String metodePembayaran){
        this.tanggalBeli = tanggalBeli;
        this.metodePembayaran = metodePembayaran;
        this.gameDibeli = new ArrayList<>();
    }
 
    public String getTanggalBeli(){
        return tanggalBeli;
    }
 
    public void setTanggalBeli(String tanggalBeli){
        this.tanggalBeli = tanggalBeli;
    }
 
    public String getMetodePembayaran(){
        return metodePembayaran;
    }
 
    public void setMetodePembayaran(String metodePembayaran){
        this.metodePembayaran = metodePembayaran;
    }
 
    public void hitungTotalBiaya(){
        int totalBiaya = 0;
        for (Game game : gameDibeli){
            totalBiaya += game.getHarga();
        }
        System.out.println("Total biaya transaksi tanggal " +tanggalBeli+ " = Rp." + totalBiaya);
    }
 
    public void detailTransaksi(){
        System.out.println("Tanggal Beli            : " + tanggalBeli);
        System.out.println("Metode Pembayaran       : " + metodePembayaran);
        System.out.println("Game yang dibeli        : ");
        if (gameDibeli.isEmpty()){
            System.out.println("(belum ada game yang dibeli)");
        } 
        else {
            for (Game game : gameDibeli){
                System.out.println("  - " + game.getJudul()+" (Rp." + game.getHarga() + ")");
            }
        }
    }
 
    public void tambahGame(Game game){
        gameDibeli.add(game);
    }
 
    public ArrayList<Game> getGameDibeli(){
        return gameDibeli;
    }
}
