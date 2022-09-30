package latihan1;

public class main {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.inputData("2021071025", "panjul");
        biodata.viewData();

        //membuat objek baru
        Biodata mhs = new Biodata();
        mhs.inputData("2020071001", "topo");
        mhs.viewData();
    }
}
