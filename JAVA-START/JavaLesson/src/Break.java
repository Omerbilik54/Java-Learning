public class Break {
    public static void main(String[] args) {
        int i = 0 ;
        //Java'da bir döngüyü içeriden kırıp (break) dıştaki döngüye geçmek istediğinizde, o dıştaki döngüye bir etiket (label) vermeniz gerekir.
        // Ancak bu etiketi kullanabilmek için etiketin tanımı (deklarasyonu) doğru yerde olmalıdır.
        //Etiket, kırmak istediğiniz döngünün hemen öncesine, iki nokta üst üste (:) ile birlikte yazılmalıdır. Bu sayede break ifadesi hangi döngüyü hedeflediğini bilir.
        enUstDongu:
        //enUstDongu etiketi sayesinde içteki while’dan direkt dıştaki while’a çıkabiliyorsun.
        //Eğer etiketi kullanmazsan, break sadece bulunduğu içteki while döngüsünü kırar, dıştaki çalışmaya devam eder.
        while (i<10){
            int j = 0;

            //int j = 0; bu burada olsaydı ne fark ederdi .
            while (j<10){
                if(i==1 && j==3) break enUstDongu;
                System.out.println(" i = " + i + " j = " + j);
                j++;
            }
            i++;
        }
    }
}
//Döngüyü tamamen sonlandırır.
//Döngü koşulu doğru olsa bile, break gördüğü anda döngüden çıkar.
//Sadece bulunduğu döngüyü kırar, dış döngüleri etkilemez (etiket kullanmazsan).
//break → döngüyü bitirir.
//
