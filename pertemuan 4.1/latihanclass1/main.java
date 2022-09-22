package latihanclass1;
class mobil {
    // Attribute / state /field
    private boolean rem = false;
    // Method / behaviors
    public void mengerem(){
        System.out.println("Fungsi rem dipanggil");
        if(this.rem){
            System.out.println("mobil mengerem");
        }
        else{
            System.out.println("mobil tidak mengerem");
        }
    }
    public void aksesRem (boolean rem) {
        this.rem = rem;
    }
}
public class main {
    public static void main(String[] args) {
        mobil objMobil = new mobil();

        //memanggil method / atribut yg bersifat public
        System.out.println("sebelum direm");
        objMobil.mengerem();
        System.out.println("sesudah direm");
        objMobil.aksesRem(true);
        objMobil.mengerem();
    }
}