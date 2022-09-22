public class main {
    public static void main(String[] args) {
        mobil Brio = new mobil();
        mobil Audi = new mobil();

        Brio.setNama("Brio");
        Brio.brakeOn();
        Brio.brakeOff();
        
        Audi.setNama("Audi");
        //Audi.brakeOn();
        Audi.brakeOff();
    }
}
