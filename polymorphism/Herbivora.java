package polymorphism;

public class Herbivora extends Hewan {
        final String jenisMakanan = "Tumbuhan";

        public Herbivora(String nama){
            super(nama);
        }
        //override = isi cenderung sama namun diperluas
        public void makan() {
            System.out.println("Hewan " + super.getNamaHewan() + " sedang makan " + jenisMakanan);
        }
}
