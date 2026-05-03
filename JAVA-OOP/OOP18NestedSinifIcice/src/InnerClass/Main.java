package InnerClass;

public class Main {
    public static void main(String[] args) {
        Araba a = new Araba();
        Araba.Motor m = a.new Motor();
        m.bilgi();
    }
}//Bu artık gerçek anlamda dış sınıfa bağımlıdır. Dış sınıfın private üyelerine bile erişebilir. Evdeki küçük kardeş gibi.
