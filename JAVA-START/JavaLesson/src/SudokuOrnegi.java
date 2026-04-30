/*Sudoku Örneği :

Yataydaki her bir değeri kpntrol et aynısı varsa doğru değildir
Dikeydeki her bir değeri kontrol et aynısı varsa doğru değildir .
Her bir kareyi kontrol et aynısı varsa doğru değildir .
*/
//-1 ler boş demek.
// Dikeydekilere i , yataydakilere j diyoruz .

public class SudokuOrnegi {
    public static void main(String[] args) {
        byte[][] sudoku  =
                {{1, 4, 3, 2 },
                {-1,-1, 1, 4},
                {4,  1, 2, 3 },
                {2, 3, -1,-1 }};

        double sudokuX = Math.sqrt(sudoku.length);
        double sudokuY = Math.sqrt(sudoku.length);
        boolean dogruMu = true ;
        enUstFor://Bizi break dediğimiz yerde bi üst döngüye atacağı için biz öyle yapmak istemiyoruz . Biz en üst döngüye çıkmak istiyoruz . Bunu da orada kullanıyoruz .
        for (int i = 0; i < sudoku.length; i++)
            for (int j = 0; j < sudoku[i].length; j++)
                if (sudoku[i][j] != -1 ) {
                    byte deger = sudoku[i][j];
                    sudoku[i][j] = -1;
                    for (int k = 0; k < sudoku.length ; k++) {
                        if (sudoku[k][j] == deger || sudoku[i][k] == deger) {
                            dogruMu = false ;
                            break enUstFor;
                        }
                    }

                    int satır = (int) (i - (i % sudokuX));
                    int sütun = (int) (j - (j % sudokuY));

                    for (int r = satır; r < satır+sudokuX; r++) {
                        for (int c = sütun; c < sütun + sudokuY; c++) {
                            if (sudoku[r][c] == deger) {
                                dogruMu = false ;
                                break enUstFor;

                            }

                        }

                    }
                }
        if(dogruMu) System.out.println("Evet bu sudoku doğrudur.");
        else System.out.println("Hayır bu sudoku yanlıştır . ");
    }
}
