/* Nama File : MGaris.java
 * Nama      : Kaila Talitha Putri
 * Nim       : 24060123140179
 * Kelas     : C
*/

public class MGaris {
    public static void main(String[] args) {
        Titik titik1 = new Titik(0, 0);
        Titik titik2 = new Titik(3, 4);
        Garis garis1 = new Garis(titik1, titik2);
        
        //Garis 1
        System.out.println("\n=== Garis 1 ===");
        System.out.println("Panjang Garis: " + garis1.panjangGaris());
        System.out.println("Gradien Garis: " + garis1.gradien());
        System.out.println("Titik Tengah: (" + garis1.titikTengah().getAbsis() + ", " + garis1.titikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis: " + garis1.printPersamaanGaris());
    
        Titik titik3 = new Titik(1, 1);
        Titik titik4 = new Titik(4, 5);
        Garis garis2 = new Garis(titik3, titik4);

        //Garis 2
        System.out.println("\n=== Garis 2 ===");
        System.out.println("Panjang Garis: " + garis2.panjangGaris());
        System.out.println("Gradien Garis: " + garis2.gradien());
        System.out.println("Titik Tengah: (" + garis2.titikTengah().getAbsis() + ", " + garis2.titikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis: " + garis2.printPersamaanGaris());
        
        //Garis 1 dan Garis 2
        System.out.println("\n=== Hubungan Garis 1 dan Garis 2 ===");
        System.out.println("Apakah garis1 sejajar dengan garis2? " + garis1.ckSejajar(garis2));
        System.out.println("Apakah garis1 tegak lurus dengan garis2? " + garis1.cekTegakLurus(garis2));

        //Menampilkan objek garis yang telah dibuat 
        System.out.println("\n=== Garis Yang Telah Dibuat ===");
        System.out.println("Jumlah Garis yang dibuat: " + Garis.getCounterGaris());
    }
}
