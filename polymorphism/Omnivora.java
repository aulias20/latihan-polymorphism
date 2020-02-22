package polymorphism;

public class Omnivora extends Hewan{
        final String jenisMakanan = "apa saja";

        public Omnivora(String nama){
            super(nama);
        }
        public void makan(){
            System.out.println("Hewan " + super.getNamaHewan() + " sedang makan " + jenisMakanan);
        }
}
