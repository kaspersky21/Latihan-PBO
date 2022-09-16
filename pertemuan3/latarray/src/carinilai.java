import java.util.Scanner;
public class carinilai {
    public static void main(String[] args) {
        int[] angka = {10, 3, 40, 50, 15, 5, 7, 8};
        int i;
        Scanner topo = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        i = topo.nextInt();
        for (int nilai : angka) {
            if (nilai == i) {
                System.out.println("angka " + i + " ada pada array");
                break;
            } else {
                System.out.println("angka " + i + " tidak ada pada array");
                break;
            }
        }
    }
}
