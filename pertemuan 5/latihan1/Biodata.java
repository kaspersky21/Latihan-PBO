/*1. analisis spesifikasi kebutuhan sistem
    a. Spesifikasi kebutuhan sistem
        - nim: String
        - nama: String
*/
package latihan1;

public class Biodata{
    private String nim;
    private String nama;

    public void inputData(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void viewData() {
        System.out.println("NIM: "+ this.nim);
        System.out.println("Nama: "+ this.nama);
    }
}