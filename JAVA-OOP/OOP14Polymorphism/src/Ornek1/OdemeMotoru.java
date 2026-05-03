package Ornek1;

public class OdemeMotoru {
        public void simdiOde(OdemeYapilabilir odeme , int tutar){
            System.out.println("Ödeme başlatılıyor" + odeme.getAciklama() + " - " + tutar + "tl");
            //Polimorfizim zamanı
            if(odeme.onayGerekliMi()){
                System.out.println("Sms onayı gerekiyor");
                //Burada gerçekte sms gönderdi burayı geçelim .
                System.out.println("Sms onaylandı");
            }
            //Aynı satır bambaşka şeyler yapıyor .
            odeme.ode(tutar);
            System.out.println("Ödeme tamamlandı");
        }
    }

