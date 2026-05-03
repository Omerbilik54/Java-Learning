//this anahtar kelimesi, yalnızca static olmayan metotlar ve kurucu metotlar içinde kullanılabilir.
// static metotlar bir nesneye değil, doğrudan sınıfa aittir, bu nedenle bir "mevcut nesne" kavramı yoktur.
//this() kullanarak kurucu metot zincirleme yapılıyorsa, bu çağrı mutlaka kurucu metodun ilk ifadesi olmalıdır.
public class Main{
    public static void main(String[] args) {
        Arena arena1 = new Arena("Arena1" , (byte) 0);
        arena1.girisYap();
        arena1.girisYap();
        arena1.girisYap();
        System.out.println();
        Arena arena2 = new Arena("Arena2" , (byte) 0);
        arena2.girisYap();

    }
}