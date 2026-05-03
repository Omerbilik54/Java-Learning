package OtelRezervasyon;

public class Otel {

        public void rezervasyonYap(Sezon sezon) {

            System.out.println("Sezon için bilet alındı : " + sezon);
        }

        public double fiyatAl(Sezon sezon){
            if(sezon == Sezon.Yaz){
                return sezon.getCarpan()*5000;
            }
            return 0;
        }
    }
