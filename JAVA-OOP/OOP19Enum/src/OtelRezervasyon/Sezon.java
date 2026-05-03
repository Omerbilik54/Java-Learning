package OtelRezervasyon;

public enum Sezon {

//    Kıs(1),
//    Yaz(2);
    //Enum içindeki değerleri override etmemiz gerekecek.
    Yaz(2){
        @Override
        public double getCarpan(){
            System.out.println("Yaz çarpanı");
            return 0;
        }
    },
    Kıs(1) {
        @Override
        public double getCarpan () {
            System.out.println("Kış çarpanı");
            return 0;
        }
    };
    Sezon(double carpan){
        this.carpan=carpan;
    }
    private double carpan;
    //Bunu abstract yapmak istersek

    public /*abstract */ double getCarpan(){
        return carpan;
    }
}
