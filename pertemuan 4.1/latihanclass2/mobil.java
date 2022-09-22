class mobil {
    //atribute
    private boolean brake = false;
    private String nama;

    //method
    public void brakeOn(){
        this.brake = true;
        System.out.println("Mobil" + this.nama);
        System.out.println("status rem mobil = "+ this.brake);
        System.out.println("");
    }
    public void brakeOff() {
        this.brake = false;
        System.out.println("Mobil" + this.nama);
        System.out.println("status rem mobil = "+ this.brake);
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
