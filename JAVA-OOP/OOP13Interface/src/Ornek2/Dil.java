package Ornek2;

public interface Dil {
    public void selamla();

    default void yazdir(){
        System.out.println("Dil interface'inden yazdım ");
        //Bu metot default olduğu için başka bir sınıftan implement(override) edilmesi istenmiyor .
        // Ama default olmazsa implement yapmanı zorunlu kılar
    }

    static void staticyazdir(){//Öncelikle
        System.out.println("Static'ten yazdım");
        //Statikte seni bu metodu implement(override) etmene zorlamıyor . Zaten istesende implement(override) edemezsin .
        //Çünkü yapısı gereği izin vemriyor .
    }

    private void gizli(){
        System.out.println("Gizlidir Ha");
    }//Default gibi . Dışarıdan göremezsin .

}
