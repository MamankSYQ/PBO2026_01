package Tugas6Inherit;
public class Game {
    private String judul;
    private String genre;
    private double size;

    public Game(String judul, String genre, double size){
        this.judul = judul;
        this.genre = genre;
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

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size; 
    }

    public void info(){
        System.out.println("Judul : " + judul);
        System.out.println("Genre : " + genre);
        System.out.println("Size  : " + size + " GB");
    }

    public void play(){
        System.out.println(judul+" sedang dimainkan");
    }
}
