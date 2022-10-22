import java.util.Scanner;

public class kerja {
    public static int jamKerja;
    public static int jamLembur;
    public static double hitJamlembur;
    public static double gaji;
    public static double gajiPokok;
    public static double hitGajipokok;
    public static double potongan;
    public static double tunjangan;
    public static double potTunjangan;


    public static int getJamLembur() {
        return jamLembur = jamKerja - 173;
    }
    public static double getHitJamlembur() {
        return getJamLembur() * 20000;
    }
    public static double getPotongan() {
        return potongan = 50000;
    }
    public static double getGajiPokok() {
        return gajiPokok = gaji + getHitJamlembur();
    }
    public static double getHitGajipokok() {
        return (getGajiPokok() - getPotongan());
    }
    public static double getPotTunjangan() {
        return potTunjangan = tunjangan - potongan;
    }

    public static void main(String[] args) {
        Scanner topo = new Scanner(System.in);
        System.out.print("Masukkan jam kerja : ");
        jamKerja = topo.nextInt();
        if (jamKerja > 173) {
            System.out.println("jam lembur : " + getJamLembur());
            System.out.println("Gaji lembur : Rp." + getHitJamlembur());
            System.out.print("masukkan gaji : Rp.");
            gaji = topo.nextDouble();
            System.out.println("Gaji pokok : Rp." + getHitGajipokok());
            System.out.print("Masukkan Tunjangan : Rp.");
            tunjangan =  topo.nextDouble();
            System.out.println("Tunjangan : Rp" + getPotTunjangan());
            System.out.println("");
            System.out.println("Golongan  "+"Gaji Pokok     "+"Tunjangan");
            System.out.println("1         "+"Rp."+getHitGajipokok()+"   Rp."+getPotTunjangan());
        }
        else {
            System.out.println("jam lembur : " + getJamLembur());
            System.out.println("Gaji lembur : Rp." + getHitJamlembur());
            System.out.print("masukkan gaji : Rp.");
            gaji = topo.nextDouble();
            System.out.println("Gaji pokok : Rp." + getHitGajipokok());
            System.out.print("Masukkan Tunjangan : Rp.");
            tunjangan =  topo.nextDouble();
            System.out.println("Tunjangan : Rp" + getPotTunjangan());
            System.out.println("");
            System.out.println("Golongan  "+"Gaji Pokok     "+"Tunjangan");
            System.out.println("2         "+"Rp."+getHitGajipokok()+"   Rp."+getPotTunjangan());
        }
    }
}
