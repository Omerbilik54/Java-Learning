package LocalandAnonymousClass;

public class Test {
    public void calistir(){
         class Mesaj {
            public void yaz(){
                System.out.println("Selam");
            }
        }
        Mesaj m = new Mesaj();
        m.yaz();
    }
}
//Metodun içinde tanımlanan sınıf. Evet, Java bazen sınıfı metodun içine bile koyuyor. Biraz gereksiz gizemli.