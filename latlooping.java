import java.util.Scanner;

public class latlooping {
    public static void main(String[] args) {
        String cek;
        Scanner topo = new Scanner(System.in);
        //looping do while
        do {
            System.out.println("halo selamat datang.");
            System.out.print("Apakah ingin mengulang lagi [y/t] ? : ");
            cek = topo.nextLine();
            if (cek.equals("t") || cek.equals("T")){
                System.out.println("Terima kasih telah menggunakan program ini");
            }
        }while (cek.equals("y") || cek.equals("Y"));
    }
}
