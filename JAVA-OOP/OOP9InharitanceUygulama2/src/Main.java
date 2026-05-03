public class Main {
    public static void main(String[] args) {
        Muz m = new Muz();
        m.onceSoy();
        //Burada ınharitance yapmayı öğrendik
//-------------------------------------------------------------------------
        //Burada override yapmayı öğrendik
        Muz m1 = new Muz();
        Portakal m2 = new Portakal();
        Domates m3 = new Domates();

        m1.tatVer();
        m1.onceSoy();
        m2.tatVer();
        m2.onceSoy();
        m3.tatVer();
        m3.ye();

//| Terim           | Anlamı                                          | Örnek                            |
//| --------------- | ----------------------------------------------- | -------------------------------- |
//| **Override**    | Üst sınıftaki metodu alt sınıfta yeniden yazmak | `Portakal` → `tatVer()`              |
//| **@Override**   | Java’ya “bu metodu yeniden yazıyorum” demek     | `@Override public void tatVer()` |
//| **super**       | Üst sınıftaki metodu çağırmak için              | `super.tatVer()`                 |
//| **Polimorfizm** | Aynı türdeki nesnelerin farklı davranması       | `Meyve m = new Elma();`          |







    }
}