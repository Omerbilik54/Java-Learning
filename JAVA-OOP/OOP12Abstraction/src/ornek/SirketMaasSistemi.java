package ornek;
public class SirketMaasSistemi {
    public static void main(String[] args) {
        // Tüm çalışanları tek bir dizide tutabiliyoruz → Polymorphism!
        Calisan[] personel = new Calisan[5];

        personel[0] = new SabitMaasliCalisan("Ömer","Bilik","10238",40000);
        personel[1] = new SaatlikCalisan("Ayşe", "Kara", "222", 150, 180);
        personel[2] = new KomisyonluCalisan("Mehmet", "Demir", "333", 500000, 0.10);
        personel[3] = new SabitArtıKomisyonluCalisan("Zeynep", "Çelik", "444", 15000, 300000, 0.08);
        personel[4] = new SabitMaasliCalisan("Ali", "Veli", "555", 32000);

        System.out.println("==== ŞİRKET MAAŞ ÖDEMELERİ =====\n");

        double toplamMaas = 0;

        for (Calisan c : personel){
            c.maasYatir();
            toplamMaas += c.getMaas() ;
            System.out.println("------------------------------------");
        }
        System.out.printf("%nToplam ödenen maaş: %.2f TL%n", toplamMaas);



    }
}
