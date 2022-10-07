package tugasP6;

import java.util.Scanner;

public class teleponBayar {

    public static double setjam(int jam, int jamAkhir) {
        return 3600 * (jamAkhir-jam); 
    }
    public static double setmenit(int menit, int menitAkhir) {
        return 60 * (menitAkhir-menit); 
    }
    public static double setdetik(int detik, int detikAkhir) {
        return detikAkhir-detik; 
    }
    public static double biayapulsa(int biaya, int detik, int jam, int menit, int jamAwal, int menitAwal, int detikAwal) {
        return ((setjam(jam,jamAwal) + setmenit(menit,menitAwal) + setdetik(detik,detikAwal))/5)*biaya ; 
    }

    /*public static void main(String[] args) {
        Scanner topo = new Scanner(System.in);
        System.out.print("Masukkan berapa jam anda mulai telefon : ");
        jam = topo.nextDouble();
        System.out.print("Masukkan berapa menit anda mulai telefon : ");
        menit = topo .nextDouble();
        System.out.print("Masukkan berapa detik anda mulai telefon : ");
        detik = topo.nextDouble();
        System.out.println("");
        System.out.print("Masukkan jam akhir : ");
        jamAkhir = topo.nextDouble();
        System.out.print("Masukkan menit akhir : ");
        menitAkhir = topo.nextDouble();
        System.out.print("Masukkan detik akhir : ");
        detikAkhir = topo.nextDouble();
        System.out.println("");
        System.out.println("Biaya yang dikenakan adalah : Rp");

    }*/

}