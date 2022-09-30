package latihan2;

public class Biodata {
    private String nim;
    private String nama;
    private int umur;
    private String gender;

    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNama() {
        return this.nama;
    }
    public String getNim() {
        return this.nim;
    }
    public int getUmur() {
        return this.umur;
    }
    public String getGender() {
        String gender = "Perempuan";
        if (this.gender == "L") {
            gender = "Laki-laki";
        }
        return gender;
    }

    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.setNim("2021071025");
        biodata.setNama("panjul");
        biodata.setUmur(19);
        biodata.setGender("L");

        System.out.println("NIM : "+ biodata.getNim());
        System.out.println("Nama : "+ biodata.getNama());
        System.out.println("Umur : "+ biodata.getUmur());
        System.out.println("Jenis Kelamin : "+ biodata.getGender());
    }
}
