package StaticNestedClass;

public class Main {
        public static void main(String[] args) {
            DisSinif.IcSinif ic = new DisSinif.IcSinif();
            ic.yazdir();
        }
    }
//Dış sınıfa bağlı gibi görünür ama gerçekte bağımlı değildir. Sanki kuzeni gibi. Dış sınıfın static’lerine erişebilir.
