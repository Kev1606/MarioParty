package juegos.Cartas.juegoCartas;

import java.util.Random;

public class JuegoCartas {
    
    public static int BARAJA_INGLESA = 52;
    private static String[] cartas = {"A10","A11","A12","A13","A14","A15","A16","A17","A18","A19","A20","A21","A22",
                               "B10","B11","B12","B13","B14","B15","B16","B17","B18","B19","B20","B21","B22",
                               "C10","C11","C12","C13","C14","C15","C16","C17","C18","C19","C20","C21","C22",
                               "D10","D11","D12","D13","D14","D15","D16","D17","D18","D19","D20","D21","D22"};
    private static String cartaSeleccionada;
    
    
    public static String escogeCarta(){
        Random random =  new Random();
        int carta = random.nextInt(BARAJA_INGLESA);
        cartaSeleccionada = cartas[carta];
        return cartaSeleccionada;
    }

}

