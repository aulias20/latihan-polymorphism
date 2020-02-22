package polymorphism;

public class Hewan {
    private String namaHewan;

    public Hewan(String nama){
        this.namaHewan=nama;
    }
    public String getNamaHewan(){
        return namaHewan;
    }
    public void makan(){
        System.out.println("Hewan " + namaHewan + " sedang makan");
    }
}
