public class Kapsamlar {
    public static void main(String[] args) {
        int degisken1 = 100 ;
        int degisken2 = 200 ;

        {
            int degisken3 = 300 ;
            System.out.println(degisken3);
            {int degisken4 = 400;
                System.out.println(degisken4);
            }
            int degisken5 = 500;
            System.out.println(degisken5);
        }
        int degisken6 = 600;
        System.out.println();
        //buraya üstteki süslü parantez içindeki değerleri yazamayız .

    }
}
