public class Main {
    public static void main(String[] args) {
        double r = 10;
        Lingkaran lingkaran = new Lingkaran(r);
        System.out.println("Luas Lingkaran: "+ lingkaran.luas());
        System.out.printf("Keliling Lingkaran: %.2f", lingkaran.keliling());
    }
}