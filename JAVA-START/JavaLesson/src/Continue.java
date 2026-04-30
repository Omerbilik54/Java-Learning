public class Continue {
    public static void main(String[] args) {
        enUstDongu:
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j <10  ; j++) {
                if (i == 0 && j > 7 ) continue enUstDongu; {
                    System.out.println( i + " " + j );
                }
            }
            System.out.println("Program Bitti");
        }
//continue → sadece o turu atlar, döngü devam eder.
//Döngüyü bitirmez, sadece o adımı atlayıp bir sonraki adıma geçer.
//Yani döngü çalışmaya devam eder.

//Sistemi keser ve başa döndürür .
        int i = 0;
        while(i<10){
            if (i == 5) {

                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

//return kuralları :
        for (int a = 0; a <10 ; a++) {
            for (int j = 0; j < 10 ; j++) {
                if (a == 1 && j == 5)return ;
                System.out.println( a + " " + j);

                }

            }
        System.out.println("Program Bitti");







//return , break , continue arasındaki farklar .
        System.out.println("---- break örneği ----");
        for (int x = 0; x < 5; x++) {
            if (x == 3) {
                break; // döngüyü tamamen bitirir
            }
            System.out.println("x = " + x);
        }

        System.out.println("---- continue örneği ----");
        for (int x = 0; x < 5; x++) {
            if (x == 3) {
                continue; // o turu atlar, döngü devam eder
            }
            System.out.println("x = " + x);
        }

        System.out.println("---- return örneği ----");
        for (int x = 0; x < 5; x++) {
            if (x == 3) {
                return; // metodu tamamen bitirir, aşağıdaki kodlar çalışmaz
            }
            System.out.println("x = " + x);
        }

        // buraya asla gelinmez, çünkü yukarıdaki return metodu bitirdi
        System.out.println("Bu satır yazdırılmaz!");
        }


    }
//Bir metod int, String, double gibi bir tip ile tanımlanmışsa, return o tipe uygun bir değer döndürmek zorundadır.
//int kareAl(int x) {
//    return x * x;   // int döndürdü
//}

//System.out.println(kareAl(5)); // 25



//Eğer metodun tipi void ise, yani değer döndürmeyecekse, return; sadece oradaki çalışmayı bitirir.
//void yazdirPozitif(int x) {
//    if (x <= 0) {
//        return; // metod burada biter, aşağıya inmez
//    }
//    System.out.println("Pozitif sayı: " + x);
//}

//yazdirPozitif(-3); // hiçbir şey yazmaz
//yazdirPozitif(10); // "Pozitif sayı: 10"