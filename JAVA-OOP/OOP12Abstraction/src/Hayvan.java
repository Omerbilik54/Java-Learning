public abstract class Hayvan {
    public void yuru(){
        System.out.println("Yürüdüm");
    }
    public abstract void sesCikar();
    public abstract void sesCikarsin (String ses);
}//Eğer bu hemen üstteki abstract metodları ürettiysen , bu sınıftan miras alan diğer sınıflarda bunu implement (yani override) etmen lazım . Bağlamak demek zaten .
