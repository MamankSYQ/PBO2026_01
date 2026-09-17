package GamesStore;
public class Game {
    private String judul;
    private String genre;
    private int harga;
    private int size;
 
    public Game(String judul, String genre, int harga, int size){
        this.judul = judul;
        this.genre = genre;
        this.harga = harga;
        this.size = size;
    }
 
    public String getJudul(){
        return judul;
    }
 
    public void setJudul(String judul){
        this.judul = judul;
    }
 
    public String getGenre(){
        return genre;
    }
 
    public void setGenre(String genre){
        this.genre = genre;
    }
 
    public int getHarga(){
        return harga;
    }
 
    public void setHarga(int harga){
        this.harga = harga;
    }
 
    public int getSize(){
        return size;
    }
 
    public void setSize(int size){
        this.size = size;
    }
 
    public void info(){
        System.out.println("Judul   : " + judul);
        System.out.println("Genre   : " + genre);
        System.out.println("Harga   : Rp." + harga);
        System.out.println("Size    : " + size + " GB");
    }
}
