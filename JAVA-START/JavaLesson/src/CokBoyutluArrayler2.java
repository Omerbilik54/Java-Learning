public class CokBoyutluArrayler2 {
    public static void main(String[] args) {
        int[][][] Dizim = new int[2][][];

        Dizim[0] = new int[2][3];
        Dizim[1] = new int[2][3];
        //Burada dizinin birinci kısmına iki yeni
        //Bu şimdi 2 ye üçlük bir matris oluyor .
        //Dizim = [[ [0,0,0], [0,0,0] ],
               // [ [0,0,0], [0,0,0] ]];
        Dizim[0][0] = new int[]{1,2,3};
        Dizim[0][1] = new int[]{4,5,6};
        Dizim[1][0] = new int[]{7,8,9};
        Dizim[1][1] = new int[]{10,11,12};

        for (int i = 0; i < Dizim.length ; i++) {//Bu döngü en dış katmanı yani Dizim[0] ve Dizim[0] katmanını gezer . i = 0 ve i = 1
            for (int j = 0; j < Dizim[i].length ; j++) {//Bu döngü, o anda seçilmiş i katmanının satırlarını gezer. Yani j = 0 ve j = 1
                for (int k = 0; k <Dizim[i][j].length ; k++) {//Bu da o satırdaki elemanları (sütunları) gezer. k = 0 , k = 1 , k = 2
                    System.out.println(Dizim[i][j][k]);

                }

            }

        }
    }
}
