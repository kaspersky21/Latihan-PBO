public class latsubstring {
    public static void main(String[] args) {
        String nim = "2021071025";
        String namaProdi = "";
        String kodeProdi = nim.substring(4, 7);
        String akt = nim.substring(0,4);
        //System.out.println("kode prodi : " +kodeProdi);
        //System.out.println("Angkatan : " +akt);
        if (kodeProdi.equals("071")){
            namaProdi = "Informatika";
        }
        System.out.println("NIM : " +nim);
        System.out.println("Nama Prodi : " + namaProdi);
    }
}
