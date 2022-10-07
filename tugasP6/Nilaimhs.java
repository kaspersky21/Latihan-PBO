package tugasP6;
import java.util.Scanner;

public class Nilaimhs {

    private double nilaiAngka;
    private String nilaiHuruf;

    public Nilaimhs() {
        Scanner topo = new Scanner(System.in);
        System.out.print("Masukkan nilai mahasiswa : ");
        nilaiAngka = topo.nextDouble();
        System.out.println("");
        System.out.println("Hasil:");
        if (nilaiAngka >= 0 && nilaiAngka <= 39.99) {
            nilaiHuruf = "E";
        }
        if (nilaiAngka >= 40 && nilaiAngka <= 49.99) {
            nilaiHuruf = "D";
        }
        if (nilaiAngka >= 50 && nilaiAngka <= 54.99) {
            nilaiHuruf = "C-";
        }
        if (nilaiAngka >= 55 && nilaiAngka <= 59.99) {
            nilaiHuruf = "C";
        }
        if (nilaiAngka >= 60 && nilaiAngka <= 64.99) {
            nilaiHuruf = "C+";
        }
        if (nilaiAngka >= 65 && nilaiAngka <= 69.99) {
            nilaiHuruf = "B-";
        }
        if (nilaiAngka >= 70 && nilaiAngka <= 74.99) {
            nilaiHuruf = "B";
        }
        if (nilaiAngka >= 75 && nilaiAngka <= 79.99) {
            nilaiHuruf = "B+";
        }
        if (nilaiAngka >= 80 && nilaiAngka <= 89.99) {
            nilaiHuruf = "A-";
        }
        if (nilaiAngka >= 90 && nilaiAngka <= 99.99) {
            nilaiHuruf = "A";
        }
    }

    public static void main(String[] args) {
        Nilaimhs gradeNilai = new Nilaimhs();
        System.out.println("Nilai angka : " + gradeNilai.nilaiAngka);
        System.out.println("Nilai huruf : " + gradeNilai.nilaiHuruf);
    }
} 
