public class Portakal extends SoyulabilirMeyve {

    public void onceSoy() {
        System.out.println("Portakalı Soydum");
        ye();
    }

    //Farkı şu: @Override sana garanti sağlar. Mesela yanlışlıkla metot adını “tatver” diye küçük harfle yazarsan:
    //Java bu durumda metodu override etmez ama sen fark etmezsin. Eğer @Override yazmış olsaydın, derleyici hata verirdi:
    //
    //“Method does not override method from its superclass”
    //
    //Bu yüzden @Override bir tür “güvenlik kemeri” gibi. Kodun onsuz da çalışır ama hataya karşı koruma sağlamaz.
    @Override
    public void tatVer() {
        System.out.println("Portakalın mayhoş bir tadı var");
    }
}
//Burada override yapmayı öğrendik .
