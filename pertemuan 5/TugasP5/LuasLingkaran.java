package TugasP5;

import java.text.DecimalFormat;
import java.util.Scanner;

class Lingkaran {
    private double luas;
    private int finger;

    public void setFinger(int finger) {
        this.finger = finger;
    }
    public void setLuas(double luas) {
        this.luas = luas;
    }

    public int getFinger() {
        return this.finger;
    }
    public double getLuas() {
        luas = 3.14 * finger * finger;
        return luas;
    }
}

public class LuasLingkaran {
    
    static DecimalFormat formatData = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner topo  = new Scanner(System.in);
        Lingkaran lsLingkar = new Lingkaran();
        
        System.out.println("Menghitung luas Lingkaran");
        System.out.print("Masukkan jari - jari : ");
        lsLingkar.setFinger(topo.nextInt());
        System.out.println("Luas lingakaran : "+ formatData.format(lsLingkar.getLuas()));
    }
}