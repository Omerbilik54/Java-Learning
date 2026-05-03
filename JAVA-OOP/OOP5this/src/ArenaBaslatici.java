public class ArenaBaslatici {
    public String durum;
    private Arena arena;
    public ArenaBaslatici(Arena arena){
        durum = "Bekleniyor";
        this.arena= arena;
    }

    public void arenayiBaslat(){
        System.out.println("Arena Başlatıcısı Çalıştı " + arena.getAdi());
        durum = "Başlatılıyor";
        arena.setGirisYapılabilirMi(false);
    }
}
