public class Trasposta {
    public static int  MAX=2;
    public static void main(String[] args) {

        int[][] matr1= new int[MAX][MAX];
        int[][] matr2= new int[MAX][MAX];
        int[][] matr3= new int[MAX][MAX];
        int[][] matr4= new int[MAX][MAX];// aggiunto commento

         System.out.println("+++++++++++ Matrice ++++++++++++++++++");
        // inizializza casualmente la matrice
        carica(matr1,MAX);
        stampa(matr1);
        System.out.println("+++++++++++ Matrice Trasposta++++++++++++++++++");
        trasposta(matr1,matr2);
        stampa(matr2);
        System.out.println("+++++++++++ Matrice Somma++++++++++++++++++");
        somma(matr1,matr2,matr3);
        stampa(matr3);
    }
    public static void carica (int[][] matr, int max){
        for (int riga=0;riga<MAX; riga++) {
            for (int col = 0; col < MAX; col++) {
                matr[riga][col] = (int) (Math.random() * 5);
            }
        }
    }

    public static void trasposta (int[][] matrice1,int[][] matrice2){
        for (int riga=0;riga<MAX; riga++) {
            for (int col = 0; col < MAX; col++) {
                matrice2[col][riga] = matrice1[riga][col];
            }
        }
    }

    public static void somma (int[][] matrice1,int[][] matrice2,int[][] matrice3){
        for (int riga=0;riga<MAX; riga++) {
            for (int col = 0; col < MAX; col++) {
                matrice3[riga][col]=matrice1[riga][col] + matrice2[riga][col];
            }
        }
    }

    public static void stampa (int[][] matrice){
        for (int riga=0;riga<MAX; riga++) {
            for (int col = 0; col < MAX; col++) {
                System.out.print(matrice[riga][col] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}


