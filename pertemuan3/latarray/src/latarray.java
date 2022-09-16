public class latarray {
    public static void main(String[] args) {

        int [] angka = {1,2,3,4,5,6,7,8,9,10}; //inisialisasi array int

        System.out.println("Nilai ke-1 adalah : "+ angka[0]);
        System.out.println("Nilai ke-2 adalah : "+ angka[1]);
        System.out.println("Nilai ke-3 adalah : "+ angka[2]);
        System.out.println("Nilai ke-4 adalah : "+ angka[3]);
        System.out.println("Nilai ke-5 adalah : "+ angka[4]);
        System.out.println("Nilai ke-6 adalah : "+ angka[5]);
        System.out.println("");

        //utk mengakses nilai pada array dgn loop
        System.out.println("Menampilkan data dengan loop 1");
        for (int i=0; i<angka.length; i++) {
            System.out.println("Nilai ke-" +(i+1)+" adalah "+ angka[i]);
        }
        System.out.println("");
        System.out.println("Menampilkan data dengan loop 2");
        int j = 1; //inisialisasi
        for (int nilai : angka){
            System.out.println("Nilai ke-"+j+" adalah "+ nilai);
            j++;
        }
        angka[2] = 30;
    }
}
