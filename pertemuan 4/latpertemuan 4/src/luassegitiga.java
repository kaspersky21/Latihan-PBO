import java.util.Scanner;
public class luassegitiga {
    static double luasSegitiga(){
        double alas,tinggi,luas;
        Scanner topo  = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        alas = topo.nextDouble();
        System.out.print("Masukkan tinggi : ");
        tinggi = topo.nextDouble();
        System.out.println("Processing");
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    public static void main(String[] args) {
        System.out.println("luas segitiga : " + luasSegitiga());
    }
}
