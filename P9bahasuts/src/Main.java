public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        double r = 10;
        lingkaran.setS1(r);
        System.out.println("Luas Lingkaran: "+ lingkaran.luas());
        System.out.printf("Keliling Lingkaran: %.2f", lingkaran.keliling());
    }
}