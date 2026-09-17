package GamesStore;
import java.util.ArrayList;
public class Pembeli {
    private String username;
    private String email;
    private ArrayList<Game> koleksiGame;
    private ArrayList<Transaksi> riwayatTransaksi;
 
    public Pembeli(String username, String email){
        this.username = username;
        this.email = email;
        this.koleksiGame = new ArrayList<>();
        this.riwayatTransaksi = new ArrayList<>();
    }
 
    public String getUsername(){
        return username;
    }
 
    public void setUsername(String username){
        this.username = username;
    }
 
    public String getEmail(){
        return email;
    }
 
    public void setEmail(String email){
        this.email = email;
    }
 
    public ArrayList<Game> getKoleksiGame(){
        return koleksiGame;
    }
 
    public ArrayList<Transaksi> getRiwayatTransaksi(){
        return riwayatTransaksi;
    }

    public void beliGame(Game game, Transaksi transaksi){
        koleksiGame.add(game);
        transaksi.tambahGame(game);
 
        if (!riwayatTransaksi.contains(transaksi)){
            riwayatTransaksi.add(transaksi);
        }
 
        System.out.println(username + " berhasil membeli game " + game.getJudul());
    }
}
