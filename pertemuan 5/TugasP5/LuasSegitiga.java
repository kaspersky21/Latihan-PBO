package TugasP5;

import java.text.DecimalFormat;
import java.util.Scanner;

class Segitiga {
    private double luas;
    private int alas;
    private int tinggi;

    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public void setLuas(double luas) {
        this.luas = luas;
    }

    public int getAlas() {
        return this.alas;
    }
    public int getTinggi() {
        return this.tinggi;
    }
    public double getLuas() {
        luas = 0.5 * alas * tinggi;
        return luas;
    }
}

public class LuasSegitiga {
    
    static DecimalFormat formatData = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Segitiga lsTiga = new Segitiga();
        Scanner topo = new Scanner(System.in);

        System.out.println("Menghitung luas Segitiga");
        System.out.print("Masukkan alas : ");
        lsTiga.setAlas(topo.nextInt());
        System.out.print("Masukkan tinggi : ");
        lsTiga.setTinggi(topo.nextInt());
        System.out.println("Luas segitiga : "+ formatData.format(lsTiga.getLuas()));
    }
}