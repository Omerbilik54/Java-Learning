public class Arena {
    private String adi ;
    private byte kisiSayisi;
    private ArenaBaslatici arenaBaslatici;
    private boolean girisYapılabilirMi;

    public Arena(String adi, byte kisiSayisi  ){
        this.adi = adi;
        this.kisiSayisi = kisiSayisi;
        this.girisYapılabilirMi = true ;
        arenaBaslatici = new ArenaBaslatici(this);
    }

    public void girisYap(){
        if(!girisYapılabilirMi){
            System.out.println("Arena doldu ve başlatıldı giriş Yapamazsınız . ");
            return;
        }
        System.out.println("Giriş Yapıldı");
        kisiSayisi++;
        if(kisiSayisi == 2){
            System.out.println("Arena Dolu");
            arenaBaslatici.arenayiBaslat();
        }
    }

    public void setGirisYapılabilirMi(boolean girisYapılabilirMi){
        this.girisYapılabilirMi= girisYapılabilirMi;
    }
    public String getAdi(){
        return adi;
    }

}
