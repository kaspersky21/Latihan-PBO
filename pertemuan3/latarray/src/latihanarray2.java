import java.util.Scanner;

public class latihanarray2 {
    public static void main(String[] args) {
        int[] angka = {10, 3, 40, 50, 15, 5, 7, 8};
        int tambah = 0;
        System.out.println("Penjumlahan data array");
        for (int no : angka) {
            tambah = tambah + no;
        }
        System.out.println("Hasil penjumlahan dari semua data array adalah : " + tambah);
        System.out.println("");
        System.out.println("Menghitung rata-rata data array");
        double i = 0;
        for (int no : angka) {
            i = tambah/8;
        }
        System.out.println("Hasil rata-rata dari data array diatas adalah : " + i);
        System.out.println("");
        System.out.println("Mencari nilai pada array");
        int x;
        Scanner topo = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        x = topo.nextInt();
        for (int nilai : angka){
            if (nilai == x){
                System.out.println("angka " + x + " ada pada array");
                break;
            }else {
                System.out.println("angka " + x + " tidak ada pada array");
                break;
            }
        }
    }
}