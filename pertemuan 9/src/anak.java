public class anak extends induk{
    anak() {
        super();
        System.out.println("ini adalah konstruktor anak");
    }
    public void informasi() {
        System.out.println("Nama = "+ this.nama);
    }
    @Override
    public void makan() {
        super.makan();
        System.out.println("Saya suka makan Mie Ayam");
    }
}
