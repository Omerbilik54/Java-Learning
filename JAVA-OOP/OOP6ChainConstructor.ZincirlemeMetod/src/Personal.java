public class Personal {
    private int yas;
    public String isim ;
    private String soyisim;


    public Personal(String isim ){
        this(isim , ": Soyisim Yok");
    }
    public Personal(String isim , String soyisim){
        this(isim , soyisim , 24);
    }//Buranın üstündeki iki constracteri kullanmaya aslında gerek yok . Demek istiyor ki sonradan eklemek istediğin bir parametre olursa onu bu şekilde ekleyebilirsin .
    //Hayı aslında gerek var. Mesela ben 3 değer yerine 2 veya 1 değeri değiştirmek istiyorum . Öbür türlü 3'lü constructerin sadece iki
    //değerini değiştirip birini değiştirmezsen hata verir. Zincirleme constructer o yüzden önemli
    public Personal(String isim , String soyisim , int yas ){
        this.isim = isim ;
        this.soyisim= soyisim;
        this.yas = yas;
    }
    public void Yazdır(){
        System.out.println( " İsim " + isim + " Soyisim " + soyisim  + " Yaş " + yas);
    }
}
//Burada zincirleme şeklinde kullanıldı constracter .
