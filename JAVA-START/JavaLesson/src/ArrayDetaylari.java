public class ArrayDetaylari {
    public static void main(String[] args) {
        int[] Dizim1 = new int[]{1, 2, 3};

        int[] Dizim2 = Dizim1.clone();
// Burada İntelij idea bir hata verdiği için devamını yazamadım . Ama zaten basit .
// Diyor ki değerleri birbirine atayabilirsin . Tamam . Dizi içinde bir değeri değiştirmek istediğin zaman direk değiştiremiyorsun .
// Diziyi önce farklı bir diziye kopyalaman lazım . Sonra o kopyaladığın dizinin elemanlarına istediğin değerleri atayabilirsin.
        Dizim2[1] = 3023;

        for (int arr1 : Dizim1){
            System.out.print(arr1 + " ");
            System.out.println(); }
        for (int arr1 : Dizim2)
            System.out.print(arr1 + " ");
    }
}







