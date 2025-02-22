/* Nama File : Titik.java 
 * Nama      : Kaila Talitha Putri
 * Nim       : 24060123140179
 * Kelas     : C
*/

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; // Titik berada di sumbu (0,0)
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    double getJarak(Titik T) {
        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2));
    }

    void RefleksiX(){
        this.absis *= -1;
    }

    void RefleksiY(){
        this.ordinat *= -1;
    }

    public Titik getRefleksiX(){
        return new Titik (absis, -ordinat);
    }
    
    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    static int getCounterTitik() {
        return counterTitik;
    }
} //end class Titik

