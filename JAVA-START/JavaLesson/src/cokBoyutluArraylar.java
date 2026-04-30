public class cokBoyutluArraylar {
    public static void main(String[] args) {
        int[][] Ömer = new int[2][3];

        //Ömerdaki 1. arraye yani 0.indekse 1,2,3
        //Ömerdeki 2. arraye yani 1. indekse 10,20,30

        Ömer[0][0] = 1;
        Ömer[0][1] = 2;
        Ömer[0][2] = 3;
        Ömer[1][0] = 10;
        Ömer[1][1] = 20;
        Ömer[1][2] = 30;

        for(int i = 0 ; i<Ömer.length ; i++)
            for(int j = 0 ; j < Ömer[i].length;j++)
                System.out.println(Ömer[i][j]);


        System.out.println();
        for (int[] my : Ömer){
            for(int i = 0 ; i < my.length; i++){
                System.out.println(my[i] + " ");
            }
        }
        //bu da farklı bir tekniği
        int[][] murat = new int[2][];
        
        murat[0] = new int[3];
        murat[1] = new int[4];
        murat[0][0] = 1; murat[0][1] = 2; murat[0][2] = 3;
        murat[1][0] = 10; murat[1][1] = 20 ; murat[1][2] = 30 ; murat[1][3] = 40 ;

        for (int i = 0; i < murat.length; i++) {
            for (int j = 0; j <murat[i].length ; j++) {
                System.out.println(murat[i][j]);

            }
            
        }
//iÇeride iki tane dizi kümesi var . Bunlar ilk köşeli parantezi temsil ediyor .
//Parantezlerin içindeki değerler ise ikinci köşeli parantesi temsil ediyor .
//
        int[][] Onur = new int[][] { {10,20,30,40},{1,2,3} };
        for(int[] Dizi: Onur)//Burada Onur dizisinin içindekileri Dizi değerinin içine atıyor . Dizi = Onur[0] , Onur[1]
            for(int deger : Dizi)//Burada da Dizi değerinin içindekileri deger değerinin içine atıyor . 1. turda deger = 1 , deger = 2 , deger = 3     2. turda deger = 10 , deger = 20 , deger = 30 , deger = 40 .
                System.out.println(deger);
        
        
        
    }
}
