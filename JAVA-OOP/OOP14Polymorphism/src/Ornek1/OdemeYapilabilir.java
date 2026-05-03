package Ornek1;

public interface OdemeYapilabilir {//Eğer interfacede eğitmen metodların başına public ve abstract yazmıyorsa bunu Java otomatik yapıyor demektir . Yani sen interfaceye metot tanımlayacaksan başına bunları yaz
    public abstract void  ode(int tutar);//Bütün interface sınıflarlar otomatik olarak abstract'tır . En üstte yazmıyor ama öyle . Ve
    public abstract String getAciklama();//Bu normal bir getter'dir. Sence niye field(Değişken) yukarıda girilmemiş . Zaten getter'larda field kaydı yapman gerekmiyor .
    public abstract boolean onayGerekliMi();//Ve bir interface sınıfının içine baktığımızda hangi metodun gövdesi yoksa o abstractır . Yani soyuttur . Gövdesi varsa o zaman somuttur .
    //Ve implement ettiğin sınıflarda interface'nin sadece abstract metodunu override(implement) etmen gerekiyor.

}
