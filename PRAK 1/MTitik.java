public class MTitik {
    public static void main (String[] args){
        Titik T1 = new Titik();
        Titik T2 = new Titik(2,3);

        //T1
        System.out.println("\n=== Titik 1 ===");
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.println("Titik awal T1:");
        T1.printTitik();

        //Geser Titik T1
        T1.geser(3,4);
        System.out.println("Setelah geser T1:");
        T1.printTitik();

        //Kuadran T1
        System.out.println("Kuadran T1: " + T1.getKuadran());

        //Jarak pusat T1
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());

        //Refleksi X T1
        Titik refleksiX = T1.getRefleksiX();
        System.out.println("Refleksi X dari t1:");
        refleksiX.printTitik();

        //T2
        System.out.println("\n=== Titik 2 ===");
        System.out.println("Titik awal T2:");
        T2.printTitik();

        //Geser T2
        T2.geser(2, -1);
        System.out.println("Setelah geser T2:");
        T2.printTitik();

        //Kuadran T2
        System.out.println("Kuadran T2: " + T2.getKuadran());

        //Jarak Pusat T2
        System.out.println("Jarak T2 ke pusat: " + T2.getJarakPusat());

        //Refleksi Y T2
        Titik refleksiY = T2.getRefleksiY();
        System.out.println("Refleksi Y dari T2:");
        refleksiY.printTitik();

        //Jarak antar titik T1 dan T2 
        System.out.println("\n=== Jarak antara T1 dan T2===");
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));

        //Menampilkan objek titik yang telah dibuat 
        System.out.println("\n=== Titik Yang Telah Dibuat ===");
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        
        
    }
}
