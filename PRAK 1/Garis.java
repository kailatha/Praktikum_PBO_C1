/* Nama File : Garis.java
 * Nama      : Kaila Talitha Putri
 * Nim       : 24060123140179
 * Kelas     : C
*/

public class Garis {
    Titik titikawal;
    Titik titikakhir;
    static int counterGaris = 0;

    Garis(){
        this.titikawal = new Titik(0,0);
        this.titikakhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik titikawal, Titik titikakhir){
        this.titikawal = titikawal;
        this.titikakhir = titikakhir;
        counterGaris++;
    }

    Titik getTitikAwal(){
        return titikawal;
    }

    Titik getTitikAkhir(){
        return titikakhir;
    }

    void setAwal(Titik titikawal){
        this.titikawal = titikawal;
    }

    void setAkhir(Titik titikakhir){
        this.titikakhir = titikakhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double panjangGaris(){
        return Math.sqrt(Math.pow(titikakhir.getAbsis() - titikawal.getAbsis(),2) + Math.pow(titikakhir.getOrdinat() - titikawal.getOrdinat(), 2));
    }

    double gradien(){
        if (titikakhir.getAbsis() - titikawal.getAbsis() == 0) {
            throw new ArithmeticException("Garis vertikal, gradien tidak terdefinisi.");
        }
        return (titikakhir.getOrdinat() - titikawal.getOrdinat()) / (titikakhir.getAbsis() - titikawal.getAbsis());
    }

    Titik titikTengah() {
        return new Titik((titikawal.getAbsis() + titikakhir.getAbsis()) / 2, (titikawal.getOrdinat() + titikakhir.getOrdinat()) / 2);
    }

    boolean ckSejajar(Garis g){
        return this.gradien() == g.gradien();
    }

    boolean cekTegakLurus(Garis g){
        return this.gradien()*g.gradien() == -1;
    }

    void printGaris(){
        System.out.println("Titik Awal: (" + titikawal.getAbsis() + ", " + titikawal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikakhir.getAbsis() + ", " + titikakhir.getOrdinat() + ")");
    }

    String printPersamaanGaris(){
        double m = gradien();
        double c = titikawal.getOrdinat() - m * titikawal.getAbsis();
        return "y = " + m + "x + " + c;
    }

}
