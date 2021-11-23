package juegos.CollectTheCoins.juegoCoins;

import java.util.Random;

public class JuegoCoins {
    public static int DIMENSION_X_Y = 25;
    
    private Random random = new Random();
    private int matrizValoresMonedas[][];
    
    private int numeroTiempo;
    
    public JuegoCoins(){
        matrizValoresMonedas = new int[DIMENSION_X_Y][DIMENSION_X_Y];
        llenaMatriz();
    }
    
    private void llenaMatriz(){
        int contadorPositivas = 0;
        int contadorNegativas = 0;
        boolean valor = false;
 
        for (int i = 0; i < DIMENSION_X_Y; i++) {
            for (int j = 0; j < DIMENSION_X_Y; j++) {
                valor = random.nextBoolean();                
                if (valor == true & contadorPositivas < 313) {
                    matrizValoresMonedas[i][j] = random.nextInt(10)+1;
                    contadorPositivas++;
                } 
                if (valor == false & contadorNegativas < 312) {
                    int numero = random.nextInt(10)+1;
                    matrizValoresMonedas[i][j] = numero*-1;
                    contadorNegativas++;
                }
                if (contadorNegativas == 312 & contadorPositivas < 313) {
                    matrizValoresMonedas[i][j] = random.nextInt(10)+1;
                    contadorPositivas++;
                } 
                if (contadorPositivas == 313 & contadorNegativas < 312){
                    int numero = random.nextInt(10)+1;
                    matrizValoresMonedas[i][j] = numero*-1;
                    contadorNegativas++;
                }
            }
        }     
    }
    
    public int conseguirTiempo(){
        int numero = random.nextInt(3)+1;
        if (numero == 1) {
            numeroTiempo = 30;
        }
        if (numero == 2) {
            numeroTiempo = 45;
        }
        if (numero == 3) {
            numeroTiempo = 60;
        }
        return numeroTiempo;
    }
    
    public int [][] getMatrizValoresMonedas(){
        return matrizValoresMonedas;
    }
}